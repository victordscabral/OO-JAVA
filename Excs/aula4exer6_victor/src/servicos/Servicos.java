package servicos;

import dados.Pessoa;

public class Servicos {
	
	public static String[] separaNome(Pessoa pessoa) {
		//Declaracoes
		String palavras[] = pessoa.getNome().toUpperCase().split(" ");
		
		//Instrucoes
		return palavras;
	}

}
