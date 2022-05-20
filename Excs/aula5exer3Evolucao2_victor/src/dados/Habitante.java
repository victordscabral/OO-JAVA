package dados;

public class Habitante {
	// Declaracoes
	private Float salario;
	private Integer idade;
	private Integer numeroFilhos;
	private Character sexo;

	// Metodo construtor
	public Habitante(float salario, int idade, char sexo, int numeroFilhos) {
		setSalario(salario);
		setIdade(idade);
		setSexo(sexo);
		setNumeroFilhos(numeroFilhos);
	}

	// Getters e Setters
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setNumeroFilhos(int numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
	}

	public Float getSalario() {
		return salario;
	}

	public Integer getIdade() {
		return idade;
	}

	public Character getSexo() {
		return sexo;
	}

	public Integer getNumeroFilhos() {
		return numeroFilhos;
	}
}
