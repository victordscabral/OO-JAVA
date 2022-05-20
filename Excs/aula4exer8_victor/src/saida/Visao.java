package saida;

import dados.GrupoVendas;

public class Visao {

	public static void limpaTela(int linhas) {
		for (int aux = 0; aux < linhas; aux++)
			System.out.println();
	}

	public static void mostraMensagemInicial() {
		System.out.println(
				"Digite as vendas semanais dos vendedores durante um mês e a quantidade de semanas desse mês (3 ou 4).");
	}

	public static void mostraMensagemSemana() {
		System.out.println("Quantidade de semanas desse mês (3 ou 4):");
	}
	
	public static void mostraMensagemErroSemana() {
		System.out.println("Valor inválido! Devem ser 3 ou 4 semanas, tente novamente:");
	}
	
	public static void mostraMensagemErroVenda() {
		System.out.println("Valor inválido! Não pode ser número negativo, tente novamente:");
	}

	public static void mostraMensagemQualVendedor(int numVendedor) {
		System.out.println("*Vendedor " + (numVendedor + 1) + "*");
	}
	
	public static void mostraMensagemQualSemana(int numSemana) {
		System.out.println("Semana " + (numSemana + 1) + ":");
	}
	
	public static void mostraMensagemValoresTotais(GrupoVendas grupoVendas, int qtdVendedores, int qtdSemanas) {
		for(int numVendedor = 0; numVendedor < qtdVendedores; numVendedor++) {
			for(int numSemanas = 0; numSemanas < qtdSemanas; numSemanas++) {
				System.out.println(grupoVendas.getGrupoVendas(numVendedor, numSemanas));
			}
		}
	}	
	
}
