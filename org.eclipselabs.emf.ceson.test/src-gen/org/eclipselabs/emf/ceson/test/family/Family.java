/**
 */
package org.eclipselabs.emf.ceson.test.family;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.test.family.Family#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.ceson.test.family.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.eclipselabs.emf.ceson.test.family.FamilyPackage#getFamily_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getMembers();

} // Family
