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
package fr.obeo.emf.ceson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
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

//CHECKSTYLE:OFF
import fr.obeo.emf.ceson.impl.StringToCValueMapImpl;
//CHECKSTYLE:ON
import fr.obeo.emf.ceson.util.CesonSwitch;

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

	/**
	 * The logger used to report information, warning and problems.
	 */
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
	 * @param logger
	 *            the logger used to report problems and information
	 */
	public EcoreGenerator(SortedMap<String, EPackage> ePackages, Resource resource,
		Map<String, Object> definitions, Logger logger) {
	this.ePackages = ePackages;
	this.definitions = definitions;
	this.resource = resource;
	this.logger = logger;
	}

	/**
	 * Create a new {@link EcoreGenerationException} instance given a set of packages and resources.
	 * 
	 * @param ePackages
	 *            the {@link EPackage} instances to create {@link EObject} from.
	 * @param resource
	 *            the resource to set {@link EObject} in.
	 * @param definitions
	 *            set of value definition to be used in generation
	 */
	public EcoreGenerator(SortedMap<String, EPackage> ePackages, Resource resource,
		Map<String, Object> definitions) {
	this(ePackages, resource, definitions, Logger.getAnonymousLogger());
	}

	@Override
	public Object caseCIntValue(CIntValue object) {
	return object.getValue();
	}

	@Override
	public Object caseCDateValue(CDateValue object) {
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
	String packageName = object.getPackageName();
	for (EPackage ePackage : ePackages.values()) {
		if (packageName != null && !packageName.equals(ePackage.getName())) {
		continue;
		}
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
		if (eClassifier instanceof EEnum) {
			String enumTypeName = object.getEnumTypeName();
			if (enumTypeName != null && !enumTypeName.equals(eClassifier.getName())) {
			continue;
			}
			return EcoreUtil.createFromString((EDataType)eClassifier, object.getLiteralName());
		}
		}
	}
	return null;
	}

	@Override
	public Object caseCReference(CReference object) {
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
		result = (EClass)eClassifier;
		}
	} else {
		// iterate over the packages and return the first class which name
		// matches.
		for (EPackage ePackage : ePackages.values()) {
		EClassifier eClassifier = ePackage.getEClassifier(className);
		if (eClassifier instanceof EClass) {
			result = (EClass)eClassifier;
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
		for (Object obj : (Collection<Object>)value) {
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
	 * Create an {@link EObject} instance given a {@link CObjectValue} instance.
	 * 
	 * @param object
	 *            the {@link CObjectValue} instance to create an EOBject from.
	 * @return the seeked {@link EObject}.
	 */
	private EObject createEObject(CObjectValue object) {
	EClass eClass = eClassLookupByName(object.getClassName());
	if (eClass == null) {
		throw new EcoreGenerationException("Couldn't find class " + object.getClassName());
	}
	EObject result = EcoreUtil.create(eClass);
	resource.getContents().add(result);
	return result;
	}

	/**
	 * Create an EObject or get it if it is already assigned to a variable.
	 * 
	 * @param object
	 *            the {@link CObjectValue} instance to create an EOBject from.
	 * @return the seeked {@link EObject}.
	 */
	private EObject createOrGetEObject(CObjectValue object) {
	EObject container = object.eContainer();
	if (container instanceof StringToCValueMapImpl) {
		return (EObject)definitions.get(((StringToCValueMapImpl)container).getKey());
	} else {
		return createEObject(object);
	}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object caseCObjectValue(CObjectValue object) {
	Map<String, Object> features = new LinkedHashMap<String, Object>();
	for (CFeature feature : object.getFeatures()) {
		features.put(feature.getName(), doSwitch(feature.getValue()));
	}
	EClass eClass = eClassLookupByName(object.getClassName());
	if (eClass == null) {
		throw new EcoreGenerationException("Couldn't find class " + object.getClassName());
	}
	EObject result = createOrGetEObject(object);
	if (result == null) {
		return null;
	} else {
		for (String featureName : features.keySet()) {
		EStructuralFeature feature = eClass.getEStructuralFeature(featureName);
		if (feature == null) {
			throw new EcoreGenerationException("couldn't find a feature named " + featureName
				+ " in EClass " + eClass.getName());
		} else {
			if (feature.isMany()) {
			setFeature(feature, result, features.get(featureName));
			} else {
			result.eSet(feature, features.get(featureName));
			}
		}
		}
		return result;
	}
	}

	/**
	 * Set a valued feature. If the featuer is many, the value must be a collection and all elements will
	 * be added to the feature.
	 * 
	 * @param feature
	 *            the feature to set.
	 * @param target
	 *            the target object.
	 * @param value
	 *            the value to set.
	 */
	@SuppressWarnings({"rawtypes", "unchecked" })
	private void setFeature(EStructuralFeature feature, EObject target, Object value) {
	List list = (List<?>)target.eGet(feature);
	if (value instanceof Collection) {
		list.addAll((Collection)value);
	} else {
		list.add(value);
	}
	}

	@Override
	public Object caseCSpecification(CSpecification object) {
	for (String var : object.getDefinitions().keySet()) {
		// logger.info("Defining variable " + var);
		CValue value = object.getDefinitions().get(var);
		if (value instanceof CObjectValue) {
		definitions.put(var, createEObject((CObjectValue)value));
		}
	}
	for (String var : object.getDefinitions().keySet()) {
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
