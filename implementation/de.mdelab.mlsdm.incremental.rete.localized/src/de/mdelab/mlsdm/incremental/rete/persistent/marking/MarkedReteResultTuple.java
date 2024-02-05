package de.mdelab.mlsdm.incremental.rete.persistent.marking;

import java.util.List;

public class MarkedReteResultTuple extends MarkedReteTuple {

	private int[] tableMask;
	
	public MarkedReteResultTuple(List<Object> tupleValue, int[] tableMask, int marking) {
		super(tupleValue, marking);
		this.tableMask = tableMask;
	}

	@Override
	public Object get(int index) {
		return tupleValue.get(tableMask[index]);
	}
}
