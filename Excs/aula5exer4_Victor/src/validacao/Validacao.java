package validacao;

import java.util.InputMismatchException;

import java.util.Vector;
import leitura.Leitura;
import saida.Visao;

public class Validacao {

	// VALIDACAO DO NOME
	public static String validaNome(String nome) {
		while (nome.equals(null) || nome.trim().equals("")) {
			Visao.limpaTela(2);
			Visao.nomeInvalido();
			nome = Leitura.leituraString();
		}
		return nome;
	}

	public static int validaNumero() {
		int numero = 0;
		boolean erro = false;
		do {
			try {
				numero = Leitura.leituraInt();
				if (numero < 0 || numero > 2) {
					Visao.limpaTela(2);
					System.out.println("Valor fora do intervalo esperado (0 - 2)\nDigite novamente: ");
					erro = true;
				} else {
					erro = false;
				}
			} catch (InputMismatchException e) {
				Visao.limpaTela(2);
				System.out.println("Erro, entrada fora do padrão esperado (inteiros)\nDigite novamente: ");
				erro = true;
			}
		} while (erro);
		return numero;
	}
	
	public static boolean validaContinua() {
		// DECLARACOES
		char opcao;

		// INSTRUCOES
		Visao.verificarContinuacao();

		opcao = Leitura.leituraChar();

		while ((opcao != 'S') && (opcao != 'N')) {
			Visao.digiteUmCaractereValido();
			opcao = Leitura.leituraChar();
		}
		Visao.limpaTela(1);
		return ((opcao == 'S') ? true : false);
	}
	
	public static boolean validaContinua(Vector grupoPessoas) {
		// DECLARACOES
		char opcao;

		// INSTRUCOES
		Visao.verificarContinuacao();

		opcao = Leitura.leituraChar();

		while ((opcao != 'S') && (opcao != 'N')) {
			Visao.digiteUmCaractereValido();
			opcao = Leitura.leituraChar();
		}
		Visao.limpaTela(1);
		if (opcao == 'N')
			Visao.quantidadeNomes(grupoPessoas);
		return ((opcao == 'S') ? true : false);
	}

}
