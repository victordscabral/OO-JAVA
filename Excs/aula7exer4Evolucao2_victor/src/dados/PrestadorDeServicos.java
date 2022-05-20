package dados;

public class PrestadorDeServicos extends Funcionario {
	private Integer horasTrabalhadas;

	public PrestadorDeServicos(String nome, String cpf, String dataDeNascimento, int horasTrabalhadas) {
		super(nome, cpf, dataDeNascimento);
		setHorasTrabalhadas(horasTrabalhadas);
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public float calculaSalarioPrestador(final float PISO) { // QTD HORAS TRABALHADAS VEZES 2 E ACRESCIDO DO PROPRIO PISO SALARIAL.
		return (PISO + (getHorasTrabalhadas() * 2));
	}

	public static float getSalarioTotalPrestadores(Empresa empresa, float PISO) {
		float total = 0F;
		
		for (PrestadorDeServicos prestadorDeServicos : empresa.getGrupoPrestadores())
			total += prestadorDeServicos.calculaSalarioPrestador(PISO);
		return total;
	}	

}
