package dados;

public class Habitante {

	private float salario;
	private int idade;
	private char sexo;
	private int numFilhos;

	// Metodos Construtores
	public Habitante(float salario, int idade, char sexo, int numFilhos) {
		this.salario = salario;
		this.idade = idade;
		this.sexo = sexo;
		this.numFilhos = numFilhos;
	}

	// Metodos Acessores
	public float getSalario() {
		return salario;
	}

	public int getIdade() {
		return idade;
	}

	public char getSexo() {
		return sexo;
	}

	public int getNumFilhos() {
		return numFilhos;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}

}
