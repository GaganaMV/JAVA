package exception;
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
	
}
public class InvalidAgeExample {
    public String checkAge(int age) throws MyException {
    	if(age>18) {
    		return "valid age";
    	}else {
    		throw new MyException("invalid age");
    	}
    	
    }
	public static void main(String[] args)  {
		InvalidAgeExample i=new InvalidAgeExample();
		try {
			String s=i.checkAge(24);
			System.out.println(s);
			
		} catch (MyException e) {
			System.out.println(e);
			
		}
		

	}

}
