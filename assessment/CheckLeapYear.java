package com.assessment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = 0;
		try {
			year = sc.nextInt();
		} 
		catch (InputMismatchException e) 
		{
			System.out.println("please enter integer values only :");
			System.exit(0);
		}
		if(year%400==0 && year%100 !=0 || year%4==0)
		{
			System.out.println(year+" : this year is leap");
		}
		else
		{
			System.out.println(year+ " : this is not leap ");
		}
	}
}
