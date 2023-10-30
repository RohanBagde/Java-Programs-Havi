package com.pract1;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("enter first string");
  String str1=sc.nextLine();
  System.out.println("enter second string");
  String str2=sc.nextLine();
  
  // covert into lowercase
  str1=str1.toLowerCase();
  str2=str2.toLowerCase();
  
  
  //check the length
  if(str1.length()==str2.length()) {
	  
	  // convert String into char
	  char[] charArray1=str1.toCharArray();
	  char[] charArray2=str2.toCharArray();
	  
	  //sort the array
	  Arrays.sort(charArray1);
	  Arrays.sort(charArray2);
	  boolean result=Arrays.equals(charArray1,charArray2);
	  if(result) {
		  System.out.println(str1+" and "+ str2+" are anagram" );
	  }
	  else {
		  System.out.println(str1+" and "+ str2+" are not anagram" );
	  }
  }
  else {
	  System.out.println(str1+" and "+ str2+" are not anagram" );
  }
	}

}
