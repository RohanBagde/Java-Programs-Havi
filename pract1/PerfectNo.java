package com.pract1;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1+2+3=6
		// 6 is the smallest perfect number because the sum of all previous digit is same 
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number :");
		int num=sc.nextInt();
		int sum=1;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==sum)
		{
			System.out.println(num+" is the perfect number");
		}
		else
		{
			System.out.println(num+" is not perfect number" );
		}
	}

}
