package com.pract1;

import java.util.Scanner;

public class Ifelseif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of fruit :");
		String fruit;
		fruit=sc.nextLine();
		
		if(fruit.equals("mango")) {
			System.out.println("green");
			}
		else if(fruit.equals("banana")) {
				System.out.println("yellow");
			}
		else if(fruit.equals("pineapple")) {
			System.out.println("naino");
		}
	}
	
		

}

