package dados;

import java.util.Vector;

import validacao.Validacao;

public class Pessoa {
	private Vector<String> nomes;

	// Metodo Construtor
	public Pessoa() {
		this.nomes = new Vector<String>();
	}
	
	// Metodos Acessores
	public Vector<String> getNomes() {
		return nomes;
	}
	
	public void setNomes(String nome) {
		this.nomes.add(nome);
	}
	
	//Metodo para zerar vetor de nomes
	public void zeraVetor() {
		this.nomes.removeAllElements();
	}
}
