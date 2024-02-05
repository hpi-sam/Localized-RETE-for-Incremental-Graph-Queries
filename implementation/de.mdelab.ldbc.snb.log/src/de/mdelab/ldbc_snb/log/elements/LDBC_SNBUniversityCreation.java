package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.City;
import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.University;

public class LDBC_SNBUniversityCreation
		extends
			LDBC_SNBElementAction<University> {

	private University university;
	private City city;

	public LDBC_SNBUniversityCreation(long creationTime, University university, City city) {
		super(creationTime);
		this.university = university;
		this.city = city;
	}
	
	@Override
	public University executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedUniversities().add(university);
		university.setIsLocatedIn(city);
		return university;
	}

	@Override
	public void undoAction(EObject model) {
		university.setIsLocatedIn(null);
		((LdbcSNBModel) model).getOwnedUniversities().remove(university);
	}
	
}
