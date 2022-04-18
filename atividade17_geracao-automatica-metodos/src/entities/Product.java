package entities;

public class Product {

	private String name;			// encapsulamento dos atributos 'private'
	private double price;
	private int quantity;
	
	// Cria��o autom�tica de construtores, getters e setters no eclipse
	// Dele��o dos m�todos construtores, setters e getters anteriormente criados
	
	// Bot�o direito >> Source >> Generate Constructor using Fields
	
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// Bot�o direito >> Source >> Generate 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	// M�todos anteriormente criados
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {		// chamando println(product) no main, automaticamente � chamado o toString()
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", "
				+ quantity
				+ " units. Total: $ "
				+ String.format("%.2f", totalValueInStock());
				
	}
}