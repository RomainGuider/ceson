package org.eclipselabs.ceson.parser.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.eclipselabs.emf.ceson.CArrayValue;
import org.eclipselabs.emf.ceson.CEnumValue;
import org.eclipselabs.emf.ceson.CReference;
import org.eclipselabs.emf.ceson.CesonIntValue;
import org.eclipselabs.emf.ceson.CesonModelBuilder;
import org.eclipselabs.emf.ceson.CesonRealValue;
import org.eclipselabs.emf.ceson.CesonStringValue;
import org.eclipselabs.emf.ceson.parser.CesonLexer;
import org.eclipselabs.emf.ceson.parser.CesonParser;
import org.junit.Before;
import org.junit.Test;

public class CesonParserTest {

	@Before
	public void setUp() {

	}

	private CesonParser createParser(String input) {
		TokenStream stream = new BufferedTokenStream(new CesonLexer(
				new ANTLRInputStream(input)));
		CesonParser parser = new CesonParser(stream);
		return parser;
	}

	private Object parseDefinition(String input) {
		CesonParser parser = createParser(input);
		CesonModelBuilder modelBuilder = new CesonModelBuilder(
				"testSpecification");
		parser.addParseListener(modelBuilder);
		parser.definition();
		return modelBuilder.getResult();
	}

	private Object parseValue(String input) {
		CesonParser parser = createParser(input);
		CesonModelBuilder modelBuilder = new CesonModelBuilder(
				"testSpecification");
		parser.addParseListener(modelBuilder);
		parser.value();
		return modelBuilder.getResult();
	}

	private Object parseFeature(String input) {
		CesonParser parser = createParser(input);
		CesonModelBuilder modelBuilder = new CesonModelBuilder(
				"testSpecification");
		parser.addParseListener(modelBuilder);
		parser.feature();
		return modelBuilder.getResult();
	}

	public CesonParserTest() {
	}

	@Test
	public void testIntValueParsing() {
		Object result = parseValue("10");
		assertTrue(result instanceof CesonIntValue);
		assertEquals(10, ((CesonIntValue) result).getValue());
	}

	@Test
	public void testRealValueParsing() {
		Object result = parseValue("10.10");
		assertTrue(result instanceof CesonRealValue);
		assertEquals(new BigDecimal("10.10"),
				((CesonRealValue) result).getValue());
	}

	@Test
	public void testStringValueParsing() {
		Object result = parseValue("'a string'");
		assertTrue(result instanceof CesonStringValue);
		assertEquals("a string", ((CesonStringValue) result).getValue());
	}

	@Test
	public void testCompleteEnumValue() {
		Object result = parseValue("ceson.ValueType.INT");
		assertTrue(result instanceof CEnumValue);
		assertEquals("ceson", ((CEnumValue) result).getPackageName());
		assertEquals("ValueType", ((CEnumValue) result).getEnumTypeName());
		assertEquals("INT", ((CEnumValue) result).getLiteralName());
	}

	@Test
	public void testNoPackageEnumValue() {
		Object result = parseValue("ValueType.INT");
		assertTrue(result instanceof CEnumValue);
		assertEquals(null, ((CEnumValue) result).getPackageName());
		assertEquals("ValueType", ((CEnumValue) result).getEnumTypeName());
		assertEquals("INT", ((CEnumValue) result).getLiteralName());
	}

	@Test
	public void emptyArrayTest() {
		Object result = parseValue("[]");
		assertTrue(result instanceof CArrayValue);
		assertEquals(0, ((CArrayValue) result).getValues().size());
	}

	@Test
	public void oneValueArrayTest() {
		Object result = parseValue("[1]");
		assertTrue(result instanceof CArrayValue);
		assertEquals(1, ((CArrayValue) result).getValues().size());
		assertTrue(((CArrayValue) result).getValues().get(0) instanceof CesonIntValue);
		assertEquals(1, ((CesonIntValue) ((CArrayValue) result).getValues()
				.get(0)).getValue());
	}

	@Test
	public void threeValuesArrayTest() {
		Object result = parseValue("[1,2,3]");
		assertTrue(result instanceof CArrayValue);
		assertEquals(3, ((CArrayValue) result).getValues().size());
		assertTrue(((CArrayValue) result).getValues().get(0) instanceof CesonIntValue);
		assertEquals(1, ((CesonIntValue) ((CArrayValue) result).getValues()
				.get(0)).getValue());
		assertTrue(((CArrayValue) result).getValues().get(1) instanceof CesonIntValue);
		assertEquals(2, ((CesonIntValue) ((CArrayValue) result).getValues()
				.get(1)).getValue());
		assertTrue(((CArrayValue) result).getValues().get(2) instanceof CesonIntValue);
		assertEquals(3, ((CesonIntValue) ((CArrayValue) result).getValues()
				.get(2)).getValue());
	}

	@Test
	public void testRef() {
		Object result = parseValue("var");
		assertTrue(result instanceof CReference);
		assertEquals("var", ((CReference) result).getVarName());

	}

	@Test
	public void testcontaineFeature() {
		Object result = parseValue("var");
		assertTrue(result instanceof CReference);
		assertEquals("var", ((CReference) result).getVarName());
	}

}
