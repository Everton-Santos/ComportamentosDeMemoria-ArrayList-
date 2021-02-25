package util;

import java.util.List;

public class Test {

	
	public Integer id;
	public String nome;
	public Double salario;
	
	public Test() {
	}
	
	public Test(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	
	public Double aumentoSalario(double porcento) {
		return this.salario += this.salario * (porcento / 100);
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return id + ", " 
				+ nome + ", " 
				+ salario;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
