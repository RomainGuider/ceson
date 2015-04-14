package org.eclipselabs.emf.ceson.ui.tests;

import org.eclipse.jface.text.rules.ICharacterScanner;

public class TestScanner implements ICharacterScanner {

	private static final char[][] LEGAL_LINE_DELIMITERS = {

	};

	private CharSequence chars;

	private int cursor;

	public TestScanner(CharSequence sequence) {
		if (sequence == null) {
			throw new IllegalArgumentException();
		}
		this.chars = sequence;
		cursor = 0;
	}

	public int getCursor() {
		return cursor;
	}

	@Override
	public char[][] getLegalLineDelimiters() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getColumn() {
		return -1;
	}

	@Override
	public int read() {
		if (cursor < chars.length()) {
			return chars.charAt(cursor++);
		} else {
			return EOF;
		}
	}

	@Override
	public void unread() {
		if (cursor > 0) {
			cursor--;
		}
	}

}
