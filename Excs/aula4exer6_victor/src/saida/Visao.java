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
		System.out.println("Digite o nome de uma pessoa para vê-lo em um formato separado:");
	}
	
	public static void mostraPessoa(Pessoa pessoa) {
		// Instrucoes
		System.out.println("Nome informado: " + pessoa.getNome());
	}
	
	public static void MostraNomeSeparado(Pessoa pessoa) {
		// Declaracoes
		String palavras[];
		int aux = 0;
		
		// Instrucoes
		palavras = Servicos.separaNome(pessoa);
		
		System.out.println("Nome no novo formato:\n");
		
		while(aux < palavras.length) {
		System.out.println(palavras[aux]);
		aux++;
		}
	}

}
