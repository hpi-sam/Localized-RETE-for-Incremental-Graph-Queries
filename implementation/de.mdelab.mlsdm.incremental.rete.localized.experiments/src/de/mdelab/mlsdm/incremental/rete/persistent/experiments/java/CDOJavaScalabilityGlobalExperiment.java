package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

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

import de.mdelab.mlsdm.incremental.rete.EMFMetaData;
import de.mdelab.mlsdm.incremental.rete.ReteNet;
import de.mdelab.mlsdm.incremental.rete.ReteQueryManager;
import de.mdelab.mlsdm.incremental.rete.diameter.DiameterBasedReteBuilder;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteResultProvider;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteSubgraphFilter;
import de.mdelab.mlsdm.incremental.rete.persistent.experiments.Experiment;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;

public class CDOJavaScalabilityGlobalExperiment extends CDOJavaScalabilityReteExperiment {

	protected ReteSubgraphFilter subgraphFilter;
	
	public CDOJavaScalabilityGlobalExperiment(String metaDataPath, int packageNumber, boolean measureMemory) {
		super(metaDataPath, packageNumber, measureMemory);
	}

	@Override
	protected ReteQueryManager createQueryManager(List<EObject> objects) {
		Model model = (Model) objects.get(0);
		
		ReteQueryManager queryManager = new ReteQueryManager();
		queryManager.observePatternStatistics(pattern);
		queryManager.registerEObject(model);

		initializeSubgraphFilter(objects);
		
		return queryManager;
	}

	@Override
	protected ReteNet createReteNet(StoryPattern pattern, EMFMetaData metaData) {
		try {
			ReteNet rete = new DiameterBasedReteBuilder(pattern, metaData).createReteNet().e1;
			ReteNode root = rete.getRoot();

			ReteResultProvider resultProvider = new ReteResultProvider();
			resultProvider.setTableMask(root.getTableMask());
			rete.setRoot(resultProvider);
			
			if(Experiment.FILTER_RESULTS) {
				subgraphFilter = new ReteSubgraphFilter();
				subgraphFilter.setTableMask(root.getTableMask());
				subgraphFilter.addSuccessor(resultProvider);
				root.addSuccessor(subgraphFilter);
			}
			else {
				root.addSuccessor(resultProvider);
			}
			
			return rete;
		} catch (SDMException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	protected void initializeSubgraphFilter(List<EObject> model) {
		if(Experiment.FILTER_RESULTS) {
			subgraphFilter.addSubgraph(getRelevantSubgraph(model));
		}
	}

	@Override
	protected void performUpdate(List<EObject> model) {
		Set<EObject> newElements = new LinkedHashSet<EObject>();
		
		Package pkg = getUpdatedPackage((Model) model.get(0));

		ClassDeclaration classDeclaration = JavaFactory.eINSTANCE.createClassDeclaration();
		pkg.getOwnedElements().add(classDeclaration);
		newElements.add(classDeclaration);
		
		for(int fieldCount = 0; fieldCount < fieldNumber; fieldCount++) {
			TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
			ClassDeclaration type = (ClassDeclaration) pkg.getOwnedElements().get(fieldCount % pkg.getOwnedElements().size());
			typeAccess.setType(type);
			newElements.add(typeAccess);
			
			FieldDeclaration field = JavaFactory.eINSTANCE.createFieldDeclaration();
			field.setType(typeAccess);
			classDeclaration.getBodyDeclarations().add(field);
			newElements.add(field);
		}

		if(Experiment.FILTER_RESULTS) {
			subgraphFilter.addSubgraph(newElements);
		}
	}
	
	public static void main(String[] args) {
		if(args.length < 4) {
			System.out.println("4 arguments: packageNumber, pattern, metaData, measureMemory");
			return;
		}

		int packageNumber = Integer.parseInt(args[0]);
		String patternFile = args[1];
		String metaDataFile = args[2];
		boolean measureMemory = Boolean.parseBoolean(args[3]);
		
		CDOJavaScalabilityGlobalExperiment experiment = new CDOJavaScalabilityGlobalExperiment(metaDataFile, packageNumber, measureMemory);
		experiment.run("dummy", patternFile);
	}

}
