package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class CesonWhitespaceDetector implements IWhitespaceDetector {

	public boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
}
