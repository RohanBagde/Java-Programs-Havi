package collection1;

import java.util.HashSet;

public class HashSetCompare {

	public static void main(String[] args) {
		 HashSet<String> h_set = new HashSet<String>();
	          h_set.add("Red");
	          h_set.add("Green");
	          h_set.add("Black");
	          h_set.add("White");

	          HashSet<String>h_set2 = new HashSet<String>();
	          h_set2.add("Red");
	          h_set2.add("Pink");
	          h_set2.add("Black");
	          h_set2.add("Orange");
	          //comparison 
	        for (String string : h_set2) {
	        	System.out.println(h_set.contains(string)?"yes":"no");
				
			}
	}

}
