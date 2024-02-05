package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

public class MainMemoryJavaScalabilityExperiment<Query> extends MainMemoryJavaExperiment<Model, Query> {

	private static final int DEFAULT_PACKAGE_NUMBER = 10;

	protected int packageNumber = 10;
	protected int classNumber = 10;
	protected int fieldNumber = 10;
	
	private int updateNumber = 10;
	
	private int currentUpdateCount;
	
	public MainMemoryJavaScalabilityExperiment(boolean measureMemory) {
		this(DEFAULT_PACKAGE_NUMBER, measureMemory);
	}

	public MainMemoryJavaScalabilityExperiment(int packageNumber, boolean measureMemory) {
		super(measureMemory);
		this.packageNumber = packageNumber;
	}

	@Override
	protected Model readModel(String modelFile) {
		Model model = JavaFactory.eINSTANCE.createModel();
		populateModel(model);
		return model;
	}

	@Override
	protected void initializeModel(Model model) {
		currentUpdateCount = 0;
	}

	protected Collection<EObject> getRelevantSubgraph(Model model) {
		Set<EObject> relevantSubgraph = new LinkedHashSet<EObject>();
		EObject rootObject = getUpdatedPackage(model);
		relevantSubgraph.add(rootObject);
		for(Iterator<EObject> it = rootObject.eAllContents(); it.hasNext();) {
			EObject childObject = it.next();
			relevantSubgraph.add(childObject);
		}
		return relevantSubgraph;
	}

	@Override
	protected boolean hasNextUpdate(Model model) {
		return currentUpdateCount < updateNumber;
	}

	@Override
	protected void performUpdate(Model model) {
		Package pkg = getUpdatedPackage(model);

		ClassDeclaration classDeclaration = JavaFactory.eINSTANCE.createClassDeclaration();
		pkg.getOwnedElements().add(classDeclaration);
		
		for(int fieldCount = 0; fieldCount < fieldNumber; fieldCount++) {
			TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
			ClassDeclaration type = (ClassDeclaration) pkg.getOwnedElements().get(fieldCount % pkg.getOwnedElements().size());
			typeAccess.setType(type);
			
			FieldDeclaration field = JavaFactory.eINSTANCE.createFieldDeclaration();
			field.setType(typeAccess);
			classDeclaration.getBodyDeclarations().add(field);
		}
	}
	
	@Override
	protected void processUpdate() {
		currentUpdateCount++;
	}

	protected Package getUpdatedPackage(Model model) {
		return model.getOwnedElements().get(0);
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

	@Override
	protected Query getQuery(String queryURI) {
		return null;
	}

	@Override
	protected void createReteNet(Query query) {
	}

	@Override
	protected void initializeReteNet(Model model) {
	}

	public static void main(String[] args) throws ViatraQueryException, IOException {
		if(args.length < 2) {
			System.out.println("2 arguments: packageNumber, measureMemory");
			return;
		}

		int packageNumber = Integer.parseInt(args[0]);
		boolean measureMemory = Boolean.parseBoolean(args[1]);
		
		MainMemoryJavaScalabilityExperiment<Object> experiment = new MainMemoryJavaScalabilityExperiment<Object>(packageNumber, measureMemory);
		experiment.run("dummy", null);
	}
}
