package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.WorkAtLink;

public class LDBC_SNBWorkCreation
		extends
			LDBC_SNBElementAction<WorkAtLink> {

	private WorkAtLink work;
	private Person person;
	private Company company;

	public LDBC_SNBWorkCreation(long creationTime, WorkAtLink work, Person person, Company company) {
		super(creationTime);
		this.work = work;
		this.person = person;
		this.company = company;
	}
	
	@Override
	public WorkAtLink executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedWorkAtLinks().add(work);
		work.setOppWorkAt(person);
		work.setWorkAt(company);
		return work;
	}

	@Override
	public void undoAction(EObject model) {
		work.setWorkAt(null);
		work.setOppWorkAt(null);
		((LdbcSNBModel) model).getOwnedWorkAtLinks().remove(work);
	}

}
