package com.pract1;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values :");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();

		}
		max=a[0];
		for(int i=0;i<5;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max+" this is the biggest element of array");
	}

}
