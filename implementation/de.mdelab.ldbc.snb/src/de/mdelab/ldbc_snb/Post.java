/**
 */
package de.mdelab.ldbc_snb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.Post#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Post#getImageFile <em>Image File</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Post#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Post#getLinkedPosts <em>Linked Posts</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Post#getContainer <em>Container</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Post#getOppSuccessor <em>Opp Successor</em>}</li>
 *   <li>{@link de.mdelab.ldbc_snb.Post#getOppLinkedPosts <em>Opp Linked Posts</em>}</li>
 * </ul>
 *
 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPost()
 * @model
 * @generated
 */
public interface Post extends Message, IntegerIdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPost_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Post#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Image File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image File</em>' attribute.
	 * @see #setImageFile(String)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPost_ImageFile()
	 * @model
	 * @generated
	 */
	String getImageFile();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Post#getImageFile <em>Image File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image File</em>' attribute.
	 * @see #getImageFile()
	 * @generated
	 */
	void setImageFile(String value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Post#getOppSuccessor <em>Opp Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Post)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPost_Successor()
	 * @see de.mdelab.ldbc_snb.Post#getOppSuccessor
	 * @model opposite="oppSuccessor"
	 * @generated
	 */
	Post getSuccessor();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Post#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Post value);

	/**
	 * Returns the value of the '<em><b>Linked Posts</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Post}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Post#getOppLinkedPosts <em>Opp Linked Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Posts</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPost_LinkedPosts()
	 * @see de.mdelab.ldbc_snb.Post#getOppLinkedPosts
	 * @model opposite="oppLinkedPosts" ordered="false"
	 * @generated
	 */
	EList<Post> getLinkedPosts();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Forum#getOppContainer <em>Opp Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Forum)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPost_Container()
	 * @see de.mdelab.ldbc_snb.Forum#getOppContainer
	 * @model opposite="oppContainer"
	 * @generated
	 */
	Forum getContainer();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Post#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Forum value);

	/**
	 * Returns the value of the '<em><b>Opp Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Post#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Successor</em>' reference.
	 * @see #setOppSuccessor(Post)
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPost_OppSuccessor()
	 * @see de.mdelab.ldbc_snb.Post#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	Post getOppSuccessor();

	/**
	 * Sets the value of the '{@link de.mdelab.ldbc_snb.Post#getOppSuccessor <em>Opp Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opp Successor</em>' reference.
	 * @see #getOppSuccessor()
	 * @generated
	 */
	void setOppSuccessor(Post value);

	/**
	 * Returns the value of the '<em><b>Opp Linked Posts</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.ldbc_snb.Post}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.ldbc_snb.Post#getLinkedPosts <em>Linked Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opp Linked Posts</em>' reference list.
	 * @see de.mdelab.ldbc_snb.Ldbc_snbPackage#getPost_OppLinkedPosts()
	 * @see de.mdelab.ldbc_snb.Post#getLinkedPosts
	 * @model opposite="linkedPosts"
	 * @generated
	 */
	EList<Post> getOppLinkedPosts();

} // Post
