package principal;

import java.util.Vector;
import dados.Habitante;
import saida.Visao;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		// Declaracoes
		Vector<Habitante> grupoHabitantes = new Vector<Habitante>();
		final int LIMITE = 999;

		// Instrucoes
		do {
			Visao.mensagemInicial();
			Habitante habitante = new Habitante(Validacao.validaSalario(), Validacao.validaIdade(),
					Validacao.validaSexo(), Validacao.validaNumeroFilhos());
			grupoHabitantes.add(habitante);
		} while (grupoHabitantes.size() < LIMITE && Validacao.validaContinua());

		Visao.imprimeResultado(grupoHabitantes);
	}
}

