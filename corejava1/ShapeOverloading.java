package corejava1;

public class ShapeOverloading {

	public static void main(String[] args) {
		/*int x=2;
		x +=1;
		x *=2;
		x -=2;
		System.out.println(x);*/
		
		int x = 3;
		do {
		x *= x; 
		} while(x<5);
		System.out.println(x);
		
		for (int i = 2; i < 10; i = i*i) {
			  System.out.println(i);
			}

	}
	
	

}
