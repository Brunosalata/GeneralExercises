import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Express?es Comparativas
		//
		// 	Operadores
		// 	<  		menor
		// 	>  		maior
		// 	<=  	menor igual
		// 	>=  	maior igual
		// 	==  	igual
		// 	!=  	diferente
		 
		// Express?es l?gicas
		// 
		//  && 		'E'		Tabela verdade do operador 'E'		
		// 
		// 						A  B  A&&B
		// 						F  F   F
		// 						F  V   F  
		// 						V  F   F
		//  					V  V   V
		// 
		//  || 		'OU' 	Tabela verdade do operador 'OU'
		// 
		// 	(alt + 124)			A  B  A||B
		// 						F  F   F
		// 						F  V   V  
		// 						V  F   V
		//  					V  V   V		// 
		// 
		//  !( )	'N?O'	Tabela verdade do operador 'N?O'
		// 
		// 						A   !A
		// 						F   V
		// 						V   F 

		// Estrutura Condicional
		// 
		// Sintaxe da estrutura condicional
		// 
		// 	- Simples      (se a condi??o for verdadeira, o comando ? lido, sen?o, o bloco ? ignorado
		// 		
		// 		if ( <condicao 1> ) {
		// 			 <comando 1>
		// 			 <comando 2>
		// 		}
		// 		
		//   * Exemplo
		//		int x = 5;
		//			
		//			if (x > 0) {
		//				System.out.println("Bom dia");
		//			}
		//						
		//			if (x < 0) {
		//				System.out.println("Boa tarde");
		//			}
		//			
		//			if (x == 0) {
		//				System.out.println("Boa noite");
		//			}
		//	
		//  - Composta	(Condi??o verdadeira executa o bloco if, condi??o falsa executa bloco else)
		// 		
		// 		if ( <condicao 1> ) {
		// 			 <comando 1>
		// 			 <comando 2>
		// 		}
		// 		else {
		// 			 <comando3>
		// 			 <comando4>
		// 		}
		// 		
		//   * Exemplo
		//		
		//			Scanner sc = new Scanner(System.in);
		//			int hora;
		//
		//			System.out.println("Quantas horas?");
		//			hora = sc.nextInt();
		//			
		//			If (hora < 12) {
		//				System.out.println("Bom dia";)
		//			}
		//			else {
		//				System.out.println("Boa tarde");
		//			}
		//			
		//			sc.close();	
		// 		
		// 		
		// 	- Estrutura composta encadeada	(Caso haja mais de apenas duas condi??es)
		// 		
		// 		if ( <condicao 1> ) {
		// 			 <comando 1>
		// 			 <comando 2>
		// 		}
		// 		else {
		// 			if ( <condicao 1> ) {
		// 			 <comando 1>
		// 			 <comando 2>
		// 			}
		// 			else {
		// 			 <comando3>
		// 			 <comando4>
		// 			}
		//		{
		//		
		//   * Exemplo
		//		
		//			Scanner sc = new Scanner(System.in);
		//			int hora;
		//
		//			System.out.println("Quantas horas?");
		//			hora = sc.nextInt();
		//			
		//			if (hora < 12) {
		//				System.out.println("Bom dia");
		//			}
		//			else {
		//				if (hora < 18) {
		//					System.out.println("Boa tarde");
		//			}
		//				else {
		//					System.out.println("Boa noite");
		//				}
		//			}
		//			sc.close();	
		// 		
		// 	Obs: Para deixar melhor apresent?vel, podemos escrever esse encadeamento da seguinte forma:	
		// 		
		// 		if ( condi??o 1 ) {
		// 			  comando 1
		// 			  comando 2
		// 		}
		// 		else if ( condi??o 2 ) {
		// 			  comando 3
		// 			  comando 4
		// 		}
		// 		else if ( condi??o 3 ) {
		// 			  comando 5
		// 			  comando 6
		// 		}
		// 		else {
		// 			  comando 7
		// 			  comando 8
		// 		}	
		// 		

	}

}
