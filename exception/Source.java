package exception;

import java.util.Scanner;

class My extends Exception{
	public My(String msg) {
		super(msg);
	}
}

public class Source {
	
	public String checkName(String firstName,String lastName) throws My{
		String name=firstName+lastName;
		if(firstName.isEmpty() || lastName.isEmpty()) {
			throw new My("FirstName and lstName is empty");
		}else {
			return name;
			
		}
	}

	public static void main(String[] args) throws My {
		Scanner sc=new Scanner(System.in);
		String firstName=sc.nextLine();
		String lastName=sc.nextLine();
		Source s=new Source();
		String name = s.checkName(firstName, lastName);
		System.out.println(name);

	}

}
