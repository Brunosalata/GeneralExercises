package entities;

public abstract class Persona {

	private String name;
	protected double income;
	
	public Persona() {
	}
	
	public Persona(String name, double income) {
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double renda) {
		this.income = renda;
	}

	public abstract double tax();
	
}
