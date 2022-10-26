package Teoria;

public class Teoria {

	//	Boxing
	//	� o processo de convers�o de um objeto tipo valor para um objeto tipo refer�ncia compat�vel
	//	ex: pegar um valor 20 e encaixotar ele em um objeto
	//
	//	int x = 20;									// espa�o com o valor 20 � criado na stack, dentro da mem�ria
	//
	//	Object obj = x;								// obj, criado na stack, aponta um espa�o contendoo valor 20 dentro da heap
	
	
	//	Unboxing
	//	� o processo de convers�o de um objeto tipo refer�ncia para um objeto tipo valor compat�vel
	//
	//	int = 20;
	//	Object obj = x;
	//	
	//	int y = (int) obj;							// � criado uma caixa y contendo o valor 20 na stack
													// ent�o, estamos desencaixotando o objeto em heap e trazendo o valor 20 para a caixa y na stack
	
	
	//	Wrapper classes
	//	
	//	S�o classes equivalentes aos tipos primitivos
	//
	//	Boxing e unboxing � natural na linguagem
	//
	//	Uso comum: campo de entidades em sistemas de informa��o (IMPORTANTE)
	//		Pois tipos refer�ncia (classes) aceitam valor null e usufruem dos recursos OO
	//	
	//	Um uso comum para a utiliza��o de wrapper classes no c�digo � quando o valor a ser inserido pode ser null,
	//	para que o vari�vel aceite isso, � necess�rio que ela seja uma Wrapper. ex: public Integer dataNascimento; (sendo que esse � um campo opcional) 
	
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
