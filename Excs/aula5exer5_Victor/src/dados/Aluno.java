package dados;

public class Aluno {

	private StringBuilder nomeAluno;
	private int matricula;
	private float media;

	// Metodos Construtores
	public Aluno(StringBuilder nomeAluno, int matricula, float media) {
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.media = media;
	}

	// Metodos Acessores
	public StringBuilder getNomeAluno() {
		return nomeAluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public float getMedia() {
		return media;
	}

	public void setNome(StringBuilder nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setMedia(float media) {
		this.media = media;
	}

}
