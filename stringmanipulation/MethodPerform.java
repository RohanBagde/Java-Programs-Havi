package com.stringmanipulation;

public class MethodPerform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I am a String";
		char c = s1.charAt(7);
		System.out.println(s1.charAt(7));
		String s2 = s1.substring(7, 13);
		System.out.println("slicing  : " + s2);
		System.out.println("Char at Method : " + c);
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.length());
		System.out.println(s1.startsWith("I am"));
		System.out.println(s1.endsWith("ng"));
		System.out.println(s1.contains("am"));
		System.out.println("===========================");
		// method chaining concepts
		String s3 = "   rohan  ";
		System.out.println(s3.length());
		System.out.println(s3.trim().length());
		System.out.println(s3.trim().substring(2).length());
		System.out.println(s3.trim().substring(1, 3).length());

		// length keyword vs length()
		int[] a = { 10, 20, 30, 40, 50, 60 };
		System.out.println(a.length); // length keyword is used to find length of array.
		String str = "jagga jasoos";
		System.out.println(str.length()); // length is method to find length of string

		// Split()
		String sa = "I Am Naruto";
		String[] d = sa.split(" ");
		for (String ss : d) {
			System.out.print(ss);
		}
		{
			
		}
		System.out.println("===================================");
		String ad = "Havi Solution";
		System.out.println(ad.substring(1, 6));
		System.out.println(ad.replace('i', 'a'));
		System.out.println(ad.replace("avi", "air"));
		System.out.println(ad.startsWith("Ha"));
		System.out.println(ad.startsWith("ha"));
		System.out.println(ad.indexOf('S'));
		System.out.println("=================================");
		String md = "RohanAndRohan";
		System.out.println(md.indexOf("han"));
		System.out.println(md.indexOf("han", 6));
		System.out.println(md.lastIndexOf("han", 6));
		System.out.println("========================");
		System.out.println(md.contains("han"));
		System.out.println(md.intern());
		System.out.println(md.isEmpty());
		System.out.println("=============================");
		String sw = "I am from havi solution";
		String[] swa = sw.split(" ");
		for (String sda : swa) {
			System.out.print(sda);
		}

	}

}
