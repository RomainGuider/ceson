package org.eclipselabs.emf.ceson;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

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

public class CesonRuntime {

	private SortedMap<String, EPackage> ePackages = new TreeMap<String, EPackage>();
	private Map<String, Object> definitions = new TreeMap<String, Object>();
	private ResourceSet resourceSet;
	private boolean singleResource;

	public CesonRuntime(ResourceSet rs, boolean singleResource) {
		this.resourceSet = rs;
		this.singleResource = singleResource;
		this.resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
	}

	public CesonRuntime(boolean singleResource) {
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
		this.singleResource = singleResource;
	}

	public CesonRuntime() {
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
		this.singleResource = true;
	}

	public void registerEPackage(EPackage ePackage) {
		ePackages.put(ePackage.getNsPrefix(), ePackage);
	}

	private CesonParser createParser(String input) {
		TokenStream stream = new BufferedTokenStream(new CesonLexer(
				new ANTLRInputStream(input)));
		CesonParser parser = new CesonParser(stream);
		return parser;
	}

	private Resource getResource(String name) {
		if (name == null || name.length() == 0) {
			name = "resource";
		}
		if (singleResource && resourceSet.getResources().size() > 0) {
			return resourceSet.getResources().get(0);
		} else {
			return resourceSet.createResource(URI.createURI("http://ceson//"
					+ name));
		}

	}

	public Resource parseSpecification(String description)
			throws CesonException {
		CesonParser parser = createParser(description);
		CesonModelBuilder modelBuilder = new CesonModelBuilder("");
		parser.addParseListener(modelBuilder);
		parser.model();
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

	public Object parseDefinition(String definition) throws CesonException {
		CesonParser parser = createParser(definition);
		CesonModelBuilder modelBuilder = new CesonModelBuilder("");
		parser.addParseListener(modelBuilder);
		parser.definition();
		Resource resource = getResource(modelBuilder.getSpecification()
				.getName());
		EcoreGenerator generator = new EcoreGenerator(ePackages, resource,
				definitions);
		String varName = (String) modelBuilder.getResult();
		if (varName == null || !(varName instanceof String)) {
			throw new CesonException("Couldn't parse the given definition.");
		}
		Object cResult = generator.doSwitch((EObject) modelBuilder
				.getSpecification().getDefinitions().get(varName));
		definitions.put(varName, cResult);
		return cResult;
	}

	public Object parseValue(String valueDescription) throws CesonException {
		CesonParser parser = createParser(valueDescription);
		CesonModelBuilder modelBuilder = new CesonModelBuilder("");
		parser.addParseListener(modelBuilder);
		parser.value();
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

	public Object define(String varName, Object value) {
		if (varName == null || value == null) {
			throw new IllegalArgumentException(
					"The variable name and the value must be non null.");
		}
		return this.definitions.put(varName, value);
	}

	public Object killDefinition(String varName) {
		return this.definitions.remove(varName);
	}

	public void clearDefinitions() {
		this.definitions.clear();
	}
}
