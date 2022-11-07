package entities;

public class Company extends Persona{

	private int employeeNumber;
	
	public Company() {
	}

	public Company(String name, double income, int employeeNumber) {
		super(name, income);
		this.employeeNumber = employeeNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	@Override
	public double tax() {
		double tax = 0.0;
		if(getEmployeeNumber()>10.0) {
			tax = getIncome() * 0.14;
		} else {
			tax = getIncome() * 0.16;
		}
		return tax; 
	}
	
}
