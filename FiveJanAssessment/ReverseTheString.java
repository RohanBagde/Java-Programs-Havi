package com.FiveJanAssessment;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String :");
		String str=sc.nextLine();
		int l=str.length();
		System.out.println("Before Reversing :"+str);
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.print("After Reversing :"+rev);		
	}

}
