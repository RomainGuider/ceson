/*******************************************************************************
 * Copyright (c) 2008, 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.emf.ceson;

/**
 * Exception thrown by the ceson runtime when a parsing or generation problem
 * occurs.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class CesonException extends Exception {
	/**
	 * Creates a new {@link CesonException} instance.
	 */
	public CesonException() {
	}

	/**
	 * Creates a new {@link CesonException} instance with the specified message.
	 * 
	 * @param msg
	 *            the message for the exception.
	 */
	public CesonException(String msg) {
		super(msg);
	}

	/**
	 * Creates a new {@link CesonException} instance with the specified cause.
	 * 
	 * @param cause
	 *            the initial cause of the exception.
	 */
	public CesonException(Throwable cause) {
		super(cause);
	}

	/**
	 * Creates a new {@link CesonException} instance.
	 * 
	 * @param msg
	 *            the message for the exception.
	 * @param cause
	 *            the initial cause of the exception.
	 */

	public CesonException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
