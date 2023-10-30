package Abstarct.Interface.Class;

interface Naruto {

	void m2();   //
	default void m33() {
		System.out.println("geegye");
	}

	public static void kakashi() { // it is an Static method
		System.out.println("Sharingan");
	}

	public static  void m1() {        // it is an default method no need to override can access directly
		System.out.println("I am from Naruto");
	}		
}

class Boruto implements Naruto {

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}
    public void m1() {
		System.out.println("i am from boruto");

	}
    @Override
    public void m33()
    {
    	System.out.println("kashsha");
    }
    

}
public class CrossChecks extends Boruto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Naruto.kakashi();
		Boruto boru = new Boruto();
		Naruto.m1();
		boru.m1();
		boru.m2();
		boru.m33();
		boru.m33();
		

	}

}
