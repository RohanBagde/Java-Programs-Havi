package com.FiveJanAssessment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibbonacci {
	
	public static void main(String[] args) {
		int a=0,b=1,c,term = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		try {term=sc.nextInt();}
		catch(InputMismatchException e)
		{
			System.out.println("please enter positive integer value");
			System.exit(0);
		}
		if(term<=0)
		{
			System.out.println("please dont insert 0 or negative values ");
		}		
		for(int i=1;i<=term;i++) 
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
