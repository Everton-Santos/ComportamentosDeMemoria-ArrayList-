package application;

import java.util.Locale;
import java.util.Scanner;

import util.Product;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos: ");
		int quantidade = ler.nextInt();
		ler.nextLine();
		
		Product[] produto = new Product[quantidade];
		
		for(int i = 0; i < produto.length; i++) {
			System.out.print("Digite o nome do produto: ");
			String nome = ler.nextLine();
			System.out.print("Digite o valor do produto: ");
			double valor = ler.nextDouble();
			ler.nextLine();
			produto[i] = new Product(nome, valor);
		}
		
		double soma = 0.0;
		for(int i = 0; i < produto.length; i++) {
			soma += produto[i].getValorProduto();
		}
		
		double media = soma / produto.length;
		System.out.printf("A média do valor dos produtos é: %.2f %n", media);
	}

}
