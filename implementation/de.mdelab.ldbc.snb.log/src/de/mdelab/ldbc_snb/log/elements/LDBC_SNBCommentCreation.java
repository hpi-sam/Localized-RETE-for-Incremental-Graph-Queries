package de.mdelab.ldbc_snb.log.elements;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Comment;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Tag;

public class LDBC_SNBCommentCreation
		extends
			LDBC_SNBElementAction<Comment> {

	private Comment comment;
	private Person creator;
	private Country country;
	private Collection<Tag> tags;
	private Message message;
	
	public LDBC_SNBCommentCreation(long creationTime, Comment comment, Person creator, Country country, Message message, Collection<Tag> tags) {
		super(creationTime);
		this.comment = comment;
		this.creator = creator;
		this.country = country;
		this.message = message;
		this.tags = tags;
	}

	@Override
	public Comment executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedComments().add(comment);
		comment.setHasCreator(creator);
		comment.setIsLocatedIn(country);
		comment.setReplyOf(message);
		for(Tag tag:tags) {
			comment.getHasTag().add(tag);
		}
		return comment;
	}

	@Override
	public void undoAction(EObject model) {
		for(Tag tag:tags) {
			comment.getHasTag().remove(tag);
		}
		comment.setReplyOf(null);
		comment.setIsLocatedIn(null);
		comment.setHasCreator(null);
		((LdbcSNBModel) model).getMessages().remove(comment);
		((LdbcSNBModel) model).getOwnedComments().remove(comment);
	}

	@Override
	public String toString() {
		return "Comment " + comment.getID();
	}
}
