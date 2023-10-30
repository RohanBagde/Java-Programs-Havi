package com.pract1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a=sc.nextInt();
		System.out.println("Enter sceond value");
		int b=sc.nextInt();
		int lcm=1;
		for(int i=1; i<=a && i<=b;i++)
		{
			if(a%i==0 ||b%i==0)
			{
				lcm=i;
			}
		}
		System.out.println(lcm);
		
	}	

}


