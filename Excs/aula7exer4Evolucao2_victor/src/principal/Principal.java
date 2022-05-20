package principal;

import dados.Empresa;
import dados.Funcionario;
import dados.GerenteDeEquipe;
import dados.PrestadorDeServicos;
import validacao.Validacao;
import saida.Visao;

public class Principal {

	public static void main(String[] args) {
		final float PISO = 232F;
		int opcao;
		Empresa empresa = new Empresa();

		do {
			opcao = Validacao.validaMenuDeFuncionarios();
			switch (opcao) {
			case 1:
				Funcionario funcionario = new Funcionario(Validacao.validaNome(), Validacao.validaCpf(empresa),
						Validacao.validaDataDeNascimento());
				empresa.setGrupoRegulares(funcionario);
				empresa.setTodosFuncionarios(funcionario);
				break;
			case 2:
				PrestadorDeServicos prestadorDeServicos = new PrestadorDeServicos(Validacao.validaNome(),
						Validacao.validaCpf(empresa), Validacao.validaDataDeNascimento(),
						Validacao.validaHorasTrabalhadas());
				empresa.setGrupoPrestadores(prestadorDeServicos);
				empresa.setTodosFuncionarios(prestadorDeServicos);
				break;
			case 3:
				GerenteDeEquipe gerenteDeEquipe = new GerenteDeEquipe(Validacao.validaNome(),
						Validacao.validaCpf(empresa), Validacao.validaDataDeNascimento(), Validacao.validaProjetos());
				empresa.setGrupoGerentes(gerenteDeEquipe);
				empresa.setTodosFuncionarios(gerenteDeEquipe);
			}
			Visao.limpaTela(30);
		} while (opcao != 0);

		do {
			opcao = Validacao.validaMenu();
			Visao.resultado(opcao, empresa, PISO);
		} while (opcao != 0);

	}
}
