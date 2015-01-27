/**
 */
package org.eclipselabs.emf.ceson.test.family;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mother</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.test.family.Mother#getHusband <em>Husband</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getMother()
 * @model
 * @generated
 */
public interface Mother extends Parent {
	/**
	 * Returns the value of the '<em><b>Husband</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Husband</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Husband</em>' reference.
	 * @see #setHusband(Father)
	 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getMother_Husband()
	 * @model
	 * @generated
	 */
	Father getHusband();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.test.family.Mother#getHusband <em>Husband</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Husband</em>' reference.
	 * @see #getHusband()
	 * @generated
	 */
	void setHusband(Father value);

} // Mother
