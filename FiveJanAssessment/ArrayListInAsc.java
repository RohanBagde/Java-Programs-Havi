package com.FiveJanAssessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArrayListInAsc {

	public static void main(String[] args)  {
		ArrayList list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("enter the values :");
		try {
			for(int i=0;i<=10;i++)
			{
				a=sc.nextInt();
				list.add(a);
			}
		}
		catch(InputMismatchException inp)
		{
			System.out.println("please enter digits only");
			System.exit(0);
		}
	
		
		System.out.println("Insertion Order :"+list);
		Collections.sort(list);
		System.out.println("Ascending Order :"+list);
	}
}
