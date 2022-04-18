package entities;

public class Product {

	public String name;			// atributo do objeto
	public double price;
	public int quantity;
	
						// par�metro do m�todo
	public Product(String name, double price, int quantity) {			// executa no momento da instancia��o
		this.name = name;												// 'this.name' referencia o atributo do objeto
		this.price = price;												// 'name' referencia o par�metro (dentro do m�todo)
		this.quantity = quantity;
	}								
	
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
