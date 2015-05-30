package org.eclipselabs.emf.ceson.ui.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.jface.text.rules.Token;
import org.junit.Before;
import org.junit.Test;

import fr.obeo.emf.ceson.ui.editors.ClassNameRule;

public class ClassRuleTest {

	private ClassNameRule rule;
	private Token success;

	@Before
	public void setUp() {
		success = new Token("SUCCESS");
		rule = new ClassNameRule(success);
	}

	@Test
	public void successTokenTest() {
		assertEquals(success, rule.getSuccessToken());
	}

	@Test
	public void nonQualifiedClassTest() {
		TestScanner scanner = new TestScanner("Class { name : 'className'}");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(5, scanner.getCursor());
	}

	@Test
	public void nonQualifiedClassTestFail() {
		TestScanner scanner = new TestScanner("java.Class _ ");
		assertEquals(Token.UNDEFINED,
				rule.evaluate(new TestScanner("Class is not a class name")));
		assertEquals(0, scanner.getCursor());
	}

	@Test
	public void qualifiedClassTest() {
		TestScanner scanner = new TestScanner(
				"java.Class { name : 'className'}");
		assertEquals(success, rule.evaluate(scanner));
		assertEquals(10, scanner.getCursor());
	}

	@Test
	public void qualifiedClassTestFail() {
		TestScanner scanner = new TestScanner("java.Class _ ");
		assertEquals(Token.UNDEFINED, rule.evaluate(scanner));
		assertEquals(0, scanner.getCursor());
	}

}
