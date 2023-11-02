package oops.inheritence;

class ComputerScience{
	String c="Computer Science";
	ComputerScience(String c){
		System.out.println("Computer scince and engineering");
	}
	
	
}

class Subject extends ComputerScience{
	Subject(String c){
		super(c);
		this.c=c;
		System.out.println("subject");
	}
	
}


class Javaprogramming extends Subject{
	Javaprogramming(String c){
		super(c);
		this.c=c;
		System.out.println("Java");
	}
	
	
}
public class Multilevel1 {

	public static void main(String[] args) {
		Javaprogramming j=new Javaprogramming("computer science");

	}

}
