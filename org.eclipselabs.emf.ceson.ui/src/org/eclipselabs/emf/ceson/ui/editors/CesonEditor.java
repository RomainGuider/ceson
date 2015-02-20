package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;

public class CesonEditor extends TextEditor {
	/**
	 * The ID to use to open Ceson editors.
	 */
	public static final String CESON_EDITOR_ID = "org.eclipselabs.emf.ceson.ui.editors.CesonEditor";
	/**
	 * Pairs of block start and end characters.
	 */
	private static final char[] CESON_BLOCKS = { '[', ']', '{', ']' };
	/**
	 * Object that manages colors.
	 */
	private ColorManager colorManager;
	/**
	 * pair matcher that's used to highlight blocks in the text.
	 */
	private DefaultCharacterPairMatcher blockMatcher;

	public CesonEditor() {
		super();
		colorManager = new ColorManager();
		blockMatcher = new DefaultCharacterPairMatcher(CESON_BLOCKS);
		setSourceViewerConfiguration(new CesonConfiguration(colorManager));
		setDocumentProvider(new CesonDocumentProvider());
	}

	public void dispose() {
		colorManager.dispose();
		blockMatcher.dispose();
		super.dispose();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.texteditor.AbstractDecoratedTextEditor#configureSourceViewerDecorationSupport(org.eclipse.ui.texteditor.SourceViewerDecorationSupport)
	 */
	@Override
	protected void configureSourceViewerDecorationSupport(
			SourceViewerDecorationSupport support) {
		/*
		 * Set the block matcher
		 */
		support.setCharacterPairMatcher(blockMatcher);
	}
}
