package entities;

public class Individual extends Persona{

	private double HealthPay;
	
	public Individual() {
	}

	public Individual(String name, double income, double healthPay) {
		super(name, income);
		HealthPay = healthPay;
	}

	public double getHealthPay() {
		return HealthPay;
	}

	public void setHealthPay(double healthPay) {
		HealthPay = healthPay;
	}
	
	@Override
	public double tax() {
		//double tax = getIncome() < 20000.0 ? getIncome() * 0.15 : getIncome() * 0.25;			Expressão alternativa
		double tax = 0.0;
		if(getIncome()<20000.00) {
			tax = getIncome() * 0.15;
		} else {
				tax = getIncome() * 0.25;
		  }
		if(getHealthPay()>0) {
			tax -= getHealthPay() * 0.5;
		}
		return tax; 
	}
	
}
