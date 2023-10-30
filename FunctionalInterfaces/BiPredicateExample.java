package com.FunctionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		// Bi-Predicate acccept two input 
		//and boolean as a return
		
		//Ex1
		BiPredicate<Integer, Integer> bipre=(i1,i2) -> i1>i2;
		
		boolean status=bipre.test(17, 15);
		System.out.println(status);
		//Ex2
		BiPredicate<String, String> len=(s1,s2) -> s1.length()>s2.length();
		boolean res=len.test("shadow", "shuriken");
		System.out.println(res);
	}

}
