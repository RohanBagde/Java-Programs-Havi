package OOPs;

class Classmates {
	Classmates(int age, String name) {
		System.out.println(age + " " + name);
	}
}

class Mates extends Classmates {

	Mates() {
		super(10, "Rohan");
		System.out.println();

	}

}

public class SuperParametrized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mates ngo = new Mates();

	}

}
