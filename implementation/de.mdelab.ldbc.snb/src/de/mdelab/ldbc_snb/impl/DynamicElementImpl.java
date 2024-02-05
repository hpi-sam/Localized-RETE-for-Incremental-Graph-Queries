/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.DynamicElement;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.DynamicElementImpl#getCts <em>Cts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.DynamicElementImpl#getDts <em>Dts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicElementImpl extends MinimalEObjectImpl.Container implements DynamicElement {
	/**
	 * The default value of the '{@link #getCts() <em>Cts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCts()
	 * @generated
	 * @ordered
	 */
	protected static final long CTS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getCts() <em>Cts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCts()
	 * @generated
	 * @ordered
	 */
	protected long cts = CTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getDts() <em>Dts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDts()
	 * @generated
	 * @ordered
	 */
	protected static final long DTS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getDts() <em>Dts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDts()
	 * @generated
	 * @ordered
	 */
	protected long dts = DTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.DYNAMIC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCts() {
		return cts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCts(long newCts) {
		long oldCts = cts;
		cts = newCts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS, oldCts, cts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDts() {
		return dts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDts(long newDts) {
		long oldDts = dts;
		dts = newDts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS, oldDts, dts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS:
				return getCts();
			case Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS:
				return getDts();
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
			case Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS:
				setCts((Long)newValue);
				return;
			case Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS:
				setDts((Long)newValue);
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
			case Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS:
				setCts(CTS_EDEFAULT);
				return;
			case Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS:
				setDts(DTS_EDEFAULT);
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
			case Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS:
				return cts != CTS_EDEFAULT;
			case Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS:
				return dts != DTS_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cts: ");
		result.append(cts);
		result.append(", dts: ");
		result.append(dts);
		result.append(')');
		return result.toString();
	}

} //DynamicElementImpl
