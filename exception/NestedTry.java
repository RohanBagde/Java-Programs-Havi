package com.exception;

public class NestedTry {

	public static void main(String[] args) {
		// Nested try bloc Example
		try 
		{
			System.out.println(10/0); // Here might we get thats why i write in try block
			try 
			{
				int a[]= {10,20,30,40}; // we are handling multiple exception using nested try block
				System.out.println(a[6]);
			}
			catch(ArrayIndexOutOfBoundsException a) // catching exception for ArrayIndexOutOfBoundsException
			{
				System.out.println(a);
			}
			
			
		}
		catch(ArithmeticException e) // catching arithmetic exception
		{
			System.out.println(e);
		}
		System.out.println("learn coding");
	}

}
