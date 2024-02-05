package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Forum;
import de.mdelab.ldbc_snb.LdbcSNBModel;

public class LDBC_SNBForumCreation
		extends
			LDBC_SNBElementAction<Forum> {

	private Forum forum;

	public LDBC_SNBForumCreation(long creationTime, Forum forum) {
		super(creationTime);
		this.forum = forum;
	}
	
	@Override
	public Forum executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedForums().add(forum);
		return forum;
	}

	@Override
	public void undoAction(EObject model) {
		((LdbcSNBModel) model).getOwnedForums().remove(forum);
	}

}
