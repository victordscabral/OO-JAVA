package validacoes;

import java.util.InputMismatchException;

import leitura.Leitura;
import saida.Visao;

public class Validacao {
	// Valicao de salario
	public static float validaSalario() {
		float salario = 0F;
		boolean erro = false;

		System.out.println("Salario (deve ser maior que 0):");
		do {
			try {
				salario = Leitura.lerFloat();
				if (salario < 0) {
					Visao.limpaTela(2);
					System.out.println("Valor fora do intervalo esperado (maior que 0)\nDigite novamente: ");
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

		Visao.limpaTela(1);
		return salario;
	}

	// Valicao de idade
	public static int validaIdade() {
		int idade = 0;
		boolean erro = false;

		System.out.println("Idade (maior que 0 e menor que 200):");
		do {
			try {
				idade = Leitura.lerInt();
				if (idade < 0 || idade > 200) {
					Visao.limpaTela(2);
					System.out.println("Valor fora do intervalo esperado (0 - 200)\nDigite novamente: ");
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

		Visao.limpaTela(1);
		return idade;
	}

	// Valicao de sexo
	public static char validaSexo() {
		char sexo = 0;

		System.out.println("Sexo, sendo M ou m para masculino e F ou f para Feminino:");
		do {
			sexo = Leitura.lerChar();
			if (sexo != 'M' && sexo != 'F') {
				Visao.limpaTela(2);
				System.out.println("Erro, caracter fora dos padroes esperados!\nTente novamente: ");
			}
		} while (sexo != 'M' && sexo != 'F');

		Visao.limpaTela(1);
		return sexo;
	}

	// Valicao de numero de filhos
	public static int validaNumFilhos() {
		// Atributo local
		int numFilhos = 0;
		boolean erro = false;

		System.out.println("Numero de filhos:");
		do {
			try {
				numFilhos = Leitura.lerInt();
				if (numFilhos < 0) {
					Visao.limpaTela(2);
					System.out.println("Valor fora do intervalo esperado (maior que 0)\nDigite novamente: ");
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

		Visao.limpaTela(1);
		return numFilhos;
	}

	// Valida continuacao
	public static char validaContinua() {
		char escolha = 0;

		System.out.println("Deseja continuar?\nDigite 'S' para sim ou 'N' para nao: ");
		do {
			escolha = Leitura.lerChar();
			if (escolha != 'S' && escolha != 'N')
				System.out.println("Erro, valor fora dos padroes esperados!\nTente novamente: ");
		} while (escolha != 'S' && escolha != 'N');

		Visao.limpaTela(30);

		return escolha;
	}

}
