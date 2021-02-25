package application;

import java.util.Locale;
import java.util.Scanner;

import util.AjudandoForEach;

public class LacoForEach {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		AjudandoForEach[] laco = new AjudandoForEach[3];
		int soma = 0;
		
		for(AjudandoForEach linha : laco) {
			System.out.print("Digite o nome: ");
			String nome = ler.nextLine();
			System.out.print("Digite a idade: ");
			Integer idade = ler.nextInt();
			ler.nextLine();
			System.out.print("Digite o Telefone: ");
			String telefone = ler.nextLine();
			
			linha = new AjudandoForEach(nome, idade);
			linha.addTelefone(telefone);
			System.out.println(" ");
			laco[soma] = linha;
			soma += 1;
		}
		
//		for(int i = 0; i < 3; i++) {
//			System.out.print("Digite o nome: ");
//			String nome = ler.nextLine();
//			System.out.print("Digite a idade: ");
//			Integer idade = ler.nextInt();
//			ler.nextLine();
//			System.out.print("Digite o Telefone: ");
//			String telefone = ler.nextLine();
//			
//			laco[i] = new AjudandoForEach(nome, idade);
//			laco[i].addTelefone(telefone);
//		}
		
		for(int i = 0; i < 3; i++) {
		System.out.println(laco[i].toString());
		}
		

	}

}
