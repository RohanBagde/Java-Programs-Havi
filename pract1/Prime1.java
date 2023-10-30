package com.pract1;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the number");
	        int n=sc.nextInt();
	        for(int i=1;i<=n;i++) {
	        	for(int j=1;j<=i;j++) {
	        		count=count++;
	        	
	        	}
	        	if(count==2) {
	        	System.out.println(count);
	             }
	        	}
	}
}