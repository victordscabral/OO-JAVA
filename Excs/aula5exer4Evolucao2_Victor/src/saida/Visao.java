package saida;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Vector;

import dados.Pessoa;
import validacao.Validacao;

public class Visao {

	public static void mostraMensagem(String msg) {
		System.out.println(msg);
	}

	public static void limpaTela(int linhas) {
		for (int i = 0; i < linhas; i++) {
			System.out.println();
		}
	}

	private static void mostraNomes(Vector<String> nomes) {
		int indice = 1;
		DecimalFormat mascara = new DecimalFormat("00");
		String formato = "%-10s%-30s\n";

		System.out.format(formato, "Indice", "Nome");
		for (String nome : nomes) {
			System.out.format(formato, mascara.format(indice++), nome);
		}
	}

	public static void mostraRelatorioInsercao(Pessoa grupo) {
		Visao.mostraMensagem("Nomes cadastrados por ordem de cadastro");
		Visao.mostraNomes(grupo.getNomes());
	}

	public static void mostraRelatorioInsercaoInverso(Pessoa grupo) {
		Vector<String> nomes = new Vector<>(grupo.getNomes());

		Collections.reverse(nomes);
		Visao.mostraMensagem("Nomes cadastrados por ordem inversa de cadastro");
		Visao.mostraNomes(nomes);
	}

	public static void mostraRelatorio(Pessoa grupo) {
		int opcaoRelatorio;

		while ((opcaoRelatorio = Validacao.validaRelatorio()) != '0') {
			Visao.limpaTela(50);
			switch (opcaoRelatorio) {
			case '1':
				Visao.mostraRelatorioInsercao(grupo);
				break;
			case '2':
				Visao.mostraRelatorioInsercaoInverso(grupo);
			}
			Visao.limpaTela(2);
		}
	}
}