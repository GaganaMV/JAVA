package oops.inheritence;

class Person{
	int id=1;
	String name ="tanuja";
	
	void display() {
		System.out.println("name of person with id:"+id+":"+name);
	}
	
}

class JavaDeveloper extends Person{
	String role="java Developer";
	void role() {
		System.out.println("roles and responsibility : "+ role);
		
	}
}



public class Single1 {

	public static void main(String[] args) {
		JavaDeveloper j=new JavaDeveloper();
		j.display();
		j.role();
		

	}

}
