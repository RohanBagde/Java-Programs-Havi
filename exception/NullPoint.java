package com.exception;

public class NullPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str=null;
			try {
			System.out.println(str.toUpperCase());
			}
			catch(Exception e) {
			System.out.println("Null cannot be casted....");
			}
	}

}
