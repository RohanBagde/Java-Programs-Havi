package com.pract1;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		month =sc.nextInt();
		String nmonths="";
		switch (month)
		{
		case 1:
			nmonths="1-january";
			break;
		case 2:
			nmonths="1-february";
			break;
		case 3:
			nmonths="1-march";
			break;
		case 4:
			nmonths="1-april";
			break;
		case 5:
			nmonths="1-may";
			break;
		case 6:
			nmonths="1-june";
			break;
		case 7:
			nmonths="1-july";
			break;
		case 8:
			nmonths="1-august";
			break;
		case 9:
			nmonths="1-september";
			break;
		case 10:
			nmonths="1-octomber";
			break;
		case 11:
			nmonths="1-november";
			break;
		case 12:
			nmonths="1-december";
			break;
		}
		System.out.println(nmonths);

	}

}
