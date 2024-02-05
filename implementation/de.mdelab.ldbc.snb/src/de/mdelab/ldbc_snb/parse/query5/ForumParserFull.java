package de.mdelab.ldbc_snb.parse.query5;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.HasMemberLink;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.parse.ForumParser;

public class ForumParserFull extends ForumParser {

	public ForumParserFull(LdbcSNBModel model, Collection<EObject> nodes,
			Map<Long, Person> persons, Map<Long, Tag> tags) {
		super(model, nodes, persons, tags);
	}
	
	protected void parseHasMember(String hasMemberFile){
		for(Forum forum:forums.values()){
			for(Person person:persons.values()){
				createHasMember(forum.getID(), person.getID(), 0l);
			}
		}
	}
	
	private void createHasMember(long forumId, long personId, long joinDate) {
		HasMemberLink hasMember = Ldbc_snbFactory.eINSTANCE.createHasMemberLink();
		
		Forum forum = forums.get(forumId);
		Person person = persons.get(personId);
		forum.getHasMember().add(hasMember);
		hasMember.setHasMember(person);
		hasMember.setJoinDate(joinDate);	
	
		nodes.add(hasMember);
		model.getOwnedHasMemberLinks().add(hasMember);
	}

}
