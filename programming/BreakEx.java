package programming;

public class BreakEx {
	public static void main(String[] args) {
		System.out.println("break example");
		int i=0;
		while(i<5) {
			if(i==2) {
				break;
			}
			i++;
			System.out.println(i);
		}
		
		System.out.println("continue statement");
		int j=0;
		while(j<5) {
			if(j==2) {
				continue;
				
			}
			
			j++;
			System.out.println(j);
		}
	}

}
