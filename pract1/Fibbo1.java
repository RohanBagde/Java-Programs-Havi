package com.pract1;

import java.util.Scanner;

public class Fibbo1 {
	static int fib(int n)																					//0 1 1 2 3 5 8 13 21
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int m=sc.nextInt();
		int f=fib(m);
		System.out.println(f);
	}

}
