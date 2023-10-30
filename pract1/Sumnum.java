package com.pract1;

import java.util.Scanner;

public class Sumnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sum = 0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			int n=sc.nextInt();
			for(int i=1; i<=n;i++)
			{
			    sum+=i;
				
			}
			System.out.println("sum of all values is :"+sum);
			
			
	}

}
