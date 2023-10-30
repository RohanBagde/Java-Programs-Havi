package Experiments;

import java.util.ArrayList;

public class ReverseArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(); // Display the arraylist values in the reverse order.
		
		arr.add(40);
		arr.add(50);
		arr.add(110);
		arr.add(16);
		arr.add(85);
		arr.add(69);
		System.out.println("Before Reverse :" + arr);
		
		for (int i = arr.size()-1; i >= 0; i--)
		{
		
			arr.add(arr.get(i));
		}
		

		System.out.println("after Reverse :"+arr);
	}

}
