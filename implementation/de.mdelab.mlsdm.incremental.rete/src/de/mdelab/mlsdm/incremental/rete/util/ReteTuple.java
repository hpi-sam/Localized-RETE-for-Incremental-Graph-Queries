package de.mdelab.mlsdm.incremental.rete.util;

import java.util.AbstractList;
import java.util.List;

public class ReteTuple extends AbstractList<Object> {

	protected List<Object> tupleValue;
	private boolean isPreliminary;
	
	private boolean dirty;
	private int cashedHash;
	
	public ReteTuple(List<Object> tupleValue) {
		this.tupleValue = tupleValue;
		this.isPreliminary = false;
		this.dirty = true;
		this.cashedHash = -1;
	}

	public List<Object> getTupleValue() {
		return tupleValue;
	}

	@Override
	public Object get(int index) {
		return tupleValue.get(index);
	}

	@Override
	public int size() {
		return tupleValue.size();
	}
	
	@Override
	public int hashCode() {
		if(dirty) {
			cashedHash = super.hashCode();
			dirty = false;
		}
		return cashedHash;
	}

	public void setIsPreliminary(boolean isPreliminary) {
		this.isPreliminary = isPreliminary;
	}
	
	public boolean isPreliminary() {
		return isPreliminary;
	}

	public boolean isMarked() {
		return false;
	}
}
