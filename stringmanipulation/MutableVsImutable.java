package com.stringmanipulation;

public class MutableVsImutable {

	public static void main(String[] args) {

		// immutable : modifications are not allowed
		String s = "I am ";
		s.concat(" String ");
		System.out.println("cant concat :-> " + s);
		
		// assigning this time 
		s = s.concat(" String ");
		System.out.println("cant concat :-> " + s);
		// Mutable : modifications are allowed
		StringBuffer sb = new StringBuffer("I am ");
		sb.append("String ");
		System.out.println("append :-> " + sb);
	}

} 
