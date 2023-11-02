package accessSpecifier;
//if i declare constructor,method,class as a private we cannot access outside class
//if i declare constructor,method,class as a default we can access outside class but within same package
class Demo{
	int c=2;
	/*Demo(int a) {
		c=a;
	}*/
	public Demo(int a) {
		// TODO Auto-generated constructor stub
		c=a;
		System.out.println(c);
	}
	void display() {
		int b=28;
		System.out.println(b);
	}
}

public class PrivateEx {
	private int a;
	private int b=1;
	
	public void test() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		PrivateEx p=new PrivateEx();
		Demo d=new Demo(10);
		d.display();
		System.out.println(d.c);
		p.a=10;
		

	}

	

}
