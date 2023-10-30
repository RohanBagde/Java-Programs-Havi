package com.pract1;

import java.util.Scanner;

public class PRime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value :");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("prime number starts from 2");
		}
		for(i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("not prime number");
				break;
				
				}//eoIf
			
			}//eoFOR
			if(n==i) {
				System.out.println("number is prime");
			}//eoIF
		}

	}

