package validacao;

import java.util.InputMismatchException;
import leitura.Leitura;
import saida.Visao;

public class Validacao {
	public static int validaOpcao () {
		int opcao = -1;
		
		try {
			opcao = Leitura.lerInt();
			if (opcao < 0 || opcao > 3) {
				System.err.println("Erro, opcao invalida");
				opcao = validaOpcao();
			}
		} catch (NumberFormatException e) {
			System.err.println("Erro, a entrada deve ser numerica.");
			opcao = validaOpcao();
		}
		return opcao;
	}
	
	public static int validaIdadeAmamentacao() {
		// Declaracoes
		int idadeAmamentacao = 0;
		final int MIN = 0;
		
		// Instrucoes
		do {
			System.out.println("Idade geral de amamentação materna (em anos):");
			try {
				idadeAmamentacao = Leitura.lerInt();
				Visao.limpaTela(2);
				if (idadeAmamentacao < MIN)
					System.err.println("Valor invalido!\nDeve ser maior que " + MIN + ". Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.err.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (idadeAmamentacao < MIN);
		return idadeAmamentacao;
	}
	
	public static int validaIdadeVida() {
		// Declaracoes
		int idadeVida = 0;
		final int MIN = 0;
		
		// Instrucoes
		do {
			System.out.println("Idade de vida do animal (em anos):");
			try {
				idadeVida = Leitura.lerInt();
				Visao.limpaTela(2);
				if (idadeVida < MIN)
					System.err.println("Valor invalido!\nDeve ser maior que " + MIN + ". Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.err.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (idadeVida < MIN);
		Visao.limpaTela(1);
		return idadeVida;
	}
	
	public static String validaDescricaoEspecie() {
		// Declaracoes
		String descricaoEspecie = new String();
			
		// Instrucoes
		do {
			System.out.println("Descrição da espécie:");
			descricaoEspecie = Leitura.lerString();
			Visao.limpaTela(2);
			if (descricaoEspecie.isBlank()) 
				System.err.println("Nenhuma descricao foi informada, por favor informe uma descricao valida:");
		} while (descricaoEspecie.isBlank());
		Visao.limpaTela(1);
		return descricaoEspecie;
	}
	
	public static float validaTamanho() {
		// Declaracoes
		float tamanho = 0f;
		final float MIN = 0f;

		// Instrucoes
		do {
			System.out.println("Tamanho normal de um na fase adulta:");
			try {
				tamanho = Leitura.lerFloat();
				Visao.limpaTela(2);
				if (tamanho < MIN)
					System.err.println("Valor invalido!\nDeve ser maior que " + MIN
							+ ". Caso escreva numero decimal utilize ',' e nao '.'.\n.Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.err.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (tamanho < MIN);
		return tamanho;
	}
	
	public static String validaPorte() {
		// Declaracoes
		String porte = new String();
			
		// Instrucoes
		do {
			System.out.println("Porte (pequeno, medio ou grande) do macaco:");
			porte = Leitura.lerString();
			Visao.limpaTela(2);
			if (porte.isBlank())
				System.err.println("Nenhum porte foi informado, por favor informe um porte valido:");
			if (!porte.equalsIgnoreCase("PEQUENO") && !porte.equalsIgnoreCase("MEDIO") && !porte.equalsIgnoreCase("GRANDE"))
				System.err.println("Porte informado nao e valido, escolha entre pequeno, medio ou grande:");
			
		} while (porte.isBlank() || !porte.equalsIgnoreCase("PEQUENO") && !porte.equalsIgnoreCase("MEDIO") && !porte.equalsIgnoreCase("GRANDE"));
		Visao.limpaTela(1);
		return porte;
	}
	
	public static float validaPeso() {
		// Declaracoes
		float peso = 0f;
		final float MIN = 0f;

		// Instrucoes
		do {
			System.out.println("Peso do animal:");
			try {
				peso = Leitura.lerFloat();
				Visao.limpaTela(2);
				if (peso < MIN)
					System.err.println("Valor invalido!\nDeve ser maior que " + MIN
							+ ". Caso escreva numero decimal utilize ',' e nao '.'.\n.Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.err.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (peso < MIN);
		return peso;
	}
	
	public static String validaHabitat() {
		// Declaracoes
		String habitat = new String();
			
		// Instrucoes
		do {
			System.out.println("Habitat do animal:");
			habitat = Leitura.lerString();
			Visao.limpaTela(2);
			if (habitat.isBlank()) 
				System.err.println("Nenhum habiat foi informado, por favor informe um habitat valido:");
		} while (habitat.isBlank());
		Visao.limpaTela(1);
		return habitat;
	}

}
