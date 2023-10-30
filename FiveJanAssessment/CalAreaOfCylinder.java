package com.FiveJanAssessment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalAreaOfCylinder {

	//Java program to find total surface area of cylinder
	public static void main(String[] args)  {
		double LOC = 0;
		double HOC = 0;
		double ROC = 0;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of cylinder :");
			try {
				LOC=sc.nextDouble();
				System.out.println("Enter the height of cylinder :");
				HOC=sc.nextDouble();
				System.out.println("Enter the radius of cylinder :");
				ROC=sc.nextDouble();
			} catch (InputMismatchException e) 
			{
				System.out.println("Enter only positive digits");
				System.exit(0);
			}
			
		if(LOC<=0 || HOC<=0  || ROC<=0 )
		{
			System.out.println("The given input values you entered is might be 0 or negative");
			System.exit(0);
		}
		
		double add=(LOC+HOC);
		double pieR=2*Math.PI*ROC;
		double TotalSurAreaOfCyl=pieR*add;
		System.out.println("The total surface area of cylinder is :"+TotalSurAreaOfCyl);				
	}

}
