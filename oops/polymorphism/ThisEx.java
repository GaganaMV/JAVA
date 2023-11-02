package oops.polymorphism;

public class ThisEx {
	public ThisEx() {
		System.out.println("hello");
	}
	
	public ThisEx(int a, int b) {
		this();
		System.out.println("my name is Tanuja");
	}
	
	
	public ThisEx(String name, int age) {
		this(12,34);
		System.out.println(name +" "+age);
	}
	
	public ThisEx(String name) {
		this("sahana",12);
		System.out.println(name);
	}
	
	public ThisEx(String name,String city) {
		this("tanuja");
		System.out.println(name+" from "+ city);
	}

	public static void main(String[] args) {
		ThisEx t=new ThisEx("tanuja","honavara");

	}

}
