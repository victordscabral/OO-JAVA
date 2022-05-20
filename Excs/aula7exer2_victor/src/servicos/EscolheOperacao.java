package servicos;

import dados.ConjuntoPintores;
import dados.Galeria;

public class EscolheOperacao {
	public static void escolheOperacao(Galeria galeria, ConjuntoPintores conjuntoPintores, int opcao) {
		switch (opcao) {
		case '1':
			galeria.cadastraQuadro(galeria);
			break;
		case '2':
			conjuntoPintores.cadastraPintor(conjuntoPintores);
			break;
		}
	}
}
