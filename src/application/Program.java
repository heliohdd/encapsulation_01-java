package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		String number = scanner.nextLine();
		System.out.print("Enter account holder: ");
		String holder = scanner.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = scanner.next().charAt(0);

		if(response == 'y'){
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = scanner.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = scanner.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = scanner.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		scanner.close();
	}
}