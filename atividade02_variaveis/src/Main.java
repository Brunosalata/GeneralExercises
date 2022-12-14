import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		
		System.out.println("Bom dia!");
		
		System.out.println(y);
		// 'print' mostra o valor da vari?vel , enquanto 'println' inclui uma quebra de linha ao final
		
		System.out.println(x);
		/* double permite valores com ponto flutuante
		 * Para definir quantas casas decimais devemos usar o 'printf' (de formatado), da seguinte forma:
		 * printf("%.Nf%n", x), onde N ? o n?mero de casas a serem consideradas, e x ? o valor da vari?vel.
		 * O padr?o para essa opera??o ? apenas '%.Nf', %n ou \n representa quebra de linha ao final da mensagem*/
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f", x);
		System.out.printf(" %.2f%n", x);
		/* O separador de casas decimais ? ',', uma vez que o comando 'f' utiliza a configura??o do computador
		 * podendo ser POR, ENG, etc. Para configurar o separador como sendo "." (separados americano), devemos
		 * aplicar a seguinte configura??o:*/
		
		Locale.setDefault(Locale.US);
		/* Locale ? uma classe do JDK, mas n?o ? reconhecida pelo sistema. Para que reconhe?a, ? necess?rio
		 * importar essa classe no topo da aplica??o 'import java.util.Locale;' ou passar o mause onde est? 
		 * o erro e seleciona 'import Locale (java.util)', que o eclipse adiciona automaticamente no topo*/

		System.out.printf("%.4f", x);
		// Ap?s importa??o da classe Locale, a aplica??o j? reconhece o separador como sendo o americano ('.')

		System.out.println("RESULTADO = " + x + " metros");
		// Concatenando elementos
		System.out.printf("RESULTADO = %.2f metros%n", x);
		// Aplicando printf - valor do 'x' vai entrar no lugar de '%.2f', j? formatado
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		/* Concatenando v?rios elementos em um mesmo comando de escrita
		 * As vari?veis indicadas ao final do comando ser? inseridas no lugar das vari?veis '%s', '%d' e '%.2f'
		 * Para que seja poss?vel, ? necess?rio declarar as vari?veis acima dos comandos ('String nome', por exemplo)*/
		
		System.out.printf("Ganhando %f reais, %s j? viajou o mundo aos %d %n", renda, nome, idade);
		// Para identificar as vari?veis dentro do comando, temos
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
		
		
	}

}
