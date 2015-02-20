package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class CesonConfiguration extends SourceViewerConfiguration {
	private CesonDoubleClickStrategy doubleClickStrategy;
	private ColorManager colorManager;

	private final Token stringToken;
	private final Token classNameToken;
	private final Token fieldNameToken;
	private final Token commentToken;
	private final Token defaultToken;

	public CesonConfiguration(ColorManager colorManager) {
		this.colorManager = colorManager;
		stringToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.STRING)));
		classNameToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.CLASS_NAME)));
		fieldNameToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.FIELD_NAME)));
		commentToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.COMMENT)));
		defaultToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.DEFAULT)));
	}

	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
				CesonPartitionScanner.CESON_COMMENT,
				CesonPartitionScanner.CESON_DEFINITION };
	}

	public ITextDoubleClickStrategy getDoubleClickStrategy(
			ISourceViewer sourceViewer, String contentType) {
		if (doubleClickStrategy == null)
			doubleClickStrategy = new CesonDoubleClickStrategy();
		return doubleClickStrategy;
	}

	protected ITokenScanner getScanner() {
		RuleBasedScanner scanner = new RuleBasedScanner();
		IRule[] rules = new IRule[5];
		// Add rule for double quotes
		rules[0] = new SingleLineRule("'", "'", stringToken, '\\');
		// Add generic whitespace rule.
		rules[1] = new WhitespaceRule(new CesonWhitespaceDetector());
		rules[2] = new SingleLineRule("//", "\n", commentToken);
		rules[3] = new ClassNameRule(classNameToken);
		rules[4] = new FieldNameRule(fieldNameToken);
		scanner.setRules(rules);
		scanner.setDefaultReturnToken(defaultToken);
		return scanner;

	}

	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		NonRuleBasedDamagerRepairer ndr = new NonRuleBasedDamagerRepairer(
				new TextAttribute(
						colorManager.getColor(ICesonColorConstants.COMMENT)));
		reconciler.setDamager(ndr, CesonPartitionScanner.CESON_COMMENT);
		reconciler.setRepairer(ndr, CesonPartitionScanner.CESON_COMMENT);

		return reconciler;
	}

}