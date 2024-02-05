/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.Continent;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Message;
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
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CountryImpl#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CountryImpl#getOppIsPartOf <em>Opp Is Part Of</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CountryImpl#getOppCompanyIsLocatedIn <em>Opp Company Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CountryImpl#getOppMessageIsLocatedIn <em>Opp Message Is Located In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryImpl extends PlaceImpl implements Country {
	/**
	 * The cached value of the '{@link #getIsPartOf() <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPartOf()
	 * @generated
	 * @ordered
	 */
	protected Continent isPartOf;
	/**
	 * The cached value of the '{@link #getOppIsPartOf() <em>Opp Is Part Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppIsPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<City> oppIsPartOf;
	/**
	 * The cached value of the '{@link #getOppCompanyIsLocatedIn() <em>Opp Company Is Located In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppCompanyIsLocatedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Company> oppCompanyIsLocatedIn;
	/**
	 * The cached value of the '{@link #getOppMessageIsLocatedIn() <em>Opp Message Is Located In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppMessageIsLocatedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> oppMessageIsLocatedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.COUNTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Continent getIsPartOf() {
		if (isPartOf != null && isPartOf.eIsProxy()) {
			InternalEObject oldIsPartOf = (InternalEObject)isPartOf;
			isPartOf = (Continent)eResolveProxy(oldIsPartOf);
			if (isPartOf != oldIsPartOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.COUNTRY__IS_PART_OF, oldIsPartOf, isPartOf));
			}
		}
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continent basicGetIsPartOf() {
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPartOf(Continent newIsPartOf, NotificationChain msgs) {
		Continent oldIsPartOf = isPartOf;
		isPartOf = newIsPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.COUNTRY__IS_PART_OF, oldIsPartOf, newIsPartOf);
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
	public void setIsPartOf(Continent newIsPartOf) {
		if (newIsPartOf != isPartOf) {
			NotificationChain msgs = null;
			if (isPartOf != null)
				msgs = ((InternalEObject)isPartOf).eInverseRemove(this, Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF, Continent.class, msgs);
			if (newIsPartOf != null)
				msgs = ((InternalEObject)newIsPartOf).eInverseAdd(this, Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF, Continent.class, msgs);
			msgs = basicSetIsPartOf(newIsPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.COUNTRY__IS_PART_OF, newIsPartOf, newIsPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<City> getOppIsPartOf() {
		if (oppIsPartOf == null) {
			oppIsPartOf = new EObjectWithInverseResolvingEList<City>(City.class, this, Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF, Ldbc_snbPackage.CITY__IS_PART_OF);
		}
		return oppIsPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Company> getOppCompanyIsLocatedIn() {
		if (oppCompanyIsLocatedIn == null) {
			oppCompanyIsLocatedIn = new EObjectWithInverseResolvingEList<Company>(Company.class, this, Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN, Ldbc_snbPackage.COMPANY__IS_LOCATED_IN);
		}
		return oppCompanyIsLocatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Message> getOppMessageIsLocatedIn() {
		if (oppMessageIsLocatedIn == null) {
			oppMessageIsLocatedIn = new EObjectWithInverseResolvingEList<Message>(Message.class, this, Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN, Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN);
		}
		return oppMessageIsLocatedIn;
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
			case Ldbc_snbPackage.COUNTRY__IS_PART_OF:
				if (isPartOf != null)
					msgs = ((InternalEObject)isPartOf).eInverseRemove(this, Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF, Continent.class, msgs);
				return basicSetIsPartOf((Continent)otherEnd, msgs);
			case Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppIsPartOf()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppCompanyIsLocatedIn()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppMessageIsLocatedIn()).basicAdd(otherEnd, msgs);
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
			case Ldbc_snbPackage.COUNTRY__IS_PART_OF:
				return basicSetIsPartOf(null, msgs);
			case Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF:
				return ((InternalEList<?>)getOppIsPartOf()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN:
				return ((InternalEList<?>)getOppCompanyIsLocatedIn()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN:
				return ((InternalEList<?>)getOppMessageIsLocatedIn()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.COUNTRY__IS_PART_OF:
				if (resolve) return getIsPartOf();
				return basicGetIsPartOf();
			case Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF:
				return getOppIsPartOf();
			case Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN:
				return getOppCompanyIsLocatedIn();
			case Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN:
				return getOppMessageIsLocatedIn();
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
			case Ldbc_snbPackage.COUNTRY__IS_PART_OF:
				setIsPartOf((Continent)newValue);
				return;
			case Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF:
				getOppIsPartOf().clear();
				getOppIsPartOf().addAll((Collection<? extends City>)newValue);
				return;
			case Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN:
				getOppCompanyIsLocatedIn().clear();
				getOppCompanyIsLocatedIn().addAll((Collection<? extends Company>)newValue);
				return;
			case Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN:
				getOppMessageIsLocatedIn().clear();
				getOppMessageIsLocatedIn().addAll((Collection<? extends Message>)newValue);
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
			case Ldbc_snbPackage.COUNTRY__IS_PART_OF:
				setIsPartOf((Continent)null);
				return;
			case Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF:
				getOppIsPartOf().clear();
				return;
			case Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN:
				getOppCompanyIsLocatedIn().clear();
				return;
			case Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN:
				getOppMessageIsLocatedIn().clear();
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
			case Ldbc_snbPackage.COUNTRY__IS_PART_OF:
				return isPartOf != null;
			case Ldbc_snbPackage.COUNTRY__OPP_IS_PART_OF:
				return oppIsPartOf != null && !oppIsPartOf.isEmpty();
			case Ldbc_snbPackage.COUNTRY__OPP_COMPANY_IS_LOCATED_IN:
				return oppCompanyIsLocatedIn != null && !oppCompanyIsLocatedIn.isEmpty();
			case Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN:
				return oppMessageIsLocatedIn != null && !oppMessageIsLocatedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CountryImpl
