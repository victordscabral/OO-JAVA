package principal;

import dados.Animais;
import dados.Macaco;
import dados.Baleia;
import dados.Elefante;
import saida.Visao;
import validacao.Validacao;

public class Principal {
	public static void main (String [] args) {
		// Atributos
		Animais animais = new Animais();
		int opcao;
		
		// Metodos
		do {
			Visao.mostraMenu();
			opcao = Validacao.validaOpcao();
			Visao.limpaTela(50);
			switch (opcao) {
			case 1:
				System.out.println("MACACO:");
				Macaco macaco = new Macaco(Validacao.validaIdadeAmamentacao(), Validacao.validaIdadeVida(),
						Validacao.validaDescricaoEspecie(), Validacao.validaTamanho(), Validacao.validaPorte());
				animais.setAnimais(macaco);
				break;
			case 2:
				System.out.println("ELEFANTE:");
				Elefante elefante = new Elefante(Validacao.validaIdadeAmamentacao(), Validacao.validaIdadeVida(),
						Validacao.validaDescricaoEspecie(), Validacao.validaTamanho(), Validacao.validaPeso(), Validacao.validaHabitat());
				animais.setAnimais(elefante);
				break;
			case 3:
				System.out.println("BALEIA:");
				Baleia baleia = new Baleia(Validacao.validaIdadeAmamentacao(), Validacao.validaIdadeVida(),
						Validacao.validaDescricaoEspecie(), Validacao.validaTamanho(), Validacao.validaPeso());
				animais.setAnimais(baleia);
			}
			Visao.limpaTela(10);
		} while (opcao != 0);
		Visao.mostraAnimais(animais);
	}
}