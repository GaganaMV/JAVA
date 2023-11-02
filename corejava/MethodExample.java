package corejava;

public class MethodExample {
	public static void main(String[] args) {
		MethodExample method = new MethodExample();
		method.add(32, 43, 10);
		int multiple = method.multiple(4, 5);
		System.out.println("Multiplication of two numbers:"+multiple);
		System.out.println("Divide two numbers :"+method.divide(76, 5));
		System.out.println("Print Name:"+ MethodExample.name("tanuja"));
		System.out.println(method.displayName("tanuja vaidya"));
		
		
	}
	
	//void method
	public void add(int a, int b, int c) {
		int add =a+b+c;
		System.out.println("addition of  three numbers :"+add);
		
	}
	
	//not a void method
	public int multiple(int d, int e) {
		int mul=d*e;
		return mul;
		
	} 
	
	//not a void method
	public int divide(int a, int b) {
		return a/b;
	}
	
	//Not a void method, return type is string
	public static String name(String nm) {
		return "Hello "+ nm;
	}
	
	public String displayName(String nam) {
		return "Hello My name is :"+nam;
	}
	
	
	
	
	

}
