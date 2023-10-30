package com.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionInterfaceEx {

	public static void main(String[] args) {
		// Function takes 1 input and
		// Returns 1 output parameter
		//1 abstract method apply()
		
		//Ex1
			  //in-para,//out-para
		Function<String, Integer> fun=(f1) -> f1.length();
		Function<Integer, Integer> mul=(f1) ->f1*2;
		Integer val=fun.andThen(mul).apply("Rowdy");
		System.out.println(val);
		
		//Ex2
		
	}
}
