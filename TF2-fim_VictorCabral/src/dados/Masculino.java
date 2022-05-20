package dados;

public class Masculino extends Pessoa {
	private Integer idade;

	public Masculino(Integer identificador, String nome, Character situacaoSaude, Integer idade) {
		super(identificador, nome, situacaoSaude);
		setIdade(idade);
	}

	// Getters
	public Integer getIdade() {
		return idade;
	}

	@Override
	public String getFoiGestantePorExtenso() {
		return null;
	}

	@Override
	public Character getFoiGestante() {
		return null;
	}

	// Setters
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	// Metodo toString
	@Override
	public String toString() {
		String pessoa = ("IDENTIFICADOR: " + getIdentificador() + "\nNOME COMPLETO: "
				+ getNome().toString().toLowerCase() + "\nSITUACAO DE SAUDE: " + getSituacaoSaudePorExtenso()
				+ "\nIDADE: " + getIdade());
		return pessoa;
	}
}
