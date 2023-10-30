package OOPs;

public class Encapsulation1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation1 encap = new Encapsulation1();
		encap.setA(10);
		System.out.println(encap.getA());
		encap.setStr("rohan");
		System.out.println(encap.getStr());
		encap.sleep();
		encap.wake();
	}

}
