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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CInt Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.emf.ceson.CIntValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.emf.ceson.CesonPackage#getCIntValue()
 * @model
 * @generated
 */
public interface CIntValue extends CValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fr.obeo.emf.ceson.CesonPackage#getCIntValue_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fr.obeo.emf.ceson.CIntValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // CIntValue