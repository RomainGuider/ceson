package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class CesonDefinitionRule extends AbstractMatcherRule {

	public CesonDefinitionRule(IToken token) {
		super(token);
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		MatcherRuleEvaluatorState state = new MatcherRuleEvaluatorState(scanner);
		if (state.matchesWord() && state.matchesChar('=')) {
			int c = state.readChar();
			while (c != ICharacterScanner.EOF && c != ';') {
				c = state.readChar();
			}
			if (c == ICharacterScanner.EOF) {
				state.rewind();
				return Token.UNDEFINED;
			} else {
				return getSuccessToken();
			}
		} else {
			return Token.UNDEFINED;
		}
	}
}
