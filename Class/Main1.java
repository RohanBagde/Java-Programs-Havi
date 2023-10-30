package Abstarct.Interface.Class;

class Asd {
	public void man() {
		System.out.println("Man company");

	}

}

interface Bsd {
	void beta();

	public int a = 10;
}
interface Fsd{
	
}

class Csd extends Asd implements Bsd, Fsd{ // here we can extend and implements at same time
										// but first we need to extend then implement

	@Override
	public void beta() {

	}

}

//interface Dsd extends Bsd,Csd{}   // Here we cannot extend two Classes
interface Dsd {
	int s = 1245;

}
class Hsd implements Fsd,Dsd{
	
}
interface Esd extends Bsd,Dsd{} // an interface can extends two interfaces
//interface Gsd extends Csd{} //we cannot extend  one class and one interface for interface


//interface Isd extends Asd{}   //interface cannot extend class
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
