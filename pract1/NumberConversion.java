package com.pract1;

import java.util.Scanner;

public class NumberConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BINARY TO DECIMAL
		System.out.println("Enter the binary number :");
		Scanner sx =new Scanner(System.in);
		long n=sx.nextLong();
		long dec=0;
				int count=0;
		while(n>0)
		{
			long r=n%10;
			dec=dec+r*pow(2,count);
			count++;
			n/=10;
		}
		System.out.println("decimal equivalent= "+dec);
	}
	static int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
			
		}
		return pw;
	}

}
