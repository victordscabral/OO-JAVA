package servicos;

import dados.Pessoa;

public class Servicos {
	
	public static String[] separaNome(Pessoa pessoa) {
		//Declaracoes
		String palavras[] = pessoa.getNomeCompleto().split(" ");
		
		//Instrucoes
		return palavras;
	}

}
