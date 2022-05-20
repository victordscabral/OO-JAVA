package dados;

import java.text.DecimalFormat;

public class GerenteEquipe extends Pessoa {
	private Integer qtdProjetos;

	public GerenteEquipe(String nomeCompleto, String CPF, String dataNascimento, Integer qtdProjetos, Float piso) {
		super(nomeCompleto, CPF, dataNascimento, piso);
		setQtdProjetos(qtdProjetos);
		calculaSalario(piso);
	}

	public Integer getQtdProjetos() {
		return qtdProjetos;
	}

	public void setQtdProjetos(Integer qtdProjetos) {
		this.qtdProjetos = qtdProjetos;
	}

	// Metodo calculaSalario
	public void calculaSalario(Float piso) {
		float porcentagem = 50f;
		piso = piso + (getQtdProjetos() * ((porcentagem / 100f) * piso));
	}

	// Metodo somaSalario do gerente de equipe
	public void somaSalarioGerente(FuncionariosPorSetor funcionarios, float piso) {
		Float somaSalario = 0f;
		DecimalFormat mascara = new DecimalFormat("0.##");
		for (GerenteEquipe gerente : funcionarios.getListaGerente()) {
			somaSalario += calculaSalario(piso);
		}
	}

}

