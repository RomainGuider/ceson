package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

public class CesonConfiguration extends TextSourceViewerConfiguration {
	private CesonDoubleClickStrategy doubleClickStrategy;
	private ColorManager colorManager;

	private final Token stringToken;
	private final Token classNameToken;
	private final Token fieldNameToken;
	private final Token commentToken;
	private final Token variableToken;
	private final Token defaultToken;
	private final CesonEditor editor;

	public CesonConfiguration(CesonEditor editor, ColorManager colorManager) {
		this.colorManager = colorManager;
		this.editor = editor;
		stringToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.STRING)));
		classNameToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.CLASS_NAME)));
		fieldNameToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.FIELD_NAME)));
		commentToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.COMMENT)));
		variableToken = new Token(new TextAttribute(
				colorManager.getColor(ICesonColorConstants.VARIABLE)));
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
		IRule[] rules = new IRule[6];
		// Add rule for double quotes
		rules[0] = new SingleLineRule("'", "'", stringToken, '\\');
		// Add generic whitespace rule.
		rules[1] = new WhitespaceRule(new CesonWhitespaceDetector());
		rules[2] = new SingleLineRule("//", "\n", commentToken);
		rules[3] = new ClassNameRule(classNameToken);
		rules[4] = new FieldNameRule(fieldNameToken);
		rules[5] = new VariableRule(variableToken);
		scanner.setRules(rules);
		scanner.setDefaultReturnToken(defaultToken);
		return scanner;

	}

	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getScanner());
		reconciler.setDamager(dr, CesonPartitionScanner.CESON_DEFINITION);
		reconciler.setRepairer(dr, CesonPartitionScanner.CESON_DEFINITION);

		dr = new DefaultDamagerRepairer(getScanner());
		reconciler.setDamager(dr, CesonPartitionScanner.CESON_COMMENT);
		reconciler.setRepairer(dr, CesonPartitionScanner.CESON_COMMENT);

		return reconciler;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getReconciler(org.eclipse.jface.text.source.ISourceViewer)
	 */
	@Override
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		if (editor != null) {
			return new MonoReconciler(new CesonReconcilingStrategy(editor),
					false);
		} else {
			return super.getReconciler(sourceViewer);
		}
	}
}