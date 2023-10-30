package com.exception1;

import java.util.Scanner;

class Vote extends RuntimeException {
	Vote(String s) {
		super(s);
	}
}

public class CustomizeException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new Vote(" you are not eligible for vote");
				
			}
			else
			{
			 System.out.println("you are eligible for vote ");
			}
		}
		catch(Vote e)
		{
		System.out.println(e.toString());	
		}
		
	}
 
}
