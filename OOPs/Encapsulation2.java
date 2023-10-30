package OOPs;

public class Encapsulation2 {
	public static void main(String[] args) {

		Otomatsku oto = new Otomatsku();
		oto.setName("Aaja");
		oto.setPhno(353);
		System.out.println(oto.getName());
		System.out.println(oto.getPhno());

	}
}

class Otomatsku extends Encapsulation2 {

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