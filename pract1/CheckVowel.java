package com.pract1;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char to check vowel/consonent :");
		c=sc.next().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("Consonent");
		}

	}

}
