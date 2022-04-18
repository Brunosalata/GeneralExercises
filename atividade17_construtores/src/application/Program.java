package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Product;
		
			// Construtores: opera��o especial da classe que executa no momento de instancia��o do objeto
			// No momento do comando 'new'
			// Usado para iniciar valores dos atributos, al�m de obrigar ou permitir que o objeto receba dados ou 
			// depend�ncias no momento de sua instancia��o
			
			// Se uma classe customizado n�o for especificado, a classe disponibiliza um construtor padr�o:
			// Product p = new Product();
			
			// � poss�vel especificar mais de um construtor na mesma classe (sobrecarga)
		
		
public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product();				// com isso, instanciamos product com atributos "vazios" (name: null ; price e quantity: 0.0)
														// Podemos exigir que o programador inicie a instancia��o com os atributos j� definidos
														// Para isso, criamos um construtor que receba os argumentos em Product.java e
														// invertemos a ordem de solicita��o dos dados no programa principal
														// Primeiro recebemos os valores para depois instanciarmos
									
		System.out.println("Enter product data: ");		
		System.out.print("Name: ");
		//product.name = sc.nextLine();
		String name = sc.nextLine();							// vari�vel tempor�ria auxiliar para receber name
		System.out.print("Price: ");
		//product.price = sc.nextDouble();
		double price = sc.nextDouble();							// vari�vel tempor�ria auxiliar para receber price
		System.out.print("Quantity in stock: ");
		//product.quantity = sc.nextInt();
		int quantity = sc.nextInt();							// vari�vel tempor�ria auxiliar para receber quantity
		Product product = new Product(name, price, quantity);	// Realoca��o da instancia��o de Product
		
		
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		//int quantity = sc.nextInt();							// n�o aceita a declara��o int do atributo (deve apenas ser removido)
		quantity = sc.nextInt();								// nova configura��o
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