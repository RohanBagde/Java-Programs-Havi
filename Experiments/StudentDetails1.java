package Experiments;

import java.util.ArrayList;
import java.util.List;
class Student {
	private String name;
	private int grade;
	private String email;

	public Student(String name, int grade, String email) {

		this.name = name;
		this.grade = grade;
		this.email = email;
	}

	public String toString() {

		return name + " " + grade + " " + email;
	}
}

public class StudentDetails1 {

	public static void main(String[] args) {
		Student[] s = new Student[3];// Array of objects.
		
		s[0] = new Student("Peter", 3, "p@gmail.com");
		s[1] = new Student("John", 4, "j@gmail.com");
		s[2] = new Student("Lisa", 5, "l@gmail.com");

		for (int i = 0; i < 3; ++i) {
			System.out.println(s[i].toString());
		}

	}

}
