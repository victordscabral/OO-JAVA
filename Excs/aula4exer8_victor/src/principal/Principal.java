package principal;

import saida.Visao;
import validacao.Validacao;
import dados.GrupoVendas;
import dados.Semanas;
import dados.Venda;

public class Principal {
	public static void main(String args[]) {
		//Declaracoes
		final int QTDVENDEDORES = 4;
		
		//Instruções
		Visao.mostraMensagemInicial();
			
		Visao.mostraMensagemSemana();
			
		Semanas qtdSemanas = new Semanas(Validacao.validaSemana());
		
		GrupoVendas grupoVendas = new GrupoVendas(qtdSemanas.getQtdSemanas());
		
		for(int numVendedor = 0; numVendedor < QTDVENDEDORES; numVendedor++) {
			Visao.limpaTela(2);
			Visao.mostraMensagemQualVendedor(numVendedor);
			Visao.limpaTela(1);
			
			for(int numSemanas = 0; numSemanas < qtdSemanas.getQtdSemanas(); numSemanas++) {
				Visao.mostraMensagemQualSemana(numSemanas);
				Venda venda = new Venda(Validacao.validaVenda());
				grupoVendas.setGrupoVendas(venda, numVendedor, numSemanas);
			}
		}
			
		Visao.mostraMensagemValoresTotais(grupoVendas, QTDVENDEDORES, qtdSemanas.getQtdSemanas());
		
	}
}
