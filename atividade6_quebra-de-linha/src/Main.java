import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		String s1, s2, s3;
		
		// Para ler um texto at� a quebra de linha, vamos chamar o sc.nextLine()
		// Caso eu chamasse sc.next() seria considerada apenas a primeira palavra da linha, n�o ela toda
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
		*/
		
		// Quebra de linha pendente
		
		/*
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();       // Quando usamos um comando de leitura diferente do nextLina() e d� quebra de linha, 
		s1 = sc.nextLine();     // essa quebra fica pendente na entrada padr�o
		s2 = sc.nextLine();     // Assim, se usamos uma nextLine() a quebra pendente � absorvida pelo nextLin()
		s3 = sc.nextLine();		// nisso, ser� absorvido um comando vazio por esse nextLine()
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
		*/
		
		// Para corrigir a quest�o do nextLina(), acima, devemos incluir um comando nextLine() vazio
		// entre o comando n�o nextLine() e o nextLine() seguinte
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();     
		s2 = sc.nextLine();     
		s3 = sc.nextLine();		
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
		
	}
}
