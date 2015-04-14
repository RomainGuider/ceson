/**
 */
package fr.obeo.emf.ceson.test.family;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.emf.ceson.test.family.Parent#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.emf.ceson.test.family.FamilyPackage#getParent()
 * @model
 * @generated
 */
public interface Parent extends Person {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.emf.ceson.test.family.Child}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see fr.obeo.emf.ceson.test.family.FamilyPackage#getParent_Children()
	 * @model
	 * @generated
	 */
	EList<Child> getChildren();

} // Parent
