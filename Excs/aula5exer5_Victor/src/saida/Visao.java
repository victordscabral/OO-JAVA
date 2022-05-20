package saida;

import java.text.DecimalFormat;
import java.util.Vector;
import dados.Aluno;
import servicos.Calculos;

public class Visao {

	// Mostra mensagem inicial
	public static void mensagemInicial() {
		Visao.limpaTela(1);
		System.out.println("Digite os seus seguintes dados dos alunos:");
		Visao.limpaTela(1);
	}

	// Apresenta o resultado final
	public static void mostraTabela(Vector alunos) {
		// Declaracoes
		DecimalFormat centesimo = new DecimalFormat("0.00");

		// Instrucoes
		limpaTela(45);
		System.out.println("  MATRICULA \t|     MEDIA \t|     NOME");
		for (int aux = 0; aux < 55; aux++)
			System.out.print("-");
		Visao.limpaTela(1);		
		for (int aux = 0; aux< alunos.size(); aux++){
			Aluno aluno = (Aluno) alunos.get(aux);
			System.out.print(aluno.getMatricula() + "\t\t|");
			System.out.print(centesimo.format(aluno.getMedia()) + "\t\t|");
			System.out.println(aluno.getNomeAluno());
		}
		Visao.limpaTela(1);
		System.out.println("Media geral: " + centesimo.format(Calculos.media(alunos)));
	}

	// Salta linhas (limpa tela)
	public static void limpaTela(int linhas) {
		for (int i = 0; i < linhas; i++)
			System.out.println();
	}

}
