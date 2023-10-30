package com.collection;

import java.util.ArrayList;

public class ArrayListCointainsExample {

	public static void main(String[] args) {
// 1st method to check the data is contained or not
		ArrayList<String> al = new ArrayList<>();
		al.add("rohan");
		al.add("Sumeet");
		al.add("kazukake");
		al.add("sharingan");
		boolean isExist = false;
		for (String string : al) {
			if (string.equalsIgnoreCase("rohan")) {
				isExist = true;
			}

		}System.out.println(isExist);
	//2nd method to check 
	System.out.println(al.contains("rohan"));
	System.out.println();
	}

}
