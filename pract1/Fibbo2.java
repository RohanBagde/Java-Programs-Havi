package com.pract1;

import java.util.Scanner;

public class Fibbo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,term;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		term=sc.nextInt();
		
		for(int i=1;i<=term;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
