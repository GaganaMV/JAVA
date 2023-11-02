package special;



import java.util.Scanner;
import java.util.function.Predicate;

public class Validator {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String userName;
		String password;
		
		Predicate<String> userNameValidate= (u)->u.equals("tanuja");
		Predicate<String> passwordValidate=(p)->p.equals("12345");
		
		System.out.println("enter username");
		userName = sc.next();
		System.out.println("enter Password");
		password = sc.next();
		if(userNameValidate.test(userName)&&passwordValidate.test(password)) {
			System.out.println("userName And Password is Valid");
		}else {
			System.out.println("invalid UserName and Password");
		}


		
		
		
	

	}

}
