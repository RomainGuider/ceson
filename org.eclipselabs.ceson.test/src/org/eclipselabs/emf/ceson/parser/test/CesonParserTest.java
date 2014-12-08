package org.eclipselabs.emf.ceson.parser.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emf.ceson.CArrayValue;
import org.eclipselabs.emf.ceson.CEnumValue;
import org.eclipselabs.emf.ceson.CFeature;
import org.eclipselabs.emf.ceson.CReference;
import org.eclipselabs.emf.ceson.CesonBuilder;
import org.eclipselabs.emf.ceson.CesonIntValue;
import org.eclipselabs.emf.ceson.CesonModelBuilder;
import org.eclipselabs.emf.ceson.CesonObjectValue;
import org.eclipselabs.emf.ceson.CesonPackage;
import org.eclipselabs.emf.ceson.CesonRealValue;
import org.eclipselabs.emf.ceson.CesonSpecification;
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

	private CesonSpecification parseDefinition(String input) {
		CesonParser parser = createParser(input);
		CesonModelBuilder modelBuilder = new CesonModelBuilder(
				"testSpecification");
		parser.addParseListener(modelBuilder);
		parser.model();
		return modelBuilder.getSpecification();
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
		Object result = parseFeature("var : 'A string'");
		assertTrue(result instanceof CFeature);
		assertTrue(((CFeature) result).isContainment());
		assertEquals("var", ((CFeature) result).getName());
		CesonStringValue expected = (CesonStringValue) EcoreUtil
				.create(CesonPackage.Literals.CESON_STRING_VALUE);
		expected.setValue("A string");
		assertTrue(EcoreUtil.equals(expected, ((CFeature) result).getValue()));
	}

	@Test
	public void testReferencedFeature() {
		Object result = parseFeature("var > 'A string'");
		assertTrue(result instanceof CFeature);
		assertFalse(((CFeature) result).isContainment());
		assertEquals("var", ((CFeature) result).getName());
		CesonStringValue expected = (CesonStringValue) EcoreUtil
				.create(CesonPackage.Literals.CESON_STRING_VALUE);
		expected.setValue("A string");
		assertTrue(EcoreUtil.equals(expected, ((CFeature) result).getValue()));
	}

	@Test
	public void testNoClassSimpleObjectValue() {
		Object result = parseValue("{ feature1:'A string', feature2:10}");
		assertTrue(result instanceof CesonObjectValue);
		CesonObjectValue object = (CesonObjectValue) result;
		assertEquals(2, object.getFeatures().size());
		assertEquals("feature1", object.getFeatures().get(0).getName());
		CesonStringValue expected = (CesonStringValue) EcoreUtil
				.create(CesonPackage.Literals.CESON_STRING_VALUE);
		expected.setValue("A string");
		assertTrue(EcoreUtil.equals(expected, object.getFeatures().get(0)
				.getValue()));
		assertEquals("feature2", object.getFeatures().get(1).getName());
		assertTrue(EcoreUtil.equals(new CesonBuilder().intValue(10), object
				.getFeatures().get(1).getValue()));
	}

	@Test
	public void testObjectAndArrayInObject() {
		CesonObjectValue expectedObject = (CesonObjectValue) parseValue("{ feature1:'A string', feature2:10}");
		CArrayValue expectedArray = (CArrayValue) parseValue("[1,2,3]");
		Object result = parseValue("{feature1:'A string',feature2:{feature1:'A string', feature2:10},feature3:[1,2,3]}");
		assertTrue(result instanceof CesonObjectValue);
		CesonObjectValue object = (CesonObjectValue) result;
		assertEquals(3, object.getFeatures().size());
		CesonStringValue expected = (CesonStringValue) EcoreUtil
				.create(CesonPackage.Literals.CESON_STRING_VALUE);
		expected.setValue("A string");
		assertTrue(EcoreUtil.equals(expected, object.getFeatures().get(0)
				.getValue()));
		assertEquals("feature2", object.getFeatures().get(1).getName());
		assertTrue(EcoreUtil.equals(expectedObject, object.getFeatures().get(1)
				.getValue()));
		assertEquals("feature3", object.getFeatures().get(2).getName());
		assertTrue(EcoreUtil.equals(expectedArray, object.getFeatures().get(2)
				.getValue()));
	}

	@Test
	public void testSimpleObjectValue() {
		Object result = parseValue("mypackage.MyClass { feature1:'A string', feature2:10}");
		assertTrue(result instanceof CesonObjectValue);
		CesonObjectValue object = (CesonObjectValue) result;
		assertEquals("mypackage.MyClass", object.getClassName());
		assertEquals(2, object.getFeatures().size());
		assertEquals("feature1", object.getFeatures().get(0).getName());
		CesonStringValue expected = (CesonStringValue) EcoreUtil
				.create(CesonPackage.Literals.CESON_STRING_VALUE);
		expected.setValue("A string");
		assertTrue(EcoreUtil.equals(expected, object.getFeatures().get(0)
				.getValue()));
		assertEquals("feature2", object.getFeatures().get(1).getName());
		assertTrue(EcoreUtil.equals(new CesonBuilder().intValue(10), object
				.getFeatures().get(1).getValue()));
	}

	@Test
	public void testDefinition() {
		CesonSpecification specification = parseDefinition("var = 10");
		assertTrue(EcoreUtil.equals(new CesonBuilder().intValue(10),
				specification.getDefinitions().get("var")));
	}

	@Test
	public void testSpecification() {
		CesonSpecification specification = parseDefinition("var = 10;obj={f1>var,f2:'string'}");
		assertTrue(EcoreUtil.equals(new CesonBuilder().intValue(10),
				specification.getDefinitions().get("var")));
		assertTrue(EcoreUtil.equals(
				(EObject) parseValue("{f1>var,f2:'string'}"), specification
						.getDefinitions().get("obj")));
	}

	@Test
	public void testEmptyModelBuilderAccess() {
		assertNull(new CesonModelBuilder("test").getResult());
	}
}
