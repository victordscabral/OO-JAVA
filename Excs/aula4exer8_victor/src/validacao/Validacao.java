package validacao;

import leitura.Leitura;
import saida.Visao;

public class Validacao {

	public static int validaSemana() {
		// Declaracoes
		boolean erro = true;
		int qtdSemanas = 0;

		// Instrucoes
		do {
				qtdSemanas = Leitura.leituraInt();
				if (qtdSemanas != 3 && qtdSemanas != 4) {
					Visao.limpaTela(2);
					Visao.mostraMensagemErroSemana();
					erro = true;
				} else
					erro = false;
		} while (erro);
		return qtdSemanas;
	}
	
	public static float validaVenda() {
		// Declaracoes
		boolean erro = true;
		float venda;
		
		// Instrucoes
		do {
			venda = (Leitura.leituraFloat());
			if (venda < 0) {
				Visao.limpaTela(2);
				Visao.mostraMensagemErroVenda();
				erro = true;
			} else
				erro = false;
		} while (erro);
		return venda;
	}
}
