package principal;

import dados.Pessoa;
import leitura.Leitura;
import saida.Visao;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {

		boolean aux = false;

		while (aux == false && Validacao.validaExecucao()) {
			Pessoa nome = new Pessoa();
			int contador = 0;

			do {
				do {
					nome.setNomes(Validacao.validaNome());
					Visao.limpaTela(2);
				} while (Validacao.validaCadastroNome());

				Visao.limpaTela(50);
				if (!nome.getNomes().isEmpty()) {
					Visao.mostraRelatorio(nome);
				}

				contador = nome.getNomes().size();
				nome.zeraVetor();
				Visao.limpaTela(50);
			} while (Validacao.validaNovoGrupo());
			aux = true;
			Visao.mostraMensagem("\nA ultima lista teve " + contador + " nomes cadastrados");
		}
	}
}
