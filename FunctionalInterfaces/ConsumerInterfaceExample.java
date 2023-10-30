package com.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {
		
		// Ex1
		Consumer<String> cons=(s) -> System.out.println(s);
		cons.accept("SpiderMan");
		
		//Ex2
		Consumer<Integer> sq=(a) ->System.out.println(a*a);
		sq.accept(5);
		
		//Ex3
		Consumer<Integer> saw=(ads) ->System.out.println();
		saw.accept(5);

	}

}
