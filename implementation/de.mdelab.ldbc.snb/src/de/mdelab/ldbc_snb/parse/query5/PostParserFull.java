package de.mdelab.ldbc_snb.parse.query5;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Place;
import de.mdelab.ldbc_snb.Post;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.parse.PostParser;

public class PostParserFull extends PostParser {

	public PostParserFull(LdbcSNBModel model, Collection<EObject> nodes, Map<Long, Forum> forums,
			Map<Long, Person> persons, Map<Long, Tag> tags,
			Map<Long, Place> places) {
		super(model, nodes, forums, persons, tags, places);
	}
	
	protected void parseHasCreator(String hasCreatorFile){
		for(Post post:posts.values()){
			for(Person person:persons.values()){
				post.setHasCreator(person);
			}
		}
	}

	protected void parseContainerOf(String containerOfFile){
		for(Forum forum:forums.values()){
			for(Post post:posts.values()){
				post.setContainer(forum);
			}
		}
	}
}
