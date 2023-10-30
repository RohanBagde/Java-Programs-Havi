package OOPs;

interface Customer {
	int amt = 5; // public + static + final

	void purchase(); // abstract+ public
}

class Seller implements Customer {
	@Override
	public void purchase() {
		// amt=7 //can't change value it is final
		System.out.println(amt);
	}
}

public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cst = new Seller();
		cst.purchase();
		System.out.println(Customer.amt);// it proves it is static variable
	}

}
