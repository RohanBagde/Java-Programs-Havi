package com.FiveJanAssessment;

import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SortHashMapByKey {
//Java program to sort hashmap by keys
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hashmap = new HashMap<>();
//		hashmap.put(1, "Kakashi");
//		hashmap.put(2, "Kisame");
//		hashmap.put(3, "Satoru");
//		hashmap.put(4, "Aasuma");
//		hashmap.put(8, "Pain");
//		hashmap.put(5, "Shikamaru");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the key as int and value as string :");
		try {
			for(int i=0;i<5;i++)
			{
				Integer a=sc.nextInt();
				String b=sc.nextLine();
				hashmap.put(a, b);
			}
		} 
		catch (InputMismatchException e) 
		{
			System.out.println("please enter key as number and value as string :");
			System.exit(0);
		}
		System.out.println(hashmap);
		Set<Entry<Integer,String>> set=hashmap.entrySet();
		for (Entry<Integer, String> entry : set) 
		{
			System.out.print("This are the sorted Keys :"+entry.getKey());
		}
	}
}
