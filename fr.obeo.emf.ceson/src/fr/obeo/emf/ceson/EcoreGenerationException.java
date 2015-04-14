/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
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
 * Exception thrown when a problem is encountered during ecore generation. It is
 * a {@link RuntimeException} so as to cope with Ecore switch API.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class EcoreGenerationException extends RuntimeException {
	/**
	 * Create a new {@link EcoreGenerationException} instance.
	 */
	public EcoreGenerationException() {
		super();
	}

	/**
	 * Create a new {@link EcoreGenerationException} instance.
	 * 
	 * @param msg
	 *            the message of the exception
	 */
	public EcoreGenerationException(String msg) {
		super(msg);
	}

	/**
	 * Create a new {@link EcoreGenerationException} instance.
	 * 
	 * @param msg
	 *            the message of the exception
	 * @param cause
	 *            the cause of the exception
	 */
	public EcoreGenerationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
