package principal;

import java.util.Vector;
import dados.Aluno;
import saida.Visao;
import validacoes.Validacao;

public class Principal {
	public static void main(String[] args) {
		// Declaracoes
		Vector alunos = new Vector();

		// Instrucoes
		do {
			Visao.mensagemInicial();
			Aluno aluno = new Aluno(Validacao.validaNomeAluno(), Validacao.validaMatricula(alunos), Validacao.validaMedia());
			alunos.add(aluno);
		} while (Validacao.validaContinua() == 'S');

		Visao.mostraTabela(alunos);
	}
}
