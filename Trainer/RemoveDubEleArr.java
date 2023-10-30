package Trainer;

import java.util.ArrayList;
import java.util.List;

public class RemoveDubEleArr {

	public static void main(String[] args) {

		ArrayList<Object> arr = new ArrayList<Object>();

		arr.add("Naruto");
		arr.add("kakashi");
		arr.add("Sasuke");
		arr.add("rasengan");
		arr.add("Naruto");
		arr.add("kakashi");
		arr.add("Sasuke");
		arr.add("rasengan");
		arr.add("Naruto");
		arr.add("kakashi");
		arr.add("Sasuke");
		arr.add("rasengan");
		System.out.println(arr);
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i).equals(arr.get(j))) {
					arr.remove(j);
					j--;
				}
			}
		}
		System.out.println(arr);
	}

}
