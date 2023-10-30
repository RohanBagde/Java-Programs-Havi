package OOPs;

interface Wwe {
	public void A(); // Abstract MEthod by default

	public void B();

	public void C();

	public void D();

	public void E();

}

class Nfc implements Wwe {
	@Override
	public void A() {
		System.out.println("I am A method");
	}

	@Override
	public void B() {
		System.out.println("I am B method");
	}

	@Override
	public void C() {
		System.out.println("I am C method");
	}

	@Override
	public void D() {
		System.out.println("I am D method");
	}

	@Override
	public void E() {
		System.out.println("I am E method");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wwe belt = new Nfc();
		belt.A();
		belt.B();
		belt.C();
		belt.D();
		belt.E();

	}

}
