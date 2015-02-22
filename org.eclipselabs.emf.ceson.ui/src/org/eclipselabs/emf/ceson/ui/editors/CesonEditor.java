package org.eclipselabs.emf.ceson.ui.editors;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.ISynchronizable;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ChainedPreferenceStore;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclipselabs.emf.ceson.ui.Activator;

public class CesonEditor extends TextEditor {
	/**
	 * The ID to use to open Ceson editors.
	 */
	public static final String CESON_EDITOR_ID = "org.eclipselabs.emf.ceson.ui.editors.CesonEditor";
	/**
	 * Preference key for matching brackets.
	 */
	private static final String MATCHING_BRACKETS = "matchingBrackets";

	/**
	 * Preference key for matching brackets color.
	 */
	private static final String MATCHING_BRACKETS_COLOR = "matchingBracketsColor";
	/**
	 * Pairs of block start and end characters.
	 */
	private static final char[] CESON_BLOCKS = { '[', ']', '{', '}' };
	/**
	 * Object that manages colors.
	 */
	private ColorManager colorManager;
	/**
	 * pair matcher that's used to highlight blocks in the text.
	 */
	private DefaultCharacterPairMatcher blockMatcher;

	/** Allows us to enable folding support on this editor. */
	private ProjectionSupport projectionSupport;

	/** This will allow us to update the folding structure of the document. */
	private ProjectionAnnotationModel annotationModel;

	public CesonEditor() {
		super();
		colorManager = new ColorManager();
		blockMatcher = new DefaultCharacterPairMatcher(CESON_BLOCKS);
		setSourceViewerConfiguration(new CesonConfiguration(this, colorManager));
		setDocumentProvider(new CesonDocumentProvider());
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();

		projectionSupport = new ProjectionSupport(viewer,
				getAnnotationAccess(), getSharedColors());
		projectionSupport.install();

		// turn projection mode on
		viewer.doOperation(ProjectionViewer.TOGGLE);

		annotationModel = viewer.getProjectionAnnotationModel();
	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent,
			IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new ProjectionViewer(parent, ruler,
				getOverviewRuler(), isOverviewRulerVisible(), styles);

		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);

		return viewer;
	}

	private Annotation[] oldAnnotations;

	/**
	 * Updates the folding structure of the template. This will be called from
	 * the Acceleo template reconciler in order to allow the folding of blocks
	 * to the user.
	 * 
	 * @param addedAnnotations
	 *            These annotations have been added since the last reconciling
	 *            operation.
	 * @param deletedAnnotations
	 *            This list represents the annotations that were deleted since
	 *            we last reconciled.
	 * @param modifiedAnnotations
	 *            These annotations have seen their positions updated.
	 */
	public void updateFoldingStructure(
			Map<Annotation, Position> addedAnnotations,
			List<Annotation> deletedAnnotations,
			Map<Annotation, Position> modifiedAnnotations) {
		Annotation[] deleted = new Annotation[deletedAnnotations.size()
				+ modifiedAnnotations.size()];
		for (int i = 0; i < deletedAnnotations.size(); i++) {
			deleted[i] = deletedAnnotations.get(i);
		}
		/*
		 * bug [273034] : merge "modified" annotations with deleted and added so
		 * as to update the whole folding structure in one go.
		 */
		final Iterator<Annotation> modifiedIterator = modifiedAnnotations
				.keySet().iterator();
		for (int i = deletedAnnotations.size(); i < deleted.length; i++) {
			deleted[i] = modifiedIterator.next();
		}
		addedAnnotations.putAll(modifiedAnnotations);
		if (annotationModel != null) {
			synchronized (getLockObject(annotationModel)) {
				annotationModel.modifyAnnotations(deleted, addedAnnotations,
						null);
			}
		}
	}

	/**
	 * Returns the lock object for the given annotation model.
	 * 
	 * @param iAnnotationModel
	 *            the annotation model
	 * @return the annotation model's lock object
	 */
	private Object getLockObject(final IAnnotationModel iAnnotationModel) {
		if (iAnnotationModel instanceof ISynchronizable) {
			final Object lock = ((ISynchronizable) iAnnotationModel)
					.getLockObject();
			if (lock != null) {
				return lock;
			}
		}
		return iAnnotationModel;
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
		super.configureSourceViewerDecorationSupport(support);
		/*
		 * Set the block matcher
		 */
		support.setCharacterPairMatcher(blockMatcher);
		support.setMatchingCharacterPainterPreferenceKeys(MATCHING_BRACKETS,
				MATCHING_BRACKETS_COLOR);
		IPreferenceStore pref = Activator.getDefault().getPreferenceStore();
		getPreferenceStore().setDefault(MATCHING_BRACKETS, true);
		getPreferenceStore().setDefault(MATCHING_BRACKETS_COLOR, "128,128,128");
		IPreferenceStore[] stores = { getPreferenceStore(), pref, };
		setPreferenceStore(new ChainedPreferenceStore(stores));
		support.install(getPreferenceStore());
		super.configureSourceViewerDecorationSupport(support);

	}
}
