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
package org.eclipselabs.emf.ceson;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipselabs.emf.ceson.parser.CesonLexer;
import org.eclipselabs.emf.ceson.parser.CesonParser;

/**
 * {@link CesonRuntime} is the entry point to ceson.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class CesonRuntime {
	/**
	 * The wild card string.
	 */
	private static final String WILDCARD = "*";
	/**
	 * the registered {@link EPackage} instances.
	 */
	private SortedMap<String, EPackage> ePackages = new TreeMap<String, EPackage>();
	/**
	 * current definitions.
	 */
	private Map<String, Object> definitions = new TreeMap<String, Object>();
	/**
	 * The resource set used for this parser.
	 */
	private ResourceSet resourceSet;
	/**
	 * whether a single resource is used for generated object or not.
	 */
	private boolean singleResource;

	private Logger logger = Logger.getAnonymousLogger();

	/**
	 * Create a new {@link CesonRuntime} instance.
	 * 
	 * @param rs
	 *            the resource set to use.
	 * @param singleResource
	 *            whether a singel resource is used.
	 */
	public CesonRuntime(ResourceSet rs, boolean singleResource) {
		this.resourceSet = rs;
		this.singleResource = singleResource;
		this.resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(WILDCARD, new XMIResourceFactoryImpl());
	}

	/**
	 * Creates a new {@link CesonRuntime} instance.
	 * 
	 * @param singleResource
	 *            whether a single resource is used to generaed object or not.
	 */
	public CesonRuntime(boolean singleResource) {
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(WILDCARD, new XMIResourceFactoryImpl());
		this.singleResource = singleResource;
	}

	/**
	 * Creates a new {@link CesonRuntime} instance with it's own
	 * {@link ResourceSet}, and using a single resource.
	 */
	public CesonRuntime() {
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(WILDCARD, new XMIResourceFactoryImpl());
		this.singleResource = true;
	}

	/**
	 * Registers a new {@link EPackage}.
	 * 
	 * @param ePackage
	 *            the registered {@link EPackage}.
	 */
	public void registerEPackage(EPackage ePackage) {
		ePackages.put(ePackage.getNsPrefix(), ePackage);
	}

	/**
	 * Create a parser.
	 * 
	 * @param input
	 *            the parser's input.
	 * @return the created {@link CesonParser}
	 */
	private CesonParser createParser(String input) {
		TokenStream stream = new BufferedTokenStream(new CesonLexer(
				new ANTLRInputStream(input)));
		CesonParser parser = new CesonParser(stream);
		return parser;
	}

	/**
	 * get or create the specified resource.
	 * 
	 * @param name
	 *            the name of the resource
	 * @return the corresponding resource.
	 */
	private Resource getResource(String name) {
		String resourceName = name;
		if (name == null || name.length() == 0) {
			resourceName = "resource";
		}
		if (singleResource && resourceSet.getResources().size() > 0) {
			return resourceSet.getResources().get(0);
		} else {
			return resourceSet.createResource(URI.createURI("http://ceson//"
					+ resourceName));
		}

	}

	/**
	 * parse the specified string which must describe a Ceson specification.
	 * 
	 * @param description
	 *            the specification to parse.
	 * @return the resource that contains the objects in the specification.
	 * @throws CesonException
	 *             if a parsing or generation problem occurs.
	 */
	public Resource parseSpecification(String description)
			throws CesonException {
		CesonParser parser = createParser(description);
		CesonModelBuilder modelBuilder = new CesonModelBuilder("");
		parser.addParseListener(modelBuilder);
		try {
			parser.model();
		} catch (IllegalStateException ise) {
			throw new CesonException(ise);
		}
		Resource resource = getResource(modelBuilder.getSpecification()
				.getName());
		EcoreGenerator generator = new EcoreGenerator(ePackages, resource,
				definitions);
		CSpecification cResult = modelBuilder.getSpecification();
		if (cResult == null || !(cResult instanceof CSpecification)) {
			throw new CesonException("Couldn't parse the given specification.");
		}
		generator.doSwitch((EObject) cResult);
		return resource;
	}

	/**
	 * parse the specified string which must describe a Ceson definition.
	 * 
	 * @param definition
	 *            the definition to parse.
	 * @return the resource that contains the objects in the specification.
	 * @throws CesonException
	 *             if a parsing or generation problem occurs.
	 */
	public Object define(String definition) throws CesonException {
		CesonParser parser = createParser(definition);
		CesonModelBuilder modelBuilder = new CesonModelBuilder("");
		parser.addParseListener(modelBuilder);
		try {
			parser.definition();
		} catch (IllegalStateException ise) {
			throw new CesonException(ise);
		}
		Resource resource = getResource(modelBuilder.getSpecification()
				.getName());
		EcoreGenerator generator = new EcoreGenerator(ePackages, resource,
				definitions);
		String varName = (String) modelBuilder.getResult();
		Object cResult = generator.doSwitch((EObject) modelBuilder
				.getSpecification().getDefinitions().get(varName));
		definitions.put(varName, cResult);
		logger.info("defined " + varName + " to " + cResult);
		return cResult;
	}

	/**
	 * parse the specified string which must describe a Ceson value.
	 * 
	 * @param valueDescription
	 *            the valueDescription to parse.
	 * @return the resource that contains the objects in the specification.
	 * @throws CesonException
	 *             if a parsing or generation problem occurs.
	 */
	public Object parseValue(String valueDescription) throws CesonException {
		CesonParser parser = createParser(valueDescription);
		CesonModelBuilder modelBuilder = new CesonModelBuilder("");
		parser.addParseListener(modelBuilder);
		try {
			parser.value();
		} catch (IllegalStateException ise) {
			throw new CesonException(ise);
		}
		Resource resource = getResource(modelBuilder.getSpecification()
				.getName());
		EcoreGenerator generator = new EcoreGenerator(ePackages, resource,
				definitions);
		Object cResult = modelBuilder.getResult();
		if (cResult == null || !(cResult instanceof CValue)) {
			throw new CesonException("Couldn't parse the given definition.");
		}
		return generator.doSwitch((EObject) cResult);
	}

	/**
	 * Define a variable with an external {@link Object}.
	 * 
	 * @param varName
	 *            the name of the created definition.
	 * @param value
	 *            the value of the definition.
	 * @return the previous object associated to the name if any.
	 */
	public Object define(String varName, Object value) {
		if (varName == null || value == null) {
			throw new IllegalArgumentException(
					"The variable name and the value must be non null.");
		}
		logger.info("defined " + varName + " to " + value);
		return this.definitions.put(varName, value);
	}

	/**
	 * Kill a definition and returns it's value if any.
	 * 
	 * @param varName
	 *            the variable name of the definition.
	 * @return the value of the killed definition if any.
	 */
	public Object killDefinition(String varName) {
		return this.definitions.remove(varName);
	}

	/**
	 * Clear all the definitions.
	 */
	public void clearDefinitions() {
		this.definitions.clear();
	}

	/**
	 * Returns the definition for the specified variable's name.
	 * 
	 * @param varName
	 *            the variable which definition is seeked.
	 * @return the value of the definition.
	 */
	Object getDefinition(String varName) {
		return this.definitions.get(varName);
	}
}
