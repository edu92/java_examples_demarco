package org.protor.sandbox.eduardo.basic;

import java.util.Arrays;

public class B {
	
	private boolean b;
	private String[] sa;
	
	public B() {
		initialize();
	}
	
	private void initialize() {
		this.b = false;
		this.sa = new String[] {"Pre-", "si", "de!"};
	}
	
	public B(boolean b, String[] sa) {
		super();
		this.b = b;
		this.sa = sa;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public String[] getSa() {
		return sa;
	}

	public void setSa(String[] sa) {
		this.sa = sa;
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", sa=" + Arrays.toString(sa) + "]";
	}
	
}
