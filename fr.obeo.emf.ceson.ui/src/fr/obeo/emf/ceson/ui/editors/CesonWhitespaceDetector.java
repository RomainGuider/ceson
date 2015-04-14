package fr.obeo.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

/**
 * White space detector.
 * 
 * @author <a href="mailto:romain.guider@obeo.fr">Romain Guider</a>
 *
 */
public class CesonWhitespaceDetector implements IWhitespaceDetector {

	public boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
}
