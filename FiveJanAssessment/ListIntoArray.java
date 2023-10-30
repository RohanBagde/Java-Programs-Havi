package com.FiveJanAssessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListIntoArray {

	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("insert 5 integer values into List :");
		try {
			for(int i=0; i<=4;i++)
			{
				l1.add(sc.nextInt());			
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("you should insert integer value only");
			System.exit(0);
		}	
		System.out.println("This is List :"+l1);
		int []newArray= new int[l1.size()];
		for(int i=0;i<=l1.size()-1;i++)
		{
			newArray[i]=l1.get(i);
		}	
		System.out.println("===============================");
		System.out.print("This is Array :");
		for (int i : newArray) 
		{
			System.out.print(i+" ");
		}
	}
}
