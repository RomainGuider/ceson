package org.eclipselabs.emf.ceson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.ceson.util.CesonSwitch;

public class EcoreGenerator extends CesonSwitch<Object> {

	private SortedMap<String, EPackage> ePackages;
	private Map<String, Object> definitions = new HashMap<String, Object>();
	private Resource resource;

	public EcoreGenerator(SortedMap<String, EPackage> ePackages,
			Resource resource, Map<String, Object> definitions) {
		this.ePackages = ePackages;
		this.definitions.putAll(definitions);
		this.resource = resource;
	}

	@Override
	public Object caseCIntValue(CIntValue object) {
		return object.getValue();
	}

	@Override
	public Object caseCStringValue(CStringValue object) {
		return object.getValue();
	}

	@Override
	public Object caseCRealValue(CRealValue object) {
		return object.getValue();
	}

	@Override
	public Object caseCArrayValue(CArrayValue object) {
		List<Object> result = new ArrayList<Object>(object.getValues().size());
		for (CValue value : object.getValues()) {
			result.add(this.doSwitch(value));
		}
		return result;
	}

	@Override
	public Object caseCEnumValue(CEnumValue object) {
		for (EPackage ePackage : ePackages.values()) {
			String packageName = object.getPackageName();
			if (packageName != null && !packageName.equals(packageName)) {
				continue;
			}
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EEnum) {
					String enumTypeName = object.getEnumTypeName();
					if (enumTypeName != null
							&& !enumTypeName.equals(eClassifier.getName())) {
						continue;
					}
					return ((EEnum) eClassifier).getEEnumLiteral(object
							.getLiteralName());
				}
			}
		}
		return null;
	}

	@Override
	public Object caseCReference(CReference object) {
		return definitions.get(object.getVarName());
	}

	private EClass eClassLookupByName(String qualifiedClassName) {
		String className = "";
		String packageName = "";
		int lastIndexOfDot = qualifiedClassName.lastIndexOf('.');
		if (lastIndexOfDot > 0) {
			packageName = qualifiedClassName.substring(0, lastIndexOfDot);
			className = qualifiedClassName.substring(lastIndexOfDot + 1);
		} else {
			className = qualifiedClassName;
		}
		if (packageName.length() > 0) {
			EPackage ePackage = ePackages.get(packageName);
			EClassifier eClassifier = ePackage.getEClassifier(className);
			if (eClassifier instanceof EClass) {
				return (EClass) eClassifier;
			} else {
				return null;
			}
		} else {
			// iterate over the packages and return the first class which name
			// matches.
			for (EPackage ePackage : ePackages.values()) {
				EClassifier eClassifier = ePackage.getEClassifier(className);
				if (eClassifier instanceof EClass) {
					return (EClass) eClassifier;
				}
			}
			return null;
		}
	}

	private EClass eClassLookupByFeatures(Map<String, Object> features) {
		// iterate on ePackages and on classifiers and returns the first
		// matching, non abstract, EClass
		for (EPackage ePackage : ePackages.values()) {
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass
						&& !((EClass) eClassifier).isAbstract()
						&& !((EClass) eClassifier).isInterface()) {
					boolean matches = true;
					for (String featureName : features.keySet()) {
						EStructuralFeature eFeature = ((EClass) eClassifier)
								.getEStructuralFeature(featureName);
						if (eFeature == null
								|| !eFeature.getEType().isInstance(
										features.get(featureName))) {
							matches = false;
							break;
						}
					}
					if (matches) {
						return (EClass) eClassifier;
					}
				}
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object caseCObjectValue(CObjectValue object) {
		Map<String, Object> features = new HashMap<String, Object>();
		for (CFeature feature : object.getFeatures()) {
			features.put(feature.getName(), doSwitch(feature.getValue()));
		}
		EClass eClass = null;
		if (object.getClassName() != null
				&& object.getClassName().length() != 0) {
			eClass = eClassLookupByName(object.getClassName());
		} else {
			eClass = eClassLookupByFeatures(features);
		}
		EObject result = EcoreUtil.create(eClass);
		resource.getContents().add(result);
		for (String featureName : features.keySet()) {
			EStructuralFeature feature = eClass
					.getEStructuralFeature(featureName);
			if (feature.isMany()) {
				setMultipleFeature(feature, result, features.get(featureName));
			} else {
				result.eSet(feature, features.get(featureName));
			}
		}
		return result;
	}

	private void setMultipleFeature(EStructuralFeature feature, EObject target,
			Object value) {
		List<Object> list = (List<Object>) target.eGet(feature);
		if (value instanceof Collection) {
			for (Object obj : (Collection) value) {
				list.add(obj);
			}
		} else {
			list.add(value);
		}
	}

	@Override
	public Object caseCSpecification(CSpecification object) {
		for (String var : object.getDefinitions().keySet()) {
			definitions.put(var, doSwitch(object.getDefinitions().get(var)));
		}
		return null;
	}

	public Object getVar(String varName) {
		return definitions.get(varName);
	}
}
