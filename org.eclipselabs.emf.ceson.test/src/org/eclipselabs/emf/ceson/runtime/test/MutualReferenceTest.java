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
package org.eclipselabs.emf.ceson.runtime.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//CHECKSTYLE:OFF
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipselabs.emf.ceson.CesonException;
import org.eclipselabs.emf.ceson.CesonRuntime;
import org.eclipselabs.emf.ceson.test.family.Child;
import org.eclipselabs.emf.ceson.test.family.Family;
import org.eclipselabs.emf.ceson.test.family.FamilyPackage;
import org.eclipselabs.emf.ceson.test.family.Father;
import org.eclipselabs.emf.ceson.test.family.Mother;
import org.junit.Before;
import org.junit.Test;

//CHECKSTYLE:ON
/**
 * Series of tests on mutual references in ceson specifications.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class MutualReferenceTest {
	/**
	 * The ceson runtime used for tests.
	 */
	private CesonRuntime ceson;

	/**
	 * setup method used to prepare tests.
	 */
	@Before
	public void setUp() {
		ceson = new CesonRuntime();
		ceson.registerEPackage(FamilyPackage.eINSTANCE);
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
	private String readString(File file) throws IOException {
		FileInputStream iStream = new FileInputStream(file);
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

	/**
	 * Test the ability to read mutual references on the simpsons example.
	 * 
	 * @throws IOException
	 *             when a problem occurs with IO.
	 * @throws CesonException
	 *             when a problem occurs with Ceson.
	 */
	@Test
	public void simpsonsTest() throws IOException, CesonException {
		String input = readString(new File("testfiles/simpsons.ceson"));
		Resource resource = ceson.parseSpecification(input);
		assertEquals(1, resource.getContents().size());
		assertTrue(resource.getContents().get(0) instanceof Family);
		Family simsons = (Family)resource.getContents().get(0);
		assertEquals(5, simsons.getMembers().size());
		assertTrue(simsons.getMembers().get(0) instanceof Father);
		assertTrue(simsons.getMembers().get(1) instanceof Mother);
		assertTrue(simsons.getMembers().get(2) instanceof Child);
		assertTrue(simsons.getMembers().get(3) instanceof Child);
		assertTrue(simsons.getMembers().get(4) instanceof Child);
		assertEquals(simsons.getMembers().get(1), ((Father)simsons.getMembers().get(0)).getWife());
		assertEquals(simsons.getMembers().get(0), ((Mother)simsons.getMembers().get(1)).getHusband());

		assertEquals(simsons.getMembers().get(0), ((Child)simsons.getMembers().get(2)).getFather());
		assertEquals(simsons.getMembers().get(1), ((Child)simsons.getMembers().get(2)).getMother());
		assertEquals(simsons.getMembers().get(0), ((Child)simsons.getMembers().get(3)).getFather());
		assertEquals(simsons.getMembers().get(1), ((Child)simsons.getMembers().get(3)).getMother());
		assertEquals(simsons.getMembers().get(0), ((Child)simsons.getMembers().get(4)).getFather());
		assertEquals(simsons.getMembers().get(1), ((Child)simsons.getMembers().get(4)).getMother());
		// CHECKSTYLE:OFF
		assertEquals("homer", simsons.getMembers().get(0).getFirstname());
		assertEquals("simpson", simsons.getMembers().get(0).getLastname());
		assertEquals("marge", simsons.getMembers().get(1).getFirstname());
		assertEquals("simpson", simsons.getMembers().get(1).getLastname());
		assertEquals("bart", simsons.getMembers().get(2).getFirstname());
		assertEquals("simpson", simsons.getMembers().get(2).getLastname());
		assertEquals("lisa", simsons.getMembers().get(3).getFirstname());
		assertEquals("simpson", simsons.getMembers().get(3).getLastname());
		assertEquals("magie", simsons.getMembers().get(4).getFirstname());
		assertEquals("simpson", simsons.getMembers().get(4).getLastname());
		// CHECKSTYLE:ON
	}
}
