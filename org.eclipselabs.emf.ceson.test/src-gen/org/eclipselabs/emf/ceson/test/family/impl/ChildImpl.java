/**
 */
package org.eclipselabs.emf.ceson.test.family.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.emf.ceson.test.family.Child;
import org.eclipselabs.emf.ceson.test.family.FamilyPackage;
import org.eclipselabs.emf.ceson.test.family.Father;
import org.eclipselabs.emf.ceson.test.family.Mother;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.test.family.impl.ChildImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.test.family.impl.ChildImpl#getFather <em>Father</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChildImpl extends PersonImpl implements Child {
	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected Mother mother;

	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected Father father;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.CHILD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mother getMother() {
		if (mother != null && mother.eIsProxy()) {
			InternalEObject oldMother = (InternalEObject)mother;
			mother = (Mother)eResolveProxy(oldMother);
			if (mother != oldMother) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.CHILD__MOTHER, oldMother, mother));
			}
		}
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mother basicGetMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(Mother newMother) {
		Mother oldMother = mother;
		mother = newMother;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.CHILD__MOTHER, oldMother, mother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Father getFather() {
		if (father != null && father.eIsProxy()) {
			InternalEObject oldFather = (InternalEObject)father;
			father = (Father)eResolveProxy(oldFather);
			if (father != oldFather) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.CHILD__FATHER, oldFather, father));
			}
		}
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Father basicGetFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(Father newFather) {
		Father oldFather = father;
		father = newFather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.CHILD__FATHER, oldFather, father));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.CHILD__MOTHER:
				if (resolve) return getMother();
				return basicGetMother();
			case FamilyPackage.CHILD__FATHER:
				if (resolve) return getFather();
				return basicGetFather();
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
			case FamilyPackage.CHILD__MOTHER:
				setMother((Mother)newValue);
				return;
			case FamilyPackage.CHILD__FATHER:
				setFather((Father)newValue);
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
			case FamilyPackage.CHILD__MOTHER:
				setMother((Mother)null);
				return;
			case FamilyPackage.CHILD__FATHER:
				setFather((Father)null);
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
			case FamilyPackage.CHILD__MOTHER:
				return mother != null;
			case FamilyPackage.CHILD__FATHER:
				return father != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildImpl
