/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study At Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.StudyAtLink#getClassYear <em>Class Year</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.StudyAtLink#getStudyAt <em>Study At</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.StudyAtLink#getOppStudyAt <em>Opp Study At</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getStudyAtLink()
 * @model
 * @generated
 */
public interface StudyAtLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Year</em>' attribute.
	 * @see #setClassYear(int)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getStudyAtLink_ClassYear()
	 * @model
	 * @generated
	 */
	int getClassYear();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.StudyAtLink#getClassYear <em>Class Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Year</em>' attribute.
	 * @see #getClassYear()
	 * @generated
	 */
	void setClassYear(int value);

	/**
	 * Returns the value of the '<em><b>Study At</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.University#getOppStudyAt <em>Opp Study At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study At</em>' reference.
	 * @see #setStudyAt(University)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getStudyAtLink_StudyAt()
	 * @see de.mdelab.ldbc_snb.University#getOppStudyAt
	 * @model opposite="oppStudyAt" required="true"
	 * @generated
	 */
	University getStudyAt();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.StudyAtLink#getStudyAt <em>Study At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study At</em>' reference.
	 * @see #getStudyAt()
	 * @generated
	 */
	void setStudyAt(University value);

	/**
	 * Returns the value of the '<em><b>Opp Study At</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Person#getStudyAt <em>Study At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Study At</em>' reference.
	 * @see #setOppStudyAt(Person)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getStudyAtLink_OppStudyAt()
	 * @see de.mdelab.ldbc_snb.Person#getStudyAt
	 * @model opposite="studyAt" required="true"
	 * @generated
	 */
	Person getOppStudyAt();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.StudyAtLink#getOppStudyAt <em>Opp Study At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Study At</em>' reference.
	 * @see #getOppStudyAt()
	 * @generated
	 */
	void setOppStudyAt(Person value);

} // StudyAtLink
