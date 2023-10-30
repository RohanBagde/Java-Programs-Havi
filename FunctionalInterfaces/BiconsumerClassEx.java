package com.FunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiconsumerClassEx {

	public static void main(String[] args) {
		//1st Ex
		BiConsumer<String, String> consume=(s,p) ->System.out.println(s+" "+p);
		BiConsumer<String, String> consumeer =(s,p) -> System.out.println(s.toUpperCase()+" "+p.toLowerCase());
		consume.accept("Goldberg", "Johncena");
		consumeer.accept("Goldberg", "Johncena");
		
		//2nd Ex
		BiConsumer<Integer, Integer> sasuke=(a,b) ->System.out.println(a+" "+b);
		sasuke.accept(10, 12);
		
	}

}
