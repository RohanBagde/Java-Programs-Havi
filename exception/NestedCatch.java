package com.exception;

public class NestedCatch {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic");
			try
			{
				String a=null;
				System.out.println(a.toLowerCase());
			}
			catch(NullPointerException n)  //here we are catching exception inside of nested catch block
			{
				System.out.println("null value can't converted");
			}
		}
		System.out.println("main method ended");
		

	}

}
