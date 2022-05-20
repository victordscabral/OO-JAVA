package validacao;

import java.util.InputMismatchException;
import leitura.Leitura;
import saida.Visao;

public class Validacao {
	public static boolean validaContinua() {
		// Declaracoes
		char opcao;

		// Instrucoes
		do {
			System.out.println("Deseja continuar cadastrando?\n Digite 'S' para sim e 'N' para nao");
			opcao = Leitura.lerChar();
			Visao.limpaTela(2);
			if ((opcao != 'S') && (opcao != 'N'))
				System.out.print("Opcao invalida!");
		} while ((opcao != 'S') && (opcao != 'N'));
		return (opcao == 'S');
	}

	// Valida Salário
	public static int validaAno() {
		// Declaracoes
		int ano = 0;
		final int MIN = 1900;
		final int ATUAL = 2020;

		// Instrucoes
		do {
			System.out.println("Ano do evento a ser cadastrado:");
			try {
				ano = Leitura.lerInt();
				Visao.limpaTela(2);
				if (ano < MIN || ano >ATUAL)
					System.out.println("Valor invalido!\nDeve ser de " + MIN + " ate " + ATUAL + ". Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.out.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (ano < MIN || ano >ATUAL);
		return ano;
	}

	// Valida presidente
	public static String validaPresidente() {
		// Declaracoes
		String presidente = new String();
		
		// Instrucoes
		System.out.println("Nome do presidente:");
		presidente = Leitura.lerString();
		while (presidente.isBlank()) {
			Visao.limpaTela(2);
			System.out.println("Nenhum nome foi informado, por favor informe um nome valido:");
			presidente = Leitura.lerString();
		}
		Visao.limpaTela(1);
		return presidente;
	}

	// Valida presidente
	public static String validaEvento() {
		// Declaracoes
		String evento = new String();
		
		// Instrucoes
		System.out.println("Nome do evento:");
		evento = Leitura.lerString();
		while (evento.isBlank()) {
			Visao.limpaTela(2);
			System.out.println("Nenhum nome foi informado, por favor informe um nome valido:");
			evento = Leitura.lerString();
		}
		Visao.limpaTela(1);
		return evento;
	}
	
}
