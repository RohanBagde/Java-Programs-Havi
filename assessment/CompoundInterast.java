package com.assessment;

import java.util.Scanner;

public class CompoundInterast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount :");
		double amt=sc.nextDouble();
		System.out.println("Enter the rate of intrest :");
		double intrest=sc.nextDouble();
		System.out.println("Enter the years :");
		int year=sc.nextInt();
		double res=(1+(intrest/100));
		double powres= Math.pow(res, year);
		double TotalAmount=amt*powres;
		double CompundInterst=TotalAmount-amt;
		System.out.println("The compound intrest of cust is :"+CompundInterst);
	}

}
