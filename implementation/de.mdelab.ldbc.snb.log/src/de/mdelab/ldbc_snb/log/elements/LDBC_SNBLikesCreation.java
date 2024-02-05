package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.LikesLink;
import de.mdelab.ldbc_snb.Message;
import de.mdelab.ldbc_snb.Person;

public class LDBC_SNBLikesCreation
		extends
			LDBC_SNBElementAction<LikesLink> {

	private LikesLink likes;
	private Person person;
	private Message message;
	
	public LDBC_SNBLikesCreation(long creationTime, LikesLink likes, Person person, Message message) {
		super(creationTime);
		this.likes = likes;
		this.person = person;
		this.message = message;
	}
	
	@Override
	public LikesLink executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedLikesLinks().add(likes);
		likes.setOppLikes(person);
		likes.setLikes(message);
		return likes;
	}

	@Override
	public void undoAction(EObject model) {
		likes.setLikes(null);
		likes.setOppLikes(null);
		((LdbcSNBModel) model).getOwnedLikesLinks().remove(likes);
	}

}
