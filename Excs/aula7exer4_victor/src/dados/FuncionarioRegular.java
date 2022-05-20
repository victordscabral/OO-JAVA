package dados;

import java.text.DecimalFormat;

public class FuncionarioRegular extends Pessoa {
	
	public FuncionarioRegular(String nomeCompleto, String CPF, String dataNascimento, Float piso) {
		super(nomeCompleto, CPF, dataNascimento, piso);
		calculaSalario(piso);
	}

	// Metodo calculaSalario
	public void calculaSalario(Float piso) {
		float porcentagem = 10f;
		piso = piso + ((porcentagem / 100f) * piso);
	}	

	// Metodo somaSalario dos funcionarios regulares
	public void somaSalarioRegulares(FuncionariosPorSetor funcionarios, float piso) {
		Float somaSalario = 0f;
		DecimalFormat mascara = new DecimalFormat("0.##");
		for (GerenteEquipe gerente : funcionarios.getListaRegulares()()) {
			somaSalario += calculaSalario(piso);
		}
	}
	
}
