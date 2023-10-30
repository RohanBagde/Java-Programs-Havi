package com.exception;

public class Numforexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ghv";
		try {
		int init=Integer.parseInt(str);
		System.out.println(init);
		}
		
		catch(Exception e)
		{
		System.out.println("String cannot be converted into integer");
		}
		System.out.println("Main method ended :");
	}

}
