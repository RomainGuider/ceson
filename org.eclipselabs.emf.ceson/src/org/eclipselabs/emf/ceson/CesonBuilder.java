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

import java.math.BigDecimal;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A simple API to build Ceson model elements.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class CesonBuilder {
	/**
	 * Creates a new {@link CesonBuilder} instance.
	 */
	public CesonBuilder() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Create a new {@link CIntValue} instance.
	 * 
	 * @param value
	 *            the value
	 * @return a new {@link CIntValue} instance
	 */
	public CIntValue intValue(int value) {
		CIntValue result = (CIntValue) EcoreUtil
				.create(CesonPackage.Literals.CINT_VALUE);
		result.setValue(value);
		return result;
	}

	/**
	 * Create a new {@link CRealValue} instance.
	 * 
	 * @param value
	 *            the value
	 * @return a new {@link CRealValue} instance
	 */
	public CRealValue realValue(BigDecimal value) {
		CRealValue result = (CRealValue) EcoreUtil
				.create(CesonPackage.Literals.CREAL_VALUE);
		result.setValue(value);
		return result;
	}

	/**
	 * Create a new {@link CStringValue} instance.
	 * 
	 * @param value
	 *            the value
	 * @return a new {@link CStringValue} instance
	 */
	public CStringValue stringValue(String value) {
		CStringValue result = (CStringValue) EcoreUtil
				.create(CesonPackage.Literals.CSTRING_VALUE);
		result.setValue(value);
		return result;
	}

	/**
	 * Create a new {@link CArrayValue} instance.
	 * 
	 * @return a new {@link CArrayValue} instance
	 */
	public CArrayValue arrayValue() {
		return (CArrayValue) EcoreUtil
				.create(CesonPackage.Literals.CARRAY_VALUE);
	}

	/**
	 * Create a new {@link CArrayValue} instance.
	 * 
	 * @param values
	 *            the values
	 * @return a new {@link CArrayValue} instance
	 */
	public CArrayValue arrayValue(CValue... values) {
		CArrayValue result = (CArrayValue) EcoreUtil
				.create(CesonPackage.Literals.CARRAY_VALUE);
		for (CValue value : values) {
			result.getValues().add(value);
		}
		return result;

	}

	/**
	 * Create a new {@link CEnumValue} instance.
	 * 
	 * @param packageName
	 *            the package where the {@link org.eclipse.emf.ecore.EEnum}
	 *            lives.
	 * @param enumName
	 *            the name of the enumName.
	 * @param literalName
	 *            the name of the literal.
	 * @return a new {@link CEnumValue} instance
	 */
	public CEnumValue enumValue(String packageName, String enumName,
			String literalName) {
		CEnumValue result = (CEnumValue) EcoreUtil
				.create(CesonPackage.Literals.CENUM_VALUE);
		if (packageName != null) {
			result.setPackageName(packageName);
		}
		if (enumName != null) {
			result.setEnumTypeName(enumName);
		}
		if (literalName != null) {
			result.setLiteralName(literalName);
		}
		return result;
	}

	/**
	 * Creates a new {@link CReference} instance.
	 * 
	 * @param varName
	 *            the referenced variable's name.
	 * @return the new {@link CReference} instance.
	 */
	public Object ref(String varName) {
		CReference ref = (CReference) EcoreUtil
				.create(CesonPackage.Literals.CREFERENCE);
		ref.setVarName(varName);
		return ref;
	}

	/**
	 * Creates a new {@link CObjectValue} instance.
	 * 
	 * @param className
	 *            the name of the class of the created instance.
	 * @param features
	 *            the features of the created instance
	 * @return the new {@link CObjectValue} instance.
	 */
	public CObjectValue objectValue(String className, List<CFeature> features) {
		CObjectValue result = (CObjectValue) EcoreUtil
				.create(CesonPackage.Literals.COBJECT_VALUE);
		result.setClassName(className);
		result.getFeatures().addAll(features);
		return result;
	}

	/**
	 * creates a new {@link CFeature} instance.
	 * 
	 * @param name
	 *            the name of the feature.
	 * @param value
	 *            the value of the feature.
	 * @return the new {@link CFeature} instance.
	 */
	public CFeature feature(String name, CValue value) {
		CFeature result = (CFeature) EcoreUtil
				.create(CesonPackage.Literals.CFEATURE);
		result.setName(name);
		result.setValue(value);
		return result;
	}

	/**
	 * Creates a new {@link CBooleanValue} instance.
	 * 
	 * @param b
	 *            the value.
	 * @return the new {@link CBooleanValue} instance.
	 */
	public Object booleanValue(boolean b) {
		CBooleanValue result = (CBooleanValue) EcoreUtil
				.create(CesonPackage.Literals.CBOOLEAN_VALUE);
		result.setValue(b);
		return result;
	}
}
