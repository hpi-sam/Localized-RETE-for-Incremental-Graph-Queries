/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.Continent#getOppIsPartOf <em>Opp Is Part Of</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getContinent()
 * @model
 * @generated
 */
public interface Continent extends Place {

	/**
	 * Returns the value of the '<em><b>Opp Is Part Of</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Country}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Country#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Is Part Of</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getContinent_OppIsPartOf()
	 * @see de.mdelab.ldbc_snb.Country#getIsPartOf
	 * @model opposite="isPartOf"
	 * @generated
	 */
	EList<Country> getOppIsPartOf();
} // Continent
