package Teoria;

public class palavraThis {

/*		this
	
		� uma refer�ncia para o pr�prio objeto
	
		Usos comuns:
		- Diferenciar atributos de vari�veis locais
		- Passar o pr�prio objeto como argumento na chamada de um m�todo ou construtor
		
	Diferenciar atributos de vari�veis locais
		
		Product product = new Product("TV", 1500.0, 0);
		
		- Na mem�ria, ser� acionado o escopo do construtor, com as vari�veis locais do construtor (os pr�prios par�metros; "TV", 1500.0 e 0)
		
		public Product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		- valores presentes nas vari�veis do construtor ser�o copiados para o objeto Product
		- a palavra 'this' faz com que o sistema acesse o valor do objeto, n�o do construtor, na vari�vel local)
		- caso n�o seja inclu�do 'this', o sistema d� prioridade ao par�metro, promovendo o acesso ao valor da vari�vel local, no escopo do construtor
	
*/	
	
}
