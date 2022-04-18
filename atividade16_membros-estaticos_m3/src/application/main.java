package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class main {

	// Quando falamos de dois triangulos, X e Y, cada um tem seus pr�prios lados (X - A, B e C / Y - D, E e F)
	// fun��o �rea = x.area() retornar� um valor diferente para cada tri�ngulo, ent�o essa � uma opera��o de inst�ncia de objeto
	
	// No caso da Calculator, os valores dos c�lculos n�o mudam para calculadoras diferentes, s�o c�lculos est�ticos
	// Calculator calc1 = new Calculator();
	// Calculator calc2 = new Calculator();
	// sendo PI = 3.14 e PI � est�tico, calc1.PI e calc2.PI retornar�o 3.14
	// o mesmo se aplica a calc1.circumference(3.0) e calc2.circumference(3.0) retornar�o 18.85, independente do objeto (calc1 ou calc2)
	
	// Como PI e os m�todos n�o dependem do objeto (c�lculo de volume, valor de PI, c�lculo de �rea, etc), vamos torn�-los est�ticos
	

	public static void main(String[] args) {
		
			// Vers�o 3: classe Calculator com m�todo est�tico

			Locale.setDefault(Locale.US);						// Uma vez que os m�todos e vari�veis s�o est�ticos na classe Calculator
			Scanner sc = new Scanner(System.in);				// n�o � necess�rio instanciar Calculator. Chamaremos as fun��es diretamente
			// Calculator calc = new Calculator();				// inclus�o do nome da classe + a fun��o ou vari�vel desejada

			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();

			// double c = calc.circumference(radius);
			double c = Calculator.circumference(radius);

			// double v = calc.volume(radius);
			double v = Calculator.volume(radius);
			
			System.out.printf("Circumference: %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("PPI value: %.2f%n", Calculator.PI);

			sc.close();
	}

}

