package OOPs;

public class Encapsulation1 {
	private int a;
	private String str;

	public void sleep() {
		System.out.println("sleeping");
	}

	public void wake() {
		System.out.println("wake up");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
