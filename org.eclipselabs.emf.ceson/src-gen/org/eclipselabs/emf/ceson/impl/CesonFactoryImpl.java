/**
 */
package org.eclipselabs.emf.ceson.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipselabs.emf.ceson.*;

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
			case CesonPackage.CESON_INT_VALUE: return createCesonIntValue();
			case CesonPackage.CESON_REAL_VALUE: return createCesonRealValue();
			case CesonPackage.CESON_STRING_VALUE: return createCesonStringValue();
			case CesonPackage.CESON_OBJECT_VALUE: return createCesonObjectValue();
			case CesonPackage.CJAVA_OBJECT_VALUE: return createCJavaObjectValue();
			case CesonPackage.CARRAY_VALUE: return createCArrayValue();
			case CesonPackage.STRING_TO_CESON_VALUE_MAP: return (EObject)createStringToCesonValueMap();
			case CesonPackage.CESON_SPECIFICATION: return createCesonSpecification();
			case CesonPackage.CENUM_VALUE: return createCEnumValue();
			case CesonPackage.CREFERENCE: return createCReference();
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
			case CesonPackage.CESON_TYPE:
				return createCesonTypeFromString(eDataType, initialValue);
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
			case CesonPackage.CESON_TYPE:
				return convertCesonTypeToString(eDataType, instanceValue);
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
	public CesonIntValue createCesonIntValue() {
		CesonIntValueImpl cesonIntValue = new CesonIntValueImpl();
		return cesonIntValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CesonRealValue createCesonRealValue() {
		CesonRealValueImpl cesonRealValue = new CesonRealValueImpl();
		return cesonRealValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CesonStringValue createCesonStringValue() {
		CesonStringValueImpl cesonStringValue = new CesonStringValueImpl();
		return cesonStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CesonObjectValue createCesonObjectValue() {
		CesonObjectValueImpl cesonObjectValue = new CesonObjectValueImpl();
		return cesonObjectValue;
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
	public Map.Entry<String, CesonValue> createStringToCesonValueMap() {
		StringToCesonValueMapImpl stringToCesonValueMap = new StringToCesonValueMapImpl();
		return stringToCesonValueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CesonSpecification createCesonSpecification() {
		CesonSpecificationImpl cesonSpecification = new CesonSpecificationImpl();
		return cesonSpecification;
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
	public CesonType createCesonTypeFromString(EDataType eDataType, String initialValue) {
		CesonType result = CesonType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCesonTypeToString(EDataType eDataType, Object instanceValue) {
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
