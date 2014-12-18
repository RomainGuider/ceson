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
package org.eclipselabs.emf.ceson.parser.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

//CHECKSTYLE:OFF
import java.math.BigDecimal;

//CHECKSTYLE:ON
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.ceson.CArrayValue;
import org.eclipselabs.emf.ceson.CBooleanValue;
import org.eclipselabs.emf.ceson.CEnumValue;
import org.eclipselabs.emf.ceson.CFeature;
import org.eclipselabs.emf.ceson.CIntValue;
import org.eclipselabs.emf.ceson.CObjectValue;
import org.eclipselabs.emf.ceson.CRealValue;
import org.eclipselabs.emf.ceson.CReference;
import org.eclipselabs.emf.ceson.CSpecification;
import org.eclipselabs.emf.ceson.CStringValue;
import org.eclipselabs.emf.ceson.CesonBuilder;
import org.eclipselabs.emf.ceson.CesonModelBuilder;
import org.eclipselabs.emf.ceson.CesonPackage;
import org.eclipselabs.emf.ceson.parser.CesonLexer;
import org.eclipselabs.emf.ceson.parser.CesonParser;
import org.junit.Test;

/**
 * Unit tests of the {@link CesonModelBuilder} class.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 */
public class CesonParserTest {
	/**
	 * The name used for specifications.
	 */
	public static final String SPEC_NAME = "testSpecification";

	/**
	 * The name used for variables.
	 */
	public static final String VAR_NAME = "var";

	/**
	 * Value used for string literals.
	 */
	public static final String STRING_VALUE = "a string";

	/**
	 * Name used for feature parsing.
	 */
	public static final String FEATURE_NAME1 = "feature1";

	/**
	 * Name used for feature parsing.
	 */
	public static final String FEATURE_NAME2 = "feature2";

	/**
	 * Create a parser given an input string.
	 * 
	 * @param input
	 *            the input
	 * @return a {@link CesonParser} instance
	 */
	private CesonParser createParser(String input) {
		TokenStream stream = new BufferedTokenStream(new CesonLexer(new ANTLRInputStream(input)));
		CesonParser parser = new CesonParser(stream);
		return parser;
	}

	/**
	 * Parse the specified input expecting a definition.
	 * 
	 * @param input
	 *            the input to parse.
	 * @return The {@link CSpecification} instance produced while parsing.
	 */
	private CSpecification parseDefinition(String input) {
		CesonParser parser = createParser(input);
		CesonModelBuilder modelBuilder = new CesonModelBuilder(SPEC_NAME);
		parser.addParseListener(modelBuilder);
		parser.model();
		return modelBuilder.getSpecification();
	}

	/**
	 * Parse the specified input expecting a value.
	 * 
	 * @param input
	 *            the input to parse.
	 * @return The {@link org.ecliplselabs.ceson.CValue} instance produced while parsing.
	 */
	private Object parseValue(String input) {
		CesonParser parser = createParser(input);
		CesonModelBuilder modelBuilder = new CesonModelBuilder(SPEC_NAME);
		parser.addParseListener(modelBuilder);
		parser.value();
		return modelBuilder.getResult();
	}

	/**
	 * Parse the specified input expecting a feature.
	 * 
	 * @param input
	 *            the input to parse.
	 * @return The {@link CFeature} instance produced while parsing.
	 */
	private Object parseFeature(String input) {
		CesonParser parser = createParser(input);
		CesonModelBuilder modelBuilder = new CesonModelBuilder(SPEC_NAME);
		parser.addParseListener(modelBuilder);
		parser.feature();
		return modelBuilder.getResult();
	}

	/**
	 * Tests parsing an integer value returns a {@link CIntValue} with the right value set.
	 */
	@Test
	public void testIntValueParsing() {
		Object result = parseValue("10");
		assertTrue(result instanceof CIntValue);
		assertEquals(10, ((CIntValue)result).getValue());
	}

	/**
	 * Test parsing the <code>true</code> boolean literal returns a {@link CBooleanValue} with the right value
	 * set.
	 */
	@Test
	public void testTrueLiteralParsing() {
		Object result = parseValue("true");
		assertTrue(result instanceof CBooleanValue);
		assertTrue(((CBooleanValue)result).isValue());
	}

	/**
	 * Test parsing the <code>false</code> boolean literal returns a {@link CBooleanValue} with the right
	 * value set.
	 */
	@Test
	public void testFalseLiteralParsing() {
		Object result = parseValue("false");
		assertTrue(result instanceof CBooleanValue);
		assertFalse(((CBooleanValue)result).isValue());
	}

	/**
	 * Tests parsing a real value returns a {@link CRealValue} with the right value set.
	 */
	@Test
	public void testRealValueParsing() {
		Object result = parseValue("10.10");
		assertTrue(result instanceof CRealValue);
		assertEquals(new BigDecimal("10.10"), ((CRealValue)result).getValue());
	}

