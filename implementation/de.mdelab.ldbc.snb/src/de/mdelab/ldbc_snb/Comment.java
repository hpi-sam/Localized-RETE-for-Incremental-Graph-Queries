/**
 */
package de.mdelab.ldbc_snb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.Comment#getReplyOf <em>Reply Of</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Message {
	/**
	 * Returns the value of the '<em><b>Reply Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Message#getOppReplyOf <em>Opp Reply Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Of</em>' reference.
	 * @see #setReplyOf(Message)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getComment_ReplyOf()
	 * @see de.mdelab.ldbc_snb.Message#getOppReplyOf
	 * @model opposite="oppReplyOf" required="true"
	 * @generated
	 */
	Message getReplyOf();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Comment#getReplyOf <em>Reply Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply Of</em>' reference.
	 * @see #getReplyOf()
	 * @generated
	 */
	void setReplyOf(Message value);

} // Comment
