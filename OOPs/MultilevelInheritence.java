package OOPs;

class Sachin {
	void cricket(String A) {
		String name = "Sachin";
		int match = 456;
		int runs = 12000;
		int age = 50;
		double avg = (match * runs) / age;
		System.out.println(" average of  " + name + " is " + avg);
	}
}

class Sehwagh extends Sachin {
	void cricket(String B) {
		String name = "Sehwagh";
		int match = 400;
		int runs = 8111;
		int age = 60;
		double avg = (match * runs) / age;
		System.out.println(" average of  " + name + " is " + avg);

	}
}

class Dhoni extends Sehwagh {
	void cricket(String C) {
		String name = "Dhoni";
		int match = 308;
		int runs = 9546;
		int age = 52;
		double avg = (match * runs) / age;
		System.out.println(" average of  " + name + " is " + avg);
	}
}

public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dhoni obj = new Dhoni();
		obj.cricket("hookage");
		Sehwagh obj1 = new Sehwagh();
		obj1.cricket("Sehwagh");
		Sachin obj2 = new Sachin();
		obj2.cricket("hshsj");
	}

}
