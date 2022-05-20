package principal;

import java.util.Vector;
import dados.Habitante;
import saida.Visao;
import validacoes.Validacao;

public class Principal {
	public static void main(String[] args) {
		// Declaracoes
		Vector grupoHabitantes = new Vector();
		final int LIMITE = 999;

		// Instrucoes
		do {
			Visao.mensagemInicial();
			Habitante habitante = new Habitante(Validacao.validaSalario(), Validacao.validaIdade(),
					Validacao.validaSexo(), Validacao.validaNumFilhos());
			grupoHabitantes.add(habitante);
		} while (grupoHabitantes.size() < LIMITE && Validacao.validaContinua() == 'S');

		Visao.mostraResultados(grupoHabitantes);
	}
}
