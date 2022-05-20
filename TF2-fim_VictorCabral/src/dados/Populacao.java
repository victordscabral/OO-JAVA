package dados;

import java.util.ArrayList;

public class Populacao {
	private ArrayList<Pessoa> populacao;

// Metodo construtor
	public Populacao() {
		this.populacao = new ArrayList<Pessoa>();
	}

//Getters
	public ArrayList<Pessoa> getPopulacao() {
		return populacao;
	}
	
	public Pessoa getPessoa(int indice) {
		return populacao.get(indice);
	}

//Setters
	public void setPopulacao(Pessoa pessoa) {
		this.populacao.add(pessoa);
	}

// Metodo para pegar quantidade de pessoas em situacao de suade informada
	public int getQtdPessoasSituacao(Character situacao) {
		int contador = 0;
			for (Pessoa pessoa : this.getPopulacao()) {
				if (pessoa.getSituacaoSaude() == situacao) {
					contador++;
				}
			}
		return contador;
	}

/* Metodo para pegar quantidade de pessoas em situacao de saude sem contaminacao, 
   separando entre masculino e feminino */
	public int getQtdPessoasSituacao(Character situacao, Character genero) {
		//Declaracoes
		int contadorMasculino = 0;
		int contadorFeminino = 0;
		
		//Instrucoes
		for (Pessoa pessoa : this.getPopulacao()) {
			if (pessoa.getSituacaoSaude() == situacao && pessoa.getFoiGestantePorExtenso() == null && genero == 'M') 
				contadorMasculino++;
			else if(pessoa.getSituacaoSaude() == situacao && pessoa.getIdade() == null) 
				contadorFeminino++;			
		}
		if (genero == 'M')
			return contadorMasculino;
		else if(genero == 'F')
			return contadorFeminino;
		
		return contadorMasculino;
	}

}
