package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account Holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char confirm = sc.next().charAt(0);

		if(confirm == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, name, initialDeposit);
		} else {
			account = new Account(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit amount: ");
		account.deposit(sc.nextDouble());
		System.out.println(account);	
		
		System.out.println();
		System.out.print("Enter a withdraw amount:");
		account.withdraw(sc.nextDouble());
		System.out.println(account);
		
		
		sc.close();
	}

}
