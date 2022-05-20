package dados;

public class Pessoa extends TodosFuncionarios {
	private String nomeCompleto;
	private String CPF;
	private String dataNascimento;
	private Float piso;

	public Pessoa(String nomeCompleto, String CPF, String dataNascimento, Float piso) {
		setNomeCompleto(nomeCompleto);
		setCPF(CPF);
		setDataNascimento(dataNascimento);
		calculaSalario(piso);
	}
	// Getters
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public Float getPiso() {
		return piso;
	}
	
	// Setters
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	// Metodo calculaSalario
	public void calculaSalario(Float piso) {
		this.piso = piso;
	}
	
}
