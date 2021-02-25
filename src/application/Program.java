package application;

import java.util.Locale;
import java.util.Scanner;

import util.Altura;

public class Program {

	public static void main(String[] args) {
	
		double soma = 0.0;
		double media;
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite quantos numeros serão lidos: ");
		int n = ler.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite uma altura: ");
			vetor[i] = ler.nextDouble();
			
		}
		
		for(int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		media = soma / n;
		System.out.printf("A media é: %.2f %n", media);
		
	}

}
