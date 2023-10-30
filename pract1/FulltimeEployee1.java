package com.pract1;

import java.util.HashMap;
import java.util.Scanner;

public class FulltimeEployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
		int EmpId;
		String CreateDate;
		String DOB;
		int Age;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter emp name :");
		Name=sc.nextLine();
		System.out.println("Enter emp id :");
		EmpId=sc.nextInt();
		System.out.println("Enter emp create date :");
		CreateDate=sc.nextLine();
		System.out.println();
		System.out.println("Enter emp date of birth :");
		DOB=sc.nextLine();
		System.out.println("Enter emp Age :");
		Age=sc.nextInt();
		System.out.println(Name+" "+EmpId+" "+CreateDate+" "+DOB+" "+Age);
		
		
		HashMap<Integer,String> HM=new HashMap<>();
		HM.put(01, "john cena");
		HM.put(02, "john abrahm");
		HM.put(03, "john lennon");
		HM.put(04, "john wayne");
		System.out.print(HM);
		
		}

	}


