package saida;

import dados.Pessoa;
import servicos.Servicos;

public class Visao {
	
	public static void limpaTela (int linhas){
		// Instrucoes
		for(int aux = 0; aux < linhas; aux++)
			System.out.println();
	}
	
	public static void mostraMensagemInicial() {
		// Instrucoes
		System.out.println("Digite o nome de uma pessoa para vê-lo no formato usado no cadastro de passageiros aereos:");
	}
	
	public static void mostraPessoa(Pessoa pessoa) {
		// Instrucoes
		System.out.println("Nome informado: " + pessoa.getNomeCompleto());
	}
	
	public static void MostraNomeSeparado(Pessoa pessoa) {
		// Declaracoes
		String palavras[];
		
		// Instrucoes
		palavras = Servicos.separaNome(pessoa);
		System.out.println("Nome no novo formato: " + palavras[palavras.length - 1] + "/" + palavras[0]);
	}

}
