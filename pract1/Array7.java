package com.pract1;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20, 30, 40, 50 };
		if (a == b) 
		{
			System.out.println(" Both are equal :");
		}
		else
		{
			System.out.println(" Both are not equal :");
		}
		int a1[] = { 10, 20, 30, 40, 50 };
		int b1[] = { 10, 20, 30, 40, 50 };
		if (Arrays.equals(a1, b1)) 
		{
			System.out.println(" Both are equal :");
		}
		else
		{
			System.out.println(" Both are not equal :");
		}
	}

}
