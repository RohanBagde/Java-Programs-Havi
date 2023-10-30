package com.assessment;

import java.util.Scanner;

public class GCDOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a=sc.nextInt();
		System.out.println("Enter sceond value");
		int b=sc.nextInt();
		int c=0;
		for(int i=1; i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				c=i;
			}
		}
		System.out.println("the GCD of Two number is :"+c);
	}

}
