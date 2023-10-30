package OOPs;

import java.util.Scanner;

interface Java {
	public void input();

	public void output();
}

class Python implements Java {
	String name;
	double salary;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username :");
		name = sc.nextLine();
		System.out.println("enter salary :");
		salary = sc.nextDouble();

	}

	public void output() {
		System.out.println(name + " is the username");
		System.out.println(salary + " is the salary");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java pj = new Python();
		pj.input();
		pj.output();
	}

}
