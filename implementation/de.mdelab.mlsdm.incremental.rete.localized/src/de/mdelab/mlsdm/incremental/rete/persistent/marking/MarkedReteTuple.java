package de.mdelab.mlsdm.incremental.rete.persistent.marking;

import java.util.List;

import de.mdelab.mlsdm.incremental.rete.util.ReteTuple;

public class MarkedReteTuple extends ReteTuple {

	public static final int NO_MARKING = -1;
	
	private int marking;
	
	public MarkedReteTuple(List<Object> tupleValue, int marking) {
		super(tupleValue);
		this.marking = marking;
	}

	public int getMarking() {
		return marking;
	}
	
	public void setMarking(int value) {
		this.marking = value;
	}

	@Override
	public boolean isMarked() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof MarkedReteTuple) {
			return getMarking() == ((MarkedReteTuple) o).getMarking() &&
					super.equals(o);
		}
		else {
			return super.equals(o);
		}
	}
	
	@Override
	public String toString() {
		return "(" + marking + " ,"  + super.toString() + ")";
	}

	public static int getMarking(ReteTuple tuple) {
		return tuple.isMarked() ? ((MarkedReteTuple) tuple).getMarking() : MarkedReteTuple.NO_MARKING;
	}
	
}
