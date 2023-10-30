package com.FiveJanAssessment;

import java.util.Scanner;

public class CheckSunnyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int num=sc.nextInt();
		num=num+1;
		boolean flag=false;
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
			    flag=true;
			}
		}
		if(flag)
		{
			System.out.println("Sunny");
		}
		else
		{
			System.out.println("not sunny");
		}
	}
}