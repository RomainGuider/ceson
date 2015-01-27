/**
 */
package org.eclipselabs.emf.ceson.test.family;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.test.family.Child#getMother <em>Mother</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.test.family.Child#getFather <em>Father</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getChild()
 * @model
 * @generated
 */
public interface Child extends Person {
	/**
	 * Returns the value of the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' reference.
	 * @see #setMother(Mother)
	 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getChild_Mother()
	 * @model
	 * @generated
	 */
	Mother getMother();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.test.family.Child#getMother <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Mother value);

	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Father)
	 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getChild_Father()
	 * @model
	 * @generated
	 */
	Father getFather();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.test.family.Child#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Father value);

} // Child