	/**
	 * Tests parsing a string value returns a {@link CStringValue} with the right value set.
	 */
	@Test
	public void testStringValueParsing() {
		Object result = parseValue("'a string'");
		assertTrue(result instanceof CStringValue);
		assertEquals(STRING_VALUE, ((CStringValue)result).getValue());
	}

	/**
	 * Tests parsing a completely specified enum value returns a {@link CEnumValue} with the right value set.
	 */
	@Test
	public void testCompleteEnumValue() {
		Object result = parseValue("ceson.ValueType.INT");
		assertTrue(result instanceof CEnumValue);
		assertEquals("ceson", ((CEnumValue)result).getPackageName());
		assertEquals("ValueType", ((CEnumValue)result).getEnumTypeName());
		assertEquals("INT", ((CEnumValue)result).getLiteralName());
	}

	/**
	 * Tests parsing a enum value with no package specified returns a {@link CEnumValue} with the right value
	 * set.
	 */
	@Test
	public void testNoPackageEnumValue() {
		Object result = parseValue("ValueType.INT");
		assertTrue(result instanceof CEnumValue);
		assertEquals(null, ((CEnumValue)result).getPackageName());
		assertEquals("ValueType", ((CEnumValue)result).getEnumTypeName());
		assertEquals("INT", ((CEnumValue)result).getLiteralName());
	}

	/**
	 * Tests parsing "[]" returns an empty instance of {@link CArrayValue}.
	 */
	@Test
	public void emptyArrayTest() {
		Object result = parseValue("[]");
		assertTrue(result instanceof CArrayValue);
		assertEquals(0, ((CArrayValue)result).getValues().size());
	}

	/**
	 * Tests parsing "[1]" returns a {@link CArrayValue} with the proper {@link CIntValue} in it.
	 */
	@Test
	public void oneValueArrayTest() {
		Object result = parseValue("[1]");
		assertTrue(result instanceof CArrayValue);
		assertEquals(1, ((CArrayValue)result).getValues().size());
		assertTrue(((CArrayValue)result).getValues().get(0) instanceof CIntValue);
		assertEquals(1, ((CIntValue)((CArrayValue)result).getValues().get(0)).getValue());
	}

	/**
	 * Tests parsing "[1,2,3]" it returns a {@link CArrayValue} with the proper {@link CIntValue} instances in
	 * it.
	 */
	@Test
	public void threeValuesArrayTest() {
		Object result = parseValue("[1,2,3]");
		assertTrue(result instanceof CArrayValue);
		assertEquals(3, ((CArrayValue)result).getValues().size());
		assertTrue(((CArrayValue)result).getValues().get(0) instanceof CIntValue);
		assertEquals(1, ((CIntValue)((CArrayValue)result).getValues().get(0)).getValue());
		assertTrue(((CArrayValue)result).getValues().get(1) instanceof CIntValue);
		assertEquals(2, ((CIntValue)((CArrayValue)result).getValues().get(1)).getValue());
		assertTrue(((CArrayValue)result).getValues().get(2) instanceof CIntValue);
		assertEquals(3, ((CIntValue)((CArrayValue)result).getValues().get(2)).getValue());
	}

	/**
	 * Test parsing "var" returns a {@link CReference} instance.
	 */
	@Test
	public void testRef() {
		Object result = parseValue(VAR_NAME);
		assertTrue(result instanceof CReference);
		assertEquals(VAR_NAME, ((CReference)result).getVarName());

	}

	/**
	 * Tests parsing "var : 'A string'" results in a {@link CFeature} isntance describing a contained feature.
	 */
	@Test
	public void testcontaineFeature() {
		Object result = parseFeature("var : 'a string'");
		assertTrue(result instanceof CFeature);
		assertTrue(((CFeature)result).isContainment());
		assertEquals(VAR_NAME, ((CFeature)result).getName());
		CStringValue expected = (CStringValue)EcoreUtil.create(CesonPackage.Literals.CSTRING_VALUE);
		expected.setValue(STRING_VALUE);
		assertTrue(EcoreUtil.equals(expected, ((CFeature)result).getValue()));
	}

	/**
	 * Tests parsing "var > 'A string'" results in a {@link CFeature} isntance describing a reference feature.
	 */
	@Test
	public void testReferencedFeature() {
		Object result = parseFeature("var > 'a string'");
		assertTrue(result instanceof CFeature);
		assertFalse(((CFeature)result).isContainment());
		assertEquals(VAR_NAME, ((CFeature)result).getName());
		CStringValue expected = (CStringValue)EcoreUtil.create(CesonPackage.Literals.CSTRING_VALUE);
		expected.setValue(STRING_VALUE);
		assertTrue(EcoreUtil.equals(expected, ((CFeature)result).getValue()));
	}

