package application;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static final double PI = 3.14159;		// termo final indica que PI � uma constante. nomenclatura da constante no JAVA: tudo maiusculo e separado por underline
	
	public static void main(String[] args) {		// membro est�tico � aquele que n�o precisa de objeto para serem chamados
													// n�o dependem de objeto, ent�o, n�o s�o instanciados, como fun��es matem�ticas como o Math.sqrt(double)
													// s�o chamados diretamente pelo nome da classe

		// Vers�o 1: m�todos na pr�pria classe do programa
		// Nota: dentro de um m�todo est�tico n�o se pode chamar membors de inst�ncia da mesma classe
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PPI value: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
	
	
		// Vers�o 2: classe Calculator com membros de inst�ncia     --> n�o far� sentido
		
		
		
		// Vers�o 3: classe Calculator com m�todo est�tico
		


}
