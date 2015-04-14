package fr.obeo.emf.ceson.ui.editors;

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
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

/**
 * Configuration of the editor.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 *
 */
public class CesonConfiguration extends TextSourceViewerConfiguration {
	/**
	 * The number of tokens defined in the related editors.
	 */
	private static final int TOKEN_NUMBER = 7;
	/**
	 * Double click strategy.
	 */
	private CesonDoubleClickStrategy doubleClickStrategy;
	/**
	 * color manager.
	 */
	private ColorManager colorManager;
	/**
	 * String token definition.
	 */
	private final Token stringToken;
	/**
	 * Class token definition.
	 */
	private final Token classNameToken;
	/**
	 * Field name token definition.
	 */
	private final Token fieldNameToken;
	/**
	 * Comment token definition.
	 */
	private final Token commentToken;
	/**
	 * Variable definition token definition.
	 */
	private final Token variableToken;
	/**
	 * default token definition.
	 */
	private final Token defaultToken;
	/**
	 * the editor.
	 */
	private final CesonEditor editor;

	/**
	 * Creates a new {@link CesonConfiguration} instance.
	 * 
	 * @param editor
	 *            the configured editor
	 * @param colorManager
	 *            the color manager to use
	 */
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

	/**
	 * Returns the configured content types.
	 * 
	 * @param sourceViewer
	 *            the concerned sourceViewer
	 * @return the configured content types.
	 */
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
				CesonPartitionScanner.CESON_COMMENT,
				CesonPartitionScanner.CESON_DEFINITION, };
	}

	/**
	 * Returns the double click strategy.
	 * 
	 * @param sourceViewer
	 *            the concerned source viewer
	 * @param contentType
	 *            the concerned content type
	 * @return the double click strategy for the specified source viewer and the
	 *         specified content type.
	 */
	public ITextDoubleClickStrategy getDoubleClickStrategy(
			ISourceViewer sourceViewer, String contentType) {
		if (doubleClickStrategy == null) {
			doubleClickStrategy = new CesonDoubleClickStrategy();
		}
		return doubleClickStrategy;
	}

	/**
	 * Returns the {@link ITokenScanner} instance for this configuration.
	 * 
	 * @return the {@link ITokenScanner} instance for this configuration
	 */
	protected ITokenScanner getScanner() {
		RuleBasedScanner scanner = new RuleBasedScanner();
		IRule[] rules = new IRule[TOKEN_NUMBER];
		// Add rule for double quotes
		rules[0] = new SingleLineRule("'", "'", stringToken, '\\');
		// Add generic whitespace rule.
		rules[1] = new WhitespaceRule(new CesonWhitespaceDetector());
		rules[2] = new SingleLineRule("//", "\n", commentToken);
		rules[3] = new ClassNameRule(classNameToken);
		rules[4] = new FieldNameRule(fieldNameToken);
		rules[5] = new VariableRule(variableToken);
		rules[6] = new MultiLineRule("/*", "*/", commentToken);
		scanner.setRules(rules);
		scanner.setDefaultReturnToken(defaultToken);
		return scanner;
	}

	/**
	 * returns the presentation reconciler.
	 * @param sourceViewer the concerned sourceViewer
	 * @return the presentation reconciler
	 */
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