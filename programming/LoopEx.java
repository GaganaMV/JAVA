package programming;

public class LoopEx {
	public static void main(String[] args) {
		
		int num=356,temp=num;
		int rem=0;
		int sum=0;
		
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			System.out.println(rem);
			}
		System.out.println(sum);
		
		//reverse number
		int rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}if(rev==temp) {
			System.out.println("palindrome number");
		}else {
			System.out.println("Not a palindrome");
		}
		
		System.out.println(rev);
		
		
		
	
}
	

}
