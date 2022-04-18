
public class Teoria {

/*	Deslocamento de mem�ria - garbage collector e escopo local
  
 		Garbage Collector (deslocamento por garbage collector)
 		
 		- � um processo que automatiza o gerenciamento de mem�ria (do Heap) de um programa em execu��o
		- Monitora os objetos alocados dinamicamente pelo programa (no Heap), deslocando aqueles que n�o est�o mais sendo utilizados
	
				Product p1, p2;
				
				p1 = new Product("TV", 900.00, 0);						// no stack, p1 aponta endere�o do Heap
				
				p2 = new Product("Mouse", 30.00, 0);					// no stack, p1 aponta endere�o do Heap
	
				p1 = p2;												// p1 passa a apontar para o endere�o de p2, deixando os espa�os iniciais de p1 (na heap)
																		// sem uma refer�ncia. Eles ser�o liberados pela garbage collector em pouco tempo, liberando a mem�ria
	
		Desaloca��o por escopo
	
			ex1:	void method1() {									// dentro de stack, um espa�o � criado para o escopo do method1
						int x = 10;										// onde � criado um espa�o para incluir o valor de x
						if (x > 0) {									// e onde � criado um espa�o para o escopo do if
							int y = 20;									// onde, por sua vez, � criado um espa�o para declarar o valor de y
						}
						System.out.println(x);							// Assim que o m�todo if � finalizado, seu valor � desalocado
					}													// Assim que o method1 � finalizado, todas as vari�veis locais ser�o desalocadas
	
			
			ex2:	void method1() {
						Product p = method2();							// Quando p chama a execu��o do method2, a execu��o vai para o method2()
						System.out.println(p.name);						// que tem refer�ncia no stack (subescopo que engloba todo o m�todo), apontando 
					}													// para os endere�os na Heap, que receber�o os valores "TV", 900.00 e 0
					
					Product method2() {
						Product prod = new Product("TV", 900.00, 0);	// O method2 vai retornar a refer�ncia para o objeto na Heap ("TV", 900.00, 0)
						return prod;									// Ent�o, quando o return for executado a vari�vel p vai receber essa refer�ncia
					}													// e passar� a apontar esse mesmo objeto. NEsse momento, teremos condi��o de fazer um 
																		// print(p.name), imprimindo "TV".
																		
																		// Mesmo method2 sendo um m�todo com escopo provis�rio, o que foi instanciado no heap � mantido.
	
	Resumo:
			
			- Objetos alocados dinamicamente, quando n�o possuem mais refer�ncia para eles, ser�o desalocados pelo garbage collector
			
			- Vari�veis locais s�o desalocadas imediatamente assim que seu escopo local sai de execu��o
			
*/
}
