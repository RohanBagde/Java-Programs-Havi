package com.collection;

import java.util.Vector;

import java.util.Iterator;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String> vec = new Vector<>();
		vec.add("Rohan");
		vec.add("Kranti");
		vec.add("15");
		System.out.println(vec);
		for (String string : vec) {
			System.out.println(string);
		}
		Iterator<String> iterator = vec.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
