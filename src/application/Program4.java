package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Test;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digita a quantidade de funcionarios: ");
		int quantFuncionarios = ler.nextInt();
		ler.nextLine();
		System.out.println(" ");
		
		List<Test> lista = new ArrayList<>();
		
		for(int i = 0; i < quantFuncionarios; i++) {
			System.out.println("Funcionário #" + (i + 1));
			System.out.print("ID: ");
			int id = ler.nextInt();
			ler.nextLine();
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("Salário: ");
			double salario = ler.nextDouble();
			System.out.println(" ");
			
			Test test = new Test(id, nome, salario);
			lista.add(test);
		}
		
		System.out.print("Entre com um ID valido: ");
		int id = ler.nextInt();
		ler.nextLine();
		
		Integer posicao = comparacaoId(lista, id);
		
		for(int i = 0; i < quantFuncionarios; i++) {
			while(posicao == null) {
				System.out.print("Id não existe! Tentar novamente: ");
				id = ler.nextInt();
				ler.nextLine();
				posicao = comparacaoId(lista, id);
			}
		}
		
		System.out.print("Entre com a porcentagem: ");
		double porcentagem = ler.nextDouble();
		lista.get(posicao).aumentoSalario(porcentagem);
		System.out.println(" ");
		
		System.out.println("Lista de funcionários:");
		for(int i = 0; i < quantFuncionarios; i++) {
		System.out.println(lista.get(i).toString());
		}
		
		
		
	}
	
	public static Integer comparacaoId(List<Test> listinha, int id) {
		for(int i = 0; i < listinha.size(); i++ ) {
			while(listinha.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	
}
