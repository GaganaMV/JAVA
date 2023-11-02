package exception;

class InvalidAgeExamples extends Exception {
	public InvalidAgeExamples(String msg) {
		super(msg);
	}

}

public class Ex {
	public String checkAge(int age) throws InvalidAgeExamples {
		if (age > 18) {
			return "valid age";
		} else {
			throw new InvalidAgeExamples("invalid age");
		}

	}

	public static void main(String[] args) {
		Ex i = new Ex();
		try {
			String s = i.checkAge(24);
			System.out.println(s);

		} catch (InvalidAgeExamples e) {
			System.out.println(e);

		}

	}

}
