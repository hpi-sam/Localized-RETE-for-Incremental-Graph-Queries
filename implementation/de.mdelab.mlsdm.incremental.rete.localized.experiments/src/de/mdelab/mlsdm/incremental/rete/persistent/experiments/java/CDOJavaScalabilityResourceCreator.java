package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.examples.embedded.CDOFacade;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.emf.JavaFactory;

public class CDOJavaScalabilityResourceCreator {

	protected static final String CDO_RESOURCE_URI = "cdo_db";
	protected static final String CDO_WARM_UP_URI = "cdo_warmup_db";
	protected static final String CDO_DATA_SOURCE_PATH = "models";

	protected CDOTransaction transaction;

	protected int packageNumber = 10;
	protected int classNumber = 10;
	protected int fieldNumber = 10;
	
	public CDOJavaScalabilityResourceCreator(int packageNumber) {
		this.packageNumber = packageNumber;
	}

	public void setUpResource(String resourceURI) {
		Model model = JavaFactory.eINSTANCE.createModel();
		populateModel(model);
		
		CDOFacade.INSTANCE.activate();
		startTransaction();
		
		CDOResource resource = createCDOResource(resourceURI);
		addModel(resource, model);
		
		commitTransaction();
		
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		resource.unload();
		CDOFacade.INSTANCE.deactivate();
	}

	protected void startTransaction() {
		transaction = CDOFacade.INSTANCE.getTransaction();
	}

	private CDOResource createCDOResource(String resourceURI) {
		CDOResource r = transaction.getOrCreateResource(resourceURI);
		return r;
	}

	protected void addModel(Resource r, Model model) {		
		r.getContents().add(model);
	}

	private void populateModel(Model model) {
		List<ClassDeclaration> classes = new ArrayList<ClassDeclaration>();
		
		for(int pkgCount = 0; pkgCount < packageNumber; pkgCount++) {
			Package pkg = JavaFactory.eINSTANCE.createPackage();
			model.getOwnedElements().add(pkg);
			
			for(int classCount = 0; classCount < classNumber; classCount++) {
				ClassDeclaration classDeclaration = JavaFactory.eINSTANCE.createClassDeclaration();
				pkg.getOwnedElements().add(classDeclaration);
				classes.add(classDeclaration);
			}	
		}
		
		for(int classIndex = 0; classIndex < classes.size(); classIndex++) {
			ClassDeclaration classDeclaration = classes.get(classIndex);
			
			for(int fieldCount = 0; fieldCount < fieldNumber; fieldCount++) {
				TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
				ClassDeclaration type = classes.get((classIndex + fieldCount) % classes.size());
				typeAccess.setType(type);
				
				FieldDeclaration field = JavaFactory.eINSTANCE.createFieldDeclaration();
				field.setType(typeAccess);
				classDeclaration.getBodyDeclarations().add(field);
			}
		}
	}

	protected void commitTransaction() {
		try {
			transaction.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		transaction = null;
	}
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("1 argument: packageNumber");
			return;
		}
		
		int packageNumber = Integer.parseInt(args[0]);
		CDOJavaScalabilityResourceCreator creator = new CDOJavaScalabilityResourceCreator(packageNumber);
		creator.setUpResource(CDO_RESOURCE_URI);
	}

}
