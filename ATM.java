package codsoft;
import java.util.*;
class BankAccount {
	 private double balance;
	 public BankAccount(double initialBalance) {
	 this.balance = initialBalance;
	 }
	 public void deposit(double amount) {
	 balance += amount;
	 System.out.println("Deposited: $" + amount);
	 }
	 public void withdraw(double amount) {
	 if (amount > balance) {
	 System.out.println("Insufficient balance.");
	 } else {
	 balance -= amount;
	 System.out.println("Withdrawn: $" + amount);
	 }
	 }
	 public void checkBalance() {
	 System.out.println("Current Balance: $" + balance);
	 }
	}
public class ATM {
		 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 BankAccount account = new BankAccount(1000);
		 while (true) {
		 System.out.println("\nATM Options:");
		 System.out.println("1. Deposit");
		 System.out.println("2. Withdraw");
		 System.out.println("3. Check Balance");
		 System.out.println("4. Exit");
		 System.out.print("Choose an option: ");
		 int choice = scanner.nextInt();
		 switch (choice) {
		 case 1:
		 System.out.print("Enter amount to deposit: ");
		 double deposit = scanner.nextDouble();
		 account.deposit(deposit);
		 break;
		 case 2:
		 System.out.print("Enter amount to withdraw: ");
		 double withdraw = scanner.nextDouble();
		 account.withdraw(withdraw);
		 break;
		 case 3:
		 account.checkBalance();
		 break;
		 case 4:
		 System.out.println("Thank you for using the ATM.");
		 return;
		 default:
		 System.out.println("Invalid option.");
		 }
	}
	}
}

