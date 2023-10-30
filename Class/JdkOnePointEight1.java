package Abstarct.Interface.Class;

abstract class Abc {
	public void m1() {
		System.out.println("i am abstract class :");
	}
}

class Bcd extends Abc {

	@Override
	public void m1() {
		super.m1();
		System.out.println("i am normal class :");
	}
}

public class JdkOnePointEight1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bcd asd = new Bcd();
		asd.m1();
	}

}
