package de.mdelab.mlsdm.incremental.rete.persistent.experiments.ldbc;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.ldbc_snb.LdbcSNBModel;
import de.mdelab.ldbc_snb.Person;
import de.mdelab.ldbc_snb.log.LDBC_SNBLogReader;

public class MainMemoryLDBCIncrementalExperiment<Query> extends MainMemoryLDBCExperiment<Query> {

	private double startPortion;
	
	public MainMemoryLDBCIncrementalExperiment(double startPortion, boolean measureMemory) {
		super(measureMemory);
		this.startPortion = startPortion;
	}

	@Override
	protected void initializeModel(LDBC_SNBLogReader model) {
		for(int count = 0; model.hasNextElement() && count < model.getLogSize() * startPortion; count++) {
			model.executeNextAction();
		}
	}

	protected Collection<EObject> getRelevantSubgraph(LDBC_SNBLogReader model) {
		Person startPerson = ((LdbcSNBModel) model.getModel()).getOwnedPersons().get(0);
		return Collections.singleton(startPerson);
	}

	@Override
	protected boolean hasNextUpdate(LDBC_SNBLogReader model) {
		return model.hasNextElement();
	}

	@Override
	protected void performUpdate(LDBC_SNBLogReader model) {
		model.executeNextAction();
	}

	@Override
	protected void processUpdate() {
		
	}

	@Override
	protected Query getQuery(String queryURI) {
		return null;
	}

	@Override
	protected void createReteNet(Query query) {
	}

	@Override
	protected void initializeReteNet(LDBC_SNBLogReader model) {
	}

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("3 arguments: modelFile, startPortion, measureMemory");
			return;
		}

		String modelFile = args[0];
		double startPortion = Double.parseDouble(args[1]);
		boolean measureMemory = Boolean.parseBoolean(args[2]);
		
		MainMemoryLDBCIncrementalExperiment<Object> experiment = new MainMemoryLDBCIncrementalExperiment<Object>(startPortion, measureMemory);
		experiment.run(modelFile, null);
	}

}
