package dados;

public class Pintor {
	private String nome;
	private Integer codigoPessoal;
	private Integer anoNascimento;
	
	public Pintor (String nome, int codigoPessoal, int anoNascimento) {
		setNome(nome);
		setCodigoPessoal(codigoPessoal);
		setAnoNascimento(anoNascimento);
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public Integer getCodigoPessoal () {
		return codigoPessoal;
	}
	
	public void setCodigoPessoal (Integer codigoPessoal) {
		this.codigoPessoal = codigoPessoal;
	}
	
	public Integer getAnoNascimento () {
		return anoNascimento;
	}
	
	public void setAnoNascimento (Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
}
