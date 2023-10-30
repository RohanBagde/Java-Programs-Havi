package com.FiveJanAssessment;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDupFromArray {
//Java program to remove the duplicates from the array. 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int s=0;
		try {
			s=sc.nextInt();
			}
		catch(InputMismatchException e)
		{
			System.out.println("The size of array should be positive integer number");
			System.exit(0);
		}
		 
		Integer[] org = new Integer[s];
		System.out.print("Enter the values of array :");
		try {
			for(int i=0;i<=s-1;i++)
			{
				org[i]=sc.nextInt();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("please dont enter anything except integer");
			System.exit(0);
		}		
		Set<Integer> newarr=new LinkedHashSet<>(Arrays.asList(org));
		System.out.println("All thge dublicates has been removed :" );
		for (Integer integer : newarr) {
			System.out.print(integer+" ");
		}
	}				
}


