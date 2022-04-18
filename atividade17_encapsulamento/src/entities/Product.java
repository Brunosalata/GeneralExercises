package entities;

public class Product {

/*			Padr�o de implementa��o de getters e setters
	
				private String name;
				private double price;
				
				public String getName() {							// get - m�todo para obter o nome retorna o atributo
					return name;									// simplesmente puxa o valor do atributo
				}
				
				public void setName(String name) {					// set - m�todo usado para alterar o valor do atributo
					this.name = name;								// para isso, ele recebe um valor diferente, mas n�o retorna nada
				}
				
				public double getPrice() {
					return price;
				}
			
				public void setPrice(double price) {
					this.price = price;
				}
*/
	
	
	private String name;			// encapsulamento dos atributos 'private'
	private double price;
	private int quantity;
	
	public Product() {													// construtor padr�o, para chamar os diferentes construtores sobrecarga
	}																	// 'Product p = new Product();' no Program. N�o resulta conflito
	
	
						// par�metro do m�todo
	public Product(String name, double price, int quantity) {			// executa no momento da instancia��o
		this.name = name;												// 'this.name' referencia o atributo do objeto
		this.price = price;												// 'name' referencia o par�metro (dentro do m�todo)
		this.quantity = quantity;
	}								
	
	// Copiando o construtor acima para que haja sobrecarga no de baixo
	
	public Product(String name, double price) {						
		this.name = name;											
		this.price = price;											
		quantity = 0;											
	}																
	
	
	// Por convens�o, devemos inserir os m�todos get e set ap�s os construtores
	
	public void setName(String name) {
		this.name = name;							// m�todo set que recebe um String name como argumento e joga dentro do
	}												// atributo name (this.name) o name recebido como argumento (name)
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
		
	public int getQuantity() {
		return quantity;
	}
	
	//public void setQuantity (int quantity) {		// Esse m�todo n�o ser� implementado, pois a altera��o na quantidade somente
	//	this.price = price;							// ser� alterada mediante adi��o ou remo��o de quantidades do estoque
	//}												// e esses m�todos j� foram criados. Assim, � poss�vel proteger a informa��o 
													// para que sempre esteja em uma condi��o consistente
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
