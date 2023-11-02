package exception;

class Funds extends Exception{
	public Funds(String msg) {
		super(msg);
	}
	
	
}

public class InsufficientFunds extends Throwable{
	
	public String insufficientBlalance(int amount) throws Funds{
		int balance=10000;
		if(balance>amount) {
			return "Please collect the cash";
		}else {
			throw new Funds("insufficient Balence");
		}
		
	}

	public static void main(String[] args) throws Funds {
		InsufficientFunds i=new InsufficientFunds();
		String amount = i.insufficientBlalance(11000);
		System.out.println(amount);

	}

}
