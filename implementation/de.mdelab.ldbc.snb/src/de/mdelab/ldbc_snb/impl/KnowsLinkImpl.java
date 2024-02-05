/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Person;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knows Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.KnowsLinkImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.KnowsLinkImpl#getKnows <em>Knows</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.KnowsLinkImpl#getOppKnows <em>Opp Knows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowsLinkImpl extends DynamicElementImpl implements KnowsLink {
	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final long CREATION_DATE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected long creationDate = CREATION_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getKnows() <em>Knows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnows()
	 * @generated
	 * @ordered
	 */
	protected Person knows;
	/**
	 * The cached value of the '{@link #getOppKnows() <em>Opp Knows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppKnows()
	 * @generated
	 * @ordered
	 */
	protected Person oppKnows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowsLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.KNOWS_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(long newCreationDate) {
		long oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.KNOWS_LINK__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getKnows() {
		if (knows != null && knows.eIsProxy()) {
			InternalEObject oldKnows = (InternalEObject)knows;
			knows = (Person)eResolveProxy(oldKnows);
			if (knows != oldKnows) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.KNOWS_LINK__KNOWS, oldKnows, knows));
			}
		}
		return knows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetKnows() {
		return knows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnows(Person newKnows, NotificationChain msgs) {
		Person oldKnows = knows;
		knows = newKnows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.KNOWS_LINK__KNOWS, oldKnows, newKnows);
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
	public void setKnows(Person newKnows) {
		if (newKnows != knows) {
			NotificationChain msgs = null;
			if (knows != null)
				msgs = ((InternalEObject)knows).eInverseRemove(this, Ldbc_snbPackage.PERSON__OPP_KNOWS, Person.class, msgs);
			if (newKnows != null)
				msgs = ((InternalEObject)newKnows).eInverseAdd(this, Ldbc_snbPackage.PERSON__OPP_KNOWS, Person.class, msgs);
			msgs = basicSetKnows(newKnows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.KNOWS_LINK__KNOWS, newKnows, newKnows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getOppKnows() {
		if (oppKnows != null && oppKnows.eIsProxy()) {
			InternalEObject oldOppKnows = (InternalEObject)oppKnows;
			oppKnows = (Person)eResolveProxy(oldOppKnows);
			if (oppKnows != oldOppKnows) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS, oldOppKnows, oppKnows));
			}
		}
		return oppKnows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetOppKnows() {
		return oppKnows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOppKnows(Person newOppKnows, NotificationChain msgs) {
		Person oldOppKnows = oppKnows;
		oppKnows = newOppKnows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS, oldOppKnows, newOppKnows);
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
	public void setOppKnows(Person newOppKnows) {
		if (newOppKnows != oppKnows) {
			NotificationChain msgs = null;
			if (oppKnows != null)
				msgs = ((InternalEObject)oppKnows).eInverseRemove(this, Ldbc_snbPackage.PERSON__KNOWS, Person.class, msgs);
			if (newOppKnows != null)
				msgs = ((InternalEObject)newOppKnows).eInverseAdd(this, Ldbc_snbPackage.PERSON__KNOWS, Person.class, msgs);
			msgs = basicSetOppKnows(newOppKnows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS, newOppKnows, newOppKnows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.KNOWS_LINK__KNOWS:
				if (knows != null)
					msgs = ((InternalEObject)knows).eInverseRemove(this, Ldbc_snbPackage.PERSON__OPP_KNOWS, Person.class, msgs);
				return basicSetKnows((Person)otherEnd, msgs);
			case Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS:
				if (oppKnows != null)
					msgs = ((InternalEObject)oppKnows).eInverseRemove(this, Ldbc_snbPackage.PERSON__KNOWS, Person.class, msgs);
				return basicSetOppKnows((Person)otherEnd, msgs);
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
			case Ldbc_snbPackage.KNOWS_LINK__KNOWS:
				return basicSetKnows(null, msgs);
			case Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS:
				return basicSetOppKnows(null, msgs);
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
			case Ldbc_snbPackage.KNOWS_LINK__CREATION_DATE:
				return getCreationDate();
			case Ldbc_snbPackage.KNOWS_LINK__KNOWS:
				if (resolve) return getKnows();
				return basicGetKnows();
			case Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS:
				if (resolve) return getOppKnows();
				return basicGetOppKnows();
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
			case Ldbc_snbPackage.KNOWS_LINK__CREATION_DATE:
				setCreationDate((Long)newValue);
				return;
			case Ldbc_snbPackage.KNOWS_LINK__KNOWS:
				setKnows((Person)newValue);
				return;
			case Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS:
				setOppKnows((Person)newValue);
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
			case Ldbc_snbPackage.KNOWS_LINK__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Ldbc_snbPackage.KNOWS_LINK__KNOWS:
				setKnows((Person)null);
				return;
			case Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS:
				setOppKnows((Person)null);
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
			case Ldbc_snbPackage.KNOWS_LINK__CREATION_DATE:
				return creationDate != CREATION_DATE_EDEFAULT;
			case Ldbc_snbPackage.KNOWS_LINK__KNOWS:
				return knows != null;
			case Ldbc_snbPackage.KNOWS_LINK__OPP_KNOWS:
				return oppKnows != null;
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
		result.append(" (creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //KnowsLinkImpl
