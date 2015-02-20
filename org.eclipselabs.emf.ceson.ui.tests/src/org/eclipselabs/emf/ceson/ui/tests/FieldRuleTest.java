package org.eclipselabs.emf.ceson.ui.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.jface.text.rules.Token;
import org.eclipselabs.emf.ceson.ui.editors.FieldNameRule;
import org.junit.Before;
import org.junit.Test;

public class FieldRuleTest {

	private FieldNameRule rule;
	private Token success;

	@Before
	public void setUp() {
		success = new Token("SUCCESS");
		rule = new FieldNameRule(success);
	}

	@Test
	public void getSuccessTest() {
		assertEquals(success, rule.getSuccessToken());
	}

	@Test
	public void matchesTest() {
		TestScanner scanner = new TestScanner("field : 'name',");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(5, scanner.getCursor());
	}

	@Test
	public void failTest() {
		TestScanner scanner = new TestScanner("field");
		assertEquals(Token.UNDEFINED, rule.evaluate(scanner));
		assertEquals(0, scanner.getCursor());
	}
}
