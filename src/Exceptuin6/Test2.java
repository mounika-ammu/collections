package Exceptuin6;

class InvalidageException extends RuntimeException {
	public InvalidageException(String message) {
		super(message);
	}
}

public class Test2 {
	public static void validate(int age) throws InvalidageException {
		if (age < 18) {
			throw new InvalidageException(" age is less than 18");
		}

		else {
			System.out.println("age is greater than 18");
		}
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
