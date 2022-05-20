package servicos;

import java.util.Vector;
import dados.Aluno;

public class Calculos {
	public static float media(Vector alunos) {
		// Declaracoes
		float media = 0F;

		// Instrucoes
		for (int aux = 0; aux < alunos.size(); aux++) {
			Aluno aluno = (Aluno) alunos.get(aux);
			media += aluno.getMedia();
		}
		return media/alunos.size();
	}

}
