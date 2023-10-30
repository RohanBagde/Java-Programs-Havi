package com.exception;

public class MultiTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int x=10,y=2,c;
			c=x/y;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero ");
		}
		try 
		{
			int a[]= {10,20,30,40};
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Beyond the array limit");
		}

	}

}
