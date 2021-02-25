package application;

import java.util.Locale;
import java.util.Scanner;

import util.Cadastro;

public class AplicativoPensionato {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Cadastro[] cadastro = new Cadastro[9];
		
		System.out.print("Digite quantos quartos serão alugados: ");
		int quartos = ler.nextInt();
		ler.nextLine();
		System.out.println(" ");
		
		for(int i = 0; i < quartos; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Informe o nome: ");
			String nome = ler.nextLine();
			System.out.print("Informe o E-mail: ");
			String email = ler.nextLine();
			System.out.print("Informe o número do quarto que quer alugar: ");
			int numeroQuarto = ler.nextInt();
			ler.nextLine();
			cadastro[numeroQuarto] = new Cadastro(nome, email);	
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < cadastro.length; i++) {
			if(cadastro[i] != null) {
				System.out.println(i + ": " + cadastro[i]);
			}
		}
		
		
		
	}

}
