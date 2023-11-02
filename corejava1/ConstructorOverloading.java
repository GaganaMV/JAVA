package corejava1;

public class ConstructorOverloading {
	public ConstructorOverloading() {
		System.out.println("my name is tanuja");
	}
	
	ConstructorOverloading(int age,String name){
		this("manya");
		System.out.println(age);
		System.out.println(name);
		
		
	}
		
	ConstructorOverloading(int age){
		this();
		System.out.println(age);
	}
	
	ConstructorOverloading(String name){
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		ConstructorOverloading c=new ConstructorOverloading();
		ConstructorOverloading c1=new ConstructorOverloading(54,"tanuja");
		ConstructorOverloading c2=new ConstructorOverloading("sahana");
		ConstructorOverloading c3=new ConstructorOverloading(12);
		
		
	}
}
