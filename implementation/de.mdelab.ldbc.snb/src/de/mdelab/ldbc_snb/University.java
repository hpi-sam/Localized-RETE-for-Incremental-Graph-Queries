/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.University#getIsLocatedIn <em>Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.University#getOppStudyAt <em>Opp Study At</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends Organisation {
	/**
	 * Returns the value of the '<em><b>Is Located In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.City#getOppUniversityIsLocatedIn <em>Opp University Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Located In</em>' reference.
	 * @see #setIsLocatedIn(City)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getUniversity_IsLocatedIn()
	 * @see de.mdelab.ldbc_snb.City#getOppUniversityIsLocatedIn
	 * @model opposite="oppUniversityIsLocatedIn" required="true"
	 * @generated
	 */
	City getIsLocatedIn();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.University#getIsLocatedIn <em>Is Located In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Located In</em>' reference.
	 * @see #getIsLocatedIn()
	 * @generated
	 */
	void setIsLocatedIn(City value);

	/**
	 * Returns the value of the '<em><b>Opp Study At</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.StudyAtLink}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.StudyAtLink#getStudyAt <em>Study At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Study At</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getUniversity_OppStudyAt()
	 * @see de.mdelab.ldbc_snb.StudyAtLink#getStudyAt
	 * @model opposite="studyAt"
	 * @generated
	 */
	EList<StudyAtLink> getOppStudyAt();

} // University
