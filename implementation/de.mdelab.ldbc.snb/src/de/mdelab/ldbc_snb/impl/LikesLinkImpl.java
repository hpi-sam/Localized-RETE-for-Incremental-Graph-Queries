/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Likes Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LikesLinkImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LikesLinkImpl#getLikes <em>Likes</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.LikesLinkImpl#getOppLikes <em>Opp Likes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LikesLinkImpl extends DynamicElementImpl implements LikesLink {
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
	 * The cached value of the '{@link #getLikes() <em>Likes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikes()
	 * @generated
	 * @ordered
	 */
	protected Message likes;
	/**
	 * The cached value of the '{@link #getOppLikes() <em>Opp Likes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppLikes()
	 * @generated
	 * @ordered
	 */
	protected Person oppLikes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LikesLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.LIKES_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.LIKES_LINK__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message getLikes() {
		if (likes != null && likes.eIsProxy()) {
			InternalEObject oldLikes = (InternalEObject)likes;
			likes = (Message)eResolveProxy(oldLikes);
			if (likes != oldLikes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.LIKES_LINK__LIKES, oldLikes, likes));
			}
		}
		return likes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetLikes() {
		return likes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLikes(Message newLikes, NotificationChain msgs) {
		Message oldLikes = likes;
		likes = newLikes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.LIKES_LINK__LIKES, oldLikes, newLikes);
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
	public void setLikes(Message newLikes) {
		if (newLikes != likes) {
			NotificationChain msgs = null;
			if (likes != null)
				msgs = ((InternalEObject)likes).eInverseRemove(this, Ldbc_snbPackage.MESSAGE__OPP_LIKES, Message.class, msgs);
			if (newLikes != null)
				msgs = ((InternalEObject)newLikes).eInverseAdd(this, Ldbc_snbPackage.MESSAGE__OPP_LIKES, Message.class, msgs);
			msgs = basicSetLikes(newLikes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.LIKES_LINK__LIKES, newLikes, newLikes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getOppLikes() {
		if (oppLikes != null && oppLikes.eIsProxy()) {
			InternalEObject oldOppLikes = (InternalEObject)oppLikes;
			oppLikes = (Person)eResolveProxy(oldOppLikes);
			if (oppLikes != oldOppLikes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.LIKES_LINK__OPP_LIKES, oldOppLikes, oppLikes));
			}
		}
		return oppLikes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetOppLikes() {
		return oppLikes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOppLikes(Person newOppLikes, NotificationChain msgs) {
		Person oldOppLikes = oppLikes;
		oppLikes = newOppLikes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.LIKES_LINK__OPP_LIKES, oldOppLikes, newOppLikes);
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
	public void setOppLikes(Person newOppLikes) {
		if (newOppLikes != oppLikes) {
			NotificationChain msgs = null;
			if (oppLikes != null)
				msgs = ((InternalEObject)oppLikes).eInverseRemove(this, Ldbc_snbPackage.PERSON__LIKES, Person.class, msgs);
			if (newOppLikes != null)
				msgs = ((InternalEObject)newOppLikes).eInverseAdd(this, Ldbc_snbPackage.PERSON__LIKES, Person.class, msgs);
			msgs = basicSetOppLikes(newOppLikes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.LIKES_LINK__OPP_LIKES, newOppLikes, newOppLikes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.LIKES_LINK__LIKES:
				if (likes != null)
					msgs = ((InternalEObject)likes).eInverseRemove(this, Ldbc_snbPackage.MESSAGE__OPP_LIKES, Message.class, msgs);
				return basicSetLikes((Message)otherEnd, msgs);
			case Ldbc_snbPackage.LIKES_LINK__OPP_LIKES:
				if (oppLikes != null)
					msgs = ((InternalEObject)oppLikes).eInverseRemove(this, Ldbc_snbPackage.PERSON__LIKES, Person.class, msgs);
				return basicSetOppLikes((Person)otherEnd, msgs);
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
			case Ldbc_snbPackage.LIKES_LINK__LIKES:
				return basicSetLikes(null, msgs);
			case Ldbc_snbPackage.LIKES_LINK__OPP_LIKES:
				return basicSetOppLikes(null, msgs);
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
			case Ldbc_snbPackage.LIKES_LINK__CREATION_DATE:
				return getCreationDate();
			case Ldbc_snbPackage.LIKES_LINK__LIKES:
				if (resolve) return getLikes();
				return basicGetLikes();
			case Ldbc_snbPackage.LIKES_LINK__OPP_LIKES:
				if (resolve) return getOppLikes();
				return basicGetOppLikes();
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
			case Ldbc_snbPackage.LIKES_LINK__CREATION_DATE:
				setCreationDate((Long)newValue);
				return;
			case Ldbc_snbPackage.LIKES_LINK__LIKES:
				setLikes((Message)newValue);
				return;
			case Ldbc_snbPackage.LIKES_LINK__OPP_LIKES:
				setOppLikes((Person)newValue);
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
			case Ldbc_snbPackage.LIKES_LINK__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Ldbc_snbPackage.LIKES_LINK__LIKES:
				setLikes((Message)null);
				return;
			case Ldbc_snbPackage.LIKES_LINK__OPP_LIKES:
				setOppLikes((Person)null);
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
			case Ldbc_snbPackage.LIKES_LINK__CREATION_DATE:
				return creationDate != CREATION_DATE_EDEFAULT;
			case Ldbc_snbPackage.LIKES_LINK__LIKES:
				return likes != null;
			case Ldbc_snbPackage.LIKES_LINK__OPP_LIKES:
				return oppLikes != null;
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

} //LikesLinkImpl
