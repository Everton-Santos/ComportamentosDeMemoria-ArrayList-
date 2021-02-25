package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Funcionarios;

public class ProgramList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantidade de Funcionarios: ");
		int quantFuncionarios = ler.nextInt();
		ler.nextLine();
		
		List<Funcionarios> lista = new ArrayList<>();

		for(int i = 0; i < quantFuncionarios; i++) {
			System.out.println(" ");
			System.out.println("Emplyoee #" + (i + 1));
			System.out.print("Id: ");
			Integer id = ler.nextInt();
			ler.nextLine();
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("Salario: ");
			Double salario = ler.nextDouble();
			
			Funcionarios funcionario = new Funcionarios(id, nome, salario);
			lista.add(funcionario);
			
		}
	
		System.out.println(" ");
		System.out.print("Entre com um id: ");
		int id = ler.nextInt();
		ler.nextLine();
		Integer pos = position(lista, id);
		if(pos == null) {
			System.out.println("Esse id não existe!");
		}
		else {
			System.out.print("Qual o valor da porcentagem ? ");
			double porcento = ler.nextDouble();
			lista.get(pos).aumentoSalario(porcento);
		}
		
		
		System.out.println(" ");
		System.out.println("Lista de Funcionarios:");
		for (Funcionarios listaFuncionario : lista) {
			System.out.println(listaFuncionario);
		}
		
		

	}

	public static Integer position(List<Funcionarios> list, int id) {
		for(int i = 0; i < list.size(); i++ ) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	

}
