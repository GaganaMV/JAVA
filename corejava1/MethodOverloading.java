package corejava1;

public class MethodOverloading {
	public void add() {
		int a=1;
		int b=3;
		int add=a+b;
		System.out.println(add);
	}
	public void add(int a,int b) {
		int add=a+b;
		System.out.println(add);
	}
	
	public void add(int a,int b,int c) {
		int add=a+b+c;
		System.out.println(add);
		
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(6, 6);
		m.add(4, 8, 7);
		
		
		
	}

}
