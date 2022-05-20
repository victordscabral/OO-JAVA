package saida;

import dados.Pessoa;
import servicos.Servicos;

public class Visao {

	public static void limpaTela(int linhas) {

		for(int aux = 0; aux < linhas; aux++)
			System.out.println();
	}
	
	public static void mostraMensagemInicial() {
		System.out.println("Digite o nome de uma pessoa para vê-lo no formato usado no cadastro de passageiros aéreos:");
	}
	
	public static void mostraNomeInformado(String nomeCompleto) {
		System.out.println("Nome informado: " + nomeCompleto);
	}

	public static void mostraPassageiro(String nomeAereo) {
		// Declaracoes
		String palavras[];
		
		// Instrucoes
		palavras = Servicos.separaNome(nomeAereo);
		System.out.println("Nome no novo formato: " + palavras[palavras.length - 1] + "/" + palavras[0]);	}
	
}
