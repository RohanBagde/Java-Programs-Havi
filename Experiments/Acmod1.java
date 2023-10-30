package Experiments;

public class Acmod1 {
	static int a=100;
	static int b=200;
	static void m1() {
		a++;
		b++;
	}
	void m2() {
		a++;
		b++;
	}
	void disp() {
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acmod1.m1();
		Acmod1 s=new  Acmod1();
		s.disp();

	}

}
