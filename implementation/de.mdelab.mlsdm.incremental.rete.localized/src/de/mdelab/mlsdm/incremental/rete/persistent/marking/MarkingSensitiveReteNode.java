package de.mdelab.mlsdm.incremental.rete.persistent.marking;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public interface MarkingSensitiveReteNode {

	public void changeMarking(ReteNode source, ReteTuple tuple, int oldMarking, int newMarking);
	
}
