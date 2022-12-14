import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Exerc?cio 1
		Fa?a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n?meros com uma
		mensagem explicativa, conforme exemplos.
		
			Scanner sc = new Scanner(System.in);
			
			int x, y, soma;
	
			x = sc.nextInt();
			y = sc.nextInt();
			soma = x + y;
					
			System.out.print("SOMA = " + soma);
			
			sc.close();
		*/
		
		/* Exerc?cio 2
		Fa?a um programa para ler o valor do raio de um c?rculo, e depois mostrar o valor da ?rea deste c?rculo com quatro
		casas decimais conforme exemplos
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			double r, A, pi = 3.14159;
		 	
		 	r = sc.nextDouble();
		 	A = pi * (Math.pow(r, 2));			// ou A = pi * r * r
		 	
		 	System.out.printf("A=%.4f%n", A);
		 
		*/
		
		/* Exerc?cio 3
		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen?a do produto
		de A e B pelo produto de C e D segundo a f?rmula: DIFERENCA = (A * B - C * D).
			Scanner sc = new Scanner(System.in);
			
			int A, B, C, D, Dif;
			
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();
			Dif = A * B - C * D;
			
			System.out.println("DIFEREN?A = " + Dif);
			
			sc.close();
		
		*/
		
		/* Exerc?cio 4
		Fazer um programa que leia o n?mero de um funcion?rio, seu n?mero de horas trabalhadas, o valor que recebe por
		hora e calcula o sal?rio desse funcion?rio. A seguir, mostre o n?mero e o sal?rio do funcion?rio, com duas casas
		decimais.
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int N;
			double H, V, salario;
			
			N = sc.nextInt();
			H = sc.nextDouble();
			V = sc.nextDouble();
			salario = H * V;
			
			System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", N, salario);
			
			sc.close();
			
		*/	
		
		/* Exercicio 5
		Fazer um programa para ler o c?digo de uma pe?a 1, o n?mero de pe?as 1, o valor unit?rio de cada pe?a 1, o
		c?digo de uma pe?a 2, o n?mero de pe?as 2 e o valor unit?rio de cada pe?a 2. Calcule e mostre o valor a ser pago
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		
			int C1, N1, C2, N2;
			double V1 , V2, Total;
			
			C1 = sc.nextInt();
			N1 = sc.nextInt();		
			V1 = sc.nextDouble();
			C2 = sc.nextInt();
			N2 = sc.nextInt();
			V2 = sc.nextDouble();	
			
			Total = N1 * V1 + N2 * V2;
			
			System.out.printf("VALOR A PAGAR: R$ %.2f", Total);
			
			sc.close();
			
		*/	
			
		/* Exerc?cio 6
		Fazer um programa que leia tr?s valores com ponto flutuante de dupla precis?o: A, B e C. Em seguida, calcule e
		mostre:
		a) a ?rea do tri?ngulo ret?ngulo que tem A por base e C por altura.
		b) a ?rea do c?rculo de raio C. (pi = 3.14159)
		c) a ?rea do trap?zio que tem A e B por bases e C por altura.
		d) a ?rea do quadrado que tem lado B.
		e) a ?rea do ret?ngulo que tem lados A e B. */

			Locale.setDefault(Locale.US);	
			Scanner sc = new Scanner(System.in);
			
			double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			triangulo = (a * c)/2;
			circulo = 3.14159 * Math.pow(c, 2);		// ou 3.14159 * c * c
			trapezio = ((a + b)/2) * c;
			quadrado = b * b;							// ou Math.pow(b, 2)
			retangulo = a * b;
			
			System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
			
			sc.close();
			
			
	}

}
