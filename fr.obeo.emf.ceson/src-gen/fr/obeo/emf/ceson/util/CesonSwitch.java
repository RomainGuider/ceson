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
package fr.obeo.emf.ceson.util;

import fr.obeo.emf.ceson.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see fr.obeo.emf.ceson.CesonPackage
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
			case CesonPackage.CVALUE: {
				CValue cValue = (CValue)theEObject;
				T result = caseCValue(cValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CANY_VALUE: {
				CAnyValue cAnyValue = (CAnyValue)theEObject;
				T result = caseCAnyValue(cAnyValue);
				if (result == null) result = caseCValue(cAnyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CINT_VALUE: {
				CIntValue cIntValue = (CIntValue)theEObject;
				T result = caseCIntValue(cIntValue);
				if (result == null) result = caseCValue(cIntValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CREAL_VALUE: {
				CRealValue cRealValue = (CRealValue)theEObject;
				T result = caseCRealValue(cRealValue);
				if (result == null) result = caseCValue(cRealValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CSTRING_VALUE: {
				CStringValue cStringValue = (CStringValue)theEObject;
				T result = caseCStringValue(cStringValue);
				if (result == null) result = caseCValue(cStringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.COBJECT_VALUE: {
				CObjectValue cObjectValue = (CObjectValue)theEObject;
				T result = caseCObjectValue(cObjectValue);
				if (result == null) result = caseCValue(cObjectValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CJAVA_OBJECT_VALUE: {
				CJavaObjectValue cJavaObjectValue = (CJavaObjectValue)theEObject;
				T result = caseCJavaObjectValue(cJavaObjectValue);
				if (result == null) result = caseCValue(cJavaObjectValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CARRAY_VALUE: {
				CArrayValue cArrayValue = (CArrayValue)theEObject;
				T result = caseCArrayValue(cArrayValue);
				if (result == null) result = caseCValue(cArrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CBOOLEAN_VALUE: {
				CBooleanValue cBooleanValue = (CBooleanValue)theEObject;
				T result = caseCBooleanValue(cBooleanValue);
				if (result == null) result = caseCValue(cBooleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.STRING_TO_CVALUE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, CValue> stringToCValueMap = (Map.Entry<String, CValue>)theEObject;
				T result = caseStringToCValueMap(stringToCValueMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CSPECIFICATION: {
				CSpecification cSpecification = (CSpecification)theEObject;
				T result = caseCSpecification(cSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CENUM_VALUE: {
				CEnumValue cEnumValue = (CEnumValue)theEObject;
				T result = caseCEnumValue(cEnumValue);
				if (result == null) result = caseCValue(cEnumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CREFERENCE: {
				CReference cReference = (CReference)theEObject;
				T result = caseCReference(cReference);
				if (result == null) result = caseCValue(cReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CesonPackage.CDATE_VALUE: {
				CDateValue cDateValue = (CDateValue)theEObject;
				T result = caseCDateValue(cDateValue);
				if (result == null) result = caseCValue(cDateValue);
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
	 * Returns the result of interpreting the object as an instance of '<em>CValue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CValue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCValue(CValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>CInt Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CInt Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIntValue(CIntValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CReal Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CReal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRealValue(CRealValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CString Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CString Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCStringValue(CStringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CObject Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CObject Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCObjectValue(CObjectValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>CBoolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CBoolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCBooleanValue(CBooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To CValue Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To CValue Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToCValueMap(Map.Entry<String, CValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSpecification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSpecification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSpecification(CSpecification object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>CDate Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDate Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDateValue(CDateValue object) {
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
