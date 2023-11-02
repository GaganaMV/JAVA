package oops.inheritence;

class Student{
	String name="tanjuja";
	public void display() {
		System.out.println("Name :"+name);
	}
	
}

class Developer extends Student{
	String role="java developer";
	void displayRole() {
		System.out.println("Role is:"+role);
	}
	
}

public class Single{

	public static void main(String[] args) {
		Developer d= new Developer();
		d.display();
		d.displayRole();

	}

}
