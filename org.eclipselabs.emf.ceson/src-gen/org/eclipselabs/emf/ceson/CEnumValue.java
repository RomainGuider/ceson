/**
 */
package org.eclipselabs.emf.ceson;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CEnum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.CEnumValue#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.CEnumValue#getEnumTypeName <em>Enum Type Name</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.CEnumValue#getLiteralName <em>Literal Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.ceson.CesonPackage#getCEnumValue()
 * @model
 * @generated
 */
public interface CEnumValue extends CValue {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.eclipselabs.emf.ceson.CesonPackage#getCEnumValue_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.CEnumValue#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Enum Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type Name</em>' attribute.
	 * @see #setEnumTypeName(String)
	 * @see org.eclipselabs.emf.ceson.CesonPackage#getCEnumValue_EnumTypeName()
	 * @model
	 * @generated
	 */
	String getEnumTypeName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.CEnumValue#getEnumTypeName <em>Enum Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Type Name</em>' attribute.
	 * @see #getEnumTypeName()
	 * @generated
	 */
	void setEnumTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Literal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Name</em>' attribute.
	 * @see #setLiteralName(String)
	 * @see org.eclipselabs.emf.ceson.CesonPackage#getCEnumValue_LiteralName()
	 * @model required="true"
	 * @generated
	 */
	String getLiteralName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.CEnumValue#getLiteralName <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Name</em>' attribute.
	 * @see #getLiteralName()
	 * @generated
	 */
	void setLiteralName(String value);

} // CEnumValue
