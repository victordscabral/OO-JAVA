package saida;

import java.text.DecimalFormat;
import dados.Galeria;
import dados.Pintor;
import dados.Quadro;

public class Visao {
	public static void mostraMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public static String mostraMenu() {
		return ("[1] - Cadastrar Novo Quadro" + "\n[2] - Cadastrar Novo Pintor"
				+ "\n[3] - Listar Quadro(s) de um Pintor" + "\n[4] - Mostrar todo(s) Quadro(s)"
				+ "\n[0] - Encerrar Programa\n\n");
	}

	public static void mostraQuadros(Galeria galeria) {
		int indice = 1;

		limpaTela(30);
		System.out.format("%-8s%-30s%-30s%-20s%-20s\n", "INDICE", "IDENTIFICACAO QUADRO", "IDENTIFICACAO PINTOR",
				"PRECO", "ANO AQUISICAO");
		for (Quadro quadro : galeria.getListaQuadros()) {
			System.out.format("%-8s%-30s%-30s%-20s%-20s\n", new DecimalFormat("00").format(indice++),
					quadro.getCodigoIdentificacao(), quadro.getCodigoIdentificacaoPintor(),
					new DecimalFormat("0.00").format(quadro.getPreco()), quadro.getAnoAquisicao());
		}
	}

	public static void mostraQuadrosNome(Galeria galeria, String nome) {
		int indice = 1;
		float total = 0f;
		int codigoProcurado = 0;
		
		limpaTela(30);
		if (codigoProcurado == -1) {
			mostraMensagem("Nenhum quadro encontrado para o pintor [" + nome + "].");
			return;
		}

		mostraMensagem("Quadro(s) encontrado(s) com [" + nome + "].");
		System.out.format("%-8s%-30s%-30s%-20s%-20s\n", "INDICE", "IDENTIFICACAO QUADRO", "IDENTIFICACAO PINTOR",
				"PRECO", "ANO AQUISICAO");
		for (Quadro quadro : galeria.getListaQuadros()) {
			for (Pintor pintor : galeria.getListaPintores()) {
				if (pintor.getNome().toUpperCase().contains(nome.toUpperCase())) {
					codigoProcurado = pintor.getCodigoPessoal();
				}
				if (quadro.getCodigoIdentificacaoPintor().equals(codigoProcurado)) {
					total += quadro.getPreco();
					System.out.format("%-8s%-30s%-30s%-20s%-20s\n", new DecimalFormat("00").format(indice++),
					quadro.getCodigoIdentificacao(), quadro.getCodigoIdentificacaoPintor(),
					new DecimalFormat("0.00").format(quadro.getPreco()), quadro.getAnoAquisicao());
				}
			}
		}
		limpaTela(2);
		mostraMensagem("Soma total dos valores dos quadros: " + new DecimalFormat("0.00").format(total));
	}

	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.println();
	}
}
