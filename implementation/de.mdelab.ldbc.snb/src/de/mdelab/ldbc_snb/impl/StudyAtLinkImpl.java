/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.StudyAtLink;
import de.mdelab.ldbc_snb.University;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study At Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.StudyAtLinkImpl#getClassYear <em>Class Year</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.StudyAtLinkImpl#getStudyAt <em>Study At</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.impl.StudyAtLinkImpl#getOppStudyAt <em>Opp Study At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyAtLinkImpl extends MinimalEObjectImpl.Container implements StudyAtLink {
	/**
	 * The default value of the '{@link #getClassYear() <em>Class Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassYear()
	 * @generated
	 * @ordered
	 */
	protected static final int CLASS_YEAR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getClassYear() <em>Class Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassYear()
	 * @generated
	 * @ordered
	 */
	protected int classYear = CLASS_YEAR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getStudyAt() <em>Study At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyAt()
	 * @generated
	 * @ordered
	 */
	protected University studyAt;
	/**
	 * The cached value of the '{@link #getOppStudyAt() <em>Opp Study At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppStudyAt()
	 * @generated
	 * @ordered
	 */
	protected Person oppStudyAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyAtLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.STUDY_AT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getClassYear() {
		return classYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassYear(int newClassYear) {
		int oldClassYear = classYear;
		classYear = newClassYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.STUDY_AT_LINK__CLASS_YEAR, oldClassYear, classYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University getStudyAt() {
		if (studyAt != null && studyAt.eIsProxy()) {
			InternalEObject oldStudyAt = (InternalEObject)studyAt;
			studyAt = (University)eResolveProxy(oldStudyAt);
			if (studyAt != oldStudyAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT, oldStudyAt, studyAt));
			}
		}
		return studyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University basicGetStudyAt() {
		return studyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyAt(University newStudyAt, NotificationChain msgs) {
		University oldStudyAt = studyAt;
		studyAt = newStudyAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT, oldStudyAt, newStudyAt);
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
	public void setStudyAt(University newStudyAt) {
		if (newStudyAt != studyAt) {
			NotificationChain msgs = null;
			if (studyAt != null)
				msgs = ((InternalEObject)studyAt).eInverseRemove(this, Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT, University.class, msgs);
			if (newStudyAt != null)
				msgs = ((InternalEObject)newStudyAt).eInverseAdd(this, Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT, University.class, msgs);
			msgs = basicSetStudyAt(newStudyAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT, newStudyAt, newStudyAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getOppStudyAt() {
		if (oppStudyAt != null && oppStudyAt.eIsProxy()) {
			InternalEObject oldOppStudyAt = (InternalEObject)oppStudyAt;
			oppStudyAt = (Person)eResolveProxy(oldOppStudyAt);
			if (oppStudyAt != oldOppStudyAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT, oldOppStudyAt, oppStudyAt));
			}
		}
		return oppStudyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetOppStudyAt() {
		return oppStudyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOppStudyAt(Person newOppStudyAt, NotificationChain msgs) {
		Person oldOppStudyAt = oppStudyAt;
		oppStudyAt = newOppStudyAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT, oldOppStudyAt, newOppStudyAt);
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
	public void setOppStudyAt(Person newOppStudyAt) {
		if (newOppStudyAt != oppStudyAt) {
			NotificationChain msgs = null;
			if (oppStudyAt != null)
				msgs = ((InternalEObject)oppStudyAt).eInverseRemove(this, Ldbc_snbPackage.PERSON__STUDY_AT, Person.class, msgs);
			if (newOppStudyAt != null)
				msgs = ((InternalEObject)newOppStudyAt).eInverseAdd(this, Ldbc_snbPackage.PERSON__STUDY_AT, Person.class, msgs);
			msgs = basicSetOppStudyAt(newOppStudyAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT, newOppStudyAt, newOppStudyAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT:
				if (studyAt != null)
					msgs = ((InternalEObject)studyAt).eInverseRemove(this, Ldbc_snbPackage.UNIVERSITY__OPP_STUDY_AT, University.class, msgs);
				return basicSetStudyAt((University)otherEnd, msgs);
			case Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT:
				if (oppStudyAt != null)
					msgs = ((InternalEObject)oppStudyAt).eInverseRemove(this, Ldbc_snbPackage.PERSON__STUDY_AT, Person.class, msgs);
				return basicSetOppStudyAt((Person)otherEnd, msgs);
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
			case Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT:
				return basicSetStudyAt(null, msgs);
			case Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT:
				return basicSetOppStudyAt(null, msgs);
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
			case Ldbc_snbPackage.STUDY_AT_LINK__CLASS_YEAR:
				return getClassYear();
			case Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT:
				if (resolve) return getStudyAt();
				return basicGetStudyAt();
			case Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT:
				if (resolve) return getOppStudyAt();
				return basicGetOppStudyAt();
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
			case Ldbc_snbPackage.STUDY_AT_LINK__CLASS_YEAR:
				setClassYear((Integer)newValue);
				return;
			case Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT:
				setStudyAt((University)newValue);
				return;
			case Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT:
				setOppStudyAt((Person)newValue);
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
			case Ldbc_snbPackage.STUDY_AT_LINK__CLASS_YEAR:
				setClassYear(CLASS_YEAR_EDEFAULT);
				return;
			case Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT:
				setStudyAt((University)null);
				return;
			case Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT:
				setOppStudyAt((Person)null);
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
			case Ldbc_snbPackage.STUDY_AT_LINK__CLASS_YEAR:
				return classYear != CLASS_YEAR_EDEFAULT;
			case Ldbc_snbPackage.STUDY_AT_LINK__STUDY_AT:
				return studyAt != null;
			case Ldbc_snbPackage.STUDY_AT_LINK__OPP_STUDY_AT:
				return oppStudyAt != null;
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
		result.append(" (classYear: ");
		result.append(classYear);
		result.append(')');
		return result.toString();
	}

} //StudyAtLinkImpl
