import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			// Fun??o apresenta erro, pois precisa importar a biblioteca java.util.Scanner
				
		// Para receber uma palavra do teclado (sem espa?o)
		
		/* 
		
		String x;
		x = sc.next();
		// isso permite que eu digite uma palavra e ela seja armazenada na vari?vel 'x'
		System.out.println("Voce digitou: " + x);
		sc.close();
		
		*/
		/*
		
		// Para receber um n?mero inteiro
		int y;
		y = sc.nextInt();
		System.out.println("Voc? digitou: " + y);
		sc.close();
		
		*/
		/*

		// Para receber um n?mero com ponto flutuante
		double z;
		z = sc.nextDouble();
		System.out.println("Voc? digitou: " + z);
		sc.close();
		
		*/
		/*
		 
		// Para receber um caractere
		char w;
		w = sc.next().charAt(1);
		System.out.println("Voc? digitou: " + w);
		sc.close();
		
		//charAt(posi??o do caracter na informa??o de entrada
		
		*/
		
		// Para ler v?rios dados na mesma linha
		String a;
		int b;
		double c;
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
		// Digitei: Maria 30 4,5    nessa ordem e com espa?o, sem v?rgula
		
		
	}

}
