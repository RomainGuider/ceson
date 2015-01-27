/**
 */
package org.eclipselabs.emf.ceson.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipselabs.emf.ceson.CAnyValue;
import org.eclipselabs.emf.ceson.CArrayValue;
import org.eclipselabs.emf.ceson.CBooleanValue;
import org.eclipselabs.emf.ceson.CEnumValue;
import org.eclipselabs.emf.ceson.CFeature;
import org.eclipselabs.emf.ceson.CJavaObjectValue;
import org.eclipselabs.emf.ceson.CReference;
import org.eclipselabs.emf.ceson.CesonFactory;
import org.eclipselabs.emf.ceson.CIntValue;
import org.eclipselabs.emf.ceson.CObjectValue;
import org.eclipselabs.emf.ceson.CesonPackage;
import org.eclipselabs.emf.ceson.CRealValue;
import org.eclipselabs.emf.ceson.CSpecification;
import org.eclipselabs.emf.ceson.CStringValue;
import org.eclipselabs.emf.ceson.CType;
import org.eclipselabs.emf.ceson.CValue;
import org.eclipselabs.emf.ceson.util.CesonValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CesonPackageImpl extends EPackageImpl implements CesonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cAnyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cIntValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cRealValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cStringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cObjectValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cJavaObjectValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cArrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToCValueMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEnumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipselabs.emf.ceson.CesonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CesonPackageImpl() {
		super(eNS_URI, CesonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CesonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CesonPackage init() {
		if (isInited) return (CesonPackage)EPackage.Registry.INSTANCE.getEPackage(CesonPackage.eNS_URI);

		// Obtain or create and register package
		CesonPackageImpl theCesonPackage = (CesonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CesonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CesonPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCesonPackage.createPackageContents();

		// Initialize created meta-data
		theCesonPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCesonPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CesonValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCesonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CesonPackage.eNS_URI, theCesonPackage);
		return theCesonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFeature() {
		return cFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCFeature_Name() {
		return (EAttribute)cFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCFeature_Containment() {
		return (EAttribute)cFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFeature_Value() {
		return (EReference)cFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCValue() {
		return cValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCValue_Type() {
		return (EAttribute)cValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAnyValue() {
		return cAnyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCAnyValue_Value() {
		return (EAttribute)cAnyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCIntValue() {
		return cIntValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCIntValue_Value() {
		return (EAttribute)cIntValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRealValue() {
		return cRealValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRealValue_Value() {
		return (EAttribute)cRealValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCStringValue() {
		return cStringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCStringValue_Value() {
		return (EAttribute)cStringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCObjectValue() {
		return cObjectValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCObjectValue_ClassName() {
		return (EAttribute)cObjectValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCObjectValue_Features() {
		return (EReference)cObjectValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCJavaObjectValue() {
		return cJavaObjectValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCJavaObjectValue_Value() {
		return (EAttribute)cJavaObjectValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCArrayValue() {
		return cArrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCArrayValue_Values() {
		return (EReference)cArrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCBooleanValue() {
		return cBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCBooleanValue_Value() {
		return (EAttribute)cBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToCValueMap() {
		return stringToCValueMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToCValueMap_Key() {
		return (EAttribute)stringToCValueMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToCValueMap_Value() {
		return (EReference)stringToCValueMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSpecification() {
		return cSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSpecification_Name() {
		return (EAttribute)cSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSpecification_Definitions() {
		return (EReference)cSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEnumValue() {
		return cEnumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEnumValue_PackageName() {
		return (EAttribute)cEnumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEnumValue_EnumTypeName() {
		return (EAttribute)cEnumValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEnumValue_LiteralName() {
		return (EAttribute)cEnumValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCReference() {
		return cReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCReference_VarName() {
		return (EAttribute)cReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCType() {
		return cTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CesonFactory getCesonFactory() {
		return (CesonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cFeatureEClass = createEClass(CFEATURE);
		createEAttribute(cFeatureEClass, CFEATURE__NAME);
		createEAttribute(cFeatureEClass, CFEATURE__CONTAINMENT);
		createEReference(cFeatureEClass, CFEATURE__VALUE);

		cValueEClass = createEClass(CVALUE);
		createEAttribute(cValueEClass, CVALUE__TYPE);

		cAnyValueEClass = createEClass(CANY_VALUE);
		createEAttribute(cAnyValueEClass, CANY_VALUE__VALUE);

		cIntValueEClass = createEClass(CINT_VALUE);
		createEAttribute(cIntValueEClass, CINT_VALUE__VALUE);

		cRealValueEClass = createEClass(CREAL_VALUE);
		createEAttribute(cRealValueEClass, CREAL_VALUE__VALUE);

		cStringValueEClass = createEClass(CSTRING_VALUE);
		createEAttribute(cStringValueEClass, CSTRING_VALUE__VALUE);

		cObjectValueEClass = createEClass(COBJECT_VALUE);
		createEAttribute(cObjectValueEClass, COBJECT_VALUE__CLASS_NAME);
		createEReference(cObjectValueEClass, COBJECT_VALUE__FEATURES);

		cJavaObjectValueEClass = createEClass(CJAVA_OBJECT_VALUE);
		createEAttribute(cJavaObjectValueEClass, CJAVA_OBJECT_VALUE__VALUE);

		cArrayValueEClass = createEClass(CARRAY_VALUE);
		createEReference(cArrayValueEClass, CARRAY_VALUE__VALUES);

		cBooleanValueEClass = createEClass(CBOOLEAN_VALUE);
		createEAttribute(cBooleanValueEClass, CBOOLEAN_VALUE__VALUE);

		stringToCValueMapEClass = createEClass(STRING_TO_CVALUE_MAP);
		createEAttribute(stringToCValueMapEClass, STRING_TO_CVALUE_MAP__KEY);
		createEReference(stringToCValueMapEClass, STRING_TO_CVALUE_MAP__VALUE);

		cSpecificationEClass = createEClass(CSPECIFICATION);
		createEAttribute(cSpecificationEClass, CSPECIFICATION__NAME);
		createEReference(cSpecificationEClass, CSPECIFICATION__DEFINITIONS);

		cEnumValueEClass = createEClass(CENUM_VALUE);
		createEAttribute(cEnumValueEClass, CENUM_VALUE__PACKAGE_NAME);
		createEAttribute(cEnumValueEClass, CENUM_VALUE__ENUM_TYPE_NAME);
		createEAttribute(cEnumValueEClass, CENUM_VALUE__LITERAL_NAME);

		cReferenceEClass = createEClass(CREFERENCE);
		createEAttribute(cReferenceEClass, CREFERENCE__VAR_NAME);

		// Create enums
		cTypeEEnum = createEEnum(CTYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cAnyValueEClass.getESuperTypes().add(this.getCValue());
		cIntValueEClass.getESuperTypes().add(this.getCValue());
		cRealValueEClass.getESuperTypes().add(this.getCValue());
		cStringValueEClass.getESuperTypes().add(this.getCValue());
		cObjectValueEClass.getESuperTypes().add(this.getCValue());
		cJavaObjectValueEClass.getESuperTypes().add(this.getCValue());
		cArrayValueEClass.getESuperTypes().add(this.getCValue());
		cBooleanValueEClass.getESuperTypes().add(this.getCValue());
		cEnumValueEClass.getESuperTypes().add(this.getCValue());
		cReferenceEClass.getESuperTypes().add(this.getCValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(cFeatureEClass, CFeature.class, "CFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, CFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCFeature_Containment(), ecorePackage.getEBoolean(), "containment", "true", 0, 1, CFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFeature_Value(), this.getCValue(), null, "value", null, 0, 1, CFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cValueEClass, CValue.class, "CValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCValue_Type(), this.getCType(), "type", null, 0, 1, CValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cAnyValueEClass, CAnyValue.class, "CAnyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCAnyValue_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, CAnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cIntValueEClass, CIntValue.class, "CIntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCIntValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, CIntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cRealValueEClass, CRealValue.class, "CRealValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCRealValue_Value(), ecorePackage.getEBigDecimal(), "value", null, 1, 1, CRealValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cStringValueEClass, CStringValue.class, "CStringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, CStringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cObjectValueEClass, CObjectValue.class, "CObjectValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCObjectValue_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, CObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCObjectValue_Features(), this.getCFeature(), null, "features", null, 0, -1, CObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cJavaObjectValueEClass, CJavaObjectValue.class, "CJavaObjectValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCJavaObjectValue_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, CJavaObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cArrayValueEClass, CArrayValue.class, "CArrayValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCArrayValue_Values(), this.getCValue(), null, "values", null, 0, -1, CArrayValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cBooleanValueEClass, CBooleanValue.class, "CBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, CBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToCValueMapEClass, Map.Entry.class, "StringToCValueMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToCValueMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToCValueMap_Value(), this.getCValue(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSpecificationEClass, CSpecification.class, "CSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, CSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSpecification_Definitions(), this.getStringToCValueMap(), null, "definitions", null, 0, -1, CSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEnumValueEClass, CEnumValue.class, "CEnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCEnumValue_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, CEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEnumValue_EnumTypeName(), ecorePackage.getEString(), "enumTypeName", null, 0, 1, CEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEnumValue_LiteralName(), ecorePackage.getEString(), "literalName", null, 1, 1, CEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cReferenceEClass, CReference.class, "CReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCReference_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, CReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cTypeEEnum, CType.class, "CType");
		addEEnumLiteral(cTypeEEnum, CType.ANY);
		addEEnumLiteral(cTypeEEnum, CType.INT);
		addEEnumLiteral(cTypeEEnum, CType.REAL);
		addEEnumLiteral(cTypeEEnum, CType.STRING);
		addEEnumLiteral(cTypeEEnum, CType.JOBJECT);
		addEEnumLiteral(cTypeEEnum, CType.COBJECT);
		addEEnumLiteral(cTypeEEnum, CType.CARRAY);
		addEEnumLiteral(cTypeEEnum, CType.ALL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Genmodel
		createGenmodelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (cObjectValueEClass, 
		   source, 
		   new String[] {
			 "constraints", "TypeIsQualifiedName"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Genmodel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenmodelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Genmodel";	
		addAnnotation
		  (cObjectValueEClass, 
		   source, 
		   new String[] {
			 "documentation", "{@link CesonObject} instances are used to represent the result of \r\nparsing the notation without having to map it to an eObject."
		   });
	}

} //CesonPackageImpl
