package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExValidatePass {

	public static void main(String[] args) {

		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));

		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));

		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));

		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));

		// 2nd Way

		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));

		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
		
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));
		
		
		System.out.println("========================");
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));
		
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));
	}

}
