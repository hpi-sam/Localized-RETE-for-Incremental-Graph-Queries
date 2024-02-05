/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.StudyAtLink;
import de.mdelab.ldbc_snb.University;
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
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.UniversityImpl#getIsLocatedIn <em>Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.UniversityImpl#getOppStudyAt <em>Opp Study At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends OrganisationImpl implements University {
	/**
	 * The cached value of the '{@link #getIsLocatedIn() <em>Is Located In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocatedIn()
	 * @generated
	 * @ordered
	 */
	protected City isLocatedIn;
	/**
	 * The cached value of the '{@link #getOppStudyAt() <em>Opp Study At</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppStudyAt()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyAtLink> oppStudyAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.UNIVERSITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public City getIsLocatedIn() {
		if (isLocatedIn != null && isLocatedIn.eIsProxy()) {
			InternalEObject oldIsLocatedIn = (InternalEObject)isLocatedIn;
			isLocatedIn = (City)eResolveProxy(oldIsLocatedIn);
			if (isLocatedIn != oldIsLocatedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN, oldIsLocatedIn, isLocatedIn));
			}
		}
		return isLocatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetIsLocatedIn() {
		return isLocatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsLocatedIn(City newIsLocatedIn, NotificationChain msgs) {
		City oldIsLocatedIn = isLocatedIn;
		isLocatedIn = newIsLocatedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN, oldIsLocatedIn, newIsLocatedIn);
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
	public void setIsLocatedIn(City newIsLocatedIn) {
		if (newIsLocatedIn != isLocatedIn) {
			NotificationChain msgs = null;
			if (isLocatedIn != null)
				msgs = ((InternalEObject)isLocatedIn).eInverseRemove(this, Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN, City.class, msgs);
			if (newIsLocatedIn != null)
				msgs = ((InternalEObject)newIsLocatedIn).eInverseAdd(this, Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN, City.class, msgs);
			msgs = basicSetIsLocatedIn(newIsLocatedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN, newIsLocatedIn, newIsLocatedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StudyAtLink> getOppStudyAt() {
		if (oppStudyAt == null) {
			oppStudyAt = new EObjectWithInverseResolvingEList<StudyAtLink>(StudyAtLink.class, this, Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT, Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT);
		}
		return oppStudyAt;
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
			case Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN:
				if (isLocatedIn != null)
					msgs = ((InternalEObject)isLocatedIn).eInverseRemove(this, Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN, City.class, msgs);
				return basicSetIsLocatedIn((City)otherEnd, msgs);
			case Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppStudyAt()).basicAdd(otherEnd, msgs);
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
			case Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN:
				return basicSetIsLocatedIn(null, msgs);
			case Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT:
				return ((InternalEList<?>)getOppStudyAt()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN:
				if (resolve) return getIsLocatedIn();
				return basicGetIsLocatedIn();
			case Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT:
				return getOppStudyAt();
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
			case Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN:
				setIsLocatedIn((City)newValue);
				return;
			case Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT:
				getOppStudyAt().clear();
				getOppStudyAt().addAll((Collection<? extends StudyAtLink>)newValue);
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
			case Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN:
				setIsLocatedIn((City)null);
				return;
			case Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT:
				getOppStudyAt().clear();
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
			case Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN:
				return isLocatedIn != null;
			case Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT:
				return oppStudyAt != null && !oppStudyAt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UniversityImpl
