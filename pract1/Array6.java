package com.pract1;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int a1[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data in array :");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter data in array2 :");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		boolean b=Arrays.equals(a, a1);
		System.out.println(b);
	}

}
