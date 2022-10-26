package Teoria;

public class Teoria {

	//	Boxing
	//	é o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível
	//	ex: pegar um valor 20 e encaixotar ele em um objeto
	//
	//	int x = 20;									// espaço com o valor 20 é criado na stack, dentro da memória
	//
	//	Object obj = x;								// obj, criado na stack, aponta um espaço contendoo valor 20 dentro da heap
	
	
	//	Unboxing
	//	é o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível
	//
	//	int = 20;
	//	Object obj = x;
	//	
	//	int y = (int) obj;							// é criado uma caixa y contendo o valor 20 na stack
													// então, estamos desencaixotando o objeto em heap e trazendo o valor 20 para a caixa y na stack
	
	
	//	Wrapper classes
	//	
	//	São classes equivalentes aos tipos primitivos
	//
	//	Boxing e unboxing é natural na linguagem
	//
	//	Uso comum: campo de entidades em sistemas de informação (IMPORTANTE)
	//		Pois tipos referência (classes) aceitam valor null e usufruem dos recursos OO
	//	
	//	Um uso comum para a utilização de wrapper classes no código é quando o valor a ser inserido pode ser null,
	//	para que o variável aceite isso, é necessário que ela seja uma Wrapper. ex: public Integer dataNascimento; (sendo que esse é um campo opcional) 
	
	//
	
	//														Object
	//								  ________________________|______________________________________
	//								  |										   |					|
	//								Number									Boolean				Character
	//								  |									   (boolean)			 (char)
	//			______________________|__________________________________________________________
	//			|				|				|				|				|				|
	//			Byte		  Short			 Integer		  Long			  Float			 Double	
	//			byte		  short			   int			  long			  float			 double
	//
	
	
}
