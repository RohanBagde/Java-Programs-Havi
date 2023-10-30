package Abstarct.Interface.Class;

interface Client {
	void webDesign(); // method in interface are by default abstract + public

	void webDevlope();
}

abstract class Ntt implements Client {

	@Override
	public void webDesign() {
		System.out.println(" HTML,CSS,JAVASCRIPT");
	}
}

class Data extends Ntt {

	@Override
	public void webDevlope() {
		System.out.println(" Java,Python");
	}
}
public class InterAbstMain {

	public static void main(String[] args) {
		Data as=new Data();
		as.webDesign();
		as.webDevlope();
	}
}
