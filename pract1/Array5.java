package com.pract1;

import java.util.Scanner;

public class Array5 {     //program to search element in array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values to array :");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		
	}

}
