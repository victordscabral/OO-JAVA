package validacoes;

import java.util.InputMismatchException;

import java.util.Vector;
import dados.Aluno;
import leitura.Leitura;
import saida.Visao;

public class Validacao {
	// Validacao do nome
	public static StringBuilder validaNomeAluno() {
		// Declaracoes
		String nome = new String();
		
		// Instrucoes
		System.out.println("Nome:");
		nome = Leitura.lerString();
		while (nome.isEmpty()) {
			Visao.limpaTela(2);
			System.out.println("Nenhum nome foi informado, por favor informe um nome valido:");
			nome = Leitura.lerString();
		}
		StringBuilder nomeAluno = new StringBuilder(nome);
		Visao.limpaTela(1);
		return nomeAluno;
	}
	
	// Validacao da matricula
	public static int validaMatricula(Vector alunos) {
		final int MAX = 1000;
		int matricula = 0;
		boolean erro = false;

		System.out.println("Matricula (deve ser maior que " + MAX +"):");
		do {
			try {
				matricula = Leitura.lerInt();
				while (matricula <= MAX) {
					Visao.limpaTela(2);
					System.out.println("Valor fora do intervalo esperado (deve ser maior que " + MAX + ")\nDigite novamente:");
					matricula = Leitura.lerInt();
				}
				for (int aux = 0; aux < alunos.size(); aux++) {
					Aluno aluno = (Aluno) alunos.get(aux);
					while (matricula == aluno.getMatricula() || matricula <= MAX) {
						Visao.limpaTela(2);
						if(matricula <= MAX)
							System.out.println("Valor fora do intervalo esperado (deve ser maior que " + MAX + ")\nDigite novamente:");
						if(matricula == aluno.getMatricula())
							System.out.println("Matricula repetida!\nDigite novamente:");
						matricula = Leitura.lerInt();
					}
				}
			} catch (InputMismatchException e) {
				Visao.limpaTela(2);
				System.out.println("Erro, entrada fora do padrao esperado (inteiros)\nDigite novamente:");
				erro = true;
			}
		} while (erro);

		Visao.limpaTela(1);
		return matricula;
	}
	
	// Validacao da media
	public static float validaMedia() {
		float media = 0F;
		boolean erro = false;

		System.out.println("Media (deve ser entre 0 e 10):");
		do {
			try {
				media = Leitura.lerFloat();
				if (media < 0 || media > 10) {
					Visao.limpaTela(2);
					System.out.println("Valor fora do intervalo esperado (entre 0 e 10)\nDigite novamente:");
					erro = true;
				} else {
					erro = false;
				}
			} catch (InputMismatchException e) {
				Visao.limpaTela(2);
				System.out.println("Erro, entrada fora do padrao esperado (inteiros)\nDigite novamente:");
				erro = true;
			}
		} while (erro);

		Visao.limpaTela(1);
		return media;
	}

	// Valida continuacao
	public static char validaContinua() {
		char escolha = 0;

		System.out.println("Deseja continuar?\nDigite 'S' para sim ou 'N' para nao:");
		do {
			escolha = Leitura.lerChar();
			if (escolha != 'S' && escolha != 'N')
				System.out.println("Erro, valor fora dos padroes esperados!\nTente novamente:");
		} while (escolha != 'S' && escolha != 'N');

		Visao.limpaTela(30);

		return escolha;
	}

}
