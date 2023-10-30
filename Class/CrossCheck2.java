package Abstarct.Interface.Class;

interface Interface3 {
	default void m1() {
		System.out.println(" i am from main interface");
	}
}

class Classmates implements Interface3 {
	@Override
	public void m1() {
		System.out.println(" i am Overriden");
	}
}

public class CrossCheck2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classmates obj1 = new Classmates();
		obj1.m1();
	}

}
