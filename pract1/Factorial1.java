package com.pract1;

import java.util.Scanner;


public class Factorial1 {
	public void fact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int a=sc.nextInt();
		long sum=1;
		for(int i=1;i<=a;i++)
		{
			sum=sum*i;
			
		}
		System.out.println("The factorial of "+a+" is :"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial1 dx=new Factorial1();
		dx.fact();
		
		

	}

}
