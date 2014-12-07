/**
 */
package org.eclipselabs.emf.ceson;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emf.ceson.CesonPackage
 * @generated
 */
public interface CesonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CesonFactory eINSTANCE = org.eclipselabs.emf.ceson.impl.CesonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CFeature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFeature</em>'.
	 * @generated
	 */
	CFeature createCFeature();

	/**
	 * Returns a new object of class '<em>CAny Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAny Value</em>'.
	 * @generated
	 */
	CAnyValue createCAnyValue();

	/**
	 * Returns a new object of class '<em>Int Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Value</em>'.
	 * @generated
	 */
	CesonIntValue createCesonIntValue();

	/**
	 * Returns a new object of class '<em>Real Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Value</em>'.
	 * @generated
	 */
	CesonRealValue createCesonRealValue();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	CesonStringValue createCesonStringValue();

	/**
	 * Returns a new object of class '<em>Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Value</em>'.
	 * @generated
	 */
	CesonObjectValue createCesonObjectValue();

	/**
	 * Returns a new object of class '<em>CJava Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CJava Object Value</em>'.
	 * @generated
	 */
	CJavaObjectValue createCJavaObjectValue();

	/**
	 * Returns a new object of class '<em>CArray Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CArray Value</em>'.
	 * @generated
	 */
	CArrayValue createCArrayValue();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	CesonSpecification createCesonSpecification();

	/**
	 * Returns a new object of class '<em>CEnum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEnum Value</em>'.
	 * @generated
	 */
	CEnumValue createCEnumValue();

	/**
	 * Returns a new object of class '<em>CReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CReference</em>'.
	 * @generated
	 */
	CReference createCReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CesonPackage getCesonPackage();

} //CesonFactory
