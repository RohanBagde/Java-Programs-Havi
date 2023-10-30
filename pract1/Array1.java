package com.pract1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;

		for(int b:a)
		{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
			System.out.println(b);
		}
		System.out.println("-------------------------------");
		List<Integer> l=new ArrayList<>();
	    l.add(10);
	    l.add(20);
	    l.add(30);
	    l.add(40);
	    l.add(50);
	    for(int s:l)
	    {
	    	System.out.println(s);
	    }
	    l.remove(0);
	    System.out.println(l);
	    HashMap<Integer,String> maps=new HashMap<Integer,String>();
	    maps.put(1, "chanda");
	    maps.put(2, "dubi");
	    maps.put(3, "aksya");
	    maps.put(4, "kalya");
	    maps.put(5, "mangya");
	    maps.put(6, "gondya");
	     
	    
	    

	}

}
