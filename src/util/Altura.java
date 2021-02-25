package util;

public class Altura {

	private double soma;
	private double media;
	
	
	public void media(double vetor, int quantidade) {
		soma += vetor;
		media = soma / quantidade;
	}
	
	
	public String toString() {
		return "A media é: "
				+ media;
	}
	
	
	
}
