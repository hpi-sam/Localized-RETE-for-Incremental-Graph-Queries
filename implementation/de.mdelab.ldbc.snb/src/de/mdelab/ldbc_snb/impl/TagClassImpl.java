/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.TagClass;
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
 * An implementation of the model object '<em><b>Tag Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagClassImpl#getIsSubclassOf <em>Is Subclass Of</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagClassImpl#getOppHasType <em>Opp Has Type</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.TagClassImpl#getOppIsSubclassOf <em>Opp Is Subclass Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagClassImpl extends IdentifiedElementImpl implements TagClass {
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
	 * The cached value of the '{@link #getIsSubclassOf() <em>Is Subclass Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubclassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<TagClass> isSubclassOf;
	/**
	 * The cached value of the '{@link #getOppHasType() <em>Opp Has Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppHasType()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> oppHasType;
	/**
	 * The cached value of the '{@link #getOppIsSubclassOf() <em>Opp Is Subclass Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppIsSubclassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<TagClass> oppIsSubclassOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.TAG_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.TAG_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TagClass> getIsSubclassOf() {
		if (isSubclassOf == null) {
			isSubclassOf = new EObjectWithInverseResolvingEList.ManyInverse<TagClass>(TagClass.class, this, Ldbc_snbPackage.TAG_CLASS__IS_SUBCLASS_OF, Ldbc_snbPackage.TAG_CLASS__OPP_IS_SUBCLASS_OF);
		}
		return isSubclassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tag> getOppHasType() {
		if (oppHasType == null) {
			oppHasType = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, Ldbc_snbPackage.TAG_CLASS__OPP_HAS_TYPE, Ldbc_snbPackage.TAG__HAS_TYPE);
		}
		return oppHasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TagClass> getOppIsSubclassOf() {
		if (oppIsSubclassOf == null) {
			oppIsSubclassOf = new EObjectWithInverseResolvingEList.ManyInverse<TagClass>(TagClass.class, this, Ldbc_snbPackage.TAG_CLASS__OPP_IS_SUBCLASS_OF, Ldbc_snbPackage.TAG_CLASS__IS_SUBCLASS_OF);
		}
		return oppIsSubclassOf;
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
			case Ldbc_snbPackage.TAG_CLASS__IS_SUBCLASS_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSubclassOf()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.TAG_CLASS__OPP_HAS_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppHasType()).basicAdd(otherEnd, msgs);
			case Ldbc_snbPackage.TAG_CLASS__OPP_IS_SUBCLASS_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppIsSubclassOf()).basicAdd(otherEnd, msgs);
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
			case Ldbc_snbPackage.TAG_CLASS__IS_SUBCLASS_OF:
				return ((InternalEList<?>)getIsSubclassOf()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.TAG_CLASS__OPP_HAS_TYPE:
				return ((InternalEList<?>)getOppHasType()).basicRemove(otherEnd, msgs);
			case Ldbc_snbPackage.TAG_CLASS__OPP_IS_SUBCLASS_OF:
				return ((InternalEList<?>)getOppIsSubclassOf()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.TAG_CLASS__NAME:
				return getName();
			case Ldbc_snbPackage.TAG_CLASS__IS_SUBCLASS_OF:
				return getIsSubclassOf();
			case Ldbc_snbPackage.TAG_CLASS__OPP_HAS_TYPE:
				return getOppHasType();
			case Ldbc_snbPackage.TAG_CLASS__OPP_IS_SUBCLASS_OF:
				return getOppIsSubclassOf();
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
			case Ldbc_snbPackage.TAG_CLASS__NAME:
				setName((String)newValue);
				return;
			case Ldbc_snbPackage.TAG_CLASS__IS_SUBCLASS_OF:
				getIsSubclassOf().clear();
				getIsSubclassOf().addAll((Collection<? extends TagClass>)newValue);
				return;
			case Ldbc_snbPackage.TAG_CLASS__OPP_HAS_TYPE:
				getOppHasType().clear();
				getOppHasType().addAll((Collection<? extends Tag>)newValue);
				return;
			case Ldbc_snbPackage.TAG_CLASS__OPP_IS_SUBCLASS_OF:
				getOppIsSubclassOf().clear();
				getOppIsSubclassOf().addAll((Collection<? extends TagClass>)newValue);
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
			case Ldbc_snbPackage.TAG_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ldbc_snbPackage.TAG_CLASS__IS_SUBCLASS_OF:
				getIsSubclassOf().clear();
				return;
			case Ldbc_snbPackage.TAG_CLASS__OPP_HAS_TYPE:
				getOppHasType().clear();
				return;
			case Ldbc_snbPackage.TAG_CLASS__OPP_IS_SUBCLASS_OF:
				getOppIsSubclassOf().clear();
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
			case Ldbc_snbPackage.TAG_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ldbc_snbPackage.TAG_CLASS__IS_SUBCLASS_OF:
				return isSubclassOf != null && !isSubclassOf.isEmpty();
			case Ldbc_snbPackage.TAG_CLASS__OPP_HAS_TYPE:
				return oppHasType != null && !oppHasType.isEmpty();
			case Ldbc_snbPackage.TAG_CLASS__OPP_IS_SUBCLASS_OF:
				return oppIsSubclassOf != null && !oppIsSubclassOf.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TagClassImpl
