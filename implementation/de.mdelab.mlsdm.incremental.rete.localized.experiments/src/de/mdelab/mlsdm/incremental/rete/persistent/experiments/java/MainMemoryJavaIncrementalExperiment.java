package de.mdelab.mlsdm.incremental.rete.persistent.experiments.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Package;

import de.mdelab.emf.util.delta.EMFDelta;
import de.mdelab.migmm.sample.modisco.delta.MoDiscoDeltaReader;

public class MainMemoryJavaIncrementalExperiment<Query> extends MainMemoryJavaExperiment<MoDiscoDeltaReader, Query> {

	protected int currentDeltaIndex;
	
	public MainMemoryJavaIncrementalExperiment(boolean measureMemory) {
		super(measureMemory);
	}

	@Override
	protected void initializeModel(MoDiscoDeltaReader model) {
		currentDeltaIndex = 0;
	}

	@Override
	protected boolean hasNextUpdate(MoDiscoDeltaReader model) {
		return currentDeltaIndex < model.getDeltas().size();
	}

	@Override
	protected void performUpdate(MoDiscoDeltaReader model) {
		EMFDelta delta = model.getDeltas().get(currentDeltaIndex);
		delta.apply(model.getObjects(), model.getIds());
	}

	@Override
	protected void processUpdate() {
		currentDeltaIndex++;
	}

	@Override
	protected Query getQuery(String queryURI) {
		return null;
	}

	@Override
	protected void createReteNet(Query query) {
	}

	@Override
	protected void initializeReteNet(MoDiscoDeltaReader model) {
	}

	@Override
	protected MoDiscoDeltaReader readModel(String modelFile) {
		MoDiscoDeltaReader model = new MoDiscoDeltaReader(modelFile);
		currentDeltaIndex = 0;
		performUpdate(model);
		processUpdate();
		return model;
	}

	protected Collection<EObject> getRelevantSubgraph(MoDiscoDeltaReader model) {
		List<EObject> relevantSubgraph = new ArrayList<EObject>();
		EObject rootObject = findPackage((Model) model.getModelRoots().get(0), "de.mdelab.mlsdm.interpreter.incremental.rete.dynamic");
		relevantSubgraph.add(rootObject);
		for(Iterator<EObject> it = rootObject.eAllContents(); it.hasNext();) {
			EObject childObject = it.next();
			relevantSubgraph.add(childObject);
		}
		return relevantSubgraph;
	}
	
	private EObject findPackage(Model model, String packageName) {
		String[] tokens = packageName.split(Pattern.quote("."));
		
		return findPackage(model.getOwnedElements(), tokens, 0);
	}

	private Package findPackage(EList<Package> pkgs, String[] tokens, int depth) {
		for(Package pkg:pkgs) {
			if(pkg.getName().equals(tokens[depth])) {
				if(depth == tokens.length - 1) {
					return pkg;
				}
				else {
					Package child = findPackage(pkg.getOwnedPackages(), tokens, depth + 1);
					if(child != null) {
						return child;
					}
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("2 arguments: model, measureMemory");
			return;
		}
		
		String modelFile = args[0];
		boolean measureMemory = Boolean.parseBoolean(args[1]);
		
		MainMemoryJavaIncrementalExperiment<Object> experiment = new MainMemoryJavaIncrementalExperiment<Object>(measureMemory);
		experiment.run(modelFile, null);
	}

}
