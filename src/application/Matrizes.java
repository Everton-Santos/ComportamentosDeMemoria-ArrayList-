package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da Matriz Bidimensional: ");
		int n = ler.nextInt();
		ler.nextLine();
		System.out.println(" ");
		
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) {
			System.out.println("Linha #" + (i + 1));
			for(int j = 0; j < mat[i].length; j++) {
				System.out.println("Coluna #" + (j + 1));
				System.out.print("Digite um número: ");
				mat[i][j] = ler.nextInt();
				System.out.println(" ");
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}	
		System.out.println(" ");
		
		int count = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		

	}

}
