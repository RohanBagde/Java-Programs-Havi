package Trainer;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// Write the java program to check if the given two strings are anagram to each
		// other or not.
		// Two strings are said to be anagram if we can form one string by arranging the
		// characters of another string.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1 :");
		String s = sc.nextLine();
		System.out.println("Enter the String 2 :");
		String s1 = sc.nextLine();
		// first converting both the string in same case
		s = s.toLowerCase();
		s1 = s1.toLowerCase();
		// checking the length of both the string
		if (s.length() == s1.length()) 
		{
			System.out.println("Length of both strings are same :");
		}
		// converting both the strings into CharArray
		char[] Cstr1 = s.toCharArray();
		char[] Cstr2 = s.toCharArray();
		// sorting the array
		Arrays.sort(Cstr1);
		Arrays.sort(Cstr2);
		// comparing both arrays containing the same letters or not
		if (String.valueOf(Cstr1).equals(String.valueOf(Cstr2))) 
		{
			System.out.println("Anagram");
		}
		else 
		{
			System.out.println("Not Anagram");
		}
	}

}
