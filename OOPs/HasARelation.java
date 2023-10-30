package OOPs;

public class HasARelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User use = new User();
		use.setEmail("rohan@gmai.com");
		use.setPhno(77444745);
		use.setUname("Rohan");
		Adress addr = new Adress();
		addr.setCity("ngp");
		addr.setLandmark("hospital");
		addr.setPincode(441102);
		addr.setState("maharashtra");
		// getting values
		System.out.println(use.getUname());
		use.setAddress(addr);
		System.out.println(use.getAddress().getPincode());
	}

}

class User {
	private String uname;
	private int phno;
	private String email;
	private Adress adres;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adress getAddress() {
		return adres;
	}

	public void setAddress(Adress address) {
		this.adres = address;
	}
}

class Adress {
	private String state;
	private String city;
	private String landmark;
	private int pincode;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
