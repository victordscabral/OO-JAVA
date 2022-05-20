package validacao;

import leitura.Leitura;
import saida.Visao;

public class Validacao {

	// VALIDACAO DO NOME
	public static boolean validaNome(String nome) {
		int espacos = 0;
		int aux = 0;

		while (aux < nome.length()) {
			if (nome.charAt(aux) == ' ')
				espacos++;
			aux++;
		}

		// EVITAR ENTER COMO ENTRADA
		if (nome.length() != 0) {

			if (espacos == 0) {
				Visao.nomeInvalido();
				return false;
			} else {
				return true;
			}

		} else {
			Visao.entradaVaziaInvalida();
			return false;
		}
	}

	// PRIMEIRO NOME
	public static StringBuilder primeiroNome(String nome) {
		// DECLARACOES
		int primeiroEspaco = 0;
		int aux = 0;

		// INSTRUCOES
		while (nome.charAt(aux) != ' ')
			aux++;
		
		primeiroEspaco = aux;

		StringBuilder nomeInicial = new StringBuilder(nome);
		nomeInicial.delete(primeiroEspaco, nome.length());

		return nomeInicial;
	}

	// ÚLTIMO NOME
	public static StringBuilder ultimoNome(String nome) {
		// DECLARACOES
		int ultimoEspaco = 0;
		int aux = 0;

		// INSTRUCOES
		while (aux < nome.length()) {
			if (nome.charAt(aux) == ' ')
				ultimoEspaco = aux;
			aux++;
		}

		StringBuilder nomeFinal = new StringBuilder(nome);
		nomeFinal.delete(0, ultimoEspaco + 1);

		return nomeFinal;
	}
	
	public static boolean validaContinua() {
		// DECLARACOES
		char opcao;
		
		// INSTRUCOES
		Visao.verificarContinuacao();

		opcao = Leitura.leituraChar();		
		
		while((opcao != 'S') && (opcao != 'N')) {
			Visao.digiteUmCaractereValido();
			opcao = Leitura.leituraChar();
		}
		Visao.limpaTela(30);
		return ((opcao =='S') ? true : false);	
	}

}
