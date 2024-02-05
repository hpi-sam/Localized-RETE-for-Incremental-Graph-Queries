package de.mdelab.ldbc_snb.log.elements;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.TagClass;

public class LDBC_SNBTagClassCreation
		extends
			LDBC_SNBElementAction<TagClass> {

	private TagClass tagClass;
	private Collection<TagClass> superTypes;

	public LDBC_SNBTagClassCreation(long creationTime, TagClass tagClass, Collection<TagClass> superTypes) {
		super(creationTime);
		this.tagClass = tagClass;
		this.superTypes = superTypes;
	}

	@Override
	public TagClass executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedTagClasses().add(tagClass);
		for(TagClass tc:superTypes) {
			tagClass.getIsSubclassOf().add(tc);
		}
		return tagClass;
	}

	@Override
	public void undoAction(EObject model) {
		for(TagClass tc:superTypes) {
			tagClass.getIsSubclassOf().remove(tc);
		}
		((LdbcSNBModel) model).getOwnedTagClasses().remove(tagClass);
	}

}
