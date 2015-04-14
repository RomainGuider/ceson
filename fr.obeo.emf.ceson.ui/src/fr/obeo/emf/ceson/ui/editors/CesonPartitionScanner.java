package fr.obeo.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * Partition scanner for Ceson's editor.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 *
 */
public class CesonPartitionScanner extends RuleBasedPartitionScanner {
	/**
	 * Comment's string token.
	 */
	public static final String CESON_COMMENT = "__ceson_comment";
	/**
	 * Definition's string token.
	 */
	public static final String CESON_DEFINITION = "__ceson_definition";
	/**
	 * Content types.
	 */
	public static final String[] LEGAL_CONTENT_TYPES = { CESON_COMMENT,
			CESON_DEFINITION, };
	/**
	 * Number of rules in the partition scanner.
	 */
	public static final int NUMBER_OF_RULES = 2;

	/**
	 * Creates a new {@link CesonPartitionScanner} instance.
	 */
	public CesonPartitionScanner() {

		IToken cesonComment = new Token(CESON_COMMENT);
		IToken cesonDefinition = new Token(CESON_DEFINITION);

		IPredicateRule[] rules = new IPredicateRule[2];

		rules[0] = new MultiLineRule("/*", "*/", cesonComment);
		rules[1] = new CesonDefinitionRule(cesonDefinition);
		setPredicateRules(rules);
	}
}
