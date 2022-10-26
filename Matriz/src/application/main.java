package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a ordem da matriz desejada: ");
		int N = sc.nextInt();
		int neg = 0;
		Integer[][] matriz = new Integer[N][N];
		
		for(int i=0; i<N; i++) {
			System.out.println("Digite os número da linha " + (i+1) + ":");
			for(int j=0; j<N; j++) {
				matriz[i][j]= sc.nextInt();
				if (matriz[i][j]<0) {
					neg++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Main diagonal: ");
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if(i==j) {
					System.out.print(matriz[i][j] + " ");	
				}
				
			}
		}
		
		System.out.println();
		System.out.println("Negative numbers: " + neg);
	}

}
