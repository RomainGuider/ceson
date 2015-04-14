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
package fr.obeo.emf.ceson.runtime.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


//CHECKSTYLE:OFF
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;

import fr.obeo.emf.ceson.CesonException;
//CHECKSTYLE:ON
import fr.obeo.emf.ceson.CesonRuntime;

/**
 * Unit tests of the {@link CesonRuntime} class.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class RuntimeTest {
	/**
	 * Tests parsing two single object values in a single resource.
	 * 
	 * @throws CesonException
	 *             shouldn't happen.
	 */
	@Test
	public void testValueSingleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		// CHECKSTYLE:OFF
		EObject value1 = (EObject)runtime.parseValue("ecore.EPackage {nsURI:'prefix'}");
		// CHECKSTYLE:ON
		EObject value2 = (EObject)runtime.parseValue("ecore.EPackage{nsURI:'prefix'}");
		assertTrue(value1 instanceof EPackage);
		assertTrue(value2 instanceof EPackage);
		assertTrue(value1.eResource() == value2.eResource());
	}

	/**
	 * Tests parsing two single object values in multiple resources.
	 * 
	 * @throws CesonException
	 *             shouldn't happen.
	 */
	@Test
	public void testValueMultipleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime(false);
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		EObject value1 = (EObject)runtime.parseValue("ecore.EPackage {nsURI:'prefix'}");
		EObject value2 = (EObject)runtime.parseValue("ecore.EPackage {nsURI:'prefix'}");
		assertTrue(value1 instanceof EPackage);
		assertTrue(value2 instanceof EPackage);
		assertTrue(value1.eResource() != value2.eResource());
	}

	/**
	 * Tests parsing two definitions in a single resource.
	 * 
	 * @throws CesonException
	 *             shouldn't happen.
	 */
	@Test
	public void testDefinitionSingleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		runtime.define("eClass=ecore.EClass {abstract:false}");
		// CHECKSTYLE:OFF
		runtime.define("package=ecore.EPackage {nsURI:'testPackage', eClassifiers:[eClass]}");
		assertTrue(runtime.parseValue("package") instanceof EPackage);
		assertTrue(runtime.parseValue("eClass") instanceof EClass);
		// CHECKSTYLE:ON
		assertNotNull(((EClass)runtime.parseValue("eClass")).eResource());
		assertNotNull(((EPackage)runtime.parseValue("package")).eResource());
		assertTrue(((EPackage)runtime.parseValue("package")).eResource() == ((EClass)runtime
				.parseValue("eClass")).eResource());
	}

	/**
	 * Tests parsing two definitions in multiple resources.
	 * 
	 * @throws CesonException
	 *             shouldn't happen.
	 */
	@Test
	public void testDefinitionMultipleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime(false);
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		runtime.define("eClass=ecore.EClass{abstract:false}");
		runtime.define("package=ecore.EPackage{nsURI:'testPackage', eClassifiers:[eClass]}");
		assertNotNull(((EClass)runtime.parseValue("eClass")).eResource());
		assertNotNull(((EPackage)runtime.parseValue("package")).eResource());
		assertTrue(((EPackage)runtime.parseValue("package")).eResource() != ((EClass)runtime
				.parseValue("eClass")).eResource());
	}

	/**
	 * Tests parsing two specifications in a single resource.
	 * 
	 * @throws CesonException
	 *             shouldn't happen.
	 */
	@Test
	public void testSpecificationSingleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		runtime.parseSpecification("eClass1=ecore.EClass {abstract:false,name:'MyGreatConcept1'}");
		runtime.parseSpecification("eClass=ecore.EClass {abstract:false,name:'MyGreatConcept'};"
				+ "package=ecore.EPackage{nsURI:'testPackage', eClassifiers:[eClass]}");
		// CHECKSTYLE:OFF
		assertNotNull(((EClass)runtime.parseValue("eClass1")).eResource());
		// CHECKSTYLE:ON
		assertNotNull(((EClass)runtime.parseValue("eClass")).eResource());
		assertNotNull(((EPackage)runtime.parseValue("package")).eResource());
		assertEquals(((EClass)runtime.parseValue("eClass1")).eResource(), ((EClass)runtime
				.parseValue("eClass")).eResource());
		assertEquals(((EClass)runtime.parseValue("eClass1")).eResource(), ((EPackage)runtime
				.parseValue("package")).eResource());
		assertTrue(runtime.parseValue("package") instanceof EPackage);
		assertTrue(runtime.parseValue("eClass") instanceof EClass);
		assertTrue(runtime.parseValue("eClass1") instanceof EClass);
	}

	/**
	 * Tests parsing two specifications in multiple resources.
	 * 
	 * @throws CesonException
	 *             shouldn't happen.
	 */
	@Test
	public void testSpecificationMultipleResource() throws CesonException {
		CesonRuntime runtime = new CesonRuntime(false);
		runtime.registerEPackage(EcorePackage.eINSTANCE);
		runtime.parseSpecification("eClass1=ecore.EClass {abstract:false,name:'MyGreatConcept1'}");
		runtime.parseSpecification("eClass=ecore.EClass {abstract:false,name:'MyGreatConcept'};"
				+ "package=ecore.EPackage {nsURI:'testPackage', eClassifiers:[eClass]}");
		assertNotNull(((EClass)runtime.parseValue("eClass1")).eResource());
		assertNotNull(((EClass)runtime.parseValue("eClass")).eResource());
		assertNotNull(((EPackage)runtime.parseValue("package")).eResource());
		assertTrue(((EClass)runtime.parseValue("eClass1")).eResource() != ((EClass)runtime
				.parseValue("eClass")).eResource());
		assertTrue(((EClass)runtime.parseValue("eClass1")).eResource() != ((EPackage)runtime
				.parseValue("package")).eResource());
		assertTrue(((EClass)runtime.parseValue("eClass")).eResource() == ((EPackage)runtime
				.parseValue("package")).eResource());
		assertTrue(runtime.parseValue("package") instanceof EPackage);
		assertTrue(runtime.parseValue("eClass") instanceof EClass);
		assertTrue(runtime.parseValue("eClass1") instanceof EClass);
	}

	/**
	 * Tests defining a value has an effect.
	 * 
	 * @throws CesonException
	 *             shouldn't happen.
	 */
	@Test
	public void testDefine() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		// CHECKSTYLE:OFF
		runtime.define("var0", 10);
		// CHECKSTYLE:ON
		assertEquals(10, runtime.parseValue("var0"));
	}

	/**
	 * Tests killing a definition has the proper effect.
	 * 
	 * @throws CesonException
	 *             shouldn't happen.
	 */
	@Test
	public void testKillDefinition() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.define("var0", 10);
		runtime.killDefinition("var0");
		assertNull(runtime.parseValue("var0"));
	}

	/**
	 * Tests clearing definitions has the proper effect.
	 * 
	 * @throws CesonException
	 *             shouldn't happen.
	 */
	@Test
	public void testClearDefinition() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.define("var0", 10);
		runtime.define("var1", 10);
		runtime.clearDefinitions();
		assertNull(runtime.parseValue("var0"));
		assertNull(runtime.parseValue("var1"));
	}

	/**
	 * Tests {@link CesonException} is thrown in case a syntax error is made.
	 * 
	 * @throws CesonException
	 *             expected exception.
	 */
	@Test(expected = CesonException.class)
	public void testBadSpecification() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.parseSpecification("eClass1={abstract:false,name:");
	}

	/**
	 * Tests {@link CesonException} is thrown in case a syntax error is made.
	 * 
	 * @throws CesonException
	 *             expected exception.
	 */
	@Test(expected = CesonException.class)
	public void testBadValue() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.parseValue("{abstract:false,name:");
	}

	/**
	 * Tests {@link CesonException} is thrown in case a syntax error is made.
	 * 
	 * @throws CesonException
	 *             expected exception.
	 */
	@Test(expected = CesonException.class)
	public void testBadDefinition() throws CesonException {
		CesonRuntime runtime = new CesonRuntime();
		runtime.define("eClass1={abstract:false,name:");
	}

	/**
	 * Tests {@link CesonException} is thrown in case a syntax error is made.
	 * 
	 * @throws CesonException
	 *             expected exception.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void defineNullValue() {
		new CesonRuntime().define("var", null);

	}

	/**
	 * Tests {@link CesonException} is thrown in case a syntax error is made.
	 * 
	 * @throws CesonException
	 *             expected exception.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void defineNullVariable() {
		new CesonRuntime().define(null, "");

	}
}
