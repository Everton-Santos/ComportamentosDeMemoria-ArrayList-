package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsandoList {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());

		
		
		for(String linha : list) {
			System.out.println(linha);
		}
		System.out.println("----------------");
		list.removeIf(linha -> linha.charAt(0) == 'M');
		
		for(String linha : list) {
			System.out.println(linha);
		}
		System.out.println("----------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("----------------");
		List<String> result = list.stream().filter(linha -> linha.charAt(0) == 'A').collect(Collectors.toList());
		for(String linha : result) {
			System.out.println(linha);
		}
		
		System.out.println("----------------");
		String name = list.stream().filter(linha -> linha.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
		
	}

}
