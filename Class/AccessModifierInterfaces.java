package Abstarct.Interface.Class;

interface Access {   //interface Accesss
	int a = 20;

	void f1();

	public void f2();
}

class Season implements Access {

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("F1");
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("F2");
	}
}

public class AccessModifierInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access sce = new Season();
		sce.f1();
		sce.f2();
	}

}
