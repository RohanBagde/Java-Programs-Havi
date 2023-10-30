package OOPs;

class Vehical {
	public void Honda() {
		System.out.println("i am honda ");
	}
}

class Hospital extends Vehical {
	public void Hyundai() {
		System.out.println("i am Hyundai");
		super.Honda();
	}
}

public class SuperKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital ward = new Hospital();
		ward.Hyundai();
	}

}
