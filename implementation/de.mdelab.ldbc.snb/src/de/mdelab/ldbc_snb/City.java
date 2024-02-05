/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.City#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.City#getOppPersonIsLocatedIn <em>Opp Person Is Located In</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.City#getOppUniversityIsLocatedIn <em>Opp University Is Located In</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCity()
 * @model
 * @generated
 */
public interface City extends Place {
	/**
	 * Returns the value of the '<em><b>Is Part Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Country#getOppIsPartOf <em>Opp Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of</em>' reference.
	 * @see #setIsPartOf(Country)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCity_IsPartOf()
	 * @see de.mdelab.ldbc_snb.Country#getOppIsPartOf
	 * @model opposite="oppIsPartOf" required="true"
	 * @generated
	 */
	Country getIsPartOf();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.City#getIsPartOf <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of</em>' reference.
	 * @see #getIsPartOf()
	 * @generated
	 */
	void setIsPartOf(Country value);

	/**
	 * Returns the value of the '<em><b>Opp Person Is Located In</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Person}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Person#getIsLocatedIn <em>Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Person Is Located In</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCity_OppPersonIsLocatedIn()
	 * @see de.mdelab.ldbc_snb.Person#getIsLocatedIn
	 * @model opposite="isLocatedIn"
	 * @generated
	 */
	EList<Person> getOppPersonIsLocatedIn();

	/**
	 * Returns the value of the '<em><b>Opp University Is Located In</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.University}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.University#getIsLocatedIn <em>Is Located In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp University Is Located In</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getCity_OppUniversityIsLocatedIn()
	 * @see de.mdelab.ldbc_snb.University#getIsLocatedIn
	 * @model opposite="isLocatedIn"
	 * @generated
	 */
	EList<University> getOppUniversityIsLocatedIn();

} // City
