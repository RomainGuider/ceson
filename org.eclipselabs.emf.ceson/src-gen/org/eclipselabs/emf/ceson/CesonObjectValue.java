/**
 */
package org.eclipselabs.emf.ceson;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.CesonObjectValue#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.CesonObjectValue#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.ceson.CesonPackage#getCesonObjectValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeIsQualifiedName'"
 *        annotation="http://www.eclipse.org/emf/2002/Genmodel documentation='{@link CesonObject} instances are used to represent the result of \r\nparsing the notation without having to map it to an eObject.'"
 * @generated
 */
public interface CesonObjectValue extends CesonValue {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.eclipselabs.emf.ceson.CesonPackage#getCesonObjectValue_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.ceson.CesonObjectValue#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.ceson.CFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.eclipselabs.emf.ceson.CesonPackage#getCesonObjectValue_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<CFeature> getFeatures();

} // CesonObjectValue
