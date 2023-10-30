package com.assessment;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=sc.nextInt();
		System.out.println("Enter te value of b :");
		int b=sc.nextInt();
		System.out.println("Before Swapping :"+a+" "+b);
		System.out.println("==============================");
		int c=0;
		c=b;  //c=20, b is empty
		b=a;  //b=10, a is empty
		a=c;  //a=20, c is empty
		System.out.println("After Swapping :"+a+" "+b);		
	}

}
