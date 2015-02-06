/**
 */
package org.eclipselabs.emf.ceson.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.emf.ceson.CEnumValue;
import org.eclipselabs.emf.ceson.CesonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CEnum Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.ceson.impl.CEnumValueImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.impl.CEnumValueImpl#getEnumTypeName <em>Enum Type Name</em>}</li>
 *   <li>{@link org.eclipselabs.emf.ceson.impl.CEnumValueImpl#getLiteralName <em>Literal Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CEnumValueImpl extends CValueImpl implements CEnumValue {
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnumTypeName() <em>Enum Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUM_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumTypeName() <em>Enum Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumTypeName()
	 * @generated
	 * @ordered
	 */
	protected String enumTypeName = ENUM_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLiteralName() <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralName()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiteralName() <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralName()
	 * @generated
	 * @ordered
	 */
	protected String literalName = LITERAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEnumValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CesonPackage.Literals.CENUM_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CesonPackage.CENUM_VALUE__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnumTypeName() {
		return enumTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumTypeName(String newEnumTypeName) {
		String oldEnumTypeName = enumTypeName;
		enumTypeName = newEnumTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CesonPackage.CENUM_VALUE__ENUM_TYPE_NAME, oldEnumTypeName, enumTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteralName() {
		return literalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralName(String newLiteralName) {
		String oldLiteralName = literalName;
		literalName = newLiteralName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CesonPackage.CENUM_VALUE__LITERAL_NAME, oldLiteralName, literalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CesonPackage.CENUM_VALUE__PACKAGE_NAME:
				return getPackageName();
			case CesonPackage.CENUM_VALUE__ENUM_TYPE_NAME:
				return getEnumTypeName();
			case CesonPackage.CENUM_VALUE__LITERAL_NAME:
				return getLiteralName();
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
			case CesonPackage.CENUM_VALUE__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case CesonPackage.CENUM_VALUE__ENUM_TYPE_NAME:
				setEnumTypeName((String)newValue);
				return;
			case CesonPackage.CENUM_VALUE__LITERAL_NAME:
				setLiteralName((String)newValue);
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
			case CesonPackage.CENUM_VALUE__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case CesonPackage.CENUM_VALUE__ENUM_TYPE_NAME:
				setEnumTypeName(ENUM_TYPE_NAME_EDEFAULT);
				return;
			case CesonPackage.CENUM_VALUE__LITERAL_NAME:
				setLiteralName(LITERAL_NAME_EDEFAULT);
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
			case CesonPackage.CENUM_VALUE__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case CesonPackage.CENUM_VALUE__ENUM_TYPE_NAME:
				return ENUM_TYPE_NAME_EDEFAULT == null ? enumTypeName != null : !ENUM_TYPE_NAME_EDEFAULT.equals(enumTypeName);
			case CesonPackage.CENUM_VALUE__LITERAL_NAME:
				return LITERAL_NAME_EDEFAULT == null ? literalName != null : !LITERAL_NAME_EDEFAULT.equals(literalName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", enumTypeName: ");
		result.append(enumTypeName);
		result.append(", literalName: ");
		result.append(literalName);
		result.append(')');
		return result.toString();
	}

} //CEnumValueImpl
