package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;

/**
 * Abstract matcher rules that implements mecanisms to unread chars on failure.
 * 
 * @author rguider
 *
 */
public abstract class AbstractMatcherRule implements IPredicateRule {

	/**
	 * Token returned in case of success.
	 */
	private IToken successToken;

	/**
	 * Creates a new {@link AbstractMatcherRule} instance.
	 * 
	 * @param token
	 *            the success token to be returned by successful evaluations.
	 */
	public AbstractMatcherRule(IToken token) {
		this.successToken = token;
	}

	@Override
	public IToken getSuccessToken() {
		return successToken;
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner, boolean resume) {
		return evaluate(scanner);
	}
}
