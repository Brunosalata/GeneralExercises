package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Product;
		
			// Sobrecarga � um recurso que uma classe possui de oferecer mais de uma opera��o com o mesmo nome, por�m com diferentes listas de par�metros
		
			// Proposta de melhoria:
			// - Criar um ocnstrutor opcional, o qual recebe apenas o nome e o pre�o do produto
			// - A quantidade em estoque deste novo produto, por padr�o, dever� ent�o ser iniciada com o valor zero

			// Nota: � poss�vel tamb�m incluir um construtor padr�o
		
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