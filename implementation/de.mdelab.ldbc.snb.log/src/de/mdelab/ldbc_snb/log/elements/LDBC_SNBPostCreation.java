package de.mdelab.ldbc_snb.log.elements;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.Tag;

public class LDBC_SNBPostCreation extends LDBC_SNBElementAction<Post> {

	private Post post;
	private Person creator;
	private Country country;
	private Collection<Tag> tags;
//	private Post predecessor;
	private Forum forum;

	public LDBC_SNBPostCreation(long creationTime, Post post, Person creator, Country country, Forum forum, Collection<Tag> tags) {
		this(creationTime, post, creator, country, forum, null, tags);
	}

	public LDBC_SNBPostCreation(long creationTime, Post post, Person creator, Country country, Forum forum, Post predecessor, Collection<Tag> tags) {
		super(creationTime);
		this.post = post;
		this.creator = creator;
		this.country = country;
		this.forum = forum;
//		this.predecessor = predecessor;
		this.tags = tags;
	}
	
	@Override
	public Post executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedPosts().add(post);
		post.setHasCreator(creator);
		post.setIsLocatedIn(country);
//		if(predecessor != null) {
//			post.setOppSuccessor(predecessor);
//		}
		post.setContainer(forum);
		for(Tag tag:tags) {
			post.getHasTag().add(tag);
		}
		return post;
	}

	@Override
	public void undoAction(EObject model) {
		for(Tag tag:tags) {
			post.getHasTag().remove(tag);
		}
//		post.setOppSuccessor(null);
		post.setContainer(null);
		post.setIsLocatedIn(null);
		post.setHasCreator(null);
		((LdbcSNBModel) model).getMessages().remove(post);
		((LdbcSNBModel) model).getOwnedPosts().remove(post);
	}
	
	@Override
	public String toString() {
		return "Post " + post.getID();
	}

}
