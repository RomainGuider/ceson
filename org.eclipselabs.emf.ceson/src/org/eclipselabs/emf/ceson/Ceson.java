package org.eclipselabs.emf.ceson;

import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * The {@link Ceson} interface defines the API of the {@link Ceson} system and
 * the main semantics rules that govern it.
 * 
 * @author rguider
 *
 */
public interface Ceson {
	/**
	 * Returns the {@link ResourceSet} instance used to create resources for
	 * parsed notation fragmentS.
	 * 
	 * @return the {@link ResourceSet} instance used by this {@link Ceson}
	 *         instance.
	 */
	ResourceSet getResourceSet();

	/**
	 * Returns the value of the singleResource property that controls the use of
	 * resources. If <code>true</code>, all the parsed notations are stored in a
	 * single {@link Resource}. A new {@link Resource} is used for each parsed
	 * notation otherwise.
	 * 
	 * @return
	 */
	boolean isSingleResource();

	/**
	 * Returns a {@link List} of {@link EPackage} instances that are registered
	 * in the {@link Ceson} instance.
	 * 
	 * @return the list of registered {@link EPackage} instances.
	 */
	List<EPackage> getRegisteredPackages();

	/**
	 * Registers a new {@link EPackage} in the {@link Ceson} instance.
	 * 
	 * @param ePackage
	 *            the new {@link EPackage} to be registered.
	 */
	void registerPackage(EPackage ePackage);

	/**
	 * Parses the specified {@link String} and returns the resulting model.
	 * 
	 * @param notation
	 *            the input notation to be parsed.
	 * @return the resulting model.
	 * @throws CesonException
	 *             in case the specified string has a syntax error or any other
	 *             problem occurs during parsing.
	 */
	public Object parse(String notation) throws CesonException;

	/**
	 * Parses the specified {@link String} and returns the resulting model.
	 * 
	 * @param notation
	 *            the input notation to be parsed.
	 * @return the resulting model.
	 * @throws CesonException
	 *             in case the specified string has a syntax error or any other
	 *             problem occurs during parsing.
	 */
	public Object parse(InputStream input) throws CesonException;

	/**
	 * <p>
	 * Parses the specified {@link String} and returns the resulting model. The
	 * model and the {@link Resource} that contains it are stored and can be
	 * retrieved from the specified reference. Stored references can be used
	 * from within notation.
	 * </p>
	 * <br/>
	 * 
	 * <p>
	 * A single assignement discipline is forced for reference and the specified
	 * reference must not be already used in the {@link Ceson} instance.
	 * </p>
	 * 
	 * @param notation
	 *            the input notation to be parsed.
	 * @param reference
	 *            the reference name under wich the produced model object can be
	 *            retrieved.
	 * 
	 * @return the resulting model.
	 * @throws CesonException
	 *             in case the specified string has a syntax error or any other
	 *             problem occurs during parsing or the reference is already
	 *             used.
	 */
	public Object parse(String notation, String reference)
			throws CesonException;

	/**
	 * <p>
	 * Parses the specified {@link String} and returns the resulting model. The
	 * model and the {@link Resource} that contains it are stored and can be
	 * retrieved from the specified reference. Stored references can be used
	 * from within notation.
	 * </p>
	 * <br/>
	 * <p>
	 * A single assignement discipline is forced for reference and the specified
	 * reference must not be already used in the {@link Ceson} instance.
	 * </p>
	 * 
	 * @param input
	 *            the input notation to be parsed.
	 * @param reference
	 *            the reference name under wich the produced model object can be
	 *            retrieved.
	 * @return the resulting model.
	 * @throws CesonException
	 *             in case the specified string has a syntax error or the
	 *             reference is already used.
	 */
	public Object parse(InputStream input, String reference)
			throws CesonException;

	/**
	 * Returns tthe model object stored under the specified reference or
	 * <code>null</code> if no object is stored under it.
	 * 
	 * @param reference
	 * @return the model object stored under the specified reference or
	 *         <code>null</code> if no object is stored under it.
	 */
	public Object getObjectReference(String reference);

}
