package OOPs;

class Parent {
	void bike() {
		System.out.println("Honda");
	}
}

class Child extends Parent {
	void car() {
		System.out.println("hyundai");
	}
}

public class Mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.car();
		obj.bike();
	}

}
