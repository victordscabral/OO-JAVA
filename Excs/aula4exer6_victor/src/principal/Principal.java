package principal;

import dados.Pessoa;
import validacao.Validacao;
import saida.Visao;

public class Principal {
	public static void main(String args[]) {
		//Instruções
		do {
			Visao.mostraMensagemInicial();
			
			Pessoa pessoa = new Pessoa(Validacao.validaNome());
			
			Visao.limpaTela(30);
			
			Visao.mostraPessoa(pessoa);
			
			Visao.MostraNomeSeparado(pessoa);
			
			Visao.limpaTela(2);

		}while(Validacao.validaContinua());
	}
}
