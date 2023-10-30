package com.pract1;

import java.util.Scanner;

public class IfelseIff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the name of the city");
		    String city;
		    city=sc.nextLine();
		   
		    if(city.equals("delhi")) {
				System.out.println("Pyar tera delhi ki sardi");}
			else if(city.equals("nagpur")) {
				System.out.println("famous for oranges");}
			else if(city.equals("kolkata")) {
				System.out.println("famous for rosgulla");}
			else
				{System.out.println("others");}

	}

}
