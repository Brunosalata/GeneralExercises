package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];				// Instanciação da matriz na memória
													// Na memória: no stack - variável n valendo 3; variável mat, que aponta uma matriz nxn no heap 
		
		for (int i = 0; i<mat.length; i++) {					// Preenchimento das linhas e colunas pelos valores inseridos
			for (int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();						// Podemos substituir n por mat.length
			}													// mat.length é o número de linhas da matriz
		}														// mat[i].length é o número de colunas da matriz, por ser um vetor de n posições, na posição i
		
		System.out.println("Main diagonal:");		
		for (int i=0; i<mat.length; i++) {					// Varrer a matriz e identificar os valores das posições que tiverem linha e coluna com igual posição
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;								// variável para somar as vezes que um número negativo aparece
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<n; j++) {
				if (mat[i][j] < 0) {
					count++;	
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		sc.close();
	}

}
