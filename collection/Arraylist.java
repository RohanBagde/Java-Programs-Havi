package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> Name=new ArrayList<String>();
		Name.add("Rohan");
		Name.add("Madhav");
		Name.add("Sumeet");
		Name.add("Pawan");
		System.out.println(Name);
		Name.add(0,"Shana");
		System.out.println(Name);
		List<String> Name1=new ArrayList<String>(Name);
		System.out.println(Name1);
		List<String> Name2=new ArrayList<String>();
	    Name2.addAll(Name);
	    System.out.println(Name2+" I am Name 2");
	    if(Name.contains("Rohan"))
	    {
	    	System.out.println("yes it contains");
	    }
	    if(Name.isEmpty())
	    {
	    	System.out.println("it is empty");
	    }
	    else
	    {
	    	System.out.println("it contains data ");
	    }
	    System.out.println(Name2.size());
	    System.out.println(Name.isEmpty());
	    Name.remove(0);
	    System.out.println(Name);
	    System.out.print(false);
	    
	}

}
