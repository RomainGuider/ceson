package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * Matches variables in variable definitions.
 * 
 * @author rguider
 *
 */
public class VariableRule extends AbstractMatcherRule {

	public VariableRule(IToken token) {
		super(token);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		MatcherRuleEvaluatorState state = new MatcherRuleEvaluatorState(scanner);
		if (state.matchesWord() && state.matchesChar('=')) {
			state.rewindToLastWord();
			return getSuccessToken();
		} else {
			state.rewind();
			return Token.UNDEFINED;
		}
	}
}
