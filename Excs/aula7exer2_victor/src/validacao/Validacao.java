package validacao;

import java.util.InputMismatchException;

import dados.Galeria;
import dados.ConjuntoPintores;
import leitura.Leitura;
import saida.Visao;

public class Validacao {
	// Valida escolha do usuario
	public static int validaOpcao() {
		// Declaracoes
		int opcao = 0;
		final int MIN_INTERVALO = 0;
		final int MAX_INTERVALO = 4;

		// Instrucoes
		do {
			Visao.mensagemInicial();
			try {
				opcao = Leitura.lerInt();
				Visao.limpaTela(1);
				if (opcao < MIN_INTERVALO || opcao > MAX_INTERVALO)
					System.out.println("Valor invalido!\nEscolha entre uma das opcoes informadas. Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.out.println("Ocorreu um  erro. Digite apenas numeros inteiros!");
			}
		} while (opcao < MIN_INTERVALO || opcao > MAX_INTERVALO);
		return opcao;
	}

	public static int validaCodigoPintor(ConjuntoPintores conjuntoPintores) {
		int codigoPintor = 0;
		boolean erro;
		final int MIN = 1;

		System.out.print("Digite o codigo do pintor (deve ser igual ou maior que " + MIN + "): ");

		do {
			try {
				erro = false;
				codigoPintor = Leitura.lerInt();

				if (codigoPintor < MIN) {
					Visao.limpaTela(1);
					System.out.println("Valor fora do intervalo esperado (deve ser igual ou maior que " + MIN
							+ ")\nDigite novamente: ");
					erro = true;
				} else {
					for (int i = 0; i < conjuntoPintores.getConjuntoPintores().size(); i++) {
						if (conjuntoPintores.getConjuntoPintores().get(i).getCodigoPintor() == codigoPintor) {
							System.out.println("\nCodigo ja existente !! Tente novamente:\n");
							erro = true;
						} else {
							erro = false;
						}
					}
				}

			} catch (InputMismatchException e) {
				System.out.println("\nFormato de codigo invalido !! Digite somente os numeros do codigo.");
				erro = true;
			}
		} while (erro);

		return codigoPintor;
	}

	public static int validaCodigoQuadro(Galeria galeria) {
		int codigoQuadro = 0;
		boolean erro;
		final int MIN = 1;

		System.out.print("Digite o codigo do quadro (deve ser igual ou maior que " + MIN + "): ");

		do {
			try {
				erro = false;
				codigoQuadro = Leitura.lerInt();

				if (codigoQuadro < MIN) {
					Visao.limpaTela(1);
					System.out.println("Valor fora do intervalo esperado (deve ser igual ou maior que " + MIN
							+ ")\nDigite novamente: ");
					erro = true;
				} else {
					for (int i = 0; i < galeria.getGaleria().size(); i++) {
						if (galeria.getGaleria().get(i).getCodigoQuadro() == codigoQuadro) {
							System.out.println("\nCodigo ja existente !! Tente novamente:\n");
							erro = true;
						} else {
							erro = false;
						}
					}
				}

			} catch (InputMismatchException e) {
				System.out.println("\nFormato de codigo invalido !! Digite somente os numeros do codigo.");
				erro = true;
			}
		} while (erro);

		return codigoQuadro;
	}

	// Valida nome do pintor
	public static String validaNomePintor() {
		// Declaracoes
		String nomePintor = new String();

		// Instrucoes
		System.out.println("Nome do pintor:");
		nomePintor = Leitura.lerString();
		while (nomePintor.isBlank()) {
			Visao.limpaTela(2);
			System.out.println("Nenhum nome foi informado, por favor informe um nome valido:");
			nomePintor = Leitura.lerString();
		}
		Visao.limpaTela(1);
		return nomePintor;
	}

	// Valida ano de nascimento do pintor
	public static int validaAnoNascimento() {
		// Declaracoes
		int anoNascimento = 0;
		final int ANO_MINIMO = 1000;

		// Instrucoes
		do {
			System.out.println("Ano de nascimento:");
			try {
				anoNascimento = Leitura.lerInt();
				Visao.limpaTela(2);
				if (anoNascimento < ANO_MINIMO)
					System.out.println("Valor invalido!\nDeve ser maior que " + ANO_MINIMO + ". Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.out.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (anoNascimento < ANO_MINIMO);
		return anoNascimento;
	}

	// Valida preco do quadro
	public static float validaPrecoQuadro() {
		// Declaracoes
		float precoQuadro = -1f;
		// PRECO_MINIMO a critério (alterar caso desejar)
		final float PRECO_MINIMO = 0f;

		// Instrucoes
		do {
			System.out.println("Preco do quadro:");
			try {
				precoQuadro = Leitura.lerFloat();
				Visao.limpaTela(2);
				if (precoQuadro < PRECO_MINIMO)
					System.out.println("Valor invalido!\nDeve ser maior que " + PRECO_MINIMO
							+ ". Caso escreva numero decimal utilize ',' e nao '.'.\n.Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.out.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (precoQuadro < PRECO_MINIMO);
		return precoQuadro;
	}

	// Valida ano de aquisicao do quadro
	public static int validaAnoAquisicaoQuadro() {
		// Declaracoes
		int anoAquisicaoQuadro = 0;
		// ANOMINIMO de aquisicao a critério (alterar caso desejar)
		final int ANOMINIMO = 0;

		// Instrucoes
		do {
			System.out.println("Ano de nascimento:");
			try {
				anoAquisicaoQuadro = Leitura.lerInt();
				Visao.limpaTela(2);
				if (anoAquisicaoQuadro < ANOMINIMO)
					System.out.println("Valor invalido!\nDeve ser maior que " + ANOMINIMO + ". Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.out.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (anoAquisicaoQuadro < ANOMINIMO);
		return anoAquisicaoQuadro;
	}
}
