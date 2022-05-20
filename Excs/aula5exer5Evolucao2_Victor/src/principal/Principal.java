package principal;

import dados.*;
import saida.Visao;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		GrupoAlunos grupoAlunos = new GrupoAlunos();
		
		while(Validacao.isContinuaCadastro()) {
			Aluno aluno = new Aluno(Validacao.validaNome(), Validacao.validaMatricula(grupoAlunos), Validacao.validaMedia());
			grupoAlunos.setAluno(aluno);
		}
		
		Visao.mostraRelatorio(grupoAlunos);
	}
}
