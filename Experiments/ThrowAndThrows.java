package Experiments;

public class ThrowAndThrows {
	static int NumberSquare(int i) {
		if (i < 0) {
			throw new ArithmeticException();

		}

		return i * i;

	}

	public static void main(String[] args) {
		// throw example
		NumberSquare(-1);

	}

}
