package com.pract1;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.println("enter any character :");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonent");
		}
		

	}

}
