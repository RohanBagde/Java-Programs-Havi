package com.exception;

public class NestedFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			String a=null;
			System.out.println(a.toUpperCase());
		}
		catch(Exception e)
		{
			System.out.println(e+" outer catch block");
		}
		finally
		{
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException a)
			{
				System.out.println(a+" inner catch block");
			}
			finally
			{
				System.out.println("Havi"); //here i am writing finally block inside a finally block
			}
			
		}
		System.out.println("main method ended :");
	}

}
