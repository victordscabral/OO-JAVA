package principal;

import dados.Evento;
import dados.GrupoEventos;
import saida.Visao;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		// Declaracoes
		GrupoEventos grupoEventos = new GrupoEventos();

		// Instrucoes
		do {
			Visao.mensagemInicial();
			Evento evento = new Evento(Validacao.validaAno(), Validacao.validaPresidente(), Validacao.validaEvento());
			grupoEventos.setEvento(evento);
		} while (Validacao.validaContinua());

		Visao.mostraRelatorio(grupoEventos);
	}
}

