package com.FiveJanAssessment;

import java.util.InputMismatchException;
import java.util.Scanner;
//Java program to calculate area of rhombus
public class CalAreaOfRombus {

	public static void main(String[] args) {
		double dia1=0;
		double dia2=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st diagonal side :");
		try {
			dia1=sc.nextDouble();
			System.out.print("Enter the 2nd diagonal side :");
			dia2=sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Please enter positive digits only ");
			System.exit(0);
		}
		sc.close();
		if(dia1<=0 || dia2<=0)
		{
			System.out.println("Please do not enter 0 or Negative values as input!s");
			System.exit(0);
		}
		double AR=dia1*dia2;
		double AreaOfRombus=(AR/2);
		System.out.println("Total area of rhombus is :"+AreaOfRombus );		
	}
}
