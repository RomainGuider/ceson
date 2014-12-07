/**
 */
package org.eclipselabs.emf.ceson.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipselabs.emf.ceson.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emf.ceson.CesonPackage
 * @generated
 */
public class CesonValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CesonValidator INSTANCE = new CesonValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipselabs.emf.ceson";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CesonValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CesonPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CesonPackage.CFEATURE:
				return validateCFeature((CFeature)value, diagnostics, context);
			case CesonPackage.CESON_VALUE:
				return validateCesonValue((CesonValue)value, diagnostics, context);
			case CesonPackage.CANY_VALUE:
				return validateCAnyValue((CAnyValue)value, diagnostics, context);
			case CesonPackage.CESON_INT_VALUE:
				return validateCesonIntValue((CesonIntValue)value, diagnostics, context);
			case CesonPackage.CESON_REAL_VALUE:
				return validateCesonRealValue((CesonRealValue)value, diagnostics, context);
			case CesonPackage.CESON_STRING_VALUE:
				return validateCesonStringValue((CesonStringValue)value, diagnostics, context);
			case CesonPackage.CESON_OBJECT_VALUE:
				return validateCesonObjectValue((CesonObjectValue)value, diagnostics, context);
			case CesonPackage.CJAVA_OBJECT_VALUE:
				return validateCJavaObjectValue((CJavaObjectValue)value, diagnostics, context);
			case CesonPackage.CARRAY_VALUE:
				return validateCArrayValue((CArrayValue)value, diagnostics, context);
			case CesonPackage.STRING_TO_CESON_VALUE_MAP:
				return validateStringToCesonValueMap((Map.Entry<?, ?>)value, diagnostics, context);
			case CesonPackage.CESON_SPECIFICATION:
				return validateCesonSpecification((CesonSpecification)value, diagnostics, context);
			case CesonPackage.CENUM_VALUE:
				return validateCEnumValue((CEnumValue)value, diagnostics, context);
			case CesonPackage.CREFERENCE:
				return validateCReference((CReference)value, diagnostics, context);
			case CesonPackage.CESON_TYPE:
				return validateCesonType((CesonType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCFeature(CFeature cFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCesonValue(CesonValue cesonValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cesonValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAnyValue(CAnyValue cAnyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cAnyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCesonIntValue(CesonIntValue cesonIntValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cesonIntValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCesonRealValue(CesonRealValue cesonRealValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cesonRealValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCesonStringValue(CesonStringValue cesonStringValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cesonStringValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCesonObjectValue(CesonObjectValue cesonObjectValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cesonObjectValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cesonObjectValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cesonObjectValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cesonObjectValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cesonObjectValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cesonObjectValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cesonObjectValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cesonObjectValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cesonObjectValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateCesonObjectValue_TypeIsQualifiedName(cesonObjectValue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypeIsQualifiedName constraint of '<em>Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCesonObjectValue_TypeIsQualifiedName(CesonObjectValue cesonObjectValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TypeIsQualifiedName", getObjectLabel(cesonObjectValue, context) },
						 new Object[] { cesonObjectValue },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCJavaObjectValue(CJavaObjectValue cJavaObjectValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cJavaObjectValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCArrayValue(CArrayValue cArrayValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cArrayValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringToCesonValueMap(Map.Entry<?, ?> stringToCesonValueMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)stringToCesonValueMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCesonSpecification(CesonSpecification cesonSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cesonSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCEnumValue(CEnumValue cEnumValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cEnumValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCReference(CReference cReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCesonType(CesonType cesonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CesonValidator
