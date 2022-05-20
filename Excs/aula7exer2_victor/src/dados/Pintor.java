package dados;

public class Pintor {
	private String nomePintor;
	private Integer codigoPintor;
	private Integer anoNascimento;
	
	public Pintor(String nomePintor, Integer codigoPintor, Integer anoNascimento) {
		setNomePintor(nomePintor);
		setCodigoPintor(codigoPintor);
		setAnoNascimento(anoNascimento);
	}
	
	// Setters
	public void setNomePintor(String nomePintor) {
		this.nomePintor = nomePintor;
	}
	
	public void setCodigoPintor(Integer codigoPintor) {
		this.codigoPintor = codigoPintor;
	}
	
	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	// Getters
	public String getNomePintor() {
		return nomePintor;
	}
	
	public Integer getCodigoPintor() {
		return codigoPintor;
	}
	
	public Integer getAnoNascimento() {
		return anoNascimento;
	}
}
