package de.mdelab.mlsdm.incremental.rete.persistent.marking.util;

import de.mdelab.mlsdm.incremental.rete.nodes.ReteNode;
import de.mdelab.mlsdm.incremental.rete.persistent.marking.DynamicChangeListener;

public class MarkingSensitiveReteUtil {

	public static boolean isDynamicChangeListener(ReteNode node) {
		return node instanceof DynamicChangeListener;
	}

}
