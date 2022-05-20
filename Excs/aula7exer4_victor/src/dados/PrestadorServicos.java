package dados;

import java.text.DecimalFormat;

public class PrestadorServicos extends Pessoa {
	private Integer qtdHoras;

	public PrestadorServicos(String nomeCompleto, String CPF, String dataNascimento, Integer qtdHoras, Float piso) {
		super(nomeCompleto, CPF, dataNascimento, piso);
		setQtdHoras(qtdHoras);
		calculaSalario(piso);
	}

	public Integer getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(Integer qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	// Metodo calculaSalario
	public void calculaSalario(Float piso) {
		piso = piso + (getQtdHoras() * 2);
	}	

	// Metodo somaSalario do prestador de servicos
	public void somaSalaioPrestador(FuncionariosPorSetor funcionarios, float piso) {
		Float somaSalario = 0f;
		DecimalFormat mascara = new DecimalFormat("0.##");
		for (GerenteEquipe gerente : funcionarios.getListaPrestadores()()) {
			somaSalario += calculaSalario(piso);
		}
	}
	
}
