package exception;

import java.util.Scanner;

public class Balance {
	public static void main(String[] args) {
		int balance=500;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the amount");
		int amount = sc.nextInt();
		if(balance>amount) {
			System.out.println("please collect the cash");
			
			
		}else {
			try {
				throw new Insufficient();
				
			} catch (Insufficient e) {
				
				System.out.println("low Balance!");
				// TODO: handle exception
			}
		}
		
	}

}
