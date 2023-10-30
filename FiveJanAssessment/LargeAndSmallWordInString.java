package com.FiveJanAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
// Java program to find the largest and smallest words in a string
public class LargeAndSmallWordInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter more two or more than two String :");
		String str=sc.nextLine();	
		String []str1=str.split(" ");
		int l=0;
		String longest=" ";
		String shortest=" ";
		for (String string : str1) 
		{
			if(string.length()>l)
			{
				l=string.length();
				longest=string;			
			}
			
		}	
		System.out.println(longest);
		for (String string : str1) 
		{
			if(string.length()<l)
			{
				l=string.length();
				shortest=string;			
			}			
		}	
		System.out.println(shortest);
	}
}
