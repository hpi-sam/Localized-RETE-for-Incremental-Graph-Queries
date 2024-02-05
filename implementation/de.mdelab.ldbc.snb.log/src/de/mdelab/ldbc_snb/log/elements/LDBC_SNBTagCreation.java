package de.mdelab.ldbc_snb.log.elements;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Tag;
import de.mdelab.ldbc_snb.TagClass;

public class LDBC_SNBTagCreation extends LDBC_SNBElementAction<Tag> {

	private Tag tag;
	private Collection<TagClass> types;
	
	public LDBC_SNBTagCreation(long creationTime, Tag tag, Collection<TagClass> types) {
		super(creationTime);
		this.tag = tag;
		this.types = types;
	}
	
	@Override
	public Tag executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedTags().add(tag);
		for(TagClass type:types) {
			tag.getHasType().add(type);
		}
		return tag;
	}

	@Override
	public void undoAction(EObject model) {
		for(TagClass type:types) {
			tag.getHasType().remove(type);
		}
		((LdbcSNBModel) model).getOwnedTags().remove(tag);
	}
	
	@Override
	public String toString() {
		return "Tag " + tag.getID();
	}

}
