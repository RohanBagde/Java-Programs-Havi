package OOPs;

abstract class Monitor {
	abstract void Mouse();

	abstract int keyboard();

	void Cpu() {
		System.out.println("Brain of computer");
	}
}

class Plug extends Monitor {

	@Override
	void Mouse() {
		// TODO Auto-generated method stub
		System.out.println("i am mouse from plug");
	}

	@Override
	int keyboard() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Unplug extends Monitor {

	@Override
	void Mouse() {
		System.out.println("i am mouse from unplug");

	}

	@Override
	int keyboard() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void Cpu() {
		System.out.println("i am Cpu from unplug");
	}

}

public class abstractShape {

	public static void main(String[] args) {
		Monitor un = new Unplug();
		un.Cpu();
		un.Mouse();
		un.keyboard();
		Monitor plu = new Plug();
		plu.Cpu();
		plu.Mouse();
		plu.keyboard();

	}

}
