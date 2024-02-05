/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.IdentifiedElement;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.TagClass;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagImpl#getIntId <em>Int Id</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagImpl#getID <em>ID</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagImpl#getHasType <em>Has Type</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagImpl#getOppMessageHasTag <em>Opp Message Has Tag</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagImpl#getOppHasInterest <em>Opp Has Interest</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagImpl#getOppForumHasTag <em>Opp Forum Has Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends MinimalEObjectImpl.Container implements Tag {
	/**
	 * The default value of the '{@link #getIntId() <em>Int Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntId()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_ID_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getIntId() <em>Int Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntId()
	 * @generated
	 * @ordered
	 */
	protected int intId = INT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getHasType() <em>Has Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasType()
	 * @generated
	 * @ordered
	 */
	protected EList<TagClass> hasType;
	/**
	 * The cached value of the '{@link #getOppMessageHasTag() <em>Opp Message Has Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppMessageHasTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> oppMessageHasTag;
	/**
	 * The cached value of the '{@link #getOppHasInterest() <em>Opp Has Interest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppHasInterest()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> oppHasInterest;
	/**
	 * The cached value of the '{@link #getOppForumHasTag() <em>Opp Forum Has Tag</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppForumHasTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Forum> oppForumHasTag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIntId() {
		return intId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntId(int newIntId) {
		int oldIntId = intId;
		intId = newIntId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.TAG__INT_ID, oldIntId, intId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(long newID) {
		long oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.TAG__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.TAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TagClass> getHasType() {
		if (hasType == null) {
			hasType = new EObjectWithInverseResolvingEList.ManyInverse<TagClass>(TagClass.class, this, Ldbc_snbPackage.TAG__HAS_TYPE, Ldbc_snbPackage.TAG_CLASS__OPP_HAS_TYPE);
		}
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Message> getOppMessageHasTag() {
		if (oppMessageHasTag == null) {
			oppMessageHasTag = new EObjectWithInverseResolvingEList.ManyInverse<Message>(Message.class, this, Ldbc_snbPackage.TAG__OPP_MESSAGE_HAS_TAG, Ldbc_snbPackage.MESSAGE__HAS_TAG);
		}
		return oppMessageHasTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getOppHasInterest() {
		if (oppHasInterest == null) {
			oppHasInterest = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, Ldbc_snbPackage.TAG__OPP_HAS_INTEREST, Ldbc_snbPackage.PERSON__HAS_INTEREST);
		}
		return oppHasInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Forum> getOppForumHasTag() {
		if (oppForumHasTag == null) {
			oppForumHasTag = new EObjectWithInverseResolvingEList.ManyInverse<Forum>(Forum.class, this, Ldbc_snbPackage.TAG__OPP_FORUM_HAS_TAG, Ldbc_snbPackage.FORUM__HAS_TAG);
		}
		return oppForumHasTag;
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
			case Ldbc_snbPackage.TAG__HAS_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasType()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.TAG__OPP_MESSAGE_HAS_TAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppMessageHasTag()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.TAG__OPP_HAS_INTEREST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppHasInterest()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.TAG__OPP_FORUM_HAS_TAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppForumHasTag()).basicAdd(otherEnd, msgs);
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
			case Ldbc_snbPackage.TAG__HAS_TYPE:
				return ((InternalEList<?>)getHasType()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.TAG__OPP_MESSAGE_HAS_TAG:
				return ((InternalEList<?>)getOppMessageHasTag()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.TAG__OPP_HAS_INTEREST:
				return ((InternalEList<?>)getOppHasInterest()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.TAG__OPP_FORUM_HAS_TAG:
				return ((InternalEList<?>)getOppForumHasTag()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.TAG__INT_ID:
				return getIntId();
			case Ldbc_snbPackage.TAG__ID:
				return getID();
			case Ldbc_snbPackage.TAG__NAME:
				return getName();
			case Ldbc_snbPackage.TAG__HAS_TYPE:
				return getHasType();
			case Ldbc_snbPackage.TAG__OPP_MESSAGE_HAS_TAG:
				return getOppMessageHasTag();
			case Ldbc_snbPackage.TAG__OPP_HAS_INTEREST:
				return getOppHasInterest();
			case Ldbc_snbPackage.TAG__OPP_FORUM_HAS_TAG:
				return getOppForumHasTag();
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
			case Ldbc_snbPackage.TAG__INT_ID:
				setIntId((Integer)newValue);
				return;
			case Ldbc_snbPackage.TAG__ID:
				setID((Long)newValue);
				return;
			case Ldbc_snbPackage.TAG__NAME:
				setName((String)newValue);
				return;
			case Ldbc_snbPackage.TAG__HAS_TYPE:
				getHasType().clear();
				getHasType().addAll((Collection<? extends TagClass>)newValue);
				return;
			case Ldbc_snbPackage.TAG__OPP_MESSAGE_HAS_TAG:
				getOppMessageHasTag().clear();
				getOppMessageHasTag().addAll((Collection<? extends Message>)newValue);
				return;
			case Ldbc_snbPackage.TAG__OPP_HAS_INTEREST:
				getOppHasInterest().clear();
				getOppHasInterest().addAll((Collection<? extends Person>)newValue);
				return;
			case Ldbc_snbPackage.TAG__OPP_FORUM_HAS_TAG:
				getOppForumHasTag().clear();
				getOppForumHasTag().addAll((Collection<? extends Forum>)newValue);
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
			case Ldbc_snbPackage.TAG__INT_ID:
				setIntId(INT_ID_EDEFAULT);
				return;
			case Ldbc_snbPackage.TAG__ID:
				setID(ID_EDEFAULT);
				return;
			case Ldbc_snbPackage.TAG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ldbc_snbPackage.TAG__HAS_TYPE:
				getHasType().clear();
				return;
			case Ldbc_snbPackage.TAG__OPP_MESSAGE_HAS_TAG:
				getOppMessageHasTag().clear();
				return;
			case Ldbc_snbPackage.TAG__OPP_HAS_INTEREST:
				getOppHasInterest().clear();
				return;
			case Ldbc_snbPackage.TAG__OPP_FORUM_HAS_TAG:
				getOppForumHasTag().clear();
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
			case Ldbc_snbPackage.TAG__INT_ID:
				return intId != INT_ID_EDEFAULT;
			case Ldbc_snbPackage.TAG__ID:
				return id != ID_EDEFAULT;
			case Ldbc_snbPackage.TAG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ldbc_snbPackage.TAG__HAS_TYPE:
				return hasType != null && !hasType.isEmpty();
			case Ldbc_snbPackage.TAG__OPP_MESSAGE_HAS_TAG:
				return oppMessageHasTag != null && !oppMessageHasTag.isEmpty();
			case Ldbc_snbPackage.TAG__OPP_HAS_INTEREST:
				return oppHasInterest != null && !oppHasInterest.isEmpty();
			case Ldbc_snbPackage.TAG__OPP_FORUM_HAS_TAG:
				return oppForumHasTag != null && !oppForumHasTag.isEmpty();
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
		if (baseClass == IdentifiedElement.class) {
			switch (derivedFeatureID) {
				case Ldbc_snbPackage.TAG__ID: return Ldbc_snbPackage.IDENTIFIED_ELEMENT__ID;
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
		if (baseClass == IdentifiedElement.class) {
			switch (baseFeatureID) {
				case Ldbc_snbPackage.IDENTIFIED_ELEMENT__ID: return Ldbc_snbPackage.TAG__ID;
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
		result.append(" (intId: ");
		result.append(intId);
		result.append(", ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TagImpl
