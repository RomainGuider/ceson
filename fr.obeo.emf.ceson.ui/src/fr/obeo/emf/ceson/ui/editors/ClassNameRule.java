package fr.obeo.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * Recognizes class names in object value specifications. class names are made
 * of the following pattern '([a-zA-A]+\.)?[a-zA-A]+\w{'
 * 
 * @author rguider
 *
 */
public class ClassNameRule extends AbstractMatcherRule {

	/**
	 * Creates a new {@link ClassNameRule} instance.
	 * 
	 * @param token
	 *            the success token to be returned by successful evaluations.
	 */
	public ClassNameRule(IToken token) {
		super(token);
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		MatcherRuleEvaluatorState state = new MatcherRuleEvaluatorState(scanner);
		// first character must be a letter
		boolean matches;
		if (state.matchesWord()) {
			char c = (char) state.readChar();
			if (c == '.' && state.matchesWord() && state.matchesChar('{')) {
				matches = true;
			} else if (state.matchesChar('{')) {
				matches = true;
			} else {
				matches = false;
			}
		} else {
			matches = false;
		}
		if (matches) {
			state.rewindToLastWord();
			return getSuccessToken();
		} else {
			state.rewind();
			return Token.UNDEFINED;
		}
	}

}
