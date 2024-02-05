/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work At Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.WorkAtLink#getWorkFrom <em>Work From</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.WorkAtLink#getWorkAt <em>Work At</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.WorkAtLink#getOppWorkAt <em>Opp Work At</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getWorkAtLink()
 * @model
 * @generated
 */
public interface WorkAtLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Work From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work From</em>' attribute.
	 * @see #setWorkFrom(int)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getWorkAtLink_WorkFrom()
	 * @model
	 * @generated
	 */
	int getWorkFrom();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.WorkAtLink#getWorkFrom <em>Work From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work From</em>' attribute.
	 * @see #getWorkFrom()
	 * @generated
	 */
	void setWorkFrom(int value);

	/**
	 * Returns the value of the '<em><b>Work At</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Company#getOppWorkAt <em>Opp Work At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work At</em>' reference.
	 * @see #setWorkAt(Company)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getWorkAtLink_WorkAt()
	 * @see de.mdelab.ldbc_snb.Company#getOppWorkAt
	 * @model opposite="oppWorkAt" required="true"
	 * @generated
	 */
	Company getWorkAt();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.WorkAtLink#getWorkAt <em>Work At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work At</em>' reference.
	 * @see #getWorkAt()
	 * @generated
	 */
	void setWorkAt(Company value);

	/**
	 * Returns the value of the '<em><b>Opp Work At</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Person#getWorkAt <em>Work At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Work At</em>' reference.
	 * @see #setOppWorkAt(Person)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getWorkAtLink_OppWorkAt()
	 * @see de.mdelab.ldbc_snb.Person#getWorkAt
	 * @model opposite="workAt" required="true"
	 * @generated
	 */
	Person getOppWorkAt();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.WorkAtLink#getOppWorkAt <em>Opp Work At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Work At</em>' reference.
	 * @see #getOppWorkAt()
	 * @generated
	 */
	void setOppWorkAt(Person value);

} // WorkAtLink
