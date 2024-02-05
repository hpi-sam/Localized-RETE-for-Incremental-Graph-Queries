package de.mdelab.mlsdm.incremental.rete.persistent.marking;

import de.mdelab.mlsdm.incremental.ChangeListener;

public interface DynamicChangeListener extends ChangeListener {

	public void setQueryManager(PersistentReteQueryManager persistentReteQueryManager);

}
