import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	/*	Exerc?cio 1
	Fazer um programa para ler um n?mero inteiro, e depois dizer se este n?mero ? negativo ou n?o.
	
		Scanner sc = new Scanner(System.in);
		int x;
		
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("N?O NEGATIVO");
		}
		
		sc.close();
	*/
		
	/*	Exerc?cio 2
	Fazer um programa para ler um n?mero inteiro e dizer se este n?mero ? par ou ?mpar
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		x = sc.nextInt();
		
		if (x % 2 == 0) {                      //  % ? o resto da divis?o de x por 2
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
		
	*/
	
	/*	Exerc?cio 3
	Leia 2 valores inteiros (A e B). Ap?s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	Multiplos", indicando se os valores lidos s?o m?ltiplos entre si. Aten??o: os n?meros devem poder ser digitados em
	ordem crescente ou decrescente.
	
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("N?o sao multiplos");
		}
			
		sc.close();
	
	*/
	
	/*	Exerc?cio 4
	Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura??o do jogo, sabendo que o mesmo pode
	come?ar em um dia e terminar em outro, tendo uma dura??o m?nima de 1 hora e m?xima de 24 horas
		
		Scanner sc = new Scanner(System.in);
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
	
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
	
		sc.close();
		
	*/
	
	/*	Exerc?cio 5
	Com base na tabela abaixo, escreva um programa que leia o c?digo de um item e a quantidade deste item. A
	seguir, calcule e mostre o valor da conta a pagar.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double valor = 0, total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			valor = 4.0;
		}
		if (codigo == 2) {
			valor = 4.5;
		}
		if (codigo == 3) {
			valor = 5.0;
		}
		if (codigo == 4) {
			valor = 2.0;
		}
		if (codigo == 5) {
			valor = 1.5;
		}

		total = quantidade * valor;
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	
	*/
		
	/*	Exerc?cio 6
	Voc? deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
	seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n?o estiver em
	nenhum destes intervalos, dever? ser impressa a mensagem ?Fora de intervalo?
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		if ( 0 <= x && x <= 25 ) {
			System.out.println("Intervalo [0,25]");
		}
		else if ( 25 < x && x <= 50 ) {
			System.out.println("Intervalo (25,50]");
		}
		else if ( 50 < x && x <= 75 ) {
			System.out.println("Intervalo (50,75]");
		}
		else if ( 75 < x && x <= 100 ) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
			
		sc.close();
		
	*/
	
	/*	Exerc?cio 7
	Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
	de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
	ponto, ou se est? sobre um dos eixos cartesianos ou na origem (x = y = 0).
	Se o ponto estiver na origem, escreva a mensagem ?Origem?.
	Se o ponto estiver sobre um dos eixos escreva ?Eixo X? ou ?Eixo Y?, conforme for a
	situa??o.
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if ( x == 0 && !( y == 0 )) {
			System.out.println("Eixo Y");
		}
		if ( y == 0 && !( x == 0 )) {
			System.out.println("Eixo X");
		}
		if ( x > 0 && y > 0 ) {
			System.out.println("Q1");
		}
		if ( x < 0 && y > 0 ) {
			System.out.println("Q2");
		}
		if ( x < 0 && y < 0 ) {
			System.out.println("Q3");
		}
		if ( x > 0 && y < 0 ) {
			System.out.println("Q4");
		}
		if ( x == 0 && y == 0 ) {
			System.out.println("Origem");
		}
		
		sc.close();
		
	*/	
		
	/*	Exerc?cio 8
	Em um pa?s imagin?rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
	que nele n?o existem pol?ticos corruptos e os recursos arrecadados s?o utilizados em benef?cio da popula??o, sem
	qualquer desvio. A moeda deste pa?s ? o Rombus, cujo s?mbolo ? o R$.
	Leia um valor com duas casas decimais, equivalente ao sal?rio de uma pessoa de Lisarb. Em seguida, calcule e
	mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
	Lembre que, se o sal?rio for R$ 3002.00, a taxa que incide ? de 8% apenas sobre R$ 1000.00, pois a faixa de
	sal?rio que fica de R$ 0.00 at? R$ 2000.00 ? isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa ?
	de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
	duas casas decimais.	
	*/	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, IR;
		
		R = sc.nextDouble();
		
		if ( R <= 2000.00) {
			IR = 0.0;
		}
		else if ( R <= 3000.00) {
			IR = ( R - 2000.0 ) * 0.08;
		}
		else if ( R <= 4500.00) {
			IR = ( R - 3000.0 ) * 0.18 + 1000.0 * 0.08; 
		}
		else {
			IR = ( R - 4500.0 ) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; 
		}
		
		if ( IR == 0.0 ) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f", IR);
		}
		
		sc.close();
		
		
	}
}