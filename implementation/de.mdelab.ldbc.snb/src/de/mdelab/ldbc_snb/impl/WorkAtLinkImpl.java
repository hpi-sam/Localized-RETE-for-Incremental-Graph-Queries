/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.WorkAtLink;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work At Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.WorkAtLinkImpl#getWorkFrom <em>Work From</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.WorkAtLinkImpl#getWorkAt <em>Work At</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.WorkAtLinkImpl#getOppWorkAt <em>Opp Work At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkAtLinkImpl extends MinimalEObjectImpl.Container implements WorkAtLink {
	/**
	 * The default value of the '{@link #getWorkFrom() <em>Work From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFrom()
	 * @generated
	 * @ordered
	 */
	protected static final int WORK_FROM_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getWorkFrom() <em>Work From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFrom()
	 * @generated
	 * @ordered
	 */
	protected int workFrom = WORK_FROM_EDEFAULT;
	/**
	 * The cached value of the '{@link #getWorkAt() <em>Work At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkAt()
	 * @generated
	 * @ordered
	 */
	protected Company workAt;
	/**
	 * The cached value of the '{@link #getOppWorkAt() <em>Opp Work At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppWorkAt()
	 * @generated
	 * @ordered
	 */
	protected Person oppWorkAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkAtLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.WORK_AT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWorkFrom() {
		return workFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkFrom(int newWorkFrom) {
		int oldWorkFrom = workFrom;
		workFrom = newWorkFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.WORK_AT_LINK__WORK_FROM, oldWorkFrom, workFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Company getWorkAt() {
		if (workAt != null && workAt.eIsProxy()) {
			InternalEObject oldWorkAt = (InternalEObject)workAt;
			workAt = (Company)eResolveProxy(oldWorkAt);
			if (workAt != oldWorkAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.WORK_AT_LINK__WORK_AT, oldWorkAt, workAt));
			}
		}
		return workAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company basicGetWorkAt() {
		return workAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkAt(Company newWorkAt, NotificationChain msgs) {
		Company oldWorkAt = workAt;
		workAt = newWorkAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.WORK_AT_LINK__WORK_AT, oldWorkAt, newWorkAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkAt(Company newWorkAt) {
		if (newWorkAt != workAt) {
			NotificationChain msgs = null;
			if (workAt != null)
				msgs = ((InternalEObject)workAt).eInverseRemove(this, Ldbc_snbPackage.COMPANY__OPP_WORK_AT, Company.class, msgs);
			if (newWorkAt != null)
				msgs = ((InternalEObject)newWorkAt).eInverseAdd(this, Ldbc_snbPackage.COMPANY__OPP_WORK_AT, Company.class, msgs);
			msgs = basicSetWorkAt(newWorkAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.WORK_AT_LINK__WORK_AT, newWorkAt, newWorkAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getOppWorkAt() {
		if (oppWorkAt != null && oppWorkAt.eIsProxy()) {
			InternalEObject oldOppWorkAt = (InternalEObject)oppWorkAt;
			oppWorkAt = (Person)eResolveProxy(oldOppWorkAt);
			if (oppWorkAt != oldOppWorkAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT, oldOppWorkAt, oppWorkAt));
			}
		}
		return oppWorkAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetOppWorkAt() {
		return oppWorkAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOppWorkAt(Person newOppWorkAt, NotificationChain msgs) {
		Person oldOppWorkAt = oppWorkAt;
		oppWorkAt = newOppWorkAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT, oldOppWorkAt, newOppWorkAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOppWorkAt(Person newOppWorkAt) {
		if (newOppWorkAt != oppWorkAt) {
			NotificationChain msgs = null;
			if (oppWorkAt != null)
				msgs = ((InternalEObject)oppWorkAt).eInverseRemove(this, Ldbc_snbPackage.PERSON__WORK_AT, Person.class, msgs);
			if (newOppWorkAt != null)
				msgs = ((InternalEObject)newOppWorkAt).eInverseAdd(this, Ldbc_snbPackage.PERSON__WORK_AT, Person.class, msgs);
			msgs = basicSetOppWorkAt(newOppWorkAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT, newOppWorkAt, newOppWorkAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_AT:
				if (workAt != null)
					msgs = ((InternalEObject)workAt).eInverseRemove(this, Ldbc_snbPackage.COMPANY__OPP_WORK_AT, Company.class, msgs);
				return basicSetWorkAt((Company)otherEnd, msgs);
			case Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT:
				if (oppWorkAt != null)
					msgs = ((InternalEObject)oppWorkAt).eInverseRemove(this, Ldbc_snbPackage.PERSON__WORK_AT, Person.class, msgs);
				return basicSetOppWorkAt((Person)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_AT:
				return basicSetWorkAt(null, msgs);
			case Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT:
				return basicSetOppWorkAt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_FROM:
				return getWorkFrom();
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_AT:
				if (resolve) return getWorkAt();
				return basicGetWorkAt();
			case Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT:
				if (resolve) return getOppWorkAt();
				return basicGetOppWorkAt();
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
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_FROM:
				setWorkFrom((Integer)newValue);
				return;
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_AT:
				setWorkAt((Company)newValue);
				return;
			case Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT:
				setOppWorkAt((Person)newValue);
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
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_FROM:
				setWorkFrom(WORK_FROM_EDEFAULT);
				return;
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_AT:
				setWorkAt((Company)null);
				return;
			case Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT:
				setOppWorkAt((Person)null);
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
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_FROM:
				return workFrom != WORK_FROM_EDEFAULT;
			case Ldbc_snbPackage.WORK_AT_LINK__WORK_AT:
				return workAt != null;
			case Ldbc_snbPackage.WORK_AT_LINK__OPP_WORK_AT:
				return oppWorkAt != null;
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
		result.append(" (workFrom: ");
		result.append(workFrom);
		result.append(')');
		return result.toString();
	}

} //WorkAtLinkImpl
