package collection1;

import java.util.ArrayList;

public class ArrayListPrac1 {

	   //ArrayList allow Multiple null values
	//Arraylist followes insertion order
	
	
	
	public static void main(String[] args) {
		ArrayList <String> arr=new ArrayList<>();
		arr.add("Rohan");
		arr.add(null);
		arr.add(null);
		arr.add(0, null);
		arr.add("Rohan");
		System.out.println(arr);

	}

}
