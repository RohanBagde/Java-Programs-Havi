package Trainer;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		// StringTokenizer is class which is used tokenized the string
		// it has ability to split the String 
		
		
		// first scenario
		StringTokenizer s = new StringTokenizer("hiii helllo");
		while (s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}

		/// second scenario

		StringTokenizer str1 = new StringTokenizer("help,me,i,am,running,out,of,time,save,me");
		while (str1.hasMoreTokens()) {
			System.out.println(str1.nextToken(","));
		}
	}

}
