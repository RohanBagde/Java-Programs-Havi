package com.pract1;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");	
		for(int j=0;j<=4;j++)
		{
			a[j]=sc.nextInt();
		}
		for(int i=0;i<=4;i++) {
			System.out.print(a[i]);
		}
	}

}
