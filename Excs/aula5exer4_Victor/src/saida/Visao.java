package saida;

import leitura.Leitura;
import validacao.Validacao;
import java.util.Vector;
import dados.Pessoa;

public class Visao {
	public static void mensagemInicial() {
		System.out.println("Digite quantos nomes desejar.");
	}

	public static void solicitarNome() {
		System.out.println("Nome:");
	}

	public static void nomeInvalido() {
		limpaTela(1);
		System.out.println("Nenhum nome foi informado, por favor informe um nome valido:");
	}

	public static void verificarContinuacao() {
		limpaTela(1);
		System.out.println("Deseja continuar? Se sim, digite 'S'. Se nao, digite 'N'.");
	}

	public static void digiteUmCaractereValido() {
		limpaTela(1);
		System.out.println("Opção invalida! Continuar cadastrando?\nDigite 'S' para sim e 'N' para nao:");
	}

	public static void escolherSequencia() {
		System.out.println("Escolha a sequencia de apresentacao dos nomes. Digite:\n");
		System.out.println(
				"1- Sequência de inserção\n2- Sequência inversa de inserção\n0- Encerra sem mostrar os nomes cadastrados");
	}
	
	public static void quantidadeNomes(Vector grupoPessoas) {
		Visao.limpaTela(30);
		System.out.println("Quantidade de nomes cadastrados na última lista: " + grupoPessoas.size() + "\nObrigado!");
	}

	public static void mensagemFinal() {
		limpaTela(1);
		System.out.println("Encerrado!");
	}

	public static void sequencia(Vector grupoPessoas) {
		System.out.println("Sequencia de insercao:\n");
		for (int aux = 0; aux < grupoPessoas.size(); aux++) {
			Pessoa pessoa = (Pessoa) grupoPessoas.get(aux);
			System.out.println(pessoa.getNome());
		}
	}
	
	public static void sequenciaInversa(Vector grupoPessoas) {
		System.out.println("Sequencia de insercao inversa:\n");
		for (int aux = grupoPessoas.size() - 1; aux >= 0; aux--) {
			Pessoa pessoa = (Pessoa) grupoPessoas.get(aux);
			System.out.println(pessoa.getNome());
		}
	}
	
	public static void sequenciaApresentacao(Vector grupoPessoas) {
		Visao.escolherSequencia();
		switch (Validacao.validaNumero()) {
		case 0: {
			Visao.mensagemFinal();
			break;
		}
		case 1: {
			Visao.limpaTela(30);
			Visao.sequencia(grupoPessoas);
			break;
		}
		case 2: {
			Visao.limpaTela(30);
			Visao.sequenciaInversa(grupoPessoas);

		}
		}
	}

	public static void limpaTela(int linhas) {
		for (int aux = 0; aux < linhas; aux++) {
			System.out.println();
		}
	}
}
