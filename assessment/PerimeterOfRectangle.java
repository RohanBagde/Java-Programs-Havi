package com.assessment;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of Side1 :");
		double Side1=sc.nextDouble();
		System.out.println("Enter the length of Side2 :");
		double Side2=sc.nextDouble();		
		double perimeter=2*(Side1+Side2);
		System.out.println("The perimeter of rectangle is :"+perimeter);
	}
}
