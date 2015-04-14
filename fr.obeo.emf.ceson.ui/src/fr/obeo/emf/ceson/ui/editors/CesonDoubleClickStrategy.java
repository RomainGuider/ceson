package fr.obeo.emf.ceson.ui.editors;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITextViewer;

/**
 * Double click strategy.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 *
 */
public class CesonDoubleClickStrategy implements ITextDoubleClickStrategy {
	/**
	 * The concerned text viewer.
	 */
	protected ITextViewer fText;

	/**
	 * signal a double click.
	 * 
	 * @param part
	 *            the clicked part.
	 */
	public void doubleClicked(ITextViewer part) {
		int pos = part.getSelectedRange().x;

		if (pos < 0) {
			return;
		}

		fText = part;

		if (!selectComment(pos)) {
			selectWord(pos);
		}
	}

	/**
	 * Select a comment range.
	 * 
	 * @param caretPos
	 *            position of caret
	 * @return <code>true</code> when
	 */
	// CHECKSTYLE:OFF
	protected boolean selectComment(int caretPos) {
		IDocument doc = fText.getDocument();
		int startPos;
		int endPos;

		try {
			int pos = caretPos;
			char c = ' ';

			while (pos >= 0) {
				c = doc.getChar(pos);
				if (c == '\\') {
					pos -= 2;
					continue;
				}
				if (c == Character.LINE_SEPARATOR || c == '\"') {
					break;
				}
				--pos;
			}

			if (c != '\"') {
				return false;
			}

			startPos = pos;

			pos = caretPos;
			int length = doc.getLength();
			c = ' ';

			while (pos < length) {
				c = doc.getChar(pos);
				if (c == Character.LINE_SEPARATOR || c == '\"') {
					break;
				}
				++pos;
			}
			if (c != '\"') {
				return false;
			}

			endPos = pos;

			int offset = startPos + 1;
			int len = endPos - offset;
			fText.setSelectedRange(offset, len);
			return true;
		} catch (BadLocationException x) {
		}

		return false;
	}

	/**
	 * select a word given a caret position.
	 * 
	 * @param caretPos
	 *            the caret position
	 * @return <code>true</code> when a word has been selected;
	 */
	protected boolean selectWord(int caretPos) {

		IDocument doc = fText.getDocument();
		int startPos;
		int endPos;

		try {

			int pos = caretPos;
			char c;

			while (pos >= 0) {
				c = doc.getChar(pos);
				if (!Character.isJavaIdentifierPart(c)) {
					break;
				}
				--pos;
			}

			startPos = pos;

			pos = caretPos;
			int length = doc.getLength();

			while (pos < length) {
				c = doc.getChar(pos);
				if (!Character.isJavaIdentifierPart(c)) {
					break;
				}
				++pos;
			}

			endPos = pos;
			selectRange(startPos, endPos);
			return true;

		} catch (BadLocationException x) {
			// FIXME : check what to do when this happen if it can actually
			// happen
		}

		return false;
	}

	// code above has been copy-pasted and we do not wan't to modify it.
	// CHECKSTYLE:ON

	/**
	 * seect a rang.
	 * 
	 * @param startPos
	 *            range's starting position
	 * @param stopPos
	 *            range's ending position
	 */
	private void selectRange(int startPos, int stopPos) {
		int offset = startPos + 1;
		int length = stopPos - offset;
		fText.setSelectedRange(offset, length);
	}
}