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
package fr.obeo.emf.ceson;

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
 * @see fr.obeo.emf.ceson.CesonFactory
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
	CesonPackage eINSTANCE = fr.obeo.emf.ceson.impl.CesonPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CFeatureImpl <em>CFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CFeatureImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCFeature()
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
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CValueImpl <em>CValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCValue()
	 * @generated
	 */
	int CVALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>CValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CAnyValueImpl <em>CAny Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CAnyValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCAnyValue()
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
	int CANY_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANY_VALUE__VALUE = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CAny Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANY_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CAny Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANY_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CIntValueImpl <em>CInt Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CIntValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCIntValue()
	 * @generated
	 */
	int CINT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINT_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINT_VALUE__VALUE = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CInt Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINT_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CInt Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINT_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CRealValueImpl <em>CReal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CRealValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCRealValue()
	 * @generated
	 */
	int CREAL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAL_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAL_VALUE__VALUE = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CReal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAL_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CReal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAL_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CStringValueImpl <em>CString Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CStringValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCStringValue()
	 * @generated
	 */
	int CSTRING_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_VALUE__VALUE = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CString Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CString Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CObjectValueImpl <em>CObject Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CObjectValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCObjectValue()
	 * @generated
	 */
	int COBJECT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBJECT_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBJECT_VALUE__CLASS_NAME = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBJECT_VALUE__FEATURES = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CObject Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBJECT_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CObject Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COBJECT_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CJavaObjectValueImpl <em>CJava Object Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CJavaObjectValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCJavaObjectValue()
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
	int CJAVA_OBJECT_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJAVA_OBJECT_VALUE__VALUE = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CJava Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJAVA_OBJECT_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CJava Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJAVA_OBJECT_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CArrayValueImpl <em>CArray Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CArrayValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCArrayValue()
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
	int CARRAY_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_VALUE__VALUES = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CArray Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CArray Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CBooleanValueImpl <em>CBoolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CBooleanValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCBooleanValue()
	 * @generated
	 */
	int CBOOLEAN_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBOOLEAN_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBOOLEAN_VALUE__VALUE = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CBoolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBOOLEAN_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CBoolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBOOLEAN_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.StringToCValueMapImpl <em>String To CValue Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.StringToCValueMapImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getStringToCValueMap()
	 * @generated
	 */
	int STRING_TO_CVALUE_MAP = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CVALUE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CVALUE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To CValue Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CVALUE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To CValue Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CVALUE_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CSpecificationImpl <em>CSpecification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CSpecificationImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCSpecification()
	 * @generated
	 */
	int CSPECIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSPECIFICATION__DEFINITIONS = 1;

	/**
	 * The number of structural features of the '<em>CSpecification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CSpecification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CEnumValueImpl <em>CEnum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CEnumValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCEnumValue()
	 * @generated
	 */
	int CENUM_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE__PACKAGE_NAME = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enum Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE__ENUM_TYPE_NAME = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE__LITERAL_NAME = CVALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CEnum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CEnum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CReferenceImpl <em>CReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CReferenceImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCReference()
	 * @generated
	 */
	int CREFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREFERENCE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREFERENCE__VAR_NAME = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREFERENCE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREFERENCE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.impl.CDateValueImpl <em>CDate Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.impl.CDateValueImpl
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCDateValue()
	 * @generated
	 */
	int CDATE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDATE_VALUE__TYPE = CVALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDATE_VALUE__VALUE = CVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CDate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDATE_VALUE_FEATURE_COUNT = CVALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CDate Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDATE_VALUE_OPERATION_COUNT = CVALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.emf.ceson.CType <em>CType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.emf.ceson.CType
	 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCType()
	 * @generated
	 */
	int CTYPE = 15;


	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CFeature <em>CFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFeature</em>'.
	 * @see fr.obeo.emf.ceson.CFeature
	 * @generated
	 */
	EClass getCFeature();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.emf.ceson.CFeature#getName()
	 * @see #getCFeature()
	 * @generated
	 */
	EAttribute getCFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CFeature#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see fr.obeo.emf.ceson.CFeature#isContainment()
	 * @see #getCFeature()
	 * @generated
	 */
	EAttribute getCFeature_Containment();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.emf.ceson.CFeature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.obeo.emf.ceson.CFeature#getValue()
	 * @see #getCFeature()
	 * @generated
	 */
	EReference getCFeature_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CValue <em>CValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CValue</em>'.
	 * @see fr.obeo.emf.ceson.CValue
	 * @generated
	 */
	EClass getCValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.obeo.emf.ceson.CValue#getType()
	 * @see #getCValue()
	 * @generated
	 */
	EAttribute getCValue_Type();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CAnyValue <em>CAny Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAny Value</em>'.
	 * @see fr.obeo.emf.ceson.CAnyValue
	 * @generated
	 */
	EClass getCAnyValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CAnyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.emf.ceson.CAnyValue#getValue()
	 * @see #getCAnyValue()
	 * @generated
	 */
	EAttribute getCAnyValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CIntValue <em>CInt Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CInt Value</em>'.
	 * @see fr.obeo.emf.ceson.CIntValue
	 * @generated
	 */
	EClass getCIntValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CIntValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.emf.ceson.CIntValue#getValue()
	 * @see #getCIntValue()
	 * @generated
	 */
	EAttribute getCIntValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CRealValue <em>CReal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CReal Value</em>'.
	 * @see fr.obeo.emf.ceson.CRealValue
	 * @generated
	 */
	EClass getCRealValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CRealValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.emf.ceson.CRealValue#getValue()
	 * @see #getCRealValue()
	 * @generated
	 */
	EAttribute getCRealValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CStringValue <em>CString Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CString Value</em>'.
	 * @see fr.obeo.emf.ceson.CStringValue
	 * @generated
	 */
	EClass getCStringValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CStringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.emf.ceson.CStringValue#getValue()
	 * @see #getCStringValue()
	 * @generated
	 */
	EAttribute getCStringValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CObjectValue <em>CObject Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CObject Value</em>'.
	 * @see fr.obeo.emf.ceson.CObjectValue
	 * @generated
	 */
	EClass getCObjectValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CObjectValue#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see fr.obeo.emf.ceson.CObjectValue#getClassName()
	 * @see #getCObjectValue()
	 * @generated
	 */
	EAttribute getCObjectValue_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.emf.ceson.CObjectValue#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see fr.obeo.emf.ceson.CObjectValue#getFeatures()
	 * @see #getCObjectValue()
	 * @generated
	 */
	EReference getCObjectValue_Features();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CJavaObjectValue <em>CJava Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CJava Object Value</em>'.
	 * @see fr.obeo.emf.ceson.CJavaObjectValue
	 * @generated
	 */
	EClass getCJavaObjectValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CJavaObjectValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.emf.ceson.CJavaObjectValue#getValue()
	 * @see #getCJavaObjectValue()
	 * @generated
	 */
	EAttribute getCJavaObjectValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CArrayValue <em>CArray Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CArray Value</em>'.
	 * @see fr.obeo.emf.ceson.CArrayValue
	 * @generated
	 */
	EClass getCArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.emf.ceson.CArrayValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see fr.obeo.emf.ceson.CArrayValue#getValues()
	 * @see #getCArrayValue()
	 * @generated
	 */
	EReference getCArrayValue_Values();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CBooleanValue <em>CBoolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CBoolean Value</em>'.
	 * @see fr.obeo.emf.ceson.CBooleanValue
	 * @generated
	 */
	EClass getCBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CBooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.emf.ceson.CBooleanValue#isValue()
	 * @see #getCBooleanValue()
	 * @generated
	 */
	EAttribute getCBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To CValue Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To CValue Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="fr.obeo.emf.ceson.CValue" valueContainment="true"
	 * @generated
	 */
	EClass getStringToCValueMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToCValueMap()
	 * @generated
	 */
	EAttribute getStringToCValueMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToCValueMap()
	 * @generated
	 */
	EReference getStringToCValueMap_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CSpecification <em>CSpecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSpecification</em>'.
	 * @see fr.obeo.emf.ceson.CSpecification
	 * @generated
	 */
	EClass getCSpecification();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.emf.ceson.CSpecification#getName()
	 * @see #getCSpecification()
	 * @generated
	 */
	EAttribute getCSpecification_Name();

	/**
	 * Returns the meta object for the map '{@link fr.obeo.emf.ceson.CSpecification#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Definitions</em>'.
	 * @see fr.obeo.emf.ceson.CSpecification#getDefinitions()
	 * @see #getCSpecification()
	 * @generated
	 */
	EReference getCSpecification_Definitions();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CEnumValue <em>CEnum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEnum Value</em>'.
	 * @see fr.obeo.emf.ceson.CEnumValue
	 * @generated
	 */
	EClass getCEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CEnumValue#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see fr.obeo.emf.ceson.CEnumValue#getPackageName()
	 * @see #getCEnumValue()
	 * @generated
	 */
	EAttribute getCEnumValue_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CEnumValue#getEnumTypeName <em>Enum Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Type Name</em>'.
	 * @see fr.obeo.emf.ceson.CEnumValue#getEnumTypeName()
	 * @see #getCEnumValue()
	 * @generated
	 */
	EAttribute getCEnumValue_EnumTypeName();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CEnumValue#getLiteralName <em>Literal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Name</em>'.
	 * @see fr.obeo.emf.ceson.CEnumValue#getLiteralName()
	 * @see #getCEnumValue()
	 * @generated
	 */
	EAttribute getCEnumValue_LiteralName();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CReference <em>CReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CReference</em>'.
	 * @see fr.obeo.emf.ceson.CReference
	 * @generated
	 */
	EClass getCReference();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CReference#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see fr.obeo.emf.ceson.CReference#getVarName()
	 * @see #getCReference()
	 * @generated
	 */
	EAttribute getCReference_VarName();

	/**
	 * Returns the meta object for class '{@link fr.obeo.emf.ceson.CDateValue <em>CDate Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDate Value</em>'.
	 * @see fr.obeo.emf.ceson.CDateValue
	 * @generated
	 */
	EClass getCDateValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.emf.ceson.CDateValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.emf.ceson.CDateValue#getValue()
	 * @see #getCDateValue()
	 * @generated
	 */
	EAttribute getCDateValue_Value();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.emf.ceson.CType <em>CType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CType</em>'.
	 * @see fr.obeo.emf.ceson.CType
	 * @generated
	 */
	EEnum getCType();

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
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CFeatureImpl <em>CFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CFeatureImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCFeature()
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
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CValueImpl <em>CValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCValue()
		 * @generated
		 */
		EClass CVALUE = eINSTANCE.getCValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVALUE__TYPE = eINSTANCE.getCValue_Type();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CAnyValueImpl <em>CAny Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CAnyValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCAnyValue()
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
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CIntValueImpl <em>CInt Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CIntValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCIntValue()
		 * @generated
		 */
		EClass CINT_VALUE = eINSTANCE.getCIntValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CINT_VALUE__VALUE = eINSTANCE.getCIntValue_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CRealValueImpl <em>CReal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CRealValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCRealValue()
		 * @generated
		 */
		EClass CREAL_VALUE = eINSTANCE.getCRealValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREAL_VALUE__VALUE = eINSTANCE.getCRealValue_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CStringValueImpl <em>CString Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CStringValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCStringValue()
		 * @generated
		 */
		EClass CSTRING_VALUE = eINSTANCE.getCStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSTRING_VALUE__VALUE = eINSTANCE.getCStringValue_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CObjectValueImpl <em>CObject Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CObjectValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCObjectValue()
		 * @generated
		 */
		EClass COBJECT_VALUE = eINSTANCE.getCObjectValue();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COBJECT_VALUE__CLASS_NAME = eINSTANCE.getCObjectValue_ClassName();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COBJECT_VALUE__FEATURES = eINSTANCE.getCObjectValue_Features();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CJavaObjectValueImpl <em>CJava Object Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CJavaObjectValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCJavaObjectValue()
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
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CArrayValueImpl <em>CArray Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CArrayValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCArrayValue()
		 * @generated
		 */
		EClass CARRAY_VALUE = eINSTANCE.getCArrayValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRAY_VALUE__VALUES = eINSTANCE.getCArrayValue_Values();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CBooleanValueImpl <em>CBoolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CBooleanValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCBooleanValue()
		 * @generated
		 */
		EClass CBOOLEAN_VALUE = eINSTANCE.getCBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CBOOLEAN_VALUE__VALUE = eINSTANCE.getCBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.StringToCValueMapImpl <em>String To CValue Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.StringToCValueMapImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getStringToCValueMap()
		 * @generated
		 */
		EClass STRING_TO_CVALUE_MAP = eINSTANCE.getStringToCValueMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_CVALUE_MAP__KEY = eINSTANCE.getStringToCValueMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_CVALUE_MAP__VALUE = eINSTANCE.getStringToCValueMap_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CSpecificationImpl <em>CSpecification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CSpecificationImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCSpecification()
		 * @generated
		 */
		EClass CSPECIFICATION = eINSTANCE.getCSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSPECIFICATION__NAME = eINSTANCE.getCSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSPECIFICATION__DEFINITIONS = eINSTANCE.getCSpecification_Definitions();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CEnumValueImpl <em>CEnum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CEnumValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCEnumValue()
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
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CReferenceImpl <em>CReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CReferenceImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCReference()
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
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.impl.CDateValueImpl <em>CDate Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.impl.CDateValueImpl
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCDateValue()
		 * @generated
		 */
		EClass CDATE_VALUE = eINSTANCE.getCDateValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDATE_VALUE__VALUE = eINSTANCE.getCDateValue_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.emf.ceson.CType <em>CType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.emf.ceson.CType
		 * @see fr.obeo.emf.ceson.impl.CesonPackageImpl#getCType()
		 * @generated
		 */
		EEnum CTYPE = eINSTANCE.getCType();

	}

} //CesonPackage
