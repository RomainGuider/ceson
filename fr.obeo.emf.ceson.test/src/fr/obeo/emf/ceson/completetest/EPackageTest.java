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
package fr.obeo.emf.ceson.completetest;

import fr.obeo.emf.ceson.CesonException;
import fr.obeo.emf.ceson.CesonRuntime;

/**
 * Tests that creates a complete {@link org.eclipse.emf.ecore.EPackage} and that uses it as an ePackage for
 * another test.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class EPackageTest {
	/**
	 * The runtime used to create the entity {@link org.eclipse.emf.ecore.EPackage}.
	 */
	private CesonRuntime parser = new CesonRuntime();

	/**
	 * Creates the entity package.
	 * 
	 * @throws CesonException
	 *             if a syntax error is made.
	 */
	private void createEntityPackage() throws CesonException {
		parser.define("entityPackage = {nsURI:'http://entity/1.0',nsPrefix:'entity',name:'entity'");
		parser.define("int", java.lang.Integer.class);
		parser.define("string", java.lang.String.class);
		parser.define("real", java.lang.Double.class);
		parser.define("nature = ecore.EEnum {name:'Nature',eLiterals:[{value:'0' ,name:'INT'},{value:'1',name:'STRING'},{value:'2',name:'ENTITY']}}");

	}

}
