/**
 */
package de.mdelab.ldbc_snb.impl;

import de.mdelab.ldbc_snb.Comment;
import de.mdelab.ldbc_snb.Ldbc_snbPackage;
import de.mdelab.ldbc_snb.Message;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.ldbc_snb.impl.CommentImpl#getReplyOf <em>Reply Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends MessageImpl implements Comment {
	/**
	 * The cached value of the '{@link #getReplyOf() <em>Reply Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyOf()
	 * @generated
	 * @ordered
	 */
	protected Message replyOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ldbc_snbPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message getReplyOf() {
		if (replyOf != null && replyOf.eIsProxy()) {
			InternalEObject oldReplyOf = (InternalEObject)replyOf;
			replyOf = (Message)eResolveProxy(oldReplyOf);
			if (replyOf != oldReplyOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ldbc_snbPackage.COMMENT__REPLY_OF, oldReplyOf, replyOf));
			}
		}
		return replyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetReplyOf() {
		return replyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyOf(Message newReplyOf, NotificationChain msgs) {
		Message oldReplyOf = replyOf;
		replyOf = newReplyOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.COMMENT__REPLY_OF, oldReplyOf, newReplyOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplyOf(Message newReplyOf) {
		if (newReplyOf != replyOf) {
			NotificationChain msgs = null;
			if (replyOf != null)
				msgs = ((InternalEObject)replyOf).eInverseRemove(this, Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF, Message.class, msgs);
			if (newReplyOf != null)
				msgs = ((InternalEObject)newReplyOf).eInverseAdd(this, Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF, Message.class, msgs);
			msgs = basicSetReplyOf(newReplyOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ldbc_snbPackage.COMMENT__REPLY_OF, newReplyOf, newReplyOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.COMMENT__REPLY_OF:
				if (replyOf != null)
					msgs = ((InternalEObject)replyOf).eInverseRemove(this, Ldbc_snbPackage.MESSAGE__OPP_REPLY_OF, Message.class, msgs);
				return basicSetReplyOf((Message)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ldbc_snbPackage.COMMENT__REPLY_OF:
				return basicSetReplyOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ldbc_snbPackage.COMMENT__REPLY_OF:
				if (resolve) return getReplyOf();
				return basicGetReplyOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ldbc_snbPackage.COMMENT__REPLY_OF:
				setReplyOf((Message)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ldbc_snbPackage.COMMENT__REPLY_OF:
				setReplyOf((Message)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ldbc_snbPackage.COMMENT__REPLY_OF:
				return replyOf != null;
		}
		return super.eIsSet(featureID);
	}

} //CommentImpl
