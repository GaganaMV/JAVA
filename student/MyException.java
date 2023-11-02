package student;

class Source{
	public String checkAge(int age) throws MyException {
		if(age<15) {
			throw new MyException("invalid");
		}
		return "valid";
	}
}

public class MyException extends Exception{

	public MyException(String message) {
		super(message);
	}

	public static void main(String[] args) throws MyException {
		Source s1=new Source();
		System.out.println(s1.checkAge(16));

	}

}
