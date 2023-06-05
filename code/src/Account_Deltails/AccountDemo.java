package Account_Deltails;
import java.util.*;
public class AccountDemo {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter account number: ");
		 String accountNumber = scanner.nextLine();

		 System.out.print("Enter account holder name: ");
		 String accountHolder = scanner.nextLine();

		 System.out.print("Enter initial balance: ");
		 double balance = scanner.nextDouble();
		 if(balance < 1000) {
			 System.out.print("error");
		 }
		 BankAccount account = new BankAccount(accountNumber, accountHolder, balance);
		 account.displayAccountDetails();
		 System.out.print("Enter withdrawal amount: ");
		 double withdrawalAmount = scanner.nextDouble();
		 account.withdraw(withdrawalAmount);

		 scanner.close();
		 }
		}
