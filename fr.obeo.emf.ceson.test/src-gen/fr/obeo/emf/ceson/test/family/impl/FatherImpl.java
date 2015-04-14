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
 * An implementation of the model object '<em><b>Father</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.emf.ceson.test.family.impl.FatherImpl#getWife <em>Wife</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FatherImpl extends ParentImpl implements Father {
	/**
	 * The cached value of the '{@link #getWife() <em>Wife</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWife()
	 * @generated
	 * @ordered
	 */
	protected Mother wife;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FatherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.FATHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mother getWife() {
		if (wife != null && wife.eIsProxy()) {
			InternalEObject oldWife = (InternalEObject)wife;
			wife = (Mother)eResolveProxy(oldWife);
			if (wife != oldWife) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.FATHER__WIFE, oldWife, wife));
			}
		}
		return wife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mother basicGetWife() {
		return wife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWife(Mother newWife) {
		Mother oldWife = wife;
		wife = newWife;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.FATHER__WIFE, oldWife, wife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.FATHER__WIFE:
				if (resolve) return getWife();
				return basicGetWife();
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
			case FamilyPackage.FATHER__WIFE:
				setWife((Mother)newValue);
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
			case FamilyPackage.FATHER__WIFE:
				setWife((Mother)null);
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
			case FamilyPackage.FATHER__WIFE:
				return wife != null;
		}
		return super.eIsSet(featureID);
	}

} //FatherImpl
