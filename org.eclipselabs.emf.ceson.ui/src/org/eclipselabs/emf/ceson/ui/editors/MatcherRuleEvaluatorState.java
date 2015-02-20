package org.eclipselabs.emf.ceson.ui.editors;

import org.eclipse.jface.text.rules.ICharacterScanner;

import com.google.common.base.CharMatcher;

public class MatcherRuleEvaluatorState {
	/**
	 * The scanner to process.
	 */
	private ICharacterScanner scanner;
	/**
	 * The count of characters read from the scanner in this instance.
	 */
	private int readCount;
	/**
	 * Mark at the last of the last matched word.
	 */
	private int lastWordMark;

	public MatcherRuleEvaluatorState(ICharacterScanner scanner) {
		this.scanner = scanner;
		this.readCount = 0;
		this.lastWordMark = -1;
	}

	/**
	 * Returns the count of characters read and not rewinded from this instance.
	 * 
	 * @return the count of read characters.
	 */
	public int getReadCount() {
		return readCount;
	}

	/**
	 * Read a character in the scanner and counts it;
	 * 
	 * @param scanner
	 *            the scanner from which to read a character.
	 * @return the character read in the scanner.
	 */
	public int readChar() {
		readCount++;
		return scanner.read();
	}

	public void consummeWhiteSpaces() {
		while (CharMatcher.WHITESPACE.matches((char) readChar())) {
			readCount++;
		}
		readCount--;
		unreadChar();
	}

	/**
	 * Read a character in the scanner and counts it;
	 * 
	 * @param scanner
	 *            the scanner from which to read a character.
	 * @return the character read in the scanner.
	 */
	public void unreadChar() {
		readCount--;
		scanner.unread();
	}

	/**
	 * Rewind the scanner by the number of characters read in this instance.
	 * 
	 * @param scanner
	 *            the scanner to rewind.
	 */
	public void rewind() {
		int count = readCount;
		for (int i = 0; i < count; i++) {
			unreadChar();
		}
	}

	/**
	 * Rewind to the last word matched in this instance. Repeated calls will
	 * have the same effect as 1 call.
	 */
	public void rewindToLastWord() {
		if (lastWordMark >= 0) {
			rewindTo(lastWordMark);
			lastWordMark = -1;
		}
	}

	/**
	 * Rewind the scanner to the specified read count.
	 * 
	 * @param mark
	 *            the read count down to which to rewind.
	 */
	public void rewindTo(int mark) {
		while (readCount > mark) {
			unreadChar();
		}
	}

	/**
	 * Returns <code>true</code> when the scanner in the current state matches a
	 * word.
	 * 
	 * @return <code>true</code> if the scanner matches a word.
	 */
	public boolean matchesWord() {
		boolean result = false;
		char c = (char) readChar();
		if (CharMatcher.JAVA_LETTER_OR_DIGIT.matches(c)) {
			result = true;
		}
		while (CharMatcher.JAVA_LETTER_OR_DIGIT.matches(c)) {
			c = (char) readChar();
		}
		unreadChar();
		lastWordMark = readCount;
		return result;
	}

	/**
	 * Returns <code>true</code> when the scanner in the current state matches a
	 * series of white spaces followed by the specified char.
	 * 
	 * @return <code>true</code> if the scanner matches a series of white spaces
	 *         followed by the specified char.
	 */
	public boolean matchesChar(char searched) {
		int mark = readCount;
		char c = (char) readChar();
		while (CharMatcher.WHITESPACE.matches(c)) {
			c = (char) readChar();
		}
		if (c == searched) {
			return true;
		} else {
			rewindTo(mark);
			return false;
		}
	}

}
