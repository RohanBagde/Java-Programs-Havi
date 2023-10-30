package OOPs;

abstract class Bike {
	abstract void ladder();
}

class Honda extends Bike {
	public void ladder() {
		System.out.println("This is an abstract method");
	}

}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike tyre = new Honda();
		tyre.ladder();
		System.out.println();

	}

}
