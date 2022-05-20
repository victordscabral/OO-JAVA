package saida;

import dados.GrupoEventos;

public class Visao {
	// Mostra mensagem inicial
	public static void mensagemInicial() {
		Visao.limpaTela(1);
		System.out.println("Digite os seguintes dados:");
		Visao.limpaTela(1);
	}
	
	// Mostra resultados
	public static void mostraRelatorio(GrupoEventos grupoEventos) {
		
		limpaTela(35);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("ANO\tPRESIDENTE\t\t\tEVENTO");
		System.out.println("---------------------------------------------------------------------------------");

		for(int i = 0; i < grupoEventos.getGrupoEventos().size(); i++) {
			System.out.println(grupoEventos.getEvento(i).toString());
		}
	}

	// Salta quantidade de linhas desejadas
	public static void limpaTela(int linhas) {
		for (int i = 0; i < linhas; i++)
			System.out.println();
	}
}
