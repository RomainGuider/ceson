package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * Recognizes field names in object value specifications. fields names are made
 * of the following pattern '([a-zA-A]+\.)?[a-zA-A]+\w:'
 * 
 * @author rguider
 *
 */
public class FieldNameRule extends AbstractMatcherRule {

	/**
	 * Creates a new {@link ClassNameRule} instance.
	 * 
	 * @param token
	 *            the success token to be returned by successful evaluations.
	 */
	public FieldNameRule(IToken token) {
		super(token);
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		MatcherRuleEvaluatorState state = new MatcherRuleEvaluatorState(scanner);
		if (state.matchesWord() && state.matchesChar(':')) {
			state.rewindToLastWord();
			return getSuccessToken();
		} else {
			state.rewind();
			return Token.UNDEFINED;
		}
	}
}
