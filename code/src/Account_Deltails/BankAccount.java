package Account_Deltails;

	public class BankAccount {
		 private String accountNumber;
		 private String accountHolder;
		 private double balance;

		 public BankAccount(String accountNumber, String accountHolder, double balance) {
		 this.accountNumber = accountNumber;
		 this.accountHolder = accountHolder;
		 this.balance = balance;
		 }

		 public void displayAccountDetails() {
		 System.out.println("Account Number: " + accountNumber);
		 System.out.println("Account Holder: " + accountHolder);
		 System.out.println("Balance: " + balance);
		 }

		 public void withdraw(double amount) {
		 if (balance - amount < 1000) {
		 System.out.println("Error: Insufficient balance!");
		 } else {
		 balance -= amount;
		 System.out.println("Withdrawal successful. Updated balance: " + balance);
		 }
		 }
}

