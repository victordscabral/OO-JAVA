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
	
	//Metodo para zerar vetor de nomes
	public void zeraVetor() {
		this.nomes.removeAllElements();
	}
	
	//Metodo para adicionar nome
	public void adicionaNome(String nome) {
		this.nomes.add(nome);
	}
}
