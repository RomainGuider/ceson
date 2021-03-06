package fr.obeo.emf.ceson.ui.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;
/**
 * Document provider.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 *
 */
public class CesonDocumentProvider extends FileDocumentProvider {
/**
 * Creates a document given an element.
 * @param element the element used to create the document.
 * @return a new {@link IDocument} instance.
 * @throws CoreException when a problem occurs.
 */
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner = new FastPartitioner(
					new CesonPartitionScanner(), new String[] {
							CesonPartitionScanner.CESON_DEFINITION,
							CesonPartitionScanner.CESON_COMMENT, });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
}