package org.eclipselabs.emf.ceson.ui.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipselabs.emf.ceson.ui.editors.MatcherRuleEvaluatorState;
import org.junit.Test;

public class MatcherRuleEvaluationStateTests {

	/**
	 * Creates a new {@link MatcherRuleEvaluatorState} given an input
	 * {@link String}
	 * 
	 * @param input
	 *            the string to be used as input.
	 * @return a fresh {@link MatcherRuleEvaluatorState} instance.
	 */
	private MatcherRuleEvaluatorState state(String input) {
		return new MatcherRuleEvaluatorState(new TestScanner(input));
	}

	@Test
	public void testReadChar() {
		MatcherRuleEvaluatorState state = state("lorem ipsum");
		assertEquals('l', state.readChar());
		assertEquals('o', state.readChar());
	}

	@Test
	public void testUnReadChar() {
		MatcherRuleEvaluatorState state = state("lorem ipsum");
		state.readChar();
		state.readChar();
		state.unreadChar();
		assertEquals('o', state.readChar());
		state.unreadChar();
		state.unreadChar();
		assertEquals('l', state.readChar());
	}

	@Test
	public void testReadCount() {
		MatcherRuleEvaluatorState state = state("lorem ipsum");
		state.readChar();
		state.readChar();
		assertEquals(2, state.getReadCount());
		state.unreadChar();
		assertEquals(1, state.getReadCount());
	}

	@Test
	public void testRewind() {
		MatcherRuleEvaluatorState state = state("lorem ipsum");
		state.readChar();
		state.readChar();
		state.readChar();
		state.rewind();
		assertEquals(0, state.getReadCount());
		assertEquals('l', state.readChar());
	}

	@Test
	public void testRewindTo() {
		MatcherRuleEvaluatorState state = state("lorem ipsum");
		state.readChar();
		state.readChar();
		state.readChar();
		state.rewindTo(1);
		assertEquals(1, state.getReadCount());
		assertEquals('o', state.readChar());
	}

	@Test
	public void testMatchWhiteSpaces() {
		MatcherRuleEvaluatorState state = state("  \t\r  \n  lorem ipsum");
		state.consummeWhiteSpaces();
		assertEquals('l', state.readChar());
	}

	@Test
	public void matchesWordTest() {
		MatcherRuleEvaluatorState state = state("lorem ipsum");
		assertTrue(state.matchesWord());
		assertEquals(5, state.getReadCount());
	}

	@Test
	public void matchesWordFailTest() {
		MatcherRuleEvaluatorState state = state("{lorem ipsum");
		assertFalse(state.matchesWord());
		assertEquals(0, state.getReadCount());
	}

	@Test
	public void rewindToLastWordTest() {
		MatcherRuleEvaluatorState state = state("lorem ipsum");
		state.matchesWord();
		state.readChar();
		state.readChar();
		state.rewindToLastWord();
		assertEquals(5, state.getReadCount());
	}

	@Test
	public void rewindToLastWordRepeatedCallsTest() {
		MatcherRuleEvaluatorState state = state("lorem ipsum");
		state.matchesWord();
		state.readChar();
		state.readChar();
		state.rewindToLastWord();
		state.rewindToLastWord();
		state.rewindToLastWord();
		assertEquals(5, state.getReadCount());
	}

	@Test
	public void matchesCharTest() {
		MatcherRuleEvaluatorState state = state("   'lorem ipsum");
		assertTrue(state.matchesChar('\''));
		assertEquals(4, state.getReadCount());
	}

	@Test
	public void matchesCharFailTest() {
		MatcherRuleEvaluatorState state = state("   {lorem ipsum");
		assertFalse(state.matchesChar('\''));
		assertEquals(0, state.getReadCount());
	}

}
