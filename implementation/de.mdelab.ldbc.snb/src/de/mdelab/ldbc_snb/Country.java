/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.Country#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Country#getOppIsPartOf <em>Opp Is Part Of</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Country#getOppCompanyIsLocatedIn <em>Opp Company Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Country#getOppMessageIsLocatedIn <em>Opp Message Is Located In</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends Place {
	/**
	 * Returns the value of the '<em><b>Is Part Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Continent#getOppIsPartOf <em>Opp Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of</em>' reference.
	 * @see #setIsPartOf(Continent)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCountry_IsPartOf()
	 * @see de.mdelab.ldbc_snb.Continent#getOppIsPartOf
	 * @model opposite="oppIsPartOf" required="true"
	 * @generated
	 */
	Continent getIsPartOf();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Country#getIsPartOf <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of</em>' reference.
	 * @see #getIsPartOf()
	 * @generated
	 */
	void setIsPartOf(Continent value);

	/**
	 * Returns the value of the '<em><b>Opp Is Part Of</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.City}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.City#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Is Part Of</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCountry_OppIsPartOf()
	 * @see de.mdelab.ldbc_snb.City#getIsPartOf
	 * @model opposite="isPartOf"
	 * @generated
	 */
	EList<City> getOppIsPartOf();

	/**
	 * Returns the value of the '<em><b>Opp Company Is Located In</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Company}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Company#getIsLocatedIn <em>Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Company Is Located In</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCountry_OppCompanyIsLocatedIn()
	 * @see de.mdelab.ldbc_snb.Company#getIsLocatedIn
	 * @model opposite="isLocatedIn"
	 * @generated
	 */
	EList<Company> getOppCompanyIsLocatedIn();

	/**
	 * Returns the value of the '<em><b>Opp Message Is Located In</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Message}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Message#getIsLocatedIn <em>Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Message Is Located In</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCountry_OppMessageIsLocatedIn()
	 * @see de.mdelab.ldbc_snb.Message#getIsLocatedIn
	 * @model opposite="isLocatedIn"
	 * @generated
	 */
	EList<Message> getOppMessageIsLocatedIn();

} // Country
