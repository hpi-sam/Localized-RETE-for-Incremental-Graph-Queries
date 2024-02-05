package de.mdelab.migmm.sample.modisco.delta;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.emf.JavaPackage;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.emf.util.MDELabResourceImpl;
import de.mdelab.emf.util.delta.EMFDelta;

public class MoDiscoDeltaReader {

	private Map<EObject, Long> ids;
	private Map<Long, EObject> objects;
	private List<EObject> modelRoots;
	private List<EMFDelta> deltas;
	
	public MoDiscoDeltaReader(String path) {
		ensurePackageRegistration();
		readModelAndDeltas(path);
	}

	private void ensurePackageRegistration() {
		JavaPackage.eINSTANCE.getName();
	}

	private void readModelAndDeltas(String path) {
		MDELabResourceImpl r = EMFUtil.loadMDELabModel(path);
		
		modelRoots = r.getContents();
		ids = r.getIDs();
		deltas = r.getDeltas();
		
		createObjectsMap();
	}

	private void createObjectsMap() {
		objects = new LinkedHashMap<Long, EObject>();
		for(Entry<EObject, Long> entry:ids.entrySet()) {
			objects.put(entry.getValue(), entry.getKey());
		}
	}

	public Map<Long, EObject> getObjects() {
		return objects;
	}
	
	public List<EObject> getModelRoots() {
		return modelRoots;
	}

	public List<EMFDelta> getDeltas() {
		return deltas;
	}
	
	public Map<EObject, Long> getIds() {
		return ids;
	}

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("1 argument: path");
			return;
		}
				
		String path = args[0];
		
		JavaPackage.eINSTANCE.getName();
		
		MoDiscoDeltaReader reader = new MoDiscoDeltaReader(path);
		System.out.println(reader.getModelRoots());
		System.out.println(reader.getDeltas());
	}

}
