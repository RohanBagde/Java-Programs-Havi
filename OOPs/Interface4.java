package OOPs;

interface Client {
	void webdesign(); // public+abstract

	void webdevlope(); // public+abstract

}

abstract class Rajtech implements Client {
	@Override
	public void webdesign() {
		System.out.println("Green,top");
	}
}

class RahulTech extends Rajtech {
	@Override
	public void webdevlope() {
		System.out.println("HTML,CSS");
	}
}

public class Interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RahulTech cl = new RahulTech();
		cl.webdevlope();
		cl.webdesign();
	}

}
