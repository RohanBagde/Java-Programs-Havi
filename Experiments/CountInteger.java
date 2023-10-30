package Experiments;

import java.util.ArrayList;
import java.util.Collections;

public class CountInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Count=0;
		 ArrayList<Integer> arrayList = new ArrayList<Integer>();
		 arrayList.add(3);
	     arrayList.add(1);
	     arrayList.add(6);
	     arrayList.add(4);
	     arrayList.add(9);
	     arrayList.add(8);
	     for(int i=0;i<=arrayList.size()-1;i++)
	     {
	    	 Count++;
	     }
	     System.out.println(Count);
	}

}
