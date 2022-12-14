package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;


	// Exemplo
			// Fazer um programa para ler as medidas dos lados de dois tri?ngulos X e Y (suponha medidas
			// v?lidas). Em seguida, mostrar o valor das ?reas dos dois tri?ngulos e dizer qual dos dois tri?ngulos
			// possui a maior ?rea.
			// A f?rmula para calcular a ?rea de um tri?ngulo a partir das medidas de seus lados a, b e c ? a
			// seguinte (f?rmula de Heron):
				
			// Resolu??o sem orienta??o a objetos	
			// Utiliza??o de diversas variaveis para representar os lados

		// Benef?cios de calcular a ?rea de um tri?ngulo por meio de um m?todo dentro da classe Triangle:
			// Reaproveitamento de c?digo: elimina c?digo repetido no programa principal
			// Delega??o de responsabilidade: concentrar metodos de natureza semelhante dentro de mesma classe

public class Program {

	public static void main(String[] args) {

		/*
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = ( xA + xB + xC ) / 2.0;
		double areaX = Math.sqrt(p * (p -xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p -yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);		
		System.out.printf("Triangle Y area: %.4f%n", areaY);
				
		if ( areaX > areaY ) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
*/
		

		// Resolu??o com orienta??o a objetos	
		// Utiliza??o de uma classe para definir o triangulo (com atributos, m?todos, construtores, polimorfismo, heren?a, etc)


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;						// uma ?nica vari?vel x, contendo 3 atributos, compactando as informa??es
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		/*												// c?lculo inclu?do na classe Triangle
		double p = ( x.a + x.b + x.c ) / 2.0;
		double areaX = Math.sqrt(p * (p -x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p -y.a) * (p - y.b) * (p - y.c));
		*/
		
														// Reformula??o para chamar a fun??o a partir do m?todo x
		double areaX = x.area();
		
		double areaY = y.area();
		
		
		System.out.printf("Triangle X area: %.4f%n", areaX);		
		System.out.printf("Triangle Y area: %.4f%n", areaY);
				
		if ( areaX > areaY ) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();

	// 	Classe: ? a defini??o do tipo
	//
	// 	Objeto: s?o inst?ncias da classe            // Instancia??o ? quando o x recebe new Triangle --> Instanciando aquele objeto
	//	
	//	Atributos: inst?ncias do objeto
		
	}

}
