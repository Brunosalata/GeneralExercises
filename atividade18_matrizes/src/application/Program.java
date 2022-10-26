package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];				// Instancia��o da matriz na mem�ria
													// Na mem�ria: no stack - vari�vel n valendo 3; vari�vel mat, que aponta uma matriz nxn no heap 
		
		for (int i = 0; i<mat.length; i++) {					// Preenchimento das linhas e colunas pelos valores inseridos
			for (int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();						// Podemos substituir n por mat.length
			}													// mat.length � o n�mero de linhas da matriz
		}														// mat[i].length � o n�mero de colunas da matriz, por ser um vetor de n posi��es, na posi��o i
		
		System.out.println("Main diagonal:");		
		for (int i=0; i<mat.length; i++) {					// Varrer a matriz e identificar os valores das posi��es que tiverem linha e coluna com igual posi��o
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;								// vari�vel para somar as vezes que um n�mero negativo aparece
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
