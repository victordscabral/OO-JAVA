package principal;

import dados.*;
import saida.Visao;
import validacao.Validacao;

public class Principal {
	public static void main (String [] args) {
		// Atributos
		TodosFuncionarios todosFuncionarios = new TodosFuncionarios();
		FuncionariosPorSetor funcionariosPorSetor = new FuncionariosPorSetor();
		int opcao;
		final float PISO = 232f;
		
		// Metodos
		do {
			Visao.mostraMenuInicial();
			opcao = Validacao.validaOpcao();
			Visao.limpaTela(30);
			switch (opcao) {
			case 1:
				System.out.println("Funcionario regular:");
				FuncionarioRegular funcionarioRegular = new FuncionarioRegular(Validacao.validaNomeCompleto(), Validacao.validaCPF(todosFuncionarios),
						Validacao.validaDataNascimento(), PISO);
				funcionariosPorSetor.setRegulares(funcionarioRegular);
				todosFuncionarios.setFuncionarios(funcionarioRegular);
				break;
			case 2:
				System.out.println("Prestador de servicos:");
				PrestadorServicos prestadorServicos = new PrestadorServicos(Validacao.validaNomeCompleto(), Validacao.validaCPF(todosFuncionarios),
						Validacao.validaDataNascimento(), Validacao.validaQtdHoras(), PISO);
				funcionariosPorSetor.setPrestadores(prestadorServicos);
				todosFuncionarios.setFuncionarios(prestadorServicos);
				break;
			case 3:
				System.out.println("Gerente de equipes:");
				GerenteEquipe gerenteEquipe  = new GerenteEquipe(Validacao.validaNomeCompleto(), Validacao.validaCPF(todosFuncionarios),
						Validacao.validaDataNascimento(), Validacao.validaQtdProjetos(), PISO);
				funcionariosPorSetor.setGerentes(gerenteEquipe);
				todosFuncionarios.setFuncionarios(gerenteEquipe);
			}
			Visao.limpaTela(10);
		} while (opcao != 0);
		
		do {
			Visao.mostraMenuInicial();
			opcao = Validacao.validaOpcao();
			Visao.limpaTela(30);
			switch (opcao) {
			case 1:
				Visao.mostraTotalFuncionarios(todosFuncionarios, funcionariosPorSetor);
			case 2:
				Visao.mostraTotalSalarial(todosFuncionarios);				
			}
		} while (opcao != 0);
	}
}