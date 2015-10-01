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
package fr.obeo.emf.ceson.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import fr.obeo.emf.ceson.CesonException;
import fr.obeo.emf.ceson.CesonRuntime;

/**
 * {@link CesonResource} can be used to read a ceson description with the classical ResourceFactory system.
 * The resource set must be equipped with a {@link CesonRuntime} instance that is accessible through the
 * option map using the key define herein. This runtime will have all the appropriate EPackages already
 * registered.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class CesonResource extends ResourceImpl {

	public static final String RUNTIME_KEY = "CESONRUNTIME";

	/**
	 * Creates a new {@link CesonResource} instance given a URI.
	 */
	public CesonResource(URI uri) {
	super(uri);
	}

	/**
	 * Reads a specification from a input path and returns the content file as string.
	 * 
	 * @param file
	 *            The file relative path.
	 * @return the content file as string.
	 * @throws IOException
	 *             Shouldn't happen.
	 */
	private String readString(InputStream iStream) throws IOException {
	StringBuilder builder = new StringBuilder();
	int available = iStream.available();
	while (available > 0) {
		byte[] buffer = new byte[available];
		iStream.read(buffer);
		builder.append(new String(buffer));
		available = iStream.available();
	}
	return builder.toString();
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
	ResourceSet rs = this.getResourceSet();
	CesonRuntime runtime = (CesonRuntime)rs.getLoadOptions().get(RUNTIME_KEY);
	String cesonDescription = readString(inputStream);
	try {
		runtime.parseSpecification(cesonDescription, this);
	} catch (CesonException e) {
		throw new IOException(e);
	}
	}
}
