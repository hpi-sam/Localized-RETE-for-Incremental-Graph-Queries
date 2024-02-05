/**
 */
package de.mdelab.ldbc_snb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knows Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.KnowsLink#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.KnowsLink#getKnows <em>Knows</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.KnowsLink#getOppKnows <em>Opp Knows</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getKnowsLink()
 * @model
 * @generated
 */
public interface KnowsLink extends DynamicElement {
	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(long)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getKnowsLink_CreationDate()
	 * @model
	 * @generated
	 */
	long getCreationDate();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.KnowsLink#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(long value);

	/**
	 * Returns the value of the '<em><b>Knows</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Person#getOppKnows <em>Opp Knows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knows</em>' reference.
	 * @see #setKnows(Person)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getKnowsLink_Knows()
	 * @see de.mdelab.ldbc_snb.Person#getOppKnows
	 * @model opposite="oppKnows" required="true"
	 * @generated
	 */
	Person getKnows();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.KnowsLink#getKnows <em>Knows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knows</em>' reference.
	 * @see #getKnows()
	 * @generated
	 */
	void setKnows(Person value);

	/**
	 * Returns the value of the '<em><b>Opp Knows</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Person#getKnows <em>Knows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Knows</em>' reference.
	 * @see #setOppKnows(Person)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getKnowsLink_OppKnows()
	 * @see de.mdelab.ldbc_snb.Person#getKnows
	 * @model opposite="knows" required="true"
	 * @generated
	 */
	Person getOppKnows();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.KnowsLink#getOppKnows <em>Opp Knows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Knows</em>' reference.
	 * @see #getOppKnows()
	 * @generated
	 */
	void setOppKnows(Person value);

} // KnowsLink
