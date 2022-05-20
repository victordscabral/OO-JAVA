package dados;

public class Funcionario {
	private String nome;
	private String cpf;
	private String dataDeNascimento;

	public Funcionario(String nome, String cpf, String dataDeNascimento) {
		setNome(nome);
		setCpf(cpf);
		setDataDeNascimento(dataDeNascimento);
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public float calculaSalarioRegular(final float PISO) { // PISO SALARIAL ACRESCIDO DE 10%
		float porcentagem = 10f;
		return (PISO + ((porcentagem / 100f) * PISO));
	}
	
	public static float getSalarioTotalRegulares(Empresa empresa, float PISO) {
		float total = 0F;
		
		for (Funcionario funcionario : empresa.getGrupoRegulares())
			total += funcionario.calculaSalarioRegular(PISO);
		return total;
	}

}
