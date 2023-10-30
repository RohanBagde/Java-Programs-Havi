package com.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		// Taking input and returning void
		
		
	Consumer<Integer>square=(a) ->System.out.println("Squaring the value :"+a*a);
	square.accept(5);
	
	Consumer<Integer>Double=(a) ->System.out.println("Doubling the value :"+2*a);
	Double.accept(5);
	Consumer<Integer>Triple=(a) ->System.out.println("Tripling the value :"+3*a);
	Triple.accept(5);
	System.out.println("==================================================");
	System.out.println("CHAINING");
	
	square.andThen(Double).andThen(Triple).accept(5);
		
	}

}
