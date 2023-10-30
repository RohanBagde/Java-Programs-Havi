package com.FiveJanAssessment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation {
//Java program to find all permutations of a string
	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) 
		{
			System.out.println(prefix);
		}
		else 
		{
			for (int i = 0; i < n; i++) 
			{
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
			}
		}
	}
	public static void main(String[] args) {
		permutation("","ABC");
	}
}