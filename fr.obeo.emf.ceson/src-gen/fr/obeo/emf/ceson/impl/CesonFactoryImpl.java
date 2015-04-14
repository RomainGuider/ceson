/**
 * 
 *   Copyright (c) 2008, 2014 Obeo.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 * 
 */
package fr.obeo.emf.ceson.impl;

import fr.obeo.emf.ceson.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CesonFactoryImpl extends EFactoryImpl implements CesonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CesonFactory init() {
		try {
			CesonFactory theCesonFactory = (CesonFactory)EPackage.Registry.INSTANCE.getEFactory(CesonPackage.eNS_URI);
			if (theCesonFactory != null) {
				return theCesonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CesonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CesonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CesonPackage.CFEATURE: return createCFeature();
			case CesonPackage.CANY_VALUE: return createCAnyValue();
			case CesonPackage.CINT_VALUE: return createCIntValue();
			case CesonPackage.CREAL_VALUE: return createCRealValue();
			case CesonPackage.CSTRING_VALUE: return createCStringValue();
			case CesonPackage.COBJECT_VALUE: return createCObjectValue();
			case CesonPackage.CJAVA_OBJECT_VALUE: return createCJavaObjectValue();
			case CesonPackage.CARRAY_VALUE: return createCArrayValue();
			case CesonPackage.CBOOLEAN_VALUE: return createCBooleanValue();
			case CesonPackage.STRING_TO_CVALUE_MAP: return (EObject)createStringToCValueMap();
			case CesonPackage.CSPECIFICATION: return createCSpecification();
			case CesonPackage.CENUM_VALUE: return createCEnumValue();
			case CesonPackage.CREFERENCE: return createCReference();
			case CesonPackage.CDATE_VALUE: return createCDateValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CesonPackage.CTYPE:
				return createCTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CesonPackage.CTYPE:
				return convertCTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFeature createCFeature() {
		CFeatureImpl cFeature = new CFeatureImpl();
		return cFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAnyValue createCAnyValue() {
		CAnyValueImpl cAnyValue = new CAnyValueImpl();
		return cAnyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIntValue createCIntValue() {
		CIntValueImpl cIntValue = new CIntValueImpl();
		return cIntValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRealValue createCRealValue() {
		CRealValueImpl cRealValue = new CRealValueImpl();
		return cRealValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CStringValue createCStringValue() {
		CStringValueImpl cStringValue = new CStringValueImpl();
		return cStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CObjectValue createCObjectValue() {
		CObjectValueImpl cObjectValue = new CObjectValueImpl();
		return cObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CJavaObjectValue createCJavaObjectValue() {
		CJavaObjectValueImpl cJavaObjectValue = new CJavaObjectValueImpl();
		return cJavaObjectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CArrayValue createCArrayValue() {
		CArrayValueImpl cArrayValue = new CArrayValueImpl();
		return cArrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CBooleanValue createCBooleanValue() {
		CBooleanValueImpl cBooleanValue = new CBooleanValueImpl();
		return cBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, CValue> createStringToCValueMap() {
		StringToCValueMapImpl stringToCValueMap = new StringToCValueMapImpl();
		return stringToCValueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSpecification createCSpecification() {
		CSpecificationImpl cSpecification = new CSpecificationImpl();
		return cSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEnumValue createCEnumValue() {
		CEnumValueImpl cEnumValue = new CEnumValueImpl();
		return cEnumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CReference createCReference() {
		CReferenceImpl cReference = new CReferenceImpl();
		return cReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDateValue createCDateValue() {
		CDateValueImpl cDateValue = new CDateValueImpl();
		return cDateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CType createCTypeFromString(EDataType eDataType, String initialValue) {
		CType result = CType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CesonPackage getCesonPackage() {
		return (CesonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CesonPackage getPackage() {
		return CesonPackage.eINSTANCE;
	}

} //CesonFactoryImpl
