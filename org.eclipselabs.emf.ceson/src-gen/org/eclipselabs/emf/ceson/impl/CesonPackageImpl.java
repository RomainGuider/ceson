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
import org.eclipselabs.emf.ceson.CEnumValue;
import org.eclipselabs.emf.ceson.CFeature;
import org.eclipselabs.emf.ceson.CJavaObjectValue;
import org.eclipselabs.emf.ceson.CReference;
import org.eclipselabs.emf.ceson.CesonFactory;
import org.eclipselabs.emf.ceson.CesonIntValue;
import org.eclipselabs.emf.ceson.CesonObjectValue;
import org.eclipselabs.emf.ceson.CesonPackage;
import org.eclipselabs.emf.ceson.CesonRealValue;
import org.eclipselabs.emf.ceson.CesonSpecification;
import org.eclipselabs.emf.ceson.CesonStringValue;
import org.eclipselabs.emf.ceson.CesonType;
import org.eclipselabs.emf.ceson.CesonValue;
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
	private EClass cesonValueEClass = null;

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
	private EClass cesonIntValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cesonRealValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cesonStringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cesonObjectValueEClass = null;

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
	private EClass stringToCesonValueMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cesonSpecificationEClass = null;

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
	private EEnum cesonTypeEEnum = null;

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
	public EClass getCesonValue() {
		return cesonValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCesonValue_Type() {
		return (EAttribute)cesonValueEClass.getEStructuralFeatures().get(0);
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
	public EClass getCesonIntValue() {
		return cesonIntValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCesonIntValue_Value() {
		return (EAttribute)cesonIntValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCesonRealValue() {
		return cesonRealValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCesonRealValue_Value() {
		return (EAttribute)cesonRealValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCesonStringValue() {
		return cesonStringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCesonStringValue_Value() {
		return (EAttribute)cesonStringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCesonObjectValue() {
		return cesonObjectValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCesonObjectValue_ClassName() {
		return (EAttribute)cesonObjectValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCesonObjectValue_Features() {
		return (EReference)cesonObjectValueEClass.getEStructuralFeatures().get(1);
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
	public EClass getStringToCesonValueMap() {
		return stringToCesonValueMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToCesonValueMap_Key() {
		return (EAttribute)stringToCesonValueMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToCesonValueMap_Value() {
		return (EReference)stringToCesonValueMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCesonSpecification() {
		return cesonSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCesonSpecification_Name() {
		return (EAttribute)cesonSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCesonSpecification_Definitions() {
		return (EReference)cesonSpecificationEClass.getEStructuralFeatures().get(1);
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
	public EEnum getCesonType() {
		return cesonTypeEEnum;
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

		cesonValueEClass = createEClass(CESON_VALUE);
		createEAttribute(cesonValueEClass, CESON_VALUE__TYPE);

		cAnyValueEClass = createEClass(CANY_VALUE);
		createEAttribute(cAnyValueEClass, CANY_VALUE__VALUE);

		cesonIntValueEClass = createEClass(CESON_INT_VALUE);
		createEAttribute(cesonIntValueEClass, CESON_INT_VALUE__VALUE);

		cesonRealValueEClass = createEClass(CESON_REAL_VALUE);
		createEAttribute(cesonRealValueEClass, CESON_REAL_VALUE__VALUE);

		cesonStringValueEClass = createEClass(CESON_STRING_VALUE);
		createEAttribute(cesonStringValueEClass, CESON_STRING_VALUE__VALUE);

		cesonObjectValueEClass = createEClass(CESON_OBJECT_VALUE);
		createEAttribute(cesonObjectValueEClass, CESON_OBJECT_VALUE__CLASS_NAME);
		createEReference(cesonObjectValueEClass, CESON_OBJECT_VALUE__FEATURES);

		cJavaObjectValueEClass = createEClass(CJAVA_OBJECT_VALUE);
		createEAttribute(cJavaObjectValueEClass, CJAVA_OBJECT_VALUE__VALUE);

		cArrayValueEClass = createEClass(CARRAY_VALUE);
		createEReference(cArrayValueEClass, CARRAY_VALUE__VALUES);

		stringToCesonValueMapEClass = createEClass(STRING_TO_CESON_VALUE_MAP);
		createEAttribute(stringToCesonValueMapEClass, STRING_TO_CESON_VALUE_MAP__KEY);
		createEReference(stringToCesonValueMapEClass, STRING_TO_CESON_VALUE_MAP__VALUE);

		cesonSpecificationEClass = createEClass(CESON_SPECIFICATION);
		createEAttribute(cesonSpecificationEClass, CESON_SPECIFICATION__NAME);
		createEReference(cesonSpecificationEClass, CESON_SPECIFICATION__DEFINITIONS);

		cEnumValueEClass = createEClass(CENUM_VALUE);
		createEAttribute(cEnumValueEClass, CENUM_VALUE__PACKAGE_NAME);
		createEAttribute(cEnumValueEClass, CENUM_VALUE__ENUM_TYPE_NAME);
		createEAttribute(cEnumValueEClass, CENUM_VALUE__LITERAL_NAME);

		cReferenceEClass = createEClass(CREFERENCE);
		createEAttribute(cReferenceEClass, CREFERENCE__VAR_NAME);

		// Create enums
		cesonTypeEEnum = createEEnum(CESON_TYPE);
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
		cAnyValueEClass.getESuperTypes().add(this.getCesonValue());
		cesonIntValueEClass.getESuperTypes().add(this.getCesonValue());
		cesonRealValueEClass.getESuperTypes().add(this.getCesonValue());
		cesonStringValueEClass.getESuperTypes().add(this.getCesonValue());
		cesonObjectValueEClass.getESuperTypes().add(this.getCesonValue());
		cJavaObjectValueEClass.getESuperTypes().add(this.getCesonValue());
		cArrayValueEClass.getESuperTypes().add(this.getCesonValue());
		cEnumValueEClass.getESuperTypes().add(this.getCesonValue());
		cReferenceEClass.getESuperTypes().add(this.getCesonValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(cFeatureEClass, CFeature.class, "CFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, CFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCFeature_Containment(), ecorePackage.getEBoolean(), "containment", "true", 0, 1, CFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFeature_Value(), this.getCesonValue(), null, "value", null, 0, 1, CFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cesonValueEClass, CesonValue.class, "CesonValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCesonValue_Type(), this.getCesonType(), "type", null, 0, 1, CesonValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cAnyValueEClass, CAnyValue.class, "CAnyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCAnyValue_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, CAnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cesonIntValueEClass, CesonIntValue.class, "CesonIntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCesonIntValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, CesonIntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cesonRealValueEClass, CesonRealValue.class, "CesonRealValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCesonRealValue_Value(), ecorePackage.getEBigDecimal(), "value", null, 1, 1, CesonRealValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cesonStringValueEClass, CesonStringValue.class, "CesonStringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCesonStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, CesonStringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cesonObjectValueEClass, CesonObjectValue.class, "CesonObjectValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCesonObjectValue_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, CesonObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCesonObjectValue_Features(), this.getCFeature(), null, "features", null, 0, -1, CesonObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cJavaObjectValueEClass, CJavaObjectValue.class, "CJavaObjectValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCJavaObjectValue_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, CJavaObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cArrayValueEClass, CArrayValue.class, "CArrayValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCArrayValue_Values(), this.getCesonValue(), null, "values", null, 0, -1, CArrayValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToCesonValueMapEClass, Map.Entry.class, "StringToCesonValueMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToCesonValueMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToCesonValueMap_Value(), this.getCesonValue(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cesonSpecificationEClass, CesonSpecification.class, "CesonSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCesonSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, CesonSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCesonSpecification_Definitions(), this.getStringToCesonValueMap(), null, "definitions", null, 0, -1, CesonSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEnumValueEClass, CEnumValue.class, "CEnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCEnumValue_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, CEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEnumValue_EnumTypeName(), ecorePackage.getEString(), "enumTypeName", null, 0, 1, CEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEnumValue_LiteralName(), ecorePackage.getEString(), "literalName", null, 1, 1, CEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cReferenceEClass, CReference.class, "CReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCReference_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, CReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cesonTypeEEnum, CesonType.class, "CesonType");
		addEEnumLiteral(cesonTypeEEnum, CesonType.ANY);
		addEEnumLiteral(cesonTypeEEnum, CesonType.INT);
		addEEnumLiteral(cesonTypeEEnum, CesonType.REAL);
		addEEnumLiteral(cesonTypeEEnum, CesonType.STRING);
		addEEnumLiteral(cesonTypeEEnum, CesonType.JOBJECT);
		addEEnumLiteral(cesonTypeEEnum, CesonType.COBJECT);
		addEEnumLiteral(cesonTypeEEnum, CesonType.CARRAY);

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
		  (cesonObjectValueEClass, 
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
		  (cesonObjectValueEClass, 
		   source, 
		   new String[] {
			 "documentation", "{@link CesonObject} instances are used to represent the result of \r\nparsing the notation without having to map it to an eObject."
		   });
	}

} //CesonPackageImpl
