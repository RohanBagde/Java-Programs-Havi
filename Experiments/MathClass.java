package Experiments;

import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of X :");
		double x=sc.nextDouble();
		System.out.print("Enter the value of Y :");
		double y=sc.nextDouble();
		
		
		System.out.println("max value between "+x+" and "+y+" is :"+Math.max(x, y));
		System.out.println("Square root of x is :"+Math.sqrt(x));
		System.out.println("Square root of Y is :"+Math.sqrt(y));
		System.out.println("x to the power Y is :"+Math.pow(x, y));
	}

}
