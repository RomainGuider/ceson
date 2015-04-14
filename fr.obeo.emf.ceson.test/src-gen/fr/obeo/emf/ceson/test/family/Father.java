/**
 */
package fr.obeo.emf.ceson.test.family;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Father</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.emf.ceson.test.family.Father#getWife <em>Wife</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.emf.ceson.test.family.FamilyPackage#getFather()
 * @model
 * @generated
 */
public interface Father extends Parent {
	/**
	 * Returns the value of the '<em><b>Wife</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wife</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wife</em>' reference.
	 * @see #setWife(Mother)
	 * @see fr.obeo.emf.ceson.test.family.FamilyPackage#getFather_Wife()
	 * @model
	 * @generated
	 */
	Mother getWife();

	/**
	 * Sets the value of the '{@link fr.obeo.emf.ceson.test.family.Father#getWife <em>Wife</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wife</em>' reference.
	 * @see #getWife()
	 * @generated
	 */
	void setWife(Mother value);

} // Father
