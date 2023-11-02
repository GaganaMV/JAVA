package oops.polymorphism;

public class ThisEx1 {
	int a,b,c;
	
	
	public void dispaly(int a, int b, int c) {
		System.out.println("A : "+ a);
		System.out.println("B : "+ b);
		System.out.println("C : "+ c);
	}
	
	public void setData(int a, int b,int c1) {
		this.dispaly(7, 8, 9);
		this.a=a;
		this.b=b;
		c=c1;
		System.out.println("A : "+ a);
		System.out.println("B : "+ b);
		System.out.println("C : "+ c);
		
	}

	public static void main(String[] args) {
		ThisEx1 t=new ThisEx1();
		t.setData(3, 7, 89);
		
		
		

	}

}
