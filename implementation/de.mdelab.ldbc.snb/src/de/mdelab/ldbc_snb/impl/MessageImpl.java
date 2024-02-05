/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Comment;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.DynamicElement;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Tag;
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
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getCts <em>Cts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getDts <em>Dts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getBrowserUsed <em>Browser Used</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getLocationIP <em>Location IP</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getContent <em>Content</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getIsLocatedIn <em>Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getHasTag <em>Has Tag</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getHasCreator <em>Has Creator</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getOppLikes <em>Opp Likes</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.MessageImpl#getOppReplyOf <em>Opp Reply Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends IdentifiedElementImpl implements Message {
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
	 * The default value of the '{@link #getBrowserUsed() <em>Browser Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserUsed()
	 * @generated
	 * @ordered
	 */
	protected static final String BROWSER_USED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBrowserUsed() <em>Browser Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserUsed()
	 * @generated
	 * @ordered
	 */
	protected String browserUsed = BROWSER_USED_EDEFAULT;
	/**
	 * The default value of the '{@link #getLocationIP() <em>Location IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationIP()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_IP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLocationIP() <em>Location IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationIP()
	 * @generated
	 * @ordered
	 */
	protected String locationIP = LOCATION_IP_EDEFAULT;
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;
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
	 * The cached value of the '{@link #getHasTag() <em>Has Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> hasTag;
	/**
	 * The cached value of the '{@link #getHasCreator() <em>Has Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCreator()
	 * @generated
	 * @ordered
	 */
	protected Person hasCreator;
	/**
	 * The cached value of the '{@link #getOppLikes() <em>Opp Likes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppLikes()
	 * @generated
	 * @ordered
	 */
	protected EList<LikesLink> oppLikes;
	/**
	 * The cached value of the '{@link #getOppReplyOf() <em>Opp Reply Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppReplyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> oppReplyOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__CTS, oldCts, cts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__DTS, oldDts, dts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrowserUsed() {
		return browserUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserUsed(String newBrowserUsed) {
		String oldBrowserUsed = browserUsed;
		browserUsed = newBrowserUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__BROWSER_USED, oldBrowserUsed, browserUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationIP() {
		return locationIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationIP(String newLocationIP) {
		String oldLocationIP = locationIP;
		locationIP = newLocationIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__LOCATION_IP, oldLocationIP, locationIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__LENGTH, oldLength, length));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN, oldIsLocatedIn, isLocatedIn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN, oldIsLocatedIn, newIsLocatedIn);
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
				msgs = ((InternalEObject)isLocatedIn).eInverseRemove(this, Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN, Country.class, msgs);
			if (newIsLocatedIn != null)
				msgs = ((InternalEObject)newIsLocatedIn).eInverseAdd(this, Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN, Country.class, msgs);
			msgs = basicSetIsLocatedIn(newIsLocatedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN, newIsLocatedIn, newIsLocatedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tag> getHasTag() {
		if (hasTag == null) {
			hasTag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, Ldbc_snbPackage.MESSAGE__HAS_TAG, Ldbc_snbPackage.TAG__OPP_MESSAGE_HAS_TAG);
		}
		return hasTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getHasCreator() {
		if (hasCreator != null && hasCreator.eIsProxy()) {
			InternalEObject oldHasCreator = (InternalEObject)hasCreator;
			hasCreator = (Person)eResolveProxy(oldHasCreator);
			if (hasCreator != oldHasCreator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.MESSAGE__HAS_CREATOR, oldHasCreator, hasCreator));
			}
		}
		return hasCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetHasCreator() {
		return hasCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasCreator(Person newHasCreator, NotificationChain msgs) {
		Person oldHasCreator = hasCreator;
		hasCreator = newHasCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__HAS_CREATOR, oldHasCreator, newHasCreator);
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
	public void setHasCreator(Person newHasCreator) {
		if (newHasCreator != hasCreator) {
			NotificationChain msgs = null;
			if (hasCreator != null)
				msgs = ((InternalEObject)hasCreator).eInverseRemove(this, Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR, Person.class, msgs);
			if (newHasCreator != null)
				msgs = ((InternalEObject)newHasCreator).eInverseAdd(this, Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR, Person.class, msgs);
			msgs = basicSetHasCreator(newHasCreator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.MESSAGE__HAS_CREATOR, newHasCreator, newHasCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<LikesLink> getOppLikes() {
		if (oppLikes == null) {
			oppLikes = new EObjectWithInverseResolvingEList<LikesLink>(LikesLink.class, this, Ldbc_snbPackage.MESSAGE__OPP_LIKES, Ldbc_snbPackage.LIKES_LINK__LIKES);
		}
		return oppLikes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Comment> getOppReplyOf() {
		if (oppReplyOf == null) {
			oppReplyOf = new EObjectWithInverseResolvingEList<Comment>(Comment.class, this, Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF, Ldbc_snbPackage.COMMENT__REPLY_OF);
		}
		return oppReplyOf;
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
			case Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN:
				if (isLocatedIn != null)
					msgs = ((InternalEObject)isLocatedIn).eInverseRemove(this, Ldbc_snbPackage.COUNTRY__OPP_MESSAGE_IS_LOCATED_IN, Country.class, msgs);
				return basicSetIsLocatedIn((Country)otherEnd, msgs);
			case Ldbc_snbPackage.MESSAGE__HAS_TAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasTag()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.MESSAGE__HAS_CREATOR:
				if (hasCreator != null)
					msgs = ((InternalEObject)hasCreator).eInverseRemove(this, Ldbc_snbPackage.PERSON__OPP_HAS_CREATOR, Person.class, msgs);
				return basicSetHasCreator((Person)otherEnd, msgs);
			case Ldbc_snbPackage.MESSAGE__OPP_LIKES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppLikes()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppReplyOf()).basicAdd(otherEnd, msgs);
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
			case Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN:
				return basicSetIsLocatedIn(null, msgs);
			case Ldbc_snbPackage.MESSAGE__HAS_TAG:
				return ((InternalEList<?>)getHasTag()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.MESSAGE__HAS_CREATOR:
				return basicSetHasCreator(null, msgs);
			case Ldbc_snbPackage.MESSAGE__OPP_LIKES:
				return ((InternalEList<?>)getOppLikes()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF:
				return ((InternalEList<?>)getOppReplyOf()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.MESSAGE__CTS:
				return getCts();
			case Ldbc_snbPackage.MESSAGE__DTS:
				return getDts();
			case Ldbc_snbPackage.MESSAGE__CREATION_DATE:
				return getCreationDate();
			case Ldbc_snbPackage.MESSAGE__BROWSER_USED:
				return getBrowserUsed();
			case Ldbc_snbPackage.MESSAGE__LOCATION_IP:
				return getLocationIP();
			case Ldbc_snbPackage.MESSAGE__CONTENT:
				return getContent();
			case Ldbc_snbPackage.MESSAGE__LENGTH:
				return getLength();
			case Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN:
				if (resolve) return getIsLocatedIn();
				return basicGetIsLocatedIn();
			case Ldbc_snbPackage.MESSAGE__HAS_TAG:
				return getHasTag();
			case Ldbc_snbPackage.MESSAGE__HAS_CREATOR:
				if (resolve) return getHasCreator();
				return basicGetHasCreator();
			case Ldbc_snbPackage.MESSAGE__OPP_LIKES:
				return getOppLikes();
			case Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF:
				return getOppReplyOf();
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
			case Ldbc_snbPackage.MESSAGE__CTS:
				setCts((Long)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__DTS:
				setDts((Long)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__CREATION_DATE:
				setCreationDate((Long)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__BROWSER_USED:
				setBrowserUsed((String)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__LOCATION_IP:
				setLocationIP((String)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__CONTENT:
				setContent((String)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__LENGTH:
				setLength((Integer)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN:
				setIsLocatedIn((Country)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__HAS_TAG:
				getHasTag().clear();
				getHasTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__HAS_CREATOR:
				setHasCreator((Person)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__OPP_LIKES:
				getOppLikes().clear();
				getOppLikes().addAll((Collection<? extends LikesLink>)newValue);
				return;
			case Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF:
				getOppReplyOf().clear();
				getOppReplyOf().addAll((Collection<? extends Comment>)newValue);
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
			case Ldbc_snbPackage.MESSAGE__CTS:
				setCts(CTS_EDEFAULT);
				return;
			case Ldbc_snbPackage.MESSAGE__DTS:
				setDts(DTS_EDEFAULT);
				return;
			case Ldbc_snbPackage.MESSAGE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Ldbc_snbPackage.MESSAGE__BROWSER_USED:
				setBrowserUsed(BROWSER_USED_EDEFAULT);
				return;
			case Ldbc_snbPackage.MESSAGE__LOCATION_IP:
				setLocationIP(LOCATION_IP_EDEFAULT);
				return;
			case Ldbc_snbPackage.MESSAGE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case Ldbc_snbPackage.MESSAGE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN:
				setIsLocatedIn((Country)null);
				return;
			case Ldbc_snbPackage.MESSAGE__HAS_TAG:
				getHasTag().clear();
				return;
			case Ldbc_snbPackage.MESSAGE__HAS_CREATOR:
				setHasCreator((Person)null);
				return;
			case Ldbc_snbPackage.MESSAGE__OPP_LIKES:
				getOppLikes().clear();
				return;
			case Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF:
				getOppReplyOf().clear();
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
			case Ldbc_snbPackage.MESSAGE__CTS:
				return cts != CTS_EDEFAULT;
			case Ldbc_snbPackage.MESSAGE__DTS:
				return dts != DTS_EDEFAULT;
			case Ldbc_snbPackage.MESSAGE__CREATION_DATE:
				return creationDate != CREATION_DATE_EDEFAULT;
			case Ldbc_snbPackage.MESSAGE__BROWSER_USED:
				return BROWSER_USED_EDEFAULT == null ? browserUsed != null : !BROWSER_USED_EDEFAULT.equals(browserUsed);
			case Ldbc_snbPackage.MESSAGE__LOCATION_IP:
				return LOCATION_IP_EDEFAULT == null ? locationIP != null : !LOCATION_IP_EDEFAULT.equals(locationIP);
			case Ldbc_snbPackage.MESSAGE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case Ldbc_snbPackage.MESSAGE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case Ldbc_snbPackage.MESSAGE__IS_LOCATED_IN:
				return isLocatedIn != null;
			case Ldbc_snbPackage.MESSAGE__HAS_TAG:
				return hasTag != null && !hasTag.isEmpty();
			case Ldbc_snbPackage.MESSAGE__HAS_CREATOR:
				return hasCreator != null;
			case Ldbc_snbPackage.MESSAGE__OPP_LIKES:
				return oppLikes != null && !oppLikes.isEmpty();
			case Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF:
				return oppReplyOf != null && !oppReplyOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DynamicElement.class) {
			switch (derivedFeatureID) {
				case Ldbc_snbPackage.MESSAGE__CTS: return Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS;
				case Ldbc_snbPackage.MESSAGE__DTS: return Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DynamicElement.class) {
			switch (baseFeatureID) {
				case Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS: return Ldbc_snbPackage.MESSAGE__CTS;
				case Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS: return Ldbc_snbPackage.MESSAGE__DTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", browserUsed: ");
		result.append(browserUsed);
		result.append(", locationIP: ");
		result.append(locationIP);
		result.append(", content: ");
		result.append(content);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
