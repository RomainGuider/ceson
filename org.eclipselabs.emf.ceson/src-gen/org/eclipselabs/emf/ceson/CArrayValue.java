/**
 */
package org.eclipselabs.emf.ceson;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CArray Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.CArrayValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.ceson.CesonPackage#getCArrayValue()
 * @model
 * @generated
 */
public interface CArrayValue extends CValue {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.ceson.CValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.eclipselabs.emf.ceson.CesonPackage#getCArrayValue_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<CValue> getValues();

} // CArrayValue
