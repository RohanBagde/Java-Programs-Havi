package OOPs;

class First {
	private int phno;
	private String name;

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Second {
	private int pincode;
	private String address;
	private First first1; // here i give classname as object

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public First getFirst1() {
		return first1;
	}

	public void setFirst1(First first1) {
		this.first1 = first1;
	}

}

public class HasRelation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Second s = new Second();
		s.setAddress("ngp");
		s.setPincode(121212);
		System.out.println(s.getAddress());
		System.out.println(s.getPincode());

		First f = new First();
		f.setName("Rohan");
		f.setPhno(20);

		System.out.println(s.getFirst1().getName());

	}

}
