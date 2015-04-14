package fr.obeo.emf.ceson.ui.editors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.swt.widgets.Display;

/**
 * reconciling strategy for the ceson's editor.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 *
 */
public class CesonReconcilingStrategy implements IReconcilingStrategy,
		IReconcilingStrategyExtension {
	/**
	 * Regular expression used to detect definitions.
	 */
	private static final Pattern DEF_REGEX = Pattern
			.compile("\\w*\\s*=[^;]*(;|\\z)");

	/**
	 * Regular expression used to extract package definitions.
	 */
	private static final Pattern PACKAGE_DECLARATION = Pattern
			.compile("@nsURI \"([^\"\n\r]*)\"");

	/**
	 * This will hold the list of all annotations that have been added since the
	 * last reconciling.
	 */
	protected final Map<Annotation, Position> addedAnnotations = new HashMap<Annotation, Position>();

	/** Current known positions of foldable block. */
	protected final Map<Annotation, Position> currentAnnotations = new HashMap<Annotation, Position>();

	/**
	 * This will hold the list of all annotations that have been removed since
	 * the last reconciling.
	 */
	protected final List<Annotation> deletedAnnotations = new ArrayList<Annotation>();

	/**
	 * This will hold the list of all annotations that have been modified since
	 * the last reconciling.
	 */
	protected final Map<Annotation, Position> modifiedAnnotations = new HashMap<Annotation, Position>();
	/**
	 * The editor this reconciler is plugged in.
	 */
	private final CesonEditor editor;
	/**
	 * The document associated to the reconciler.
	 */
	private IDocument document;
	/**
	 * Maps offset to the package declarations they contain.
	 */
	private Map<Integer, EPackage> ePackages;

	/**
	 * The offset where the modified region starts.
	 */
	private int offset;

	/**
	 * Creates a new {@link CesonReconcilingStrategy}.
	 * 
	 * @param theEditor
	 *            the editor used in this reconciling strategy.
	 */
	public CesonReconcilingStrategy(CesonEditor theEditor) {
		this.editor = theEditor;
		this.ePackages = new HashMap<Integer, EPackage>();
	}

	@Override
	public void setDocument(IDocument document) {
		this.document = document;
		try {
			computePositions();
			updateFoldingStructure();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
		reconcile(subRegion);
	}

	@Override
	public void reconcile(IRegion partition) {
		offset = partition.getOffset();
		try {
			computePositions();
			updateFoldingStructure();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Detects declared {@link EPackage} instances.
	 */
	private Map<Integer, EPackage> scanEPackages(IRegion region) {
		// Find ePackages
		Map<Integer, EPackage> packages = new HashMap<Integer, EPackage>();
		try {
			ITypedRegion[] regions = document.computePartitioning(
					region.getOffset(), region.getLength());
			for (ITypedRegion typedRegion : regions) {
				if (CesonPartitionScanner.CESON_COMMENT.equals(typedRegion
						.getType())) {
					// look up package declaration.
					Matcher packageMatcher = PACKAGE_DECLARATION
							.matcher(document.get(typedRegion.getOffset(),
									typedRegion.getLength()));
					while (packageMatcher.find()) {
						String nsURI = packageMatcher.group(1);
						int varOffset = typedRegion.getOffset()
								+ packageMatcher.start();
						packages.put(varOffset, loadPackage(nsURI));
					}
				}
			}
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return packages;

	}

	/**
	 * returns the {@link EPackage} that has the specified nsURI.
	 * 
	 * @param nsURI
	 *            the ns URI of the seeked {@link EPackage}.
	 * @return the found package.
	 */
	private EPackage loadPackage(String nsURI) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * This will update lists {@link #deletedAnnotations},
	 * {@link #addedAnnotations} and {@link #modifiedAnnotations} according to
	 * the given values.
	 * 
	 * @param newOffset
	 *            Offset of the text we want the annotation updated of.
	 * @param newLength
	 *            Length of the text we want the annotation updated of.
	 * @param initiallyCollapsed
	 *            Indicates that the created annotation should be folded from
	 *            start.
	 * @throws BadLocationException
	 *             Thrown if we try and get an out of range character. Should
	 *             not happen.
	 */
	private void createOrUpdateAnnotation(int newOffset, int newLength,
			boolean initiallyCollapsed) throws BadLocationException {
		boolean createAnnotation = true;
		final Map<Annotation, Position> copy = new HashMap<Annotation, Position>(
				currentAnnotations);
		final String text = document.get(newOffset, newLength);
		for (Map.Entry<Annotation, Position> entry : copy.entrySet()) {
			if (entry.getKey().getText().equals(text)) {
				createAnnotation = false;
				final Position oldPosition = entry.getValue();
				if (oldPosition.getOffset() != newOffset
						|| oldPosition.getLength() != newLength) {
					final Position newPosition = new Position(newOffset,
							newLength);
					modifiedAnnotations.put(entry.getKey(), newPosition);
					currentAnnotations.put(entry.getKey(), newPosition);
				}
				deletedAnnotations.remove(entry.getKey());
				break;
			}
		}
		if (createAnnotation) {
			final Annotation annotation = new ProjectionAnnotation(
					initiallyCollapsed);
			annotation.setText(text);
			final Position position = new Position(newOffset, newLength);
			currentAnnotations.put(annotation, position);
			addedAnnotations.put(annotation, position);
		}
	}

	/**
	 * Compute the positions.
	 * 
	 * @throws BadLocationException
	 *             when a bad location is computed.
	 */
	private void computePositions() throws BadLocationException {
		deletedAnnotations.clear();
		modifiedAnnotations.clear();
		addedAnnotations.clear();
		deletedAnnotations.addAll(currentAnnotations.keySet());
		for (Map.Entry<Annotation, Position> entry : currentAnnotations
				.entrySet()) {
			final Position position = entry.getValue();
			if (position.getOffset() + position.getLength() < offset) {
				deletedAnnotations.remove(entry.getKey());
			}
		}
		String docAsString = document.get(0, document.getLength());
		Matcher matcher = DEF_REGEX.matcher(docAsString);
		while (matcher.find()) {
			int offsetVar = matcher.start();
			int length = matcher.end() - offsetVar - 1;
			createOrUpdateAnnotation(offsetVar, length, false);
		}

	}

	@Override
	public void setProgressMonitor(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialReconcile() {
		offset = 0;
		try {
			computePositions();
			updateFoldingStructure();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Updates the editor's folding structure.
	 */
	private void updateFoldingStructure() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				editor.updateFoldingStructure(addedAnnotations,
						deletedAnnotations, modifiedAnnotations);
			}
		});
	}

}
