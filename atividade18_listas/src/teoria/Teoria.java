package teoria;

public class Teoria {

	//	Listas
	//	
	//	Lista é uma estrutura de dados:
	//		- Homogênea (dados do mesmo tipo)
	//		- Ordenada (elementos acessados por meio de posições)
	//		- Inicia vazia, e seus elementos são alocados sob demanda
	//		- Cada elemento ocupa um "nó" (ou nodo) da lista
	//			> e cada nó aponta apenas o próximo endereço. O último possui um indicador de terminação
	//	
	//	Tipo (interface): List
	//		- Classes que implementam: ArrayList, LinkedList, etc
	//	
	//	Vantagens:
	//		- Tamanho da lista é variável
	//		- Facilidade para se realizar inserções e deleções
	//			- em vetores, é mais difícil fazer isso, já que cada inserção ou deleção implica em mover 
	//			todos os elementos subsequêntes para frente ou para trás
	//	
	//	Desvantagens:
	//		- Acesso sequencial aos elementos*
	//			- ex.: se eu quiser o elemento na posição 5, preciso percorrer todos os anteriores para isso
	//		* dependendo da implementação da lista, essa navegação pode ser otimizada
	//			- ArrayList consegue otimizar, porque é uma mistura de vetor e List, se comportando mais 
	//			como vetor
	//	
	//	
	//	Comandos para consulta:
	//	
	//		- Tamanho da lista:		size()
	//	
	//		- Inserir elemento na lista:	add(obj),	add(int, obj)
	//	
	//		- Remover elemento da lista:	remove(obj),	remove(int),	removeIf(Predicate)
	//	
	//		- Encontrar posição de elemento:	indexOf(obj),	lastIndexOf(obj)
	//	
	//		- Filtrar lista com base em predicado:	List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
	//	
	//		- Encontrar primeira ocorrência com base em predicado:	Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
	//	
	//	
	//	
	//	
	//	
	//	
	//	
	//	
	//	
	//	
	//	
	
}
