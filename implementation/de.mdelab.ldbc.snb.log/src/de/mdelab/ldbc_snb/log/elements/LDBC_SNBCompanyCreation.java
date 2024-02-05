package de.mdelab.ldbc_snb.log.elements;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.Company;
import de.mdelab.ldbc_snb.Country;
import de.mdelab.ldbc_snb.LdbcSNBModel;

public class LDBC_SNBCompanyCreation
		extends
			LDBC_SNBElementAction<Company> {

	private Company company;
	private Country country;

	public LDBC_SNBCompanyCreation(long creationTime, Company company, Country country) {
		super(creationTime);
		this.company = company;
		this.country = country;
	}

	@Override
	public Company executeAction(EObject model) {
		((LdbcSNBModel) model).getOwnedCompanies().add(company);
		company.setIsLocatedIn(country);
		return company;
	}

	@Override
	public void undoAction(EObject model) {
		company.setIsLocatedIn(null);
		((LdbcSNBModel) model).getOwnedCompanies().remove(company);
	}

}
