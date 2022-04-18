package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class main {

	public static void main(String[] args) { 					// membro est�tico � aquele que n�o precisa de objeto para serem chamados
																// n�o dependem de objeto, ent�o, n�o s�o instanciados, como fun��es matem�ticas
																// como o Math.sqrt(double)
																// s�o chamados diretamente pelo nome da classe

		// Vers�o 2: classe Calculator com membros de inst�ncia 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circumference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PPI value: %.2f%n", calc.PI);

		sc.close();
	}

}
