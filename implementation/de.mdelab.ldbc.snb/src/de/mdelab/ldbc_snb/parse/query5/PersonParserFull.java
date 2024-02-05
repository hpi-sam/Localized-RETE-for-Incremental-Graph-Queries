package de.mdelab.ldbc_snb.parse.query5;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Ldbc_snbFactory;
import de.mdelab.ldbc_snb.Organisation;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Place;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.parse.PersonParser;

public class PersonParserFull extends PersonParser{
	
	public PersonParserFull(LdbcSNBModel model, Collection<EObject> nodes, Map<Long, Place> places, Map<Long, Organisation> organisations, Map<Long, Tag> tags){
		super(model, nodes, places, organisations, tags);
	}
	
	protected void parseKnows(String knowsFile) {
		for(Person p1:persons.values()){
			for(Person p2:persons.values()){
				if(p1.getID() < p2.getID()){
					createKnows(p1.getID(), p2.getID(), 0l);
				}
			}	
		}
	}
	
	private void createKnows(long id1, long id2, long creationDate) {
		KnowsLink k1 = Ldbc_snbFactory.eINSTANCE.createKnowsLink();
		KnowsLink k2 = Ldbc_snbFactory.eINSTANCE.createKnowsLink();
		
		Person p1 = persons.get(id1);
		Person p2 = persons.get(id2);
		
		p1.getKnows().add(k1);
		p2.getKnows().add(k2);
		
		k1.setKnows(p2);
		k2.setKnows(p1);
		
		k1.setCreationDate(creationDate);
		k2.setCreationDate(creationDate);
		
		nodes.add(k1);
		nodes.add(k2);
		model.getOwnedKnowsLinks().add(k1);
		model.getOwnedKnowsLinks().add(k2);
	}

	@Override
	public String getName() {
		return "person parser full";
	}

}
