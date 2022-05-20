package principal;

import dados.Galeria;
import dados.ConjuntoPintores;
import saida.Visao;
import validacao.Validacao;
import servicos.EscolheOperacao;

public class Principal {
	public static void main(String[] args) {
		// Declaracoes
		int opcao = 0;
		
		// Instrucoes
		Galeria galeria = new Galeria();
		ConjuntoPintores conjuntoPintores = new ConjuntoPintores();
		while((opcao = Validacao.validaOpcao()) != 0) {
			EscolheOperacao.escolheOperacao(galeria, conjuntoPintores, opcao);
		 }
	}
}
