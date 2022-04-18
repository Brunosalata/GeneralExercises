
public class Main {

	public static void main(String[] args) {
		
		/*Comando de atribui��o
		  
		 	Sintaxe:
			<vari�vel> = <express�o>;
		 */

	// Exemplo 1
		int x, y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
	// Exemplo 2
		int w;
		double z;
		w = 5;
		z = 2 * w;
		
		System.out.println(w);
		System.out.println(z);
		
	// Exemplo 3
						
		double b1, B1, h1, area1;
		b1 = 6.0;
		B1 = 8.0;
		h1 = 5.0;
		area1 = (b1 + B1) / 2.0 * h1;
		
		System.out.println(area1);
		
		//Sempre indique o tipo do n�mero, se a express�o for de ponto flutuante (n�o inteira).
				//Para double use: .0		Para float use:f
		
		float b2, B2, h2, area2;
		b2 = 6f;
		B2 = 8f;
		h2 = 5f;
		area2 = (b2 + B2) / 2f * h2;
		System.out.println(area2);
		
	// Exemplo 4
		
		int c, d;
		double resultado;
		c = 5;
		d = 2;
		resultado = c / d;
		
		System.out.println(resultado);
		
		// O resultado � um n�mero inteiro porque c e d foram definidas como inteiros
		// Para resolver isso, devemos considerar vari�veis de origem como double
		
		/* Possibilidades
		 
		 int a, b;
			double resultado;
			a = 5;
			b = 2;
			resultado = (double) a / b;
			
			System.out.println(resultado);

		 A inclus�o do (double) � denominada casting, que � a convers�o expl�cita dos valores
		 
		 */
		
	// Exemplo 5
		// Outra situa��o na qual usamos o casting � quando o  compilador considera perda de informa��o com o processo
		
		/*
		double n1;
		int o1;
		n1 = 5.0;
		o1 = n1;
		
		System.out.println(o1);
		
		Compilador apresenta erro, pois n�o � poss�vel converter uma vari�vel double em int
		a n�o ser que a gente indique explicitamente que as casa sdecimais n�o s�o relevantes.
		Fazemos isso inserindo (int) logo antes da vari�vel em quenst�o, da seguinte forma: */
		
		double n2;
		int o2;
		n2 = 5.0;
		o2 = (int) n2;
		
		System.out.println(o2);
		
		
	}

}
