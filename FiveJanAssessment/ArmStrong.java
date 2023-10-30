package com.FiveJanAssessment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmStrong {
//Java program to check a number is armstrong Or not
	
	public static void main(String[] args) {
		int n,t, res=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number :");
		try {
		n=sc.nextInt();
		t=n;

		if(n<0)
		{
			System.out.println("please enter positive digits only Your cant insert negative");
			System.exit(0);
		}
		while(t!=0)
		{
			rem=t%10;
			res=res+(rem*rem*rem);
			t=t/10;
		}
			if(n==res)
			{
				System.out.println(n+" : is an armstrong");
			}
			else
			{
				System.out.println("Not armstrong");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("you entered wrong input Enter positive digit only");
		}				
	}
}
