/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Person;
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
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CityImpl#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CityImpl#getOppPersonIsLocatedIn <em>Opp Person Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CityImpl#getOppUniversityIsLocatedIn <em>Opp University Is Located In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CityImpl extends PlaceImpl implements City {
	/**
	 * The cached value of the '{@link #getIsPartOf() <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPartOf()
	 * @generated
	 * @ordered
	 */
	protected Country isPartOf;
	/**
	 * The cached value of the '{@link #getOppPersonIsLocatedIn() <em>Opp Person Is Located In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppPersonIsLocatedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> oppPersonIsLocatedIn;
	/**
	 * The cached value of the '{@link #getOppUniversityIsLocatedIn() <em>Opp University Is Located In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppUniversityIsLocatedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<University> oppUniversityIsLocatedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Country getIsPartOf() {
		if (isPartOf != null && isPartOf.eIsProxy()) {
			InternalEObject oldIsPartOf = (InternalEObject)isPartOf;
			isPartOf = (Country)eResolveProxy(oldIsPartOf);
			if (isPartOf != oldIsPartOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.CITY__IS_PART_OF, oldIsPartOf, isPartOf));
			}
		}
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetIsPartOf() {
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPartOf(Country newIsPartOf, NotificationChain msgs) {
		Country oldIsPartOf = isPartOf;
		isPartOf = newIsPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.CITY__IS_PART_OF, oldIsPartOf, newIsPartOf);
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
	public void setIsPartOf(Country newIsPartOf) {
		if (newIsPartOf != isPartOf) {
			NotificationChain msgs = null;
			if (isPartOf != null)
				msgs = ((InternalEObject)isPartOf).eInverseRemove(this, Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF, Country.class, msgs);
			if (newIsPartOf != null)
				msgs = ((InternalEObject)newIsPartOf).eInverseAdd(this, Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF, Country.class, msgs);
			msgs = basicSetIsPartOf(newIsPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.CITY__IS_PART_OF, newIsPartOf, newIsPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getOppPersonIsLocatedIn() {
		if (oppPersonIsLocatedIn == null) {
			oppPersonIsLocatedIn = new EObjectWithInverseResolvingEList<Person>(Person.class, this, Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN, Ldbc_snbPackage.PERSON__IS_LOCATED_IN);
		}
		return oppPersonIsLocatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<University> getOppUniversityIsLocatedIn() {
		if (oppUniversityIsLocatedIn == null) {
			oppUniversityIsLocatedIn = new EObjectWithInverseResolvingEList<University>(University.class, this, Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN, Ldbc_snbPackage.UNIVERSITY__IS_LOCATED_IN);
		}
		return oppUniversityIsLocatedIn;
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
			case Ldbc_snbPackage.CITY__IS_PART_OF:
				if (isPartOf != null)
					msgs = ((InternalEObject)isPartOf).eInverseRemove(this, Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF, Country.class, msgs);
				return basicSetIsPartOf((Country)otherEnd, msgs);
			case Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppPersonIsLocatedIn()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppUniversityIsLocatedIn()).basicAdd(otherEnd, msgs);
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
			case Ldbc_snbPackage.CITY__IS_PART_OF:
				return basicSetIsPartOf(null, msgs);
			case Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN:
				return ((InternalEList<?>)getOppPersonIsLocatedIn()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN:
				return ((InternalEList<?>)getOppUniversityIsLocatedIn()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.CITY__IS_PART_OF:
				if (resolve) return getIsPartOf();
				return basicGetIsPartOf();
			case Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN:
				return getOppPersonIsLocatedIn();
			case Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN:
				return getOppUniversityIsLocatedIn();
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
			case Ldbc_snbPackage.CITY__IS_PART_OF:
				setIsPartOf((Country)newValue);
				return;
			case Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN:
				getOppPersonIsLocatedIn().clear();
				getOppPersonIsLocatedIn().addAll((Collection<? extends Person>)newValue);
				return;
			case Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN:
				getOppUniversityIsLocatedIn().clear();
				getOppUniversityIsLocatedIn().addAll((Collection<? extends University>)newValue);
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
			case Ldbc_snbPackage.CITY__IS_PART_OF:
				setIsPartOf((Country)null);
				return;
			case Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN:
				getOppPersonIsLocatedIn().clear();
				return;
			case Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN:
				getOppUniversityIsLocatedIn().clear();
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
			case Ldbc_snbPackage.CITY__IS_PART_OF:
				return isPartOf != null;
			case Ldbc_snbPackage.CITY__OPP_PERSON_IS_LOCATED_IN:
				return oppPersonIsLocatedIn != null && !oppPersonIsLocatedIn.isEmpty();
			case Ldbc_snbPackage.CITY__OPP_UNIVERSITY_IS_LOCATED_IN:
				return oppUniversityIsLocatedIn != null && !oppUniversityIsLocatedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CityImpl
