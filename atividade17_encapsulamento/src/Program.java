import java.util.Locale;
import java.util.Scanner;

import entities.Product;
		
			// Encapsulamento � um princ�pio que consiste em esconder detalhes de implementa��o de uma classe, expondo apenas
			// opera��es seguras e que mantenham os objetos em um estado consistente
			// Comparar a um toca disco, que ter� exposto bot�es espec�ficos e esconder� circuitos e placas
		
			// Regra de ouro: o objeto deve sempre estar em um estado consistente, e a pr�pria classe deve garantir isso

			// Regra geral b�sica: 
			// - Um objeto N�O deve expor nenhum atributo (modificador de acesso private)
			// - Os atributos devem ser acessados por meio de m�todos get e set (Padr�o JavaBeans) - Convens�o de desenvolvimento, com algumas regras para padronizar
			
			// Padr�o de aplica��o de get e set no arquivo Product.java


		
public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();		
		
		System.out.println("Enter product data: ");		
		System.out.print("Name: ");
		String name = sc.nextLine();							
		System.out.print("Price: ");
		double price = sc.nextDouble();							
		//System.out.print("Quantity in stock: ");				// Dele��o do requerimento do valor 'quantity'
		//int quantity = sc.nextInt();							
		Product product = new Product(name, price);				// Chamando o construtor de dois argumentos apenas
		
		//product.name = "Computer";							// esse comando solicita altera��o da visibilidade do atributo name
		product.setName("Computer");							// com o m�todo setName � poss�vel alterar o valor do atributo name
	
		//System.out.println("Updated name: " + product.name); 	// Para que esse comando funcione, sem mudar a visibilidade do atributo name, � necess�rio criar o m�todo getName
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println("Quantity: " + product.getQuantity());
		
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		//quantity = sc.nextInt();								// necess�rio declarar 'int quantity' 
		int quantity = sc.nextInt();							
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
	
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();	
		
	}

}