package com.kita.level4;

public class Value {
	
	private int val; 
	
	
	public Value(int val) {
		this.val = val;
	}
	public int getVal() {
		return val;
	}
	@Override
	public boolean equals(Object obj) {
		Value value=(Value) obj;
		
	/*	if(val == s.getVal()) {
			return true;
		}
		else {
			return false;
		}
	}*/
		return this.val==value.getVal();
	}
	
	@Override
	public String toString() {
		return String.format("%d",val);
	// return String.Valueof(val);
	}
	
}
