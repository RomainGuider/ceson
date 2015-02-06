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
	 * Returns a new object of class '<em>CInt Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CInt Value</em>'.
	 * @generated
	 */
	CIntValue createCIntValue();

	/**
	 * Returns a new object of class '<em>CReal Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CReal Value</em>'.
	 * @generated
	 */
	CRealValue createCRealValue();

	/**
	 * Returns a new object of class '<em>CString Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CString Value</em>'.
	 * @generated
	 */
	CStringValue createCStringValue();

	/**
	 * Returns a new object of class '<em>CObject Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CObject Value</em>'.
	 * @generated
	 */
	CObjectValue createCObjectValue();

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
	 * Returns a new object of class '<em>CBoolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CBoolean Value</em>'.
	 * @generated
	 */
	CBooleanValue createCBooleanValue();

	/**
	 * Returns a new object of class '<em>CSpecification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSpecification</em>'.
	 * @generated
	 */
	CSpecification createCSpecification();

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
	 * Returns a new object of class '<em>CDate Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDate Value</em>'.
	 * @generated
	 */
	CDateValue createCDateValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CesonPackage getCesonPackage();

} //CesonFactory
