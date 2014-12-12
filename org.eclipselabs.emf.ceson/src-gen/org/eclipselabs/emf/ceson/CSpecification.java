/**
 */
package org.eclipselabs.emf.ceson;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.CSpecification#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.CSpecification#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.ceson.CesonPackage#getCSpecification()
 * @model
 * @generated
 */
public interface CSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipselabs.emf.ceson.CesonPackage#getCSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.CSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipselabs.emf.ceson.CValue},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' map.
	 * @see org.eclipselabs.emf.ceson.CesonPackage#getCSpecification_Definitions()
	 * @model mapType="org.eclipselabs.emf.ceson.StringToCesonValueMap<org.eclipse.emf.ecore.EString, org.eclipselabs.emf.ceson.CValue>"
	 * @generated
	 */
	EMap<String, CValue> getDefinitions();

} // CesonSpecification
