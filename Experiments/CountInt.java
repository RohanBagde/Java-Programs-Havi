package Experiments;

import java.util.ArrayList;
import java.util.Collections;

public class CountInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int temp = 0;
	     //create object of ArrayList
	     ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
	     //add numbers in an ArrayList
	     arrayList.add(3);
	     arrayList.add(1);
	     arrayList.add(6);
	     arrayList.add(4);
	     arrayList.add(9);
	     arrayList.add(8);
	     //sort numbers in an ArrayList
	     Collections.sort(arrayList);
	     //return second highest number from sorted ArrayList
	     temp=arrayList.get(arrayList.size()-2);
	     System.out.println("Second highest number");
	     System.out.println(temp);
	}

}
