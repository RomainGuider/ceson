package fr.obeo.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * rule used to match ceson's definitions.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 *
 */
public class CesonDefinitionRule extends AbstractMatcherRule {
	/**
	 * Creates a new {@link CesonDefinitionRule} instance.
	 * 
	 * @param token
	 *            the token used to mark sucessful match.
	 */
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
			return getSuccessToken();
		} else {
			return Token.UNDEFINED;
		}
	}
}
