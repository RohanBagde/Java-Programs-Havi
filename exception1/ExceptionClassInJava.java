package com.exception1;

import java.util.Scanner;

class MyException extends Exception{
	@Override
	public String toString()
	{
		return " i am to String()";
		
	}
	public String getMessage() {
		return super.getMessage()+"i am get massage()";
	}
}
public class ExceptionClassInJava {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter a value :");
		a=sc.nextInt();
		if(a<9)
		{
			try {
				throw new MyException();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				System.out.println(e);
			}	
			
		}
		else
		{
			
			System.out.println("Entered value is greater than 9 :");
			
		}
		 		
	}

}
