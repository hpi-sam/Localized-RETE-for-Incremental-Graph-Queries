/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Person;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Member Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.HasMemberLinkImpl#getJoinDate <em>Join Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.HasMemberLinkImpl#getHasMember <em>Has Member</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.HasMemberLinkImpl#getOppHasMember <em>Opp Has Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HasMemberLinkImpl extends DynamicElementImpl implements HasMemberLink {
	/**
	 * The default value of the '{@link #getJoinDate() <em>Join Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinDate()
	 * @generated
	 * @ordered
	 */
	protected static final long JOIN_DATE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getJoinDate() <em>Join Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinDate()
	 * @generated
	 * @ordered
	 */
	protected long joinDate = JOIN_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getHasMember() <em>Has Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMember()
	 * @generated
	 * @ordered
	 */
	protected Person hasMember;
	/**
	 * The cached value of the '{@link #getOppHasMember() <em>Opp Has Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppHasMember()
	 * @generated
	 * @ordered
	 */
	protected Forum oppHasMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasMemberLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.HAS_MEMBER_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getJoinDate() {
		return joinDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinDate(long newJoinDate) {
		long oldJoinDate = joinDate;
		joinDate = newJoinDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.HAS_MEMBER_LINK__JOIN_DATE, oldJoinDate, joinDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getHasMember() {
		if (hasMember != null && hasMember.eIsProxy()) {
			InternalEObject oldHasMember = (InternalEObject)hasMember;
			hasMember = (Person)eResolveProxy(oldHasMember);
			if (hasMember != oldHasMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER, oldHasMember, hasMember));
			}
		}
		return hasMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetHasMember() {
		return hasMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMember(Person newHasMember, NotificationChain msgs) {
		Person oldHasMember = hasMember;
		hasMember = newHasMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER, oldHasMember, newHasMember);
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
	public void setHasMember(Person newHasMember) {
		if (newHasMember != hasMember) {
			NotificationChain msgs = null;
			if (hasMember != null)
				msgs = ((InternalEObject)hasMember).eInverseRemove(this, Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER, Person.class, msgs);
			if (newHasMember != null)
				msgs = ((InternalEObject)newHasMember).eInverseAdd(this, Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER, Person.class, msgs);
			msgs = basicSetHasMember(newHasMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER, newHasMember, newHasMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Forum getOppHasMember() {
		if (oppHasMember != null && oppHasMember.eIsProxy()) {
			InternalEObject oldOppHasMember = (InternalEObject)oppHasMember;
			oppHasMember = (Forum)eResolveProxy(oldOppHasMember);
			if (oppHasMember != oldOppHasMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER, oldOppHasMember, oppHasMember));
			}
		}
		return oppHasMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forum basicGetOppHasMember() {
		return oppHasMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOppHasMember(Forum newOppHasMember, NotificationChain msgs) {
		Forum oldOppHasMember = oppHasMember;
		oppHasMember = newOppHasMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER, oldOppHasMember, newOppHasMember);
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
	public void setOppHasMember(Forum newOppHasMember) {
		if (newOppHasMember != oppHasMember) {
			NotificationChain msgs = null;
			if (oppHasMember != null)
				msgs = ((InternalEObject)oppHasMember).eInverseRemove(this, Ldbc_snbPackage.FORUM__HAS_MEMBER, Forum.class, msgs);
			if (newOppHasMember != null)
				msgs = ((InternalEObject)newOppHasMember).eInverseAdd(this, Ldbc_snbPackage.FORUM__HAS_MEMBER, Forum.class, msgs);
			msgs = basicSetOppHasMember(newOppHasMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER, newOppHasMember, newOppHasMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER:
				if (hasMember != null)
					msgs = ((InternalEObject)hasMember).eInverseRemove(this, Ldbc_snbPackage.PERSON__OPP_HAS_MEMBER, Person.class, msgs);
				return basicSetHasMember((Person)otherEnd, msgs);
			case Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER:
				if (oppHasMember != null)
					msgs = ((InternalEObject)oppHasMember).eInverseRemove(this, Ldbc_snbPackage.FORUM__HAS_MEMBER, Forum.class, msgs);
				return basicSetOppHasMember((Forum)otherEnd, msgs);
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
			case Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER:
				return basicSetHasMember(null, msgs);
			case Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER:
				return basicSetOppHasMember(null, msgs);
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
			case Ldbc_snbPackage.HAS_MEMBER_LINK__JOIN_DATE:
				return getJoinDate();
			case Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER:
				if (resolve) return getHasMember();
				return basicGetHasMember();
			case Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER:
				if (resolve) return getOppHasMember();
				return basicGetOppHasMember();
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
			case Ldbc_snbPackage.HAS_MEMBER_LINK__JOIN_DATE:
				setJoinDate((Long)newValue);
				return;
			case Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER:
				setHasMember((Person)newValue);
				return;
			case Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER:
				setOppHasMember((Forum)newValue);
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
			case Ldbc_snbPackage.HAS_MEMBER_LINK__JOIN_DATE:
				setJoinDate(JOIN_DATE_EDEFAULT);
				return;
			case Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER:
				setHasMember((Person)null);
				return;
			case Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER:
				setOppHasMember((Forum)null);
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
			case Ldbc_snbPackage.HAS_MEMBER_LINK__JOIN_DATE:
				return joinDate != JOIN_DATE_EDEFAULT;
			case Ldbc_snbPackage.HAS_MEMBER_LINK__HAS_MEMBER:
				return hasMember != null;
			case Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER:
				return oppHasMember != null;
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
		result.append(" (joinDate: ");
		result.append(joinDate);
		result.append(')');
		return result.toString();
	}

} //HasMemberLinkImpl
