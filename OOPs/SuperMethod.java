package OOPs;

class SuperMethod1 {
	SuperMethod1() {
		System.out.println("Superclass constructor");
	}
}

class LowerMethod extends SuperMethod1 {
	LowerMethod() {
		super();
		System.out.println("LowerClass constructor");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowerMethod srk = new LowerMethod();

	}

}
