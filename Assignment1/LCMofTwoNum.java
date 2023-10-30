package com.assessment;

import java.util.Scanner;

public class LCMofTwoNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a=sc.nextInt();
		System.out.println("Enter sceond value");
		int b=sc.nextInt();
		int lcm;
		if(a>b)
		{
			lcm=a;
		}
		else
		{
			lcm=b;
		}
		while(true) {
			if(lcm%a==0 && lcm%b==0)
			{
				System.out.println("least common multiplier is :"+lcm);
			break;
			}
			lcm++;
		}	
	}
}
