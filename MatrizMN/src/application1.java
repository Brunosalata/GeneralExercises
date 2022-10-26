import java.util.Scanner;

public class application1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de linhas: ");
		int M = sc.nextInt();
		System.out.print("Digite o número de colunas: ");
		int N = sc.nextInt();
		
		Integer[][] matriz = new Integer[M][N];
		
		for (int i=0; i<M; i++) {
			System.out.println("Digite os valores da linha " + (i+1) + ":"); 
			for(int j=0; j<N; j++) {
				matriz[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("Digite um número: ");
		int valor = sc.nextInt();
		
		for (int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(matriz[i][j] == valor) {
					System.out.println("Position: " + i + "," + j);
				}
				if(matriz[i][j] == valor && i>0) {
					System.out.println("UP: " + matriz[i-1][j]);
				}
				if(matriz[i][j] == valor && i<(M-1)) {
					System.out.println("DOWN: " + matriz[i+1][j]);
				}
				if(matriz[i][j] == valor && j>0) {
					System.out.println("LEFT: " + matriz[i][j-1]);
				}
				if(matriz[i][j] == valor && j<(N-1)) {
					System.out.println("RIGHT: " + matriz[i][j+1]);
				}
			}
		}
	}

}
