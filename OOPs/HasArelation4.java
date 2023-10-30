package OOPs;

class Jadoo {
	private int phno;

	// getter and setter
	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}
}

class Tona {
	private int mono;
	private Jadoo jadoo;

	public int getMono() {
		return mono;
	}

	public void setMono(int mono) {
		this.mono = mono;
	}

	public Jadoo getJadoo() {
		return jadoo;
	}

	public void setJadoo(Jadoo jadoo) {
		this.jadoo = jadoo;
	}
}

public class HasArelation4 {

	public static void main(String[] args) {
		Tona tune = new Tona();
		tune.setMono(10);
		System.out.println(tune.getMono());
		Jadoo judu = new Jadoo();
		judu.setPhno(1422);
		System.out.println(judu.getPhno());

		System.out.println(tune.getJadoo().getPhno());

	}

}
