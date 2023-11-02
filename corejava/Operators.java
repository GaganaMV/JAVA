package corejava;

public class Operators {
	public static void main(String[] args) {
		
		//Unary operator
		int x=5;
		int y=6;
		System.out.println("Post increment :"+ x++);
		System.out.println("Pre increment :"+ ++x);
		System.out.println("Post decrement :"+ y--);
		System.out.println("pre Decrement :" + --y);
		
		int w=20;
		int z= ++w * 10 /w++ + ++w;
		System.out.println(z);
		
		int a=100;
		System.out.println(+~a);
		int b=-289;
		
		int i=10;
		int j= i++ + i++;
		System.out.println(j +"and"+ i);
		
		int c=19;
		System.out.println(c++);
		
		
	}

}
