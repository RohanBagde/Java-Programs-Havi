package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPractiseExample {

	public static void main(String[] args) {
		String re=" ";
		String rest= " ";
		
		Pattern pt=Pattern.compile(re);
		Matcher mt=pt.matcher(rest);
		
		boolean res=mt.matches();
		System.out.println(res);
		//1st way  
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		System.out.println(b);

		//2nd way  
		System.out.println(Pattern.matches("[amn]?", "a"));
		//true (a or m or n comes one time)

	}

}