	/**
	 * Tests parsing "{ feature1:'A string', feature2:10}" results in the proper {@link CObjectValue}
	 * instance.
	 */
	@Test
	public void testNoClassSimpleObjectValue() {
		Object result = parseValue("{ feature1:'a string', feature2:10}");
		assertTrue(result instanceof CObjectValue);
		CObjectValue object = (CObjectValue)result;
		assertEquals(2, object.getFeatures().size());
		assertEquals(FEATURE_NAME1, object.getFeatures().get(0).getName());
		CStringValue expected = (CStringValue)EcoreUtil.create(CesonPackage.Literals.CSTRING_VALUE);
		expected.setValue(STRING_VALUE);
		assertTrue(EcoreUtil.equals(expected, object.getFeatures().get(0).getValue()));
		assertEquals(FEATURE_NAME2, object.getFeatures().get(1).getName());
		assertTrue(EcoreUtil.equals(new CesonBuilder().intValue(10), object.getFeatures().get(1).getValue()));
	}

	/**
	 * Tests that parsing "{feature1:'A string',feature2:{feature1:'A string', feature2:10},feature3:[1,2,3]}"
	 * results in the proper {@link CObjectValue} instance.
	 */
	@Test
	public void testObjectAndArrayInObject() {
		CObjectValue expectedObject = (CObjectValue)parseValue("{ feature1:'a string', feature2:10}");
		CArrayValue expectedArray = (CArrayValue)parseValue("[1,2,3]");
		Object result = parseValue("{feature1:'a string',feature2:{feature1:'a string', feature2:10},feature3:[1,2,3]}");
		assertTrue(result instanceof CObjectValue);
		CObjectValue object = (CObjectValue)result;
		assertEquals(3, object.getFeatures().size());
		CStringValue expected = (CStringValue)EcoreUtil.create(CesonPackage.Literals.CSTRING_VALUE);
		expected.setValue(STRING_VALUE);
		assertTrue(EcoreUtil.equals(expected, object.getFeatures().get(0).getValue()));
		assertEquals(FEATURE_NAME2, object.getFeatures().get(1).getName());
		assertTrue(EcoreUtil.equals(expectedObject, object.getFeatures().get(1).getValue()));
		assertEquals("feature3", object.getFeatures().get(2).getName());
		assertTrue(EcoreUtil.equals(expectedArray, object.getFeatures().get(2).getValue()));
	}

	/**
	 * Tests that parsing "mypackage.MyClass { feature1:'A string', feature2:10}" results in the proper
	 * {@link CObjectValue} instance.
	 */
	@Test
	public void testSimpleObjectValue() {
		Object result = parseValue("mypackage.MyClass { feature1:'a string', feature2:10}");
		assertTrue(result instanceof CObjectValue);
		CObjectValue object = (CObjectValue)result;
		assertEquals("mypackage.MyClass", object.getClassName());
		assertEquals(2, object.getFeatures().size());
		assertEquals(FEATURE_NAME1, object.getFeatures().get(0).getName());
		CStringValue expected = (CStringValue)EcoreUtil.create(CesonPackage.Literals.CSTRING_VALUE);
		expected.setValue(STRING_VALUE);
		assertTrue(EcoreUtil.equals(expected, object.getFeatures().get(0).getValue()));
		assertEquals(FEATURE_NAME2, object.getFeatures().get(1).getName());
		assertTrue(EcoreUtil.equals(new CesonBuilder().intValue(10), object.getFeatures().get(1).getValue()));
	}

	/**
	 * Tests parsing "var = 10" results in the proper {@link org.eclipselabs.ceson.CDefinition} instance.
	 */
	@Test
	public void testDefinition() {
		CSpecification specification = parseDefinition("var = 10");
		assertTrue(EcoreUtil.equals(new CesonBuilder().intValue(10), specification.getDefinitions().get(
				VAR_NAME)));
	}

	/**
	 * Tests parsing "var = 10;obj={f1>var,f2:'string'}" results in the proper {@link CSpecification}
	 * instance.
	 */
	@Test
	public void testSpecification() {
		CSpecification specification = parseDefinition("var = 10;obj={f1>var,f2:'string'}");
		assertTrue(EcoreUtil.equals(new CesonBuilder().intValue(10), specification.getDefinitions().get(
				VAR_NAME)));
		assertTrue(EcoreUtil.equals((EObject)parseValue("{f1>var,f2:'string'}"), specification
				.getDefinitions().get("obj")));
	}

	/**
	 * Tests calling getResult on a unused {@link CesonModelBuilder} results in <code>null</code>.
	 */
	@Test
	public void testEmptyModelBuilderAccess() {
		assertNull(new CesonModelBuilder("test").getResult());
	}
}
