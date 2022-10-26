package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// Declarar lista de numeros inteiros, instanciando logo em seguida. Apenas a declaração não permite utilização dela
		
		List<String> list = new ArrayList<>();			//	java não aceita instanciação de lista assim "= new List<>();"	
														//	Para instanciar um tipo que seja uma interface (como é o caso da lista, precisamos aplicar 
														//		uma classe que implementa essa interface
														//	importação do ArrayList, porque essa implementação da lista é otimizada (melhores características
														//		entre vetor e lista
														//	Pode ser inserido String em "new ArrayList<String>();", mas as últimas versões de Java dispensam 
														//		a necessidade, o que torna o código mais limpo
				
		// Lista, diferente de vetor, não aceita tipos primitivos. 'List<int> list;' por exemplo. 
		// 		necessário usar a wrapper class do int, que é o Integer
		// O que foi inserido entre <> são os gererics, quando você pode parametrizar a definição
		//		de um tipo, informando um outro tipo específico.
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
		
		list.add(2, "Marco");				//	Sobrecarga: inserir "Marco" (nova String), na posição 2 --> Comando:  list.add(int index, String element);
											//	As posições começam em 0, 1, 2... e a inserção ou deleção de uma posição implica numero total de posições da lista 
		System.out.println(list.size());
		
		for (String x : list) {				//	Lista passa a incluir "Marco" na posição 2
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		list.remove("Ana");					//	Lista tem uma operação que é capaz de remover um dado a partir da comparação do valor dele com outro valor
		
		System.out.println(list.size());
		
		for (String x : list) {				//	Lista passa a não incluir "Ana" e o número de posições reduz em um
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		list.remove(1);						//	Remoção da posição 1, junto ao valor que ela possui
		
		System.out.println(list.size());
		
		for (String x : list) {				//	Lista passa a não ter mais a posição 1, "Alex", e "Marco" passa a assumir essa posição
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');		//	Remoção de todos os valores que contenham um predicado (função que vai retornar em V ou F
						// função lâmbida			//	"Pega um valor x tal que x inicie (x.charAt(0)) com 'M' 'At(posição)'

		System.out.println(list.size());
		
		for (String x : list) {				//	Lista passa a não ter mais os valores que iniciam em "M" ("Maria" e "Marcos")
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));		//	Achar a posição de um elemento (indexOf())
		System.out.println("Index of Marco: " + list.indexOf("Marco"));		//	Achar a posição de um elemento que não existe
		System.out.println("-------------------");
		
		list.add("Maria");
		list.add("Alex");
		list.add("Ana");
		
		for (String x : list) {				//	Elementos são adicionados em sequencia
			System.out.println(x);
		}	
		System.out.println("-------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());	
																				//	Deixar somente aqueles começados com "A" ("Ana" e Alex")
																				//	Devo declarar uma nova lista, que pegue a lista original, 
						// A função vai devolver um stream filtrado 			//		filtra os elementos começados com "A" e retorne uma  
						// 		conforme o predicado							//		nova lista com os elementos filtrados
						// Mas esse stream não é compatível com list
						//		então, pegamos o stream e convertemos 
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
