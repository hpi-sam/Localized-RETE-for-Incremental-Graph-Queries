package de.mdelab.mlsdm.incremental.rete.persistent.marking.nodes;

import org.eclipse.emf.ecore.EClassifier;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteDomainFilter;
import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.MarkingSensitiveReteNode;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkingSensitiveReteDomainFilter extends ReteDomainFilter implements MarkingSensitiveReteNode {

	public MarkingSensitiveReteDomainFilter(EClassifier classifier, int index) {
		super(classifier, index);
	}

	@Override
	public void changeMarking(ReteNode source, ReteTuple tuple, int oldMarking, int newMarking) {
		if(!filter(tuple)) {
			for(ReteNode successor:successors) {
				((MarkingSensitiveReteNode) successor).changeMarking(this, tuple, oldMarking, newMarking);
			}
		}
	}

}
