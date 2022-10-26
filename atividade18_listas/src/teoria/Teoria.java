package teoria;

public class Teoria {

	//	Listas
	//	
	//	Lista � uma estrutura de dados:
	//		- Homog�nea (dados do mesmo tipo)
	//		- Ordenada (elementos acessados por meio de posi��es)
	//		- Inicia vazia, e seus elementos s�o alocados sob demanda
	//		- Cada elemento ocupa um "n�" (ou nodo) da lista
	//			> e cada n� aponta apenas o pr�ximo endere�o. O �ltimo possui um indicador de termina��o
	//	
	//	Tipo (interface): List
	//		- Classes que implementam: ArrayList, LinkedList, etc
	//	
	//	Vantagens:
	//		- Tamanho da lista � vari�vel
	//		- Facilidade para se realizar inser��es e dele��es
	//			- em vetores, � mais dif�cil fazer isso, j� que cada inser��o ou dele��o implica em mover 
	//			todos os elementos subsequ�ntes para frente ou para tr�s
	//	
	//	Desvantagens:
	//		- Acesso sequencial aos elementos*
	//			- ex.: se eu quiser o elemento na posi��o 5, preciso percorrer todos os anteriores para isso
	//		* dependendo da implementa��o da lista, essa navega��o pode ser otimizada
	//			- ArrayList consegue otimizar, porque � uma mistura de vetor e List, se comportando mais 
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
	//		- Encontrar posi��o de elemento:	indexOf(obj),	lastIndexOf(obj)
	//	
	//		- Filtrar lista com base em predicado:	List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
	//	
	//		- Encontrar primeira ocorr�ncia com base em predicado:	Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
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
