package principal;

import javax.swing.JOptionPane;
import dados.Galeria;
import dados.Pintor;
import dados.Quadro;
import saida.Visao;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		// Atributos
		Galeria galeria = new Galeria();
		int escolha;

		// Metodos
		do {
			escolha = Validacao.validaEscolha("Opcao:");
			switch (escolha) {
			case 1:
				if (galeria.getListaPintores().isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"Erro, e necessario registra ao menos 1 pintor para acessar a opcao.", "Erro",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Visao.limpaTela(30);
					galeria.setQuadro(new Quadro(Validacao.validaCodigoQuadro(galeria, "Determine o codigo do Quadro:"),
							Validacao.validaCodigoPintor(galeria,
									"Determine o codigo do Pintor responsavel pelo quadro:"),
							Validacao.validaPreco("Determine o preco do quadro: [0 caso tenha sido doado]"),
							Validacao.validaAno("Determine o ano da compra do quadro:")));
				}
				break;
			case 2:
				Visao.limpaTela(30);
				galeria.setPintor(new Pintor(Validacao.validaNome("Determine o nome do Pintor:"),
						Validacao.validaCodigoPessoal(galeria, "Determine o codigo do Pintor:"),
						Validacao.validaAno("Determine o ano de nascimento do pintor:")));
				break;
			case 3:
				if (galeria.getListaQuadros().isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"Erro, e necessario registra ao menos 1 quadro para acessar a opcao.", "Erro",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Visao.limpaTela(30);
					Visao.mostraQuadrosNome(galeria, JOptionPane.showInputDialog(null, "Digite o nome a ser procurado:",
							"", JOptionPane.PLAIN_MESSAGE));
				}
				break;
			case 4:
				if (galeria.getListaQuadros().isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"Erro, e necessario registra ao menos 1 quadro para acessar a opcao.", "Erro",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Visao.limpaTela(30);
					Visao.mostraQuadros(galeria);
				}
			}
			Visao.limpaTela(3);
		} while (escolha != 0);
	}
}