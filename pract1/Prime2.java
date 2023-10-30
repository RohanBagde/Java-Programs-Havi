package com.pract1;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// Write a program to display Prime number 1 to N ?
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n;
		n=sc.nextInt();
		for(int i=1;i<=n;i++ )
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i+" ");
			}
		}

	}

}
