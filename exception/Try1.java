package com.exception;

public class Try1 {

	public static void main(String[] args) {
		// Simple try and catch example
		int a = 100;
		int b = 0;
		try {
			
			int c = a / b;  // only risky code should be write in try block
			} 
		catch (Exception e)  // here we catching exception
		{
			System.out.println(" You are trying to divide a number by zero :");
		}

	}

}

