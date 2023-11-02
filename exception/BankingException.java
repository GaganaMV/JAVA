package exception;

import java.util.Scanner;

class MinBalanceException extends Exception
{	
//	String msg;
	public MinBalanceException(String msg)
	{
		super(msg);
//		this.msg=msg;
	}
	//@Override
//	public String toString() {
//		
//		return msg;
//	}
}
public class BankingException {
	static int balance=2000;

	public static void main(String[] args) throws MinBalanceException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		int amount=sc.nextInt();
		try {
			
		
		if(balance<amount)
		{
			throw new MinBalanceException("insufficient balance! your balance is: "+balance);
		}
		else
		{
			System.out.println("plz take money: "+amount);
		}
		}
		catch(MinBalanceException e)
		{
			System.out.println(e);
		}
	}

}
