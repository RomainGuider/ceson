package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class CesonPartitionScanner extends RuleBasedPartitionScanner {
	public final static String CESON_COMMENT = "__ceson_comment";
	public final static String CESON_DEFINITION = "__ceson_definition";

	public static final String[] LEGAL_CONTENT_TYPES = { CESON_COMMENT,
			CESON_DEFINITION };
	public static final int NUMBER_OF_RULES = 2;

	public CesonPartitionScanner() {

		IToken cesonComment = new Token(CESON_COMMENT);
		IToken cesonDefinition = new Token(CESON_DEFINITION);

		IPredicateRule[] rules = new IPredicateRule[2];

		rules[0] = new MultiLineRule("/*", "*/", cesonComment);
		rules[1] = new CesonDefinitionRule(cesonDefinition);
		setPredicateRules(rules);
	}
}
