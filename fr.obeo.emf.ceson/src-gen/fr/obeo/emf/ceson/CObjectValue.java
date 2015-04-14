/**
 * 
 *   Copyright (c) 2008, 2014 Obeo.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 * 
 */
package fr.obeo.emf.ceson;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CObject Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.emf.ceson.CObjectValue#getClassName <em>Class Name</em>}</li>
 *   <li>{@link fr.obeo.emf.ceson.CObjectValue#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.emf.ceson.CesonPackage#getCObjectValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TypeIsQualifiedName'"
 *        annotation="http://www.eclipse.org/emf/2002/Genmodel documentation='{@link CesonObject} instances are used to represent the result of \r\nparsing the notation without having to map it to an eObject.'"
 * @generated
 */
public interface CObjectValue extends CValue {
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
	 * @see fr.obeo.emf.ceson.CesonPackage#getCObjectValue_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link fr.obeo.emf.ceson.CObjectValue#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.emf.ceson.CFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see fr.obeo.emf.ceson.CesonPackage#getCObjectValue_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<CFeature> getFeatures();

} // CObjectValue
