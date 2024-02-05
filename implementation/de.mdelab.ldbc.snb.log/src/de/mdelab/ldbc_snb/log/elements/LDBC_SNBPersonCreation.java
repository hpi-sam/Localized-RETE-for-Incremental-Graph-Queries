package de.mdelab.ldbc_snb.log.elements;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.Tag;

public class LDBC_SNBPersonCreation extends LDBC_SNBElementAction<Person> {

	private Person person;
	private City city;
	private Collection<Tag> tags;
	
	public LDBC_SNBPersonCreation(long creationTime, Person person, City city, Collection<Tag> tags) {
		super(creationTime);
		this.person = person;
		this.city = city;
		this.tags = tags;
	}
	
	@Override
	public Person executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedPersons().add(person);
		person.setIsLocatedIn(city);
		for(Tag t:tags) {
			person.getHasInterest().add(t);
		}
		return person;
	}

	@Override
	public void undoAction(EObject model) {
		for(Tag t:tags) {
			person.getHasInterest().remove(t);
		}
		person.setIsLocatedIn(null);
		((LdbcSNBModel) model).getOwnedPersons().remove(person);
	}
	
	@Override
	public String toString() {
		return "Person " + person.getID();
	}

}
