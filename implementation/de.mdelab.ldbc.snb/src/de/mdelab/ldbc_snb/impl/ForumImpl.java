/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.DynamicElement;
import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Post;
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
 * An implementation of the model object '<em><b>Forum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.ForumImpl#getCts <em>Cts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.ForumImpl#getDts <em>Dts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.ForumImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.ForumImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.ForumImpl#getHasModerator <em>Has Moderator</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.ForumImpl#getHasTag <em>Has Tag</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.ForumImpl#getHasMember <em>Has Member</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.ForumImpl#getOppContainer <em>Opp Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForumImpl extends IdentifiedElementImpl implements Forum {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;
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
	 * The cached value of the '{@link #getHasModerator() <em>Has Moderator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasModerator()
	 * @generated
	 * @ordered
	 */
	protected Person hasModerator;
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
	 * The cached value of the '{@link #getHasMember() <em>Has Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMember()
	 * @generated
	 * @ordered
	 */
	protected EList<HasMemberLink> hasMember;
	/**
	 * The cached value of the '{@link #getOppContainer() <em>Opp Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> oppContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.FORUM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.FORUM__CTS, oldCts, cts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.FORUM__DTS, oldDts, dts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.FORUM__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.FORUM__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getHasModerator() {
		if (hasModerator != null && hasModerator.eIsProxy()) {
			InternalEObject oldHasModerator = (InternalEObject)hasModerator;
			hasModerator = (Person)eResolveProxy(oldHasModerator);
			if (hasModerator != oldHasModerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.FORUM__HAS_MODERATOR, oldHasModerator, hasModerator));
			}
		}
		return hasModerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetHasModerator() {
		return hasModerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasModerator(Person newHasModerator, NotificationChain msgs) {
		Person oldHasModerator = hasModerator;
		hasModerator = newHasModerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.FORUM__HAS_MODERATOR, oldHasModerator, newHasModerator);
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
	public void setHasModerator(Person newHasModerator) {
		if (newHasModerator != hasModerator) {
			NotificationChain msgs = null;
			if (hasModerator != null)
				msgs = ((InternalEObject)hasModerator).eInverseRemove(this, Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR, Person.class, msgs);
			if (newHasModerator != null)
				msgs = ((InternalEObject)newHasModerator).eInverseAdd(this, Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR, Person.class, msgs);
			msgs = basicSetHasModerator(newHasModerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.FORUM__HAS_MODERATOR, newHasModerator, newHasModerator));
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
			hasTag = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, Ldbc_snbPackage.FORUM__HAS_TAG, Ldbc_snbPackage.TAG__OPP_FORUM_HAS_TAG);
		}
		return hasTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<HasMemberLink> getHasMember() {
		if (hasMember == null) {
			hasMember = new EObjectWithInverseResolvingEList<HasMemberLink>(HasMemberLink.class, this, Ldbc_snbPackage.FORUM__HAS_MEMBER, Ldbc_snbPackage.HAS_MEMBER_LINK__OPP_HAS_MEMBER);
		}
		return hasMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Post> getOppContainer() {
		if (oppContainer == null) {
			oppContainer = new EObjectWithInverseResolvingEList<Post>(Post.class, this, Ldbc_snbPackage.FORUM__OPP_CONTAINER, Ldbc_snbPackage.POST__CONTAINER);
		}
		return oppContainer;
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
			case Ldbc_snbPackage.FORUM__HAS_MODERATOR:
				if (hasModerator != null)
					msgs = ((InternalEObject)hasModerator).eInverseRemove(this, Ldbc_snbPackage.PERSON__OPP_HAS_MODERATOR, Person.class, msgs);
				return basicSetHasModerator((Person)otherEnd, msgs);
			case Ldbc_snbPackage.FORUM__HAS_TAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasTag()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.FORUM__HAS_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasMember()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.FORUM__OPP_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppContainer()).basicAdd(otherEnd, msgs);
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
			case Ldbc_snbPackage.FORUM__HAS_MODERATOR:
				return basicSetHasModerator(null, msgs);
			case Ldbc_snbPackage.FORUM__HAS_TAG:
				return ((InternalEList<?>)getHasTag()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.FORUM__HAS_MEMBER:
				return ((InternalEList<?>)getHasMember()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.FORUM__OPP_CONTAINER:
				return ((InternalEList<?>)getOppContainer()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.FORUM__CTS:
				return getCts();
			case Ldbc_snbPackage.FORUM__DTS:
				return getDts();
			case Ldbc_snbPackage.FORUM__TITLE:
				return getTitle();
			case Ldbc_snbPackage.FORUM__CREATION_DATE:
				return getCreationDate();
			case Ldbc_snbPackage.FORUM__HAS_MODERATOR:
				if (resolve) return getHasModerator();
				return basicGetHasModerator();
			case Ldbc_snbPackage.FORUM__HAS_TAG:
				return getHasTag();
			case Ldbc_snbPackage.FORUM__HAS_MEMBER:
				return getHasMember();
			case Ldbc_snbPackage.FORUM__OPP_CONTAINER:
				return getOppContainer();
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
			case Ldbc_snbPackage.FORUM__CTS:
				setCts((Long)newValue);
				return;
			case Ldbc_snbPackage.FORUM__DTS:
				setDts((Long)newValue);
				return;
			case Ldbc_snbPackage.FORUM__TITLE:
				setTitle((String)newValue);
				return;
			case Ldbc_snbPackage.FORUM__CREATION_DATE:
				setCreationDate((Long)newValue);
				return;
			case Ldbc_snbPackage.FORUM__HAS_MODERATOR:
				setHasModerator((Person)newValue);
				return;
			case Ldbc_snbPackage.FORUM__HAS_TAG:
				getHasTag().clear();
				getHasTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case Ldbc_snbPackage.FORUM__HAS_MEMBER:
				getHasMember().clear();
				getHasMember().addAll((Collection<? extends HasMemberLink>)newValue);
				return;
			case Ldbc_snbPackage.FORUM__OPP_CONTAINER:
				getOppContainer().clear();
				getOppContainer().addAll((Collection<? extends Post>)newValue);
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
			case Ldbc_snbPackage.FORUM__CTS:
				setCts(CTS_EDEFAULT);
				return;
			case Ldbc_snbPackage.FORUM__DTS:
				setDts(DTS_EDEFAULT);
				return;
			case Ldbc_snbPackage.FORUM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Ldbc_snbPackage.FORUM__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case Ldbc_snbPackage.FORUM__HAS_MODERATOR:
				setHasModerator((Person)null);
				return;
			case Ldbc_snbPackage.FORUM__HAS_TAG:
				getHasTag().clear();
				return;
			case Ldbc_snbPackage.FORUM__HAS_MEMBER:
				getHasMember().clear();
				return;
			case Ldbc_snbPackage.FORUM__OPP_CONTAINER:
				getOppContainer().clear();
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
			case Ldbc_snbPackage.FORUM__CTS:
				return cts != CTS_EDEFAULT;
			case Ldbc_snbPackage.FORUM__DTS:
				return dts != DTS_EDEFAULT;
			case Ldbc_snbPackage.FORUM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Ldbc_snbPackage.FORUM__CREATION_DATE:
				return creationDate != CREATION_DATE_EDEFAULT;
			case Ldbc_snbPackage.FORUM__HAS_MODERATOR:
				return hasModerator != null;
			case Ldbc_snbPackage.FORUM__HAS_TAG:
				return hasTag != null && !hasTag.isEmpty();
			case Ldbc_snbPackage.FORUM__HAS_MEMBER:
				return hasMember != null && !hasMember.isEmpty();
			case Ldbc_snbPackage.FORUM__OPP_CONTAINER:
				return oppContainer != null && !oppContainer.isEmpty();
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
				case Ldbc_snbPackage.FORUM__CTS: return Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS;
				case Ldbc_snbPackage.FORUM__DTS: return Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS;
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
				case Ldbc_snbPackage.DYNAMIC_ELEMENT__CTS: return Ldbc_snbPackage.FORUM__CTS;
				case Ldbc_snbPackage.DYNAMIC_ELEMENT__DTS: return Ldbc_snbPackage.FORUM__DTS;
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
		result.append(", title: ");
		result.append(title);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //ForumImpl
