/**
 *
 * $Id$
 */
package org.eclipselabs.emf.ceson.validation;

import org.eclipselabs.emf.ceson.CesonValue;

/**
 * A sample validator interface for {@link java.utl.Map.Entry}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StringToCesonValueMapValidator {
	boolean validate();

	boolean validateTypedKey(String value);

	boolean validateTypedValue(CesonValue value);

	boolean validateKey(String value);
	boolean validateValue(CesonValue value);
}