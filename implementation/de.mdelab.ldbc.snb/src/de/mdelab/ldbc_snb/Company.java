/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.Company#getIsLocatedIn <em>Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Company#getOppWorkAt <em>Opp Work At</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends Organisation {
	/**
	 * Returns the value of the '<em><b>Is Located In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Country#getOppCompanyIsLocatedIn <em>Opp Company Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Located In</em>' reference.
	 * @see #setIsLocatedIn(Country)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCompany_IsLocatedIn()
	 * @see de.mdelab.ldbc_snb.Country#getOppCompanyIsLocatedIn
	 * @model opposite="oppCompanyIsLocatedIn" required="true"
	 * @generated
	 */
	Country getIsLocatedIn();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Company#getIsLocatedIn <em>Is Located In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Located In</em>' reference.
	 * @see #getIsLocatedIn()
	 * @generated
	 */
	void setIsLocatedIn(Country value);

	/**
	 * Returns the value of the '<em><b>Opp Work At</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.WorkAtLink}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.WorkAtLink#getWorkAt <em>Work At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Work At</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCompany_OppWorkAt()
	 * @see de.mdelab.ldbc_snb.WorkAtLink#getWorkAt
	 * @model opposite="workAt"
	 * @generated
	 */
	EList<WorkAtLink> getOppWorkAt();

} // Company
