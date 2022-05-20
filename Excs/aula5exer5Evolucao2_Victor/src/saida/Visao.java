package saida;

import java.text.DecimalFormat;
import dados.GrupoAlunos;
import validacao.Validacao;

public class Visao {
	public static void mostraRelatorio(GrupoAlunos grupoAlunos) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		
		limpaConsole(35);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("MATRICULA\tMEDIA FINAL\t\tNOME");
		System.out.println("---------------------------------------------------------------------------------");

		for(int i = 0; i < grupoAlunos.getGrupoAlunos().size(); i++) {
			System.out.println(grupoAlunos.getAluno(i).toString());
		}
		System.out.println("\n\nMEDIA GERAL: " + mascara.format(Validacao.validaMediaGeral(grupoAlunos)));
	}
	
	public static void limpaConsole(int linhas) {
		for(int i =0; i < linhas; i++) 
			System.out.println();
	}
}
