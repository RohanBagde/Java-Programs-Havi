package com.exception;

public class Finally2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("learn coding");
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);
			System.out.println("havi solutions ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't devid by zero :"+e);
		}
		finally
		{
			System.out.println("i am finally block");
		}
		System.out.println("main method ended :");
	}

}
