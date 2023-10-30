package com.pract1;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    String city="";
    city=sc.nextLine();
    System.out.println("Enter the name of the city");
    if(city=="delhi") {
    	System.out.println("Pyar tera delhi ki sardi");
    }
    else if(city=="nagpur") { 
    	System.out.println("famous for oranges");
    	
    }
    else if(city=="kolkata") {
    	System.out.println("famous for rosgulla");
    }
    else
    {
    	System.out.println("others");
    }
	}

}
