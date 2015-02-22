package org.eclipselabs.emf.ceson.ui.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.jface.text.rules.Token;
import org.eclipselabs.emf.ceson.ui.editors.CesonDefinitionRule;
import org.junit.Before;
import org.junit.Test;

public class DefinitionRuleTest {
	private CesonDefinitionRule rule;
	private Token success;

	@Before
	public void setUp() {
		success = new Token("SUCCESS");
		rule = new CesonDefinitionRule(success);
	}

	@Test
	public void testDefinitionOfInt() {
		TestScanner scanner = new TestScanner("var = 1;");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(8, scanner.getCursor());
	}

	@Test
	public void testDefinitionOfIntEOF() {
		TestScanner scanner = new TestScanner("var = 1");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(7, scanner.getCursor());
	}

	@Test
	public void testDefinitionOfIntFailed() {
		TestScanner scanner = new TestScanner("var = 1 var2=3");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(14, scanner.getCursor());
	}

	@Test
	public void testDefinitionOfObject() {
		TestScanner scanner = new TestScanner(
				"var = pack.Concept {name:'name'}");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(32, scanner.getCursor());
	}

	@Test
	public void testDefinitionOfObjectSemicolon() {
		TestScanner scanner = new TestScanner(
				"var = pack.Concept {name:'name'};");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(33, scanner.getCursor());
	}

	@Test
	public void testDefinitionOfObjects() {
		TestScanner scanner = new TestScanner(
				"var = pack.Concept {name:'name'};var2 = pack.Concept {name:'name'};");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(33, scanner.getCursor());
	}

	@Test
	public void testDefinitionOfObjectsIncorrect() {
		TestScanner scanner = new TestScanner(
				"var = pack.Concept {name:'name'} var2 = pack.Concept {name:'name'};");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(67, scanner.getCursor());
	}

}
