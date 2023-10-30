package OOPs;

class Animal {
	String animalColor = "White";

}

class Dog extends Animal {
	String animalColor = "Black";

	public void printColor() {
		System.out.println(animalColor);
		System.out.println(super.animalColor); // using super keyword we can directly call to parent class data member
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog g = new Dog();
		g.printColor();
	}

}
