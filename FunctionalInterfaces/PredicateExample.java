package com.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
//Takes 1 input
//Return a boolean
	public static void main(String[] args) {
		Predicate<String> chkl= (s) -> s.length()>5;
		System.out.println(chkl.test("Havi Solutions"));	
 
		System.out.println("=======================================");
		
	//predicate Joining
		Predicate<String> chklength=l -> l.length()>5;
		System.out.println(chklength.test("code decode"));
		
		Predicate<String> chkEven= l -> l.length()%2==0;
		System.out.println("len of string :"+chkEven.test("codedecode"));
		
	//Joining with and operator
		System.out.println("after merging with and operator :"+chklength.and(chkEven).test("codedecode"));
	//Joining with or operator
		System.out.println("after merging with or operator :"+chklength.or(chkEven).test("codedecode"));
	// Negate
		System.out.println("after merging with negate :"+chklength.negate().test("codedecode"));		
	}

}
