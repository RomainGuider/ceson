/**
 */
package org.eclipselabs.emf.ceson.test.family;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.test.family.Person#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.test.family.Person#getLastname <em>Lastname</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.test.family.Person#getBirthdate <em>Birthdate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getPerson_Firstname()
	 * @model
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.test.family.Person#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getPerson_Lastname()
	 * @model
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.test.family.Person#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(Date)
	 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getPerson_Birthdate()
	 * @model
	 * @generated
	 */
	Date getBirthdate();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.test.family.Person#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Date value);

} // Person
