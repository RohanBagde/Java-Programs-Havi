package com.pract1;

import java.util.Scanner;

public class PractiseClass {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int lcm=0;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first value :");
			a = sc.nextInt();
			System.out.println("Enter the second value :");
			b = sc.nextInt();	
			lcm=(a>b) ? a:b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			if(lcm%a==0 && lcm%b==0)
			{
				System.out.println(lcm);
			break;
			}
			++lcm;
		}

	}

}
