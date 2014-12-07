package org.eclipselabs.ceson.parser.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStream;
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
}
