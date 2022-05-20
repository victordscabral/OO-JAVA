package dados;

public class GerenteDeEquipe extends Funcionario {
	private Integer quantidadeDeProjetos;

	public GerenteDeEquipe(String nome, String cpf, String dataDeNascimento, int quantidadeDeProjetos) {
		super(nome, cpf, dataDeNascimento);
		setQuantidadeDeProjetos(quantidadeDeProjetos);
	}

	public Integer getQuantidadeDeProjetos() {
		return quantidadeDeProjetos;
	}

	public void setQuantidadeDeProjetos(Integer quantidadeDeProjetos) {
		this.quantidadeDeProjetos = quantidadeDeProjetos;
	}

	public float calculaSalarioGerente(final float PISO) { // QTD DE PROJETOS VEZES 50% DO PISO SALARIAL ACRESCIDO DO PROPRIO PISO
		float porcentagem = 50f;
		return (PISO + (getQuantidadeDeProjetos() * ((porcentagem / 100f) * PISO)));
	}
	
	public static float getSalarioTotalGerentes(Empresa empresa, float PISO) {
		float total = 0F;
		
		for (GerenteDeEquipe gerenteDeEquipe : empresa.getGrupoGerentes())
			total += gerenteDeEquipe.calculaSalarioGerente(PISO);
		return total;
	}	

}
