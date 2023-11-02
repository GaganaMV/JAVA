package exception;

public class NumberFormatEx {

	public static void main(String[] args) {
		try {
			String s="tanuja";
			int val=Integer.parseInt(s);
			System.out.println(val);
			
			int c=10/0;
			
			
			System.out.println(c);
			
		}catch(NumberFormatException n) {
			System.out.println(n);
		}catch(Exception a) {
			System.out.println(a);
		}
	}

}
