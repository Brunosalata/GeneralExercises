package entities;

public class Funcionarios {

	private int id;
	private String name;
	private double salary;
	
	// Método de promoção salarial
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100; 
	}
	
	// Construtores
	
	
	public Funcionarios() {
	}
	
	public Funcionarios(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return    id 
				+ ", " 
				+ name 
				+ ", " 
				+ String.format("%.2f", salary);
	}
	
	

}
