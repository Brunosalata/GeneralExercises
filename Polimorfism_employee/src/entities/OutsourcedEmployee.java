package entities;

public class OutsourcedEmployee extends Employee{

	private Double addValue;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double addValue) {
		super(name, hour, valuePerHour);
		this.addValue = addValue;
	}

	public Double getAddValue() {
		return addValue;
	}

	public void setAddValue(Double addValue) {
		this.addValue = addValue;
	}
	
	@Override
	public double payment() {
		return super.payment() + addValue * 1.1;
	}
	
	@Override
	public String toString () {
		return name + " - $" + payment();
	}
}
