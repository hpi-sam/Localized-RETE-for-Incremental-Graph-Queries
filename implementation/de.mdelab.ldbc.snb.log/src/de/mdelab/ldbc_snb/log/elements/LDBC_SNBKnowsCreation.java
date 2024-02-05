package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.KnowsLink;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Person;

public class LDBC_SNBKnowsCreation extends LDBC_SNBElementAction<KnowsLink> {

	private KnowsLink knows;
	private Person source;
	private Person target;
	
	public LDBC_SNBKnowsCreation(long creationTime, KnowsLink knows, Person source, Person target) {
		super(creationTime);
		this.knows = knows;
		this.source = source;
		this.target = target;
	}
	
	@Override
	public KnowsLink executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedKnowsLinks().add(knows);
		source.getKnows().add(knows);
		knows.setKnows(target);
		return knows;
	}

	@Override
	public void undoAction(EObject model) {
		knows.setKnows(null);
		source.getKnows().remove(knows);
		((LdbcSNBModel) model).getOwnedKnowsLinks().remove(knows);
	}
	
	@Override
	public String toString() {
		return source.getID() + " -knows-> " + target.getID();
	}

}
