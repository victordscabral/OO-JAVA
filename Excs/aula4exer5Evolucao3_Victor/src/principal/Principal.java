package principal;

import leitura.Leitura;
import validacao.Validacao;
import saida.Visao;

public class Principal {

	public static void main(String[] args) {
		// DECLARACOES
		String nome = new String();
		StringBuilder primeiroNome;
		StringBuilder ultimoNome;
		

		// INSTRUCOES
		do {
			Visao.solicitarNome();
			do {
				nome = Leitura.leituraString();
			} while (!Validacao.validaNome(nome));

			primeiroNome = Validacao.primeiroNome(nome);
			ultimoNome = Validacao.ultimoNome(nome);

			Visao.nomeConcatenado(primeiroNome, ultimoNome);

		} while (Validacao.validaContinua());
		
		Visao.mensagemFinal();

	}
}
