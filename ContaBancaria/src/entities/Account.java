package entities;

public class Account {

	private int accountNumber;
	private String name;
	private double amount;
	
	public void deposit(double value) {
		amount += value;
	}
	
	public void withdraw(double value) {
		amount -= value + 5;
	}
	
	public Account(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public Account(int accountNumber, String name, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return "Account " 
				+ accountNumber 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ String.format("%.2f", amount);
	}
	
	
	
	
}
