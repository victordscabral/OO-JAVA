package principal;

import java.util.Vector;
import leitura.Leitura;
import validacao.Validacao;
import saida.Visao;
import dados.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// DECLARACOES
		Vector grupoPessoas = new Vector();

		// INSTRUCOES
		Visao.mensagemInicial();
		do {
			grupoPessoas.removeAllElements();
			do {
				Visao.solicitarNome();
				Pessoa pessoa = new Pessoa(Validacao.validaNome(Leitura.leituraString()));
				grupoPessoas.add(pessoa);
			} while (Validacao.validaContinua());
			Visao.sequenciaApresentacao(grupoPessoas);
		} while (Validacao.validaContinua(grupoPessoas));
	}
}
