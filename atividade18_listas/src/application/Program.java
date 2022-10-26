package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// Declarar lista de numeros inteiros, instanciando logo em seguida. Apenas a declara��o n�o permite utiliza��o dela
		
		List<String> list = new ArrayList<>();			//	java n�o aceita instancia��o de lista assim "= new List<>();"	
														//	Para instanciar um tipo que seja uma interface (como � o caso da lista, precisamos aplicar 
														//		uma classe que implementa essa interface
														//	importa��o do ArrayList, porque essa implementa��o da lista � otimizada (melhores caracter�sticas
														//		entre vetor e lista
														//	Pode ser inserido String em "new ArrayList<String>();", mas as �ltimas vers�es de Java dispensam 
														//		a necessidade, o que torna o c�digo mais limpo
				
		// Lista, diferente de vetor, n�o aceita tipos primitivos. 'List<int> list;' por exemplo. 
		// 		necess�rio usar a wrapper class do int, que � o Integer
		// O que foi inserido entre <> s�o os gererics, quando voc� pode parametrizar a defini��o
		//		de um tipo, informando um outro tipo espec�fico.
		// 		ex: <Integer> para lista de inteiros; <String> para lista de Strings...
		
		// Com a lista pronta, vamos adicionar elementos nela
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		list.add(2, "Marco");				//	Sobrecarga: inserir "Marco" (nova String), na posi��o 2 --> Comando:  list.add(int index, String element);
											//	As posi��es come�am em 0, 1, 2... e a inser��o ou dele��o de uma posi��o implica numero total de posi��es da lista 
		System.out.println(list.size());
		
		for (String x : list) {				//	Lista passa a incluir "Marco" na posi��o 2
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		list.remove("Ana");					//	Lista tem uma opera��o que � capaz de remover um dado a partir da compara��o do valor dele com outro valor
		
		System.out.println(list.size());
		
		for (String x : list) {				//	Lista passa a n�o incluir "Ana" e o n�mero de posi��es reduz em um
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		list.remove(1);						//	Remo��o da posi��o 1, junto ao valor que ela possui
		
		System.out.println(list.size());
		
		for (String x : list) {				//	Lista passa a n�o ter mais a posi��o 1, "Alex", e "Marco" passa a assumir essa posi��o
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');		//	Remo��o de todos os valores que contenham um predicado (fun��o que vai retornar em V ou F
						// fun��o l�mbida			//	"Pega um valor x tal que x inicie (x.charAt(0)) com 'M' 'At(posi��o)'

		System.out.println(list.size());
		
		for (String x : list) {				//	Lista passa a n�o ter mais os valores que iniciam em "M" ("Maria" e "Marcos")
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));		//	Achar a posi��o de um elemento (indexOf())
		System.out.println("Index of Marco: " + list.indexOf("Marco"));		//	Achar a posi��o de um elemento que n�o existe
		System.out.println("-------------------");
		
		list.add("Maria");
		list.add("Alex");
		list.add("Ana");
		
		for (String x : list) {				//	Elementos s�o adicionados em sequencia
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());	
																				//	Deixar somente aqueles come�ados com "A" ("Ana" e Alex")
																				//	Devo declarar uma nova lista, que pegue a lista original, 
						// A fun��o vai devolver um stream filtrado 			//		filtra os elementos come�ados com "A" e retorne uma  
						// 		conforme o predicado							//		nova lista com os elementos filtrados
						// Mas esse stream n�o � compat�vel com list
						//		ent�o, pegamos o stream e convertemos 
						//		novamente para lista '.collect(Collectors.toList())'
		
		for (String x : result) {				//	Para chamar a nova lista result
			System.out.println(x);
		}
		System.out.println("-------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);	
								//	Encontrar um elemento que atenda o predicado. Declara uma nova variavel para assumir esse valor
								//	Encontrar o primeiro elemento que inicie com a letra "A"
		System.out.println(name);
		System.out.println("-------------------");
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);	
								//	Encontrar um elemento inexistente retorna null
		System.out.println(name2);
	}

}
