package com.exception;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,b=2,c;
			c=a/b;
			System.out.println(c);
			int arr[]= {10,20,30,40};
			System.out.println(arr[1]);
			String str=null;
			System.out.println(str.toUpperCase());
		}
		catch(ArrayIndexOutOfBoundsException z)
		{
		 System.out.println("Array Exception");	
		}
		catch(ArithmeticException y)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(NumberFormatException n)
		{
			System.out.println("Number Exception");
		}
		catch(Exception x)
		{
			System.out.println("all type of exception handel");
		}

	}

}
