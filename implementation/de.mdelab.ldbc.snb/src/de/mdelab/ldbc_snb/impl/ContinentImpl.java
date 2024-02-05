/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Continent;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.ContinentImpl#getOppIsPartOf <em>Opp Is Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinentImpl extends PlaceImpl implements Continent {
	/**
	 * The cached value of the '{@link #getOppIsPartOf() <em>Opp Is Part Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppIsPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Country> oppIsPartOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.CONTINENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Country> getOppIsPartOf() {
		if (oppIsPartOf == null) {
			oppIsPartOf = new EObjectWithInverseResolvingEList<Country>(Country.class, this, Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF, Ldbc_snbPackage.COUNTRY__IS_PART_OF);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOppIsPartOf()).basicAdd(otherEnd, msgs);
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
			case Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF:
				return ((InternalEList<?>)getOppIsPartOf()).basicRemove(otherEnd, msgs);
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
			case Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF:
				return getOppIsPartOf();
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
			case Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF:
				getOppIsPartOf().clear();
				getOppIsPartOf().addAll((Collection<? extends Country>)newValue);
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
			case Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF:
				getOppIsPartOf().clear();
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
			case Ldbc_snbPackage.CONTINENT__OPP_IS_PART_OF:
				return oppIsPartOf != null && !oppIsPartOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContinentImpl
