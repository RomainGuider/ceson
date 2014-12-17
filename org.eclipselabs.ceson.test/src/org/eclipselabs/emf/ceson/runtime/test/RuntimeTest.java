package org.eclipselabs.emf.ceson.runtime.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipselabs.emf.ceson.CesonException;
import org.eclipselabs.emf.ceson.CesonRuntime;
import org.junit.Test;

public class RuntimeTest {

	@Test
	public void testValueSingleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		EObject value1 = (EObject) runtime.parseValue("{nsURI:'prefix'}");
		EObject value2 = (EObject) runtime.parseValue("{nsURI:'prefix'}");
		assertTrue(value1 instanceof EPackage);
		assertTrue(value2 instanceof EPackage);
		assertTrue(value1.eResource() == value2.eResource());
	}

	@Test
	public void testValueMultipleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime(false);
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		EObject value1 = (EObject) runtime.parseValue("{nsURI:'prefix'}");
		EObject value2 = (EObject) runtime.parseValue("{nsURI:'prefix'}");
		assertTrue(value1 instanceof EPackage);
		assertTrue(value2 instanceof EPackage);
		assertTrue(value1.eResource() != value2.eResource());
	}

	@Test
	public void testDefinitionSingleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		runtime.parseDefinition("eClass={abstract:false}");
		runtime.parseDefinition("package={nsURI:'testPackage', eClassifiers:[eClass]}");
		assertTrue(runtime.parseValue("package") instanceof EPackage);
		assertTrue(runtime.parseValue("eClass") instanceof EClass);
		assertNotNull(((EClass) runtime.parseValue("eClass")).eResource());
		assertNotNull(((EPackage) runtime.parseValue("package")).eResource());
		assertTrue(((EPackage) runtime.parseValue("package")).eResource() == ((EClass) runtime
				.parseValue("eClass")).eResource());
	}

	@Test
	public void testDefinitionMultipleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime(false);
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		runtime.parseDefinition("eClass={abstract:false}");
		runtime.parseDefinition("package={nsURI:'testPackage', eClassifiers:[eClass]}");
		assertNotNull(((EClass) runtime.parseValue("eClass")).eResource());
		assertNotNull(((EPackage) runtime.parseValue("package")).eResource());
		assertTrue(((EPackage) runtime.parseValue("package")).eResource() != ((EClass) runtime
				.parseValue("eClass")).eResource());
	}

	@Test
	public void testSpecificationSingleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		runtime.parseSpecification("eClass1={abstract:false,name:'MyGreatConcept1'}");
		runtime.parseSpecification("eClass={abstract:false,name:'MyGreatConcept'};"
				+ "package={nsURI:'testPackage', eClassifiers:[eClass]}");
		assertNotNull(((EClass) runtime.parseValue("eClass1")).eResource());
		assertNotNull(((EClass) runtime.parseValue("eClass")).eResource());
		assertNotNull(((EPackage) runtime.parseValue("package")).eResource());
		assertEquals(((EClass) runtime.parseValue("eClass1")).eResource(),
				((EClass) runtime.parseValue("eClass")).eResource());
		assertEquals(((EClass) runtime.parseValue("eClass1")).eResource(),
				((EPackage) runtime.parseValue("package")).eResource());
		assertTrue(runtime.parseValue("package") instanceof EPackage);
		assertTrue(runtime.parseValue("eClass") instanceof EClass);
		assertTrue(runtime.parseValue("eClass1") instanceof EClass);
	}

	@Test
	public void testSpecificationMultipleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime(false);
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		runtime.parseSpecification("eClass1={abstract:false,name:'MyGreatConcept1'}");
		runtime.parseSpecification("eClass={abstract:false,name:'MyGreatConcept'};"
				+ "package={nsURI:'testPackage', eClassifiers:[eClass]}");
		assertNotNull(((EClass) runtime.parseValue("eClass1")).eResource());
		assertNotNull(((EClass) runtime.parseValue("eClass")).eResource());
		assertNotNull(((EPackage) runtime.parseValue("package")).eResource());
		assertTrue(((EClass) runtime.parseValue("eClass1")).eResource() != ((EClass) runtime
				.parseValue("eClass")).eResource());
		assertTrue(((EClass) runtime.parseValue("eClass1")).eResource() != ((EPackage) runtime
				.parseValue("package")).eResource());
		assertTrue(((EClass) runtime.parseValue("eClass")).eResource() == ((EPackage) runtime
				.parseValue("package")).eResource());
		assertTrue(runtime.parseValue("package") instanceof EPackage);
		assertTrue(runtime.parseValue("eClass") instanceof EClass);
		assertTrue(runtime.parseValue("eClass1") instanceof EClass);
	}

	@Test
	public void testDefine() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.define("var0", 10);
		assertEquals(10, runtime.parseValue("var0"));
	}

	@Test
	public void testKillDefinition() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.define("var0", 10);
		runtime.killDefinition("var0");
		assertNull(runtime.parseValue("var0"));
	}

	@Test
	public void testClearDefinition() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.define("var0", 10);
		runtime.define("var1", 10);
		runtime.clearDefinitions();
		assertNull(runtime.parseValue("var0"));
		assertNull(runtime.parseValue("var1"));

	}
}
