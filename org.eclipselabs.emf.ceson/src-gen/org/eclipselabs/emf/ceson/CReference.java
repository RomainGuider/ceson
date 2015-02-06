/**
 */
package org.eclipselabs.emf.ceson;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.CReference#getVarName <em>Var Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.ceson.CesonPackage#getCReference()
 * @model
 * @generated
 */
public interface CReference extends CValue {
	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see org.eclipselabs.emf.ceson.CesonPackage#getCReference_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.CReference#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

} // CReference
