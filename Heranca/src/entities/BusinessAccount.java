package entities;

public class BusinessAccount extends Account{

	private double loanLimit;
	
	public BusinessAccount() {
		super();			//super(); trata-se da chamada do construtor da superclasse, aquela à qual extendemos esse atual
	}

	public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);			//Chamada do construtor da classe Account
		this.loanLimit = loanLimit;
	}

	public BusinessAccount(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	
}
