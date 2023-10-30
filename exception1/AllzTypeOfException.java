   package com.exception1;

import java.util.Scanner;

public class AllzTypeOfException {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		// Type1 Arithmetic
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=sc.nextInt();
		System.out.println("Enteer the value of B :");
		int b=sc.nextInt();
		
		
		try {
		
			int c = a / b;
			System.out.println(c);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("you are trying to divide by zero :");
			
		}
		System.out.println("=======================================");
		//NumberFormatException
		
		String str=" Fullmetal Alchemist brotherhood";
		
		try {
			int q=Integer.parseInt(str);//trying to convert string to int
			System.out.println(a); //this line will not going to execute
			
		}
		catch(NumberFormatException n)
		{
			System.out.println("String "+str+" can't be converted into integer");
		}
		System.out.println("================================================");
		
		//NullPointerException
		
        String s1=null;
		
		try {
			System.out.println(s1.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println("null cannot casted :");
		}
		System.out.println("========================================");
		
	}

}
