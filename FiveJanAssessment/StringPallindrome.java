package com.FiveJanAssessment;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String :");
		String str=sc.nextLine();
		System.out.println("Orignal String :"+str);
		int l=str.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String :"+rev);
		if(rev.equals(str)) 
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("string is not pallindrome");
		}		
	}
}
