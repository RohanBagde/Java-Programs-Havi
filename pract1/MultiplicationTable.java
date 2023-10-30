package com.pract1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digit ");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			sum=n*i;
			System.out.println(n+"*"+i+"="+sum);
		}
		
  
	}

}
