package validacao;

import javax.swing.*;
import dados.Galeria;
import dados.Pintor;
import dados.Quadro;
import saida.Visao;

public class Validacao {
	public static int validaEscolha(String mensagem) {
		int escolha = -1;

		try {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null, Visao.mostraMenu() + mensagem, "Menu",
					JOptionPane.PLAIN_MESSAGE));
			if (escolha < 0 || escolha > 4) {
				JOptionPane.showMessageDialog(null, "Erro, opcao invalida.", "Erro", JOptionPane.ERROR_MESSAGE);
				escolha = validaEscolha(mensagem);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro, a entrada deve ser numerica.", "Erro",
					JOptionPane.ERROR_MESSAGE);
			escolha = validaEscolha(mensagem);
		}
		return escolha;
	}

	public static String validaNome(String mensagem) {
		String nome = JOptionPane.showInputDialog(null, mensagem, "", JOptionPane.PLAIN_MESSAGE);
		if (nome.length() < 3 || isNomeComNumeros(nome)) {
			JOptionPane.showMessageDialog(null, "Erro, o nome deve conter ao menos 3 caracteres e nao possuir digitos.",
					"Erro", JOptionPane.ERROR_MESSAGE);
			nome = validaNome(mensagem);
		}

		return nome;
	}

	public static float validaPreco(String mensagem) {
		final float MIN = 0;
		float preco = MIN - 1;

		try {
			preco = Float.parseFloat(JOptionPane.showInputDialog(null, mensagem, "", JOptionPane.PLAIN_MESSAGE));
			if (preco < MIN) {
				JOptionPane.showMessageDialog(null, "Erro, o valor deve ser ao menos " + MIN + " (doado).", "Erro",
						JOptionPane.ERROR_MESSAGE);
				preco = validaPreco(mensagem);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro, a entrada deve ser numerica.", "Erro",
					JOptionPane.ERROR_MESSAGE);
			preco = validaPreco(mensagem);
		}
		return preco;
	}

	public static int validaAno(String mensagem) {
		final int ANOMINIMO = 1000, ATUAL = 2020;
		int ano = validaInteiro(mensagem);
		if (ano <= ANOMINIMO || ano > ATUAL) {
			JOptionPane.showMessageDialog(null, "Erro, o valor deve estar entre " + ANOMINIMO + " e " + ATUAL + ".",
					"Erro", JOptionPane.ERROR_MESSAGE);
			ano = validaAno(mensagem);
		}
		return ano;
	}

	public static int validaCodigoPessoal(Galeria galeria, String mensagem) {
		int codigoPessoal = validaInteiro(mensagem);
		if (codigoPessoal < 1 || isCodigoPessoalRepetido(galeria, codigoPessoal)) {
			JOptionPane.showMessageDialog(null, "Erro, o valor do codigo deve ser ao menos 1 e ser unico.", "Erro",
					JOptionPane.ERROR_MESSAGE);
			codigoPessoal = validaCodigoPessoal(galeria, mensagem);
		}
		return codigoPessoal;
	}

	public static int validaCodigoPintor(Galeria galeria, String mensagem) {
		int codigoPessoal = validaInteiro(mensagem);
		if (codigoPessoal < 1 || !isCodigoPessoalRepetido(galeria, codigoPessoal)) {
			JOptionPane.showMessageDialog(null, "Erro, o valor do codigo deve ser ao menos 1 e pertencer a um pintor.",
					"Erro", JOptionPane.ERROR_MESSAGE);
			codigoPessoal = validaCodigoPintor(galeria, mensagem);
		}
		return codigoPessoal;
	}

	public static int validaCodigoQuadro(Galeria galeria, String mensagem) {
		int codigoQuadro = validaInteiro(mensagem);
		if (codigoQuadro < 1 || isCodigoQuadroRepetido(galeria, codigoQuadro)) {
			JOptionPane.showMessageDialog(null, "Erro, o valor do codigo deve ser ao menos 1 e ser unico.", "Erro",
					JOptionPane.ERROR_MESSAGE);
			codigoQuadro = validaCodigoQuadro(galeria, mensagem);
		}
		return codigoQuadro;
	}

	private static boolean isCodigoQuadroRepetido(Galeria galeria, int codigoQuadro) {
		for (Quadro quadro : galeria.getListaQuadros()) {
			if (quadro.getCodigoIdentificacao().equals(codigoQuadro)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isCodigoPessoalRepetido(Galeria galeria, int codigoPessoal) {
		for (Pintor pintor : galeria.getListaPintores()) {
			if (pintor.getCodigoPessoal().equals(codigoPessoal)) {
				return true;
			}
		}
		return false;
	}

	private static int validaInteiro(String mensagem) {
		int valor = -1;

		try {
			valor = Integer.parseInt(JOptionPane.showInputDialog(null, mensagem, JOptionPane.PLAIN_MESSAGE));
			if (valor < 0) {
				JOptionPane.showMessageDialog(null, "Erro, o valor deve ser positivo", "Erro",
						JOptionPane.ERROR_MESSAGE);
				valor = validaInteiro(mensagem);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro, a entrada deve ser numerica.", "Erro",
					JOptionPane.ERROR_MESSAGE);
			valor = validaInteiro(mensagem);
		}
		return valor;
	}

	private static boolean isNomeComNumeros(String nome) {
		for (char c : nome.toCharArray()) {
			if (Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}
}
