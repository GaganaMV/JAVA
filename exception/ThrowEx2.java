package exception;

import java.util.Scanner;
class Valid extends Exception{
	public Valid(String msg) {
		super(msg);
	}
}

public class ThrowEx2 {
	
	public String ageMarks(int marks) throws Valid {
		if(marks>0 && marks<=100) {
			return "valid Marks";
		}else {
			throw new ArithmeticException("invalid marks");
		}
	}

	public static void main(String[] args) throws Valid {
		ThrowEx2 t=new ThrowEx2();
		String ageMarks = t.ageMarks(-9);
		System.out.println(ageMarks);
		

	}

}
