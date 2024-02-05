/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.WorkAtLink;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CompanyImpl#getIsLocatedIn <em>Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CompanyImpl#getOppWorkAt <em>Opp Work At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyImpl extends OrganisationImpl implements Company {
	/**
	 * The cached value of the '{@link #getIsLocatedIn() <em>Is Located In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocatedIn()
	 * @generated
	 * @ordered
	 */
	protected Country isLocatedIn;
	/**
	 * The cached value of the '{@link #getOppWorkAt() <em>Opp Work At</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppWorkAt()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkAtLink> oppWorkAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.COMPANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Country getIsLocatedIn() {
		if (isLocatedIn != null && isLocatedIn.eIsProxy()) {
			InternalEObject oldIsLocatedIn = (InternalEObject)isLocatedIn;
			isLocatedIn = (Country)eResolveProxy(oldIsLocatedIn);
			if (isLocatedIn != oldIsLocatedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.COMPANY__IS_LOCATED_IN, oldIsLocatedIn, isLocatedIn));
			}
		}
		return isLocatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetIsLocatedIn() {
		return isLocatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsLocatedIn(Country newIsLocatedIn, NotificationChain msgs) {
		Country oldIsLocatedIn = isLocatedIn;
		isLocatedIn = newIsLocatedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.COMPANY__IS_LOCATED_IN, oldIsLocatedIn, newIsLocatedIn);
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
	public void setIsLocatedIn(Country newIsLocatedIn) {
		if (newIsLocatedIn != isLocatedIn) {
			NotificationChain msgs = null;
			if (isLocatedIn != null)
				msgs = ((InternalEObject)isLocatedIn).eInverseRemove(this, Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN, Country.class, msgs);
			if (newIsLocatedIn != null)
				msgs = ((InternalEObject)newIsLocatedIn).eInverseAdd(this, Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN, Country.class, msgs);
			msgs = basicSetIsLocatedIn(newIsLocatedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.COMPANY__IS_LOCATED_IN, newIsLocatedIn, newIsLocatedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WorkAtLink> getOppWorkAt() {
		if (oppWorkAt == null) {
			oppWorkAt = new EObjectWithInverseResolvingEList<WorkAtLink>(WorkAtLink.class, this, Ldbc_snbPackage.COMPANY__OPP_WORK_AT, Ldbc_snbPackage.WORK_AT_LINK__WORK_AT);
		}
		return oppWorkAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.COMPANY__IS_LOCATED_IN:
				if (isLocatedIn != null)
					msgs = ((InternalEObject)isLocatedIn).eInverseRemove(this, Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN, Country.class, msgs);
				return basicSetIsLocatedIn((Country)otherEnd, msgs);
			case Ldbc_snbPackage.COMPANY__OPP_WORK_AT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppWorkAt()).basicAdd(otherEnd, msgs);
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
			case Ldbc_snbPackage.COMPANY__IS_LOCATED_IN:
				return basicSetIsLocatedIn(null, msgs);
			case Ldbc_snbPackage.COMPANY__OPP_WORK_AT:
				return ((InternalEList<?>)getOppWorkAt()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.COMPANY__IS_LOCATED_IN:
				if (resolve) return getIsLocatedIn();
				return basicGetIsLocatedIn();
			case Ldbc_snbPackage.COMPANY__OPP_WORK_AT:
				return getOppWorkAt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ldbc_snbPackage.COMPANY__IS_LOCATED_IN:
				setIsLocatedIn((Country)newValue);
				return;
			case Ldbc_snbPackage.COMPANY__OPP_WORK_AT:
				getOppWorkAt().clear();
				getOppWorkAt().addAll((Collection<? extends WorkAtLink>)newValue);
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
			case Ldbc_snbPackage.COMPANY__IS_LOCATED_IN:
				setIsLocatedIn((Country)null);
				return;
			case Ldbc_snbPackage.COMPANY__OPP_WORK_AT:
				getOppWorkAt().clear();
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
			case Ldbc_snbPackage.COMPANY__IS_LOCATED_IN:
				return isLocatedIn != null;
			case Ldbc_snbPackage.COMPANY__OPP_WORK_AT:
				return oppWorkAt != null && !oppWorkAt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompanyImpl
