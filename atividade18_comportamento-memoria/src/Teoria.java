
public class Teoria {

/*	-- Classes s�o tipo refer�ncia
  
 		Vari�veis cujo tipo s�o classes n�o devem ser entendidas como caixas, mas sim "setas" (tent�culos) para as caixas	
	
													// Dentro da mem�ria, existem duas espa�os: Stack, onde fica o espa�o com o endere�o, 
													   e o Heap, onde ficam armazenados os valores das vari�veis (aloca��o din�mica de mem�ria)
	
	Product p1, p2;									// classe Product e as vari�veis p1 e p2
													// � criado um espa�o para p1 e um para p2 no Stack, que apontar�o os espa�os no Heap que contenha seus valores
	p1 = new Product("TV", 900.00, 0);				// p1 recebe new Product, com os valores que preenchem o Heap
	
	p2 = p1;										// p2 recebe p1, ent�o p2 passar� a apontar para o endere�o de mem�ria de p1
	
	p2 = null;										// p2 n�o aponta para nenhum endere�o
	
	
	-- Tipos primitivos s�o tipo valor
	
		Em Java, tipos primitivos s�o tipo valor, que s�o caixas e n�o ponteiros.
		
	double x, y;									// duas vari�veis, com espa�o dentro da Stack
	
	x = 10;											// O espa�o na Stack j� armazena os valores de x e y, n�o mais o endere�o da Heap
	
	y = x;											// y recebe uma c�pia de x
	
	
	-- Tipos primitivos em Java, tipos valor
	
	 -Tipo-			-Conte�do-					-Padr�o-	-Tamanho-					-Intervalo-
	 boolean		true ou false	 			 false		  1 bit			NA
	 char			caracter unicode			 \u0000		 16 bits		\u0000 a \uFFFF	
	 byte			integer							0  		 8 bits			-128 a 127
	 short			integer							0	 	 16 bits		-32768 a 32768
	 int			integer							0	 	 32 bits		-2147483648 a 2147483648
	 long			integer							0	 	 64 bits		-9223372036854775808 a 9223372036854775808
	 float			IEEE 754 pontos flutuantes		0.0	 	 32 bits		+/-1.4E-45 a +/-3.4028235E+38
	 double			IEEE 754 pontos flutuantes		0.0	 	 64 bits		+/-4.9E-324 a +/-1.7976931348623157E+308
	 
	 
	 -- Valores padr�o
	 
	 	Quando alocamos (new) qualquer tipo estruturado (classe ou array), s�o atribu�dos valores padr�o aos seus elementos
	 	- n�mero: 0
	 	- boolean: false
	 	- char: caracter c�digo 0
	 	- objeto: null															Mem�ria
	 																name		price		quantity
	 	Product p = new Product(); 									null		0.0				0
	 	
	 	
	 -- Tipos refer�ncia vs. tipos valor
	 
	 	CLASSE													TIPO PRIMITIVO
	 	Vantagem: usufrui de todos os recursos Ori Obj			Vantagem: � mais semples e mais perform�tico
	 	Vari�veis s�o ponteiros									Vari�veis s�o caixas
	 	Objetos precisam ser instanciadas usando new, ou		N�o instancia. Uma vez declarados, est�o prontos
	 		apontar para um objeto j� existente						para uso
	 	Aceita valor null										N�o aceita valor null
	 	y = x;													y = x;
	 		"y passa a apontar para onde x aponta"					"y recebe uma c�pia de x"
	 	Objetos instanciados no Heap							"Objetos" instanciados no stack
	 	Objetos n�o utilizados s�o desalocados em um 			"Objetos" s�o deslocados imediatamente quando
	 		momento pr�ximo pelo garbage collector					seu escopo de execu��o � finalizado
	 		
	 		
*/
}
