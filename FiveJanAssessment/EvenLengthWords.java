package com.FiveJanAssessment;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenLengthWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("You have to enter Two or more Words :");
		String str=sc.nextLine();
		
		String []str1=str.split(" ");		
		System.out.println("This are the even word :");
		for (String string : str1) {
			if(string.length()%2==0)
			{
				System.out.println(string);
			}			
		}	
		
	}
}


