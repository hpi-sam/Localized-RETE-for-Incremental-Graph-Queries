package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.StudyAtLink;
import de.mdelab.ldbc_snb.University;

public class LDBC_SNBStudyCreation
		extends
			LDBC_SNBElementAction<StudyAtLink> {

	private StudyAtLink study;
	private Person person;
	private University university;

	public LDBC_SNBStudyCreation(long creationTime, StudyAtLink study, Person person, University university) {
		super(creationTime);
		this.study = study;
		this.person = person;
		this.university = university;
	}
	
	@Override
	public StudyAtLink executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedStudyAtLinks().add(study);
		study.setOppStudyAt(person);
		study.setStudyAt(university);
		return study;
	}

	@Override
	public void undoAction(EObject model) {
		study.setStudyAt(null);
		study.setOppStudyAt(null);
		((LdbcSNBModel) model).getOwnedStudyAtLinks().remove(study);
	}

}
