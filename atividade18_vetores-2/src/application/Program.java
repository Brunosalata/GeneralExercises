package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];						// vetor tipo refer�ncia
																// cria um vetor com espa�os "null" por padr�o (ponteiros vazios)
		for (int i=0; i<vect.length; i++) {								// no stack, vect aponta o vetor na Heap. 
			sc.nextLine();										// Para armazenar um produto em cada posi��o do vetor, devemos instanciar um produto
			String name = sc.nextLine();						// e fazer a posi��o apontar para esse objeto ("TV", 900.00)
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
																// Para evitar criar depend�ncia de uma vari�vel n�o atrelada ao vetor, o ideal � 
		double sum = 0.0;										// utilizar 'vect.length', que � o n�mero de posi��es que o vetor possui
																// em vez de utilizar i < n, usar i < vect.length
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);
		
		
		sc.close();

	}

}
