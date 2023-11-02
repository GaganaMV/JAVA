package programming;

public class ArmstrongNum {
	public static void main(String[] args) {
		//Armstrong number 
				//153=1^3+5^3+3^3
				   //=1+125+27
				   //=153
		int num=153;
		double sum=0;
		int rem=0;
		int temp=num;
		
		while(temp!=0) {
			rem=temp%10;
			sum=sum+Math.pow(rem, 3);
			temp=temp/10;
			
		}if (sum==num) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not a armstrong");
		}
		
	}

}
