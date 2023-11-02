package miniproject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AtmManagement {

	public static void main(String[] args) throws InterruptedException {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		int balance = 30000;

		int withdraw;

		int deposit;

		String accountno = "1234";

		String pinnumber = "0531";

		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		Thread.sleep(600);
		System.out.print(">>");
		Thread.sleep(600);
		System.out.print(">>");
		Thread.sleep(600);
		System.out.print(">>");
		Thread.sleep(600);
		System.out.print(">>");
		Thread.sleep(600);
		System.out.print(" WELCOME");
		Thread.sleep(600);
		System.out.print(" TO");
		Thread.sleep(600);
		System.out.print(" OUR");
		Thread.sleep(600);
		System.out.print(" ATM");
		Thread.sleep(600);
		System.out.print(" SERVICES");
		Thread.sleep(600);
		System.out.print(" <<");
		Thread.sleep(600);
		System.out.print("<<");
		Thread.sleep(600);
		System.out.print("<<");
		Thread.sleep(600);
		System.out.print("<<");
		Thread.sleep(600);
		System.out.println("<<");
		
		System.out.println("It allow users to perform self-service transactions and balance inquiries.");
		System.out.println();
		Thread.sleep(5000);
		System.out.println("Enter a Pin");

		String newpin = sc.next();

		if (pinnumber.equals(newpin)) {

			System.out.println("Login Successfully");

		} else {

			System.out.println("Incorrect PinNumber");

		}

		while (true) {
			System.out.println(" ______________________________________________________________________________ ");
			System.out.println("                                ATM MACHINE                                      ");
			System.out.println();
			System.out.println(" ******************************************************************************");
			System.out.println("       |-----------------------|"+       "           |-----------------------|");
			System.out.println("       |      1.withdraw       |           |       2.deposite      |");
			System.out.println("       |-----------------------|           |-----------------------|" );
			System.out.println();
			System.out.println("       |-----------------------|"+       "           |-----------------------|");
			System.out.println("       |   3.Balance Enquiry   |           |  4. Hepline Number    |");
			System.out.println("       |-----------------------|           |-----------------------|");
			System.out.println();
			System.out.println("       |-----------------------|"+       "           |-----------------------|");
			System.out.println("       |   5.Mini Statement    |           |  6. Exit              |");
			System.out.println("       |-----------------------|           |-----------------------|");
			
			
			System.out.println(" ______________________________________________________________________________");
			System.out.println();
			
			System.out.println(" Choose The Operation You Want To Perform");
			
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("  Enter the amount to withdraw");

				withdraw = sc.nextInt();

				if (withdraw >= balance) {

					System.out.println("   Amount is not sufficient to withdraw");

				}

				else {

					System.out.println("   Amount is sufficient");

					System.out.println("   Please Collect Your Money");

					System.out.println();

				}

				balance = balance - withdraw;

				break;

			case 2:

				System.out.println("   Select an Account Number to deposit");

				String deposite = sc.next();

				if (accountno.equals(deposite)) {

					System.out.println("   Account number is valid");
					System.out.println("   Enter a deposit amount");

					deposit = sc.nextInt();

					System.out.println("   Your amount is succesfully deposited");

					balance = balance + deposit;

					System.out.println();

				} else {
					System.out.println("   Account number is invalid");

				}

				System.out.println();

				break;

			case 3:

				System.out.println("   Enter a Account Number ");

				deposite = sc.next();

				if (accountno.equals(deposite)) {

					System.out.println("   Account number is valid");

					System.out.println("   Remaining Balance is:" + balance);

				}

				else {

					System.out.println("   Account number is invalid");

					System.out.println();

				}

				break;

			case 4:

				System.out.println("	For assistance, call our helpline at 123-456-7890.");

				System.out.println();

				break;
			case 5:
				System.out.println("___________________________________________________");
				System.out.println("|                  MINI SATEMENT                  |");
				System.out.println("|-------------------------------------------------|");
				System.out.println("|   "+" "+dt.format(now)+ "                          |");
				System.out.println("|    CARD NUMBER    : ********"+accountno+"                |");
				System.out.println("|    TRANSACTION    : MINI STATEMENT              |");
				System.out.println("|    AVAIL BAL      :Rs.   "+balance+"                  |");
				System.out.println("|    THANK YOU FOR BANKING WITH US....            |");
				System.out.println("|_________________________________________________|");

				break;	

			case 6:
				System.out.print(">>");
				Thread.sleep(500);
				System.out.print(">>");
				Thread.sleep(500);
				System.out.print(">>");
				Thread.sleep(500);
				System.out.print(">>");
				Thread.sleep(500);
				System.out.print(">>");
				Thread.sleep(500);
				System.out.print(">>");
				Thread.sleep(500);
				System.out.print(" THANK");
				Thread.sleep(500);
				System.out.print(" YOU");
				Thread.sleep(500);
				System.out.print(" FOR");
				Thread.sleep(500);
				System.out.print(" USING");
				Thread.sleep(500);
				System.out.print(" OUR");
				Thread.sleep(500);
				System.out.print(" SERVICES");
				Thread.sleep(500);
				System.out.print(" <<");
				Thread.sleep(500);
				System.out.print("<<");
				Thread.sleep(500);
				System.out.print("<<");
				Thread.sleep(500);
				System.out.print("<<");
				Thread.sleep(500);
				System.out.print("<<");
				Thread.sleep(500);
				System.out.print("<<");
				Thread.sleep(500);
				
				System.exit(0);

			}

		}

	}

}