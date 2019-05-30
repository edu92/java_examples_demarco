package org.protor.sandbox.eduardo.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToyC implements Interface1, Interface2 {

	
	private List<Double> innerList;
	
	
	public ToyC(List<Double> l) {
		this.innerList = l;
	}
	public ToyC() {
		this.innerList = new ArrayList<Double>();
	}
	@Override
	public List<Double> calculate2a(List<C> l2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Double> calculate1a(List<C> l2, double a, double b) {

		List<Double> result = new ArrayList<>();
		
		for (C c : l2) {
			result.addAll(c.getAllNumbers(a, b));
		}
		return result;
	}
	@Override
	public double[] calculate2b(List<C> l) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Double> calculate1a(List<C> l) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Double> calculate1b(AbstractB[] bb) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Double> getInnerList() {
		return innerList;
	}
	public void setInnerList(List<Double> innerList) {
		this.innerList = innerList;
	}
	@Override
	public String toString() {
		return "ToyC [innerList=" + Arrays.toString(this.innerList.toArray())+ "]";
	}
	
	
	
}
