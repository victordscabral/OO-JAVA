package dados;

public abstract class Pessoa {
	private Integer identificador;
	private StringBuilder nome;
	private Character situacaoSaude;

// Metodo Contrutor
	public Pessoa(Integer identificador, String nome, Character situacaoSaude) {
		setIdentificador(identificador);
		setNome(nome);
		setSituacaoSaude(situacaoSaude);
	}

// Getters
	public Integer getIdentificador() {
		return identificador;
	}

	public StringBuilder getNome() {
		return nome;
	}

	public Character getSituacaoSaude() {
		return situacaoSaude;
	}

// Setters
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public void setNome(String nome) {
		this.nome = new StringBuilder(nome);
	}

	public void setSituacaoSaude(Character situacaoSaude) {
		this.situacaoSaude = situacaoSaude;
	}

// Metodo para pegar situacao de saude por extenso
	public String getSituacaoSaudePorExtenso() {
		String situacaoSaude = new String();

		switch (getSituacaoSaude()) {
		case 'T':
			situacaoSaude = "contaminada em tratamento";
			break;
		case 'F':
			situacaoSaude = "contaminada falecida";
			break;
		case 'C':
			situacaoSaude = "contaminada curada";
			break;
		case 'S':
			situacaoSaude = "sem contaminacao";
		}
		return situacaoSaude;
	}

// Metodos abstratos
	public abstract Integer getIdade();

	public abstract Character getFoiGestante();

	public abstract String getFoiGestantePorExtenso();
}
