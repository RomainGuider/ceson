/**
 */
package org.eclipselabs.emf.ceson.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipselabs.emf.ceson.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emf.ceson.CesonPackage
 * @generated
 */
public class CesonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CesonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CesonSwitch() {
		if (modelPackage == null) {
			modelPackage = CesonPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CesonPackage.CFEATURE: {
				CFeature cFeature = (CFeature)theEObject;
				T result = caseCFeature(cFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CESON_VALUE: {
				CesonValue cesonValue = (CesonValue)theEObject;
				T result = caseCesonValue(cesonValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CANY_VALUE: {
				CAnyValue cAnyValue = (CAnyValue)theEObject;
				T result = caseCAnyValue(cAnyValue);
				if (result == null) result = caseCesonValue(cAnyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CESON_INT_VALUE: {
				CesonIntValue cesonIntValue = (CesonIntValue)theEObject;
				T result = caseCesonIntValue(cesonIntValue);
				if (result == null) result = caseCesonValue(cesonIntValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CESON_REAL_VALUE: {
				CesonRealValue cesonRealValue = (CesonRealValue)theEObject;
				T result = caseCesonRealValue(cesonRealValue);
				if (result == null) result = caseCesonValue(cesonRealValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CESON_STRING_VALUE: {
				CesonStringValue cesonStringValue = (CesonStringValue)theEObject;
				T result = caseCesonStringValue(cesonStringValue);
				if (result == null) result = caseCesonValue(cesonStringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CESON_OBJECT_VALUE: {
				CesonObjectValue cesonObjectValue = (CesonObjectValue)theEObject;
				T result = caseCesonObjectValue(cesonObjectValue);
				if (result == null) result = caseCesonValue(cesonObjectValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CJAVA_OBJECT_VALUE: {
				CJavaObjectValue cJavaObjectValue = (CJavaObjectValue)theEObject;
				T result = caseCJavaObjectValue(cJavaObjectValue);
				if (result == null) result = caseCesonValue(cJavaObjectValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CARRAY_VALUE: {
				CArrayValue cArrayValue = (CArrayValue)theEObject;
				T result = caseCArrayValue(cArrayValue);
				if (result == null) result = caseCesonValue(cArrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.STRING_TO_CESON_VALUE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, CesonValue> stringToCesonValueMap = (Map.Entry<String, CesonValue>)theEObject;
				T result = caseStringToCesonValueMap(stringToCesonValueMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CESON_SPECIFICATION: {
				CesonSpecification cesonSpecification = (CesonSpecification)theEObject;
				T result = caseCesonSpecification(cesonSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CENUM_VALUE: {
				CEnumValue cEnumValue = (CEnumValue)theEObject;
				T result = caseCEnumValue(cEnumValue);
				if (result == null) result = caseCesonValue(cEnumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CREFERENCE: {
				CReference cReference = (CReference)theEObject;
				T result = caseCReference(cReference);
				if (result == null) result = caseCesonValue(cReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFeature(CFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCesonValue(CesonValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAny Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAny Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAnyValue(CAnyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCesonIntValue(CesonIntValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCesonRealValue(CesonRealValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCesonStringValue(CesonStringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCesonObjectValue(CesonObjectValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CJava Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CJava Object Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCJavaObjectValue(CJavaObjectValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CArray Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CArray Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCArrayValue(CArrayValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Ceson Value Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Ceson Value Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToCesonValueMap(Map.Entry<String, CesonValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCesonSpecification(CesonSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CEnum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CEnum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEnumValue(CEnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCReference(CReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CesonSwitch
