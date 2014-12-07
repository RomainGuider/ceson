/**
 */
package org.eclipselabs.emf.ceson;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emf.ceson.CesonFactory
 * @model kind="package"
 * @generated
 */
public interface CesonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ceson";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.emf.ceson/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ceson";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CesonPackage eINSTANCE = org.eclipselabs.emf.ceson.impl.CesonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CFeatureImpl <em>CFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CFeatureImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCFeature()
	 * @generated
	 */
	int CFEATURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFEATURE__CONTAINMENT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFEATURE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>CFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFEATURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>CFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CesonValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CesonValueImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonValue()
	 * @generated
	 */
	int CESON_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_VALUE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CAnyValueImpl <em>CAny Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CAnyValueImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCAnyValue()
	 * @generated
	 */
	int CANY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANY_VALUE__TYPE = CESON_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANY_VALUE__VALUE = CESON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CAny Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANY_VALUE_FEATURE_COUNT = CESON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CAny Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANY_VALUE_OPERATION_COUNT = CESON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CesonIntValueImpl <em>Int Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CesonIntValueImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonIntValue()
	 * @generated
	 */
	int CESON_INT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_INT_VALUE__TYPE = CESON_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_INT_VALUE__VALUE = CESON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_INT_VALUE_FEATURE_COUNT = CESON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_INT_VALUE_OPERATION_COUNT = CESON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CesonRealValueImpl <em>Real Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CesonRealValueImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonRealValue()
	 * @generated
	 */
	int CESON_REAL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_REAL_VALUE__TYPE = CESON_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_REAL_VALUE__VALUE = CESON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_REAL_VALUE_FEATURE_COUNT = CESON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_REAL_VALUE_OPERATION_COUNT = CESON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CesonStringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CesonStringValueImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonStringValue()
	 * @generated
	 */
	int CESON_STRING_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_STRING_VALUE__TYPE = CESON_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_STRING_VALUE__VALUE = CESON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_STRING_VALUE_FEATURE_COUNT = CESON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_STRING_VALUE_OPERATION_COUNT = CESON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CesonObjectValueImpl <em>Object Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CesonObjectValueImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonObjectValue()
	 * @generated
	 */
	int CESON_OBJECT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_OBJECT_VALUE__TYPE = CESON_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_OBJECT_VALUE__CLASS_NAME = CESON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_OBJECT_VALUE__FEATURES = CESON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_OBJECT_VALUE_FEATURE_COUNT = CESON_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_OBJECT_VALUE_OPERATION_COUNT = CESON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CJavaObjectValueImpl <em>CJava Object Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CJavaObjectValueImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCJavaObjectValue()
	 * @generated
	 */
	int CJAVA_OBJECT_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJAVA_OBJECT_VALUE__TYPE = CESON_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJAVA_OBJECT_VALUE__VALUE = CESON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CJava Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJAVA_OBJECT_VALUE_FEATURE_COUNT = CESON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CJava Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJAVA_OBJECT_VALUE_OPERATION_COUNT = CESON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CArrayValueImpl <em>CArray Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CArrayValueImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCArrayValue()
	 * @generated
	 */
	int CARRAY_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_VALUE__TYPE = CESON_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_VALUE__VALUE = CESON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CArray Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_VALUE_FEATURE_COUNT = CESON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CArray Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_VALUE_OPERATION_COUNT = CESON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.StringToCesonValueMapImpl <em>String To Ceson Value Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.StringToCesonValueMapImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getStringToCesonValueMap()
	 * @generated
	 */
	int STRING_TO_CESON_VALUE_MAP = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CESON_VALUE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CESON_VALUE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Ceson Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CESON_VALUE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Ceson Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CESON_VALUE_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CesonSpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CesonSpecificationImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonSpecification()
	 * @generated
	 */
	int CESON_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_SPECIFICATION__DEFINITIONS = 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CESON_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CEnumValueImpl <em>CEnum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CEnumValueImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCEnumValue()
	 * @generated
	 */
	int CENUM_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE__TYPE = CESON_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE__PACKAGE_NAME = CESON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enum Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE__ENUM_TYPE_NAME = CESON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE__LITERAL_NAME = CESON_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CEnum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE_FEATURE_COUNT = CESON_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CEnum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE_OPERATION_COUNT = CESON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.impl.CReferenceImpl <em>CReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.impl.CReferenceImpl
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCReference()
	 * @generated
	 */
	int CREFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREFERENCE__TYPE = CESON_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREFERENCE__VAR_NAME = CESON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREFERENCE_FEATURE_COUNT = CESON_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREFERENCE_OPERATION_COUNT = CESON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.ceson.CesonType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.ceson.CesonType
	 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonType()
	 * @generated
	 */
	int CESON_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CFeature <em>CFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFeature</em>'.
	 * @see org.eclipselabs.emf.ceson.CFeature
	 * @generated
	 */
	EClass getCFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.emf.ceson.CFeature#getName()
	 * @see #getCFeature()
	 * @generated
	 */
	EAttribute getCFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CFeature#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.eclipselabs.emf.ceson.CFeature#isContainment()
	 * @see #getCFeature()
	 * @generated
	 */
	EAttribute getCFeature_Containment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.emf.ceson.CFeature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CFeature#getValue()
	 * @see #getCFeature()
	 * @generated
	 */
	EReference getCFeature_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CesonValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonValue
	 * @generated
	 */
	EClass getCesonValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CesonValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonValue#getType()
	 * @see #getCesonValue()
	 * @generated
	 */
	EAttribute getCesonValue_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CAnyValue <em>CAny Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAny Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CAnyValue
	 * @generated
	 */
	EClass getCAnyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CAnyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CAnyValue#getValue()
	 * @see #getCAnyValue()
	 * @generated
	 */
	EAttribute getCAnyValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CesonIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonIntValue
	 * @generated
	 */
	EClass getCesonIntValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CesonIntValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonIntValue#getValue()
	 * @see #getCesonIntValue()
	 * @generated
	 */
	EAttribute getCesonIntValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CesonRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonRealValue
	 * @generated
	 */
	EClass getCesonRealValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CesonRealValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonRealValue#getValue()
	 * @see #getCesonRealValue()
	 * @generated
	 */
	EAttribute getCesonRealValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CesonStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonStringValue
	 * @generated
	 */
	EClass getCesonStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CesonStringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonStringValue#getValue()
	 * @see #getCesonStringValue()
	 * @generated
	 */
	EAttribute getCesonStringValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CesonObjectValue <em>Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonObjectValue
	 * @generated
	 */
	EClass getCesonObjectValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CesonObjectValue#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonObjectValue#getClassName()
	 * @see #getCesonObjectValue()
	 * @generated
	 */
	EAttribute getCesonObjectValue_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.ceson.CesonObjectValue#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonObjectValue#getFeatures()
	 * @see #getCesonObjectValue()
	 * @generated
	 */
	EReference getCesonObjectValue_Features();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CJavaObjectValue <em>CJava Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CJava Object Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CJavaObjectValue
	 * @generated
	 */
	EClass getCJavaObjectValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CJavaObjectValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CJavaObjectValue#getValue()
	 * @see #getCJavaObjectValue()
	 * @generated
	 */
	EAttribute getCJavaObjectValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CArrayValue <em>CArray Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CArray Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CArrayValue
	 * @generated
	 */
	EClass getCArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.ceson.CArrayValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CArrayValue#getValue()
	 * @see #getCArrayValue()
	 * @generated
	 */
	EReference getCArrayValue_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Ceson Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Ceson Value Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipselabs.emf.ceson.CesonValue" valueContainment="true"
	 * @generated
	 */
	EClass getStringToCesonValueMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToCesonValueMap()
	 * @generated
	 */
	EAttribute getStringToCesonValueMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToCesonValueMap()
	 * @generated
	 */
	EReference getStringToCesonValueMap_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CesonSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonSpecification
	 * @generated
	 */
	EClass getCesonSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CesonSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonSpecification#getName()
	 * @see #getCesonSpecification()
	 * @generated
	 */
	EAttribute getCesonSpecification_Name();

	/**
	 * Returns the meta object for the map '{@link org.eclipselabs.emf.ceson.CesonSpecification#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Definitions</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonSpecification#getDefinitions()
	 * @see #getCesonSpecification()
	 * @generated
	 */
	EReference getCesonSpecification_Definitions();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CEnumValue <em>CEnum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEnum Value</em>'.
	 * @see org.eclipselabs.emf.ceson.CEnumValue
	 * @generated
	 */
	EClass getCEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CEnumValue#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.eclipselabs.emf.ceson.CEnumValue#getPackageName()
	 * @see #getCEnumValue()
	 * @generated
	 */
	EAttribute getCEnumValue_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CEnumValue#getEnumTypeName <em>Enum Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Type Name</em>'.
	 * @see org.eclipselabs.emf.ceson.CEnumValue#getEnumTypeName()
	 * @see #getCEnumValue()
	 * @generated
	 */
	EAttribute getCEnumValue_EnumTypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CEnumValue#getLiteralName <em>Literal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Name</em>'.
	 * @see org.eclipselabs.emf.ceson.CEnumValue#getLiteralName()
	 * @see #getCEnumValue()
	 * @generated
	 */
	EAttribute getCEnumValue_LiteralName();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.ceson.CReference <em>CReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CReference</em>'.
	 * @see org.eclipselabs.emf.ceson.CReference
	 * @generated
	 */
	EClass getCReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.ceson.CReference#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see org.eclipselabs.emf.ceson.CReference#getVarName()
	 * @see #getCReference()
	 * @generated
	 */
	EAttribute getCReference_VarName();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.emf.ceson.CesonType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.eclipselabs.emf.ceson.CesonType
	 * @generated
	 */
	EEnum getCesonType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CesonFactory getCesonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CFeatureImpl <em>CFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CFeatureImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCFeature()
		 * @generated
		 */
		EClass CFEATURE = eINSTANCE.getCFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CFEATURE__NAME = eINSTANCE.getCFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CFEATURE__CONTAINMENT = eINSTANCE.getCFeature_Containment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFEATURE__VALUE = eINSTANCE.getCFeature_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CesonValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CesonValueImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonValue()
		 * @generated
		 */
		EClass CESON_VALUE = eINSTANCE.getCesonValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CESON_VALUE__TYPE = eINSTANCE.getCesonValue_Type();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CAnyValueImpl <em>CAny Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CAnyValueImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCAnyValue()
		 * @generated
		 */
		EClass CANY_VALUE = eINSTANCE.getCAnyValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANY_VALUE__VALUE = eINSTANCE.getCAnyValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CesonIntValueImpl <em>Int Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CesonIntValueImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonIntValue()
		 * @generated
		 */
		EClass CESON_INT_VALUE = eINSTANCE.getCesonIntValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CESON_INT_VALUE__VALUE = eINSTANCE.getCesonIntValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CesonRealValueImpl <em>Real Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CesonRealValueImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonRealValue()
		 * @generated
		 */
		EClass CESON_REAL_VALUE = eINSTANCE.getCesonRealValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CESON_REAL_VALUE__VALUE = eINSTANCE.getCesonRealValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CesonStringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CesonStringValueImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonStringValue()
		 * @generated
		 */
		EClass CESON_STRING_VALUE = eINSTANCE.getCesonStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CESON_STRING_VALUE__VALUE = eINSTANCE.getCesonStringValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CesonObjectValueImpl <em>Object Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CesonObjectValueImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonObjectValue()
		 * @generated
		 */
		EClass CESON_OBJECT_VALUE = eINSTANCE.getCesonObjectValue();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CESON_OBJECT_VALUE__CLASS_NAME = eINSTANCE.getCesonObjectValue_ClassName();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CESON_OBJECT_VALUE__FEATURES = eINSTANCE.getCesonObjectValue_Features();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CJavaObjectValueImpl <em>CJava Object Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CJavaObjectValueImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCJavaObjectValue()
		 * @generated
		 */
		EClass CJAVA_OBJECT_VALUE = eINSTANCE.getCJavaObjectValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CJAVA_OBJECT_VALUE__VALUE = eINSTANCE.getCJavaObjectValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CArrayValueImpl <em>CArray Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CArrayValueImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCArrayValue()
		 * @generated
		 */
		EClass CARRAY_VALUE = eINSTANCE.getCArrayValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRAY_VALUE__VALUE = eINSTANCE.getCArrayValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.StringToCesonValueMapImpl <em>String To Ceson Value Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.StringToCesonValueMapImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getStringToCesonValueMap()
		 * @generated
		 */
		EClass STRING_TO_CESON_VALUE_MAP = eINSTANCE.getStringToCesonValueMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_CESON_VALUE_MAP__KEY = eINSTANCE.getStringToCesonValueMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_CESON_VALUE_MAP__VALUE = eINSTANCE.getStringToCesonValueMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CesonSpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CesonSpecificationImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonSpecification()
		 * @generated
		 */
		EClass CESON_SPECIFICATION = eINSTANCE.getCesonSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CESON_SPECIFICATION__NAME = eINSTANCE.getCesonSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CESON_SPECIFICATION__DEFINITIONS = eINSTANCE.getCesonSpecification_Definitions();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CEnumValueImpl <em>CEnum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CEnumValueImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCEnumValue()
		 * @generated
		 */
		EClass CENUM_VALUE = eINSTANCE.getCEnumValue();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENUM_VALUE__PACKAGE_NAME = eINSTANCE.getCEnumValue_PackageName();

		/**
		 * The meta object literal for the '<em><b>Enum Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENUM_VALUE__ENUM_TYPE_NAME = eINSTANCE.getCEnumValue_EnumTypeName();

		/**
		 * The meta object literal for the '<em><b>Literal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENUM_VALUE__LITERAL_NAME = eINSTANCE.getCEnumValue_LiteralName();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.impl.CReferenceImpl <em>CReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.impl.CReferenceImpl
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCReference()
		 * @generated
		 */
		EClass CREFERENCE = eINSTANCE.getCReference();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREFERENCE__VAR_NAME = eINSTANCE.getCReference_VarName();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.ceson.CesonType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.ceson.CesonType
		 * @see org.eclipselabs.emf.ceson.impl.CesonPackageImpl#getCesonType()
		 * @generated
		 */
		EEnum CESON_TYPE = eINSTANCE.getCesonType();

	}

} //CesonPackage
