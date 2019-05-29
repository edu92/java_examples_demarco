package org.protor.sandbox.eduardo.test;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.protor.sandbox.eduardo.basic.A;
import org.protor.sandbox.eduardo.basic.B;

public class testBasic01 {

	public static void main(String[] args) {

		A a1 = new A();
		a1.setI(1);
		a1.setD(-0.5);
		a1.setS("Oggetto A1");
		A a2 = new A(2, 3.1415, "Oggetto A2");

		B b1 = new B();
		B b2 = new B();
		System.out.println(b1);

		b1.getSa()[0] = "AAAA";
		/*
		 * for (String s : b1.getSa())
		 * Syste.out.println(s);
		 * 
		 * String[] s1 = b1.getSa();
		 * s1[0] = "AAAA";  NON è UNA COPIA DI B1!!!!!
		 * 
		 */
		System.out.println(b1);

		String[] s1 = {"boh", "aaa", "qwe"};
		String[] s1a = Arrays.copyOf(b1.getSa(), b1.getSa().length+1);
		s1a[3] = "boh";
		
	

		String[] s1b = ArrayUtils.addAll(s1, s1a); //needs Apache Commons Lang
		
		System.out.println(Arrays.toString(s1b));
		
		for (String s : s1b)
			System.out.println(s);



	}

}
