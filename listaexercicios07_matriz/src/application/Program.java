package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, m;
		
		System.out.print("Choose teh number of lines: ");
		n = sc.nextInt();
		System.out.print("Choose teh number of coluns: ");
		m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			System.out.println("Enter " + m + " numbers of line " + (i + 1));
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Choose one of the entered numbers: ");
		int number = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == number) {
					System.out.println("Position: " + i + "," + j);
					if (j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
					}
					if (j < mat[0].length-1) {
					System.out.println("Right: " + mat[i][j+1]);
					}
					if (i > 0) {
					System.out.println("Up: " + mat[i-1][j]);
					}
					if (i < mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
	}

}
