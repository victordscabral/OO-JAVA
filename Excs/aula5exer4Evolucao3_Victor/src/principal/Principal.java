package principal;

import dados.Pessoa;
import leitura.Leitura;
import saida.Visao;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {

		boolean aux = false;

		while (aux == false && Validacao.validaExecucao()) {
			Pessoa nomes = new Pessoa();
			int contador = 0;

			do {
				do {
					nomes.adicionaNome(Validacao.validaNome());
					Visao.limpaTela(2);
				} while (Validacao.validaCadastroNome());

				Visao.limpaTela(50);
				if (!nomes.getNomes().isEmpty()) {
					Visao.mostraRelatorio(nomes);
				}

				contador = nomes.getNomes().size();
				nomes.zeraVetor();
				Visao.limpaTela(50);
			} while (Validacao.validaNovoGrupo());
			aux = true;
			Visao.mostraMensagem("\nA ultima lista teve " + contador + " nomes cadastrados");
		}
	}
}
