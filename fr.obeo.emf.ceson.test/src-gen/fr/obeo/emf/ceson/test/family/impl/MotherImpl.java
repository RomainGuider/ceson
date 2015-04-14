/**
 */
package fr.obeo.emf.ceson.test.family.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.obeo.emf.ceson.test.family.FamilyPackage;
import fr.obeo.emf.ceson.test.family.Father;
import fr.obeo.emf.ceson.test.family.Mother;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mother</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.emf.ceson.test.family.impl.MotherImpl#getHusband <em>Husband</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MotherImpl extends ParentImpl implements Mother {
	/**
	 * The cached value of the '{@link #getHusband() <em>Husband</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHusband()
	 * @generated
	 * @ordered
	 */
	protected Father husband;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.MOTHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Father getHusband() {
		if (husband != null && husband.eIsProxy()) {
			InternalEObject oldHusband = (InternalEObject)husband;
			husband = (Father)eResolveProxy(oldHusband);
			if (husband != oldHusband) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.MOTHER__HUSBAND, oldHusband, husband));
			}
		}
		return husband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Father basicGetHusband() {
		return husband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHusband(Father newHusband) {
		Father oldHusband = husband;
		husband = newHusband;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.MOTHER__HUSBAND, oldHusband, husband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.MOTHER__HUSBAND:
				if (resolve) return getHusband();
				return basicGetHusband();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FamilyPackage.MOTHER__HUSBAND:
				setHusband((Father)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FamilyPackage.MOTHER__HUSBAND:
				setHusband((Father)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FamilyPackage.MOTHER__HUSBAND:
				return husband != null;
		}
		return super.eIsSet(featureID);
	}

} //MotherImpl
