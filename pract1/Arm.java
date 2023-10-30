package com.pract1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Arm {

	public static void main(String[] args)  {
		int a,arm=0,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>10000)
		{
			a=n%10;
			arm=arm+(a*a*a);
			n=n/10;
		}
		if(arm==temp)
			System.out.println("arm");
		else
		{
			System.out.println("not arm");
		}
		

	}

}
