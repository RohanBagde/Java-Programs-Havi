package Trainer;

import java.util.ArrayList;

public class RemDubFromAl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Remove Dublicate elements from arrayList
		 ArrayList<String> al = new ArrayList<>();
	        ArrayList<String> withoutDuplicates = new ArrayList<>();
	        al.add("Havi");
	        al.add("Havi");
	        al.add("Hai");
	        al.add("Hai");
	        al.add("Hai");
	        al.add("Hai");
	        for (String string : al) {
	            if(!withoutDuplicates.contains(string)) {
	                withoutDuplicates.add(string);
	            }
	        }
	        System.out.println(withoutDuplicates);
	}

}
