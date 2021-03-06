package org.protor.sandbox.eduardo.test;

import java.util.ArrayList;
import java.util.List;

import org.protor.sandbox.eduardo.basic.C;
import org.protor.sandbox.eduardo.basic.ToyC;

public class TestBasic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1 = new C();

		System.out.println(c1);

		System.out.println("----------------------");

		List<Double> l0 = new ArrayList<>();

		l0.add(-55.0);
		l0.add(-45.0);


		C c2 = new C(-10, true, -0.7, new int[] {-1, 1, 2}, 0.9, l0);
		System.out.println(c2);
		System.out.println("----------------------");
		
		List<C> nodes = new ArrayList<C>();
		nodes.add(c1);
		nodes.add(c2);
		
		ToyC tc = new ToyC();
		
		List<Double> numbers = tc.calculate1a(nodes, -20.0, 89.5);
		
		tc.setInnerList(numbers);
		System.out.println(tc);

	}

	
	
}
