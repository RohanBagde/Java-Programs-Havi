package Enumurations;

enum level {
	LOW, MEDIUM, HIGH
}

public class Enums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(level.HIGH); // type1
		level l = level.LOW; // type2
		level h=level.HIGH;
		level m=level.MEDIUM;
		System.out.println(l);
		switch (m) {
		case LOW:
			System.out.println("low level");
			break;
		case HIGH:
			System.out.println("high level");
			break;
		case MEDIUM:
			System.out.println("medium level");
			break;

		}

	}

}
