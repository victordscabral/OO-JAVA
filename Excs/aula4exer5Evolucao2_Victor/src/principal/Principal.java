package principal;

import dados.Pessoa;
import validacao.Validacao;
import saida.Visao;

public class Principal {

	public static void main(String[] args) {

		do {
			Visao.mostraMensagemInicial();
			Pessoa pessoa = new Pessoa(Validacao.validaNome());
			Visao.limpaTela(30);
			Visao.mostraNomeInformado(pessoa.getString());
			Visao.mostraPassageiro(pessoa.getString());
			
		} while (Validacao.validaContinua());
	}

}
