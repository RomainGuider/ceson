/*******************************************************************************
 * Copyright (c) 2008, 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emf.ceson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.ceson.util.CesonSwitch;

/**
 * {@link EcoreGenerator} is used to generate Ecore models from Ceson models.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class EcoreGenerator extends CesonSwitch<Object> {
	/**
	 * The registered packages.
	 */
	private SortedMap<String, EPackage> ePackages;
	/**
	 * the current definitions.
	 */
	private Map<String, Object> definitions;
	/**
	 * the resource where to store created objects.
	 */
	private Resource resource;
	private Logger logger;

	/**
	 * CReates a new {@link EcoreGenerator} instance.
	 * 
	 * @param ePackages
	 *            the registered packaeges.
	 * @param resource
	 *            the resource to use
	 * @param definitions
	 *            the existing definitions.
	 */
	public EcoreGenerator(SortedMap<String, EPackage> ePackages,
			Resource resource, Map<String, Object> definitions, Logger logger) {
		this.ePackages = ePackages;
		this.definitions = definitions;
		this.resource = resource;
		this.logger = logger;
	}

	public EcoreGenerator(SortedMap<String, EPackage> ePackages,
			Resource resource, Map<String, Object> definitions) {
		this(ePackages, resource, definitions, Logger.getAnonymousLogger());
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
	public Object caseCBooleanValue(CBooleanValue object) {
		return object.isValue();
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
					return EcoreUtil.createFromString((EDataType) eClassifier,
							object.getLiteralName());
				}
			}
		}
		return null;
	}

	@Override
	public Object caseCReference(CReference object) {
		if (!definitions.containsKey(object.getVarName())) {
			logger.log(Level.SEVERE, "Couldn't find a definition for variable "
					+ object.getVarName());
		}
		return definitions.get(object.getVarName());
	}

	/**
	 * Lookup an {@link EClass} by it's qualified name.
	 * 
	 * @param qualifiedClassName
	 *            the seeked {@link EClass} qualified name.
	 * @return the found {@link EClass} or <code>null</code>.
	 */
	private EClass eClassLookupByName(String qualifiedClassName) {
		String className = "";
		String packageName = "";
		EClass result = null;
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
				result = (EClass) eClassifier;
			}
		} else {
			// iterate over the packages and return the first class which name
			// matches.
			for (EPackage ePackage : ePackages.values()) {
				EClassifier eClassifier = ePackage.getEClassifier(className);
				if (eClassifier instanceof EClass) {
					result = (EClass) eClassifier;
					break;
				}
			}
		}
		return result;
	}

	/**
	 * checks whether the value is assignable to the feature.
	 * 
	 * @param feature
	 *            the checked feature.
	 * @param value
	 *            the value to check/
	 * @return <code>true</code> of the value is assignable to the feature.
	 */
	private boolean featureMatches(EStructuralFeature feature, Object value) {
		if (value instanceof Collection) { // All of the values must match
											// feature's type
			boolean result = true;
			for (Object obj : (Collection<Object>) value) {
				if (!feature.getEType().isInstance(obj) && obj != null) {
					result = false;
					break;
				}
			}
			return result;
		} else {
			return feature.getEType().isInstance(value);
		}
	}

	/**
	 * Lookup a class that matches a set of featuers.
	 * 
	 * @param features
	 *            the features used to lookup the class.
	 * @return the found {@link EClass} or <code>null</code>
	 */
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
								|| !featureMatches(eFeature,
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
			if (eClass == null) {
				logger.severe("Couldn't find class " + object.getClassName());
			}
		} else {
			eClass = eClassLookupByFeatures(features);
		}
		if (eClass == null) {
			return null;
		} else {
			EObject result = EcoreUtil.create(eClass);
			resource.getContents().add(result);
			for (String featureName : features.keySet()) {
				EStructuralFeature feature = eClass
						.getEStructuralFeature(featureName);
				if (feature == null) {
					logger.log(Level.SEVERE, "couldn't find a feature named "
							+ featureName + " in EClass " + eClass.getName());
				}
				if (feature.isMany()) {
					setFeature(feature, result, features.get(featureName));
				} else {
					result.eSet(feature, features.get(featureName));
				}
			}
			return result;
		}
	}

	/**
	 * Set a valued feature. If the featuer is many, the value must be a
	 * collection and all elements will be added to the feature.
	 * 
	 * @param feature
	 *            the feature to set.
	 * @param target
	 *            the target object.
	 * @param value
	 *            the value to set.
	 */
	private void setFeature(EStructuralFeature feature, EObject target,
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
			logger.info("Defining variable " + var);
			definitions.put(var, doSwitch(object.getDefinitions().get(var)));
		}
		return null;
	}

	/**
	 * Returns the value associated to the specified variable name.
	 * 
	 * @param varName
	 *            the variable.
	 * @return the value associated to the variable's name.
	 */
	public Object getVar(String varName) {
		return definitions.get(varName);
	}
}
