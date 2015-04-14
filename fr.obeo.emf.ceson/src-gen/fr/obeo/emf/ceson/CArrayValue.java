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
 * A representation of the model object '<em><b>CArray Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.emf.ceson.CArrayValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.emf.ceson.CesonPackage#getCArrayValue()
 * @model
 * @generated
 */
public interface CArrayValue extends CValue {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.emf.ceson.CValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see fr.obeo.emf.ceson.CesonPackage#getCArrayValue_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<CValue> getValues();

} // CArrayValue
