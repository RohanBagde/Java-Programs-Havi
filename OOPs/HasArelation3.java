package OOPs;

class A {

	public void Stigma() {
		System.out.println("stigma");
	}
}

class B {

	A has = new A();

	public void hello() {

		// here i create reference var of class A
		has.Stigma();
	}
}

public class HasArelation3 {

	public static void main(String[] args) {

		B has2 = new B();
		has2.hello();
	}

}
