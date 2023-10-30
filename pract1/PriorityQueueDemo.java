package com.pract1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue q=new PriorityQueue(15,new MyComparator());
	        q.offer("python");
	        q.offer("Training");
	        q.offer("javascript");
	        q.add("minus");
	        q.offer("java");
	        q.offer("plus");
	        
	        System.out.println(q);
	        
	    }
	}
	class MyComparator implements Comparator{
	    public int compare(Object obj1,Object obj2) {
	        String s1=(String)obj1;
	        String s2=(String)obj2;
	        return s2.compareTo(s1);
	        
	}
	

	}


