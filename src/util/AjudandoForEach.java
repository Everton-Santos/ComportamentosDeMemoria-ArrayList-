package util;

public class AjudandoForEach {

	private String nome;
	private Integer idade;
	public String Telefone;
	
	
	public AjudandoForEach() {
	}
	
	public AjudandoForEach(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public void addTelefone(String tell) {
		this.Telefone = tell;
	}


	@Override
	public String toString() {
		return "Dados [nome=" + nome 
				+ ", idade=" + idade 
				+ ", Telefone=" + Telefone + "]";
	}
	
	

	public String getTelefone() {
		return Telefone;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
