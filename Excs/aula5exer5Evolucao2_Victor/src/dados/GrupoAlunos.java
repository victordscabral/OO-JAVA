package dados;

import java.util.ArrayList;

public class GrupoAlunos {
	private ArrayList<Aluno> grupoAlunos;
	
	public GrupoAlunos() {
		grupoAlunos = new ArrayList<Aluno>();
	}
	
	public ArrayList<Aluno> getGrupoAlunos() {
		return this.grupoAlunos;
	}
	
	public Aluno getAluno(int i) {
		return grupoAlunos.get(i);
	}
	
	public void setAluno(Aluno aluno) {
		this.grupoAlunos.add(aluno);
	}
}
