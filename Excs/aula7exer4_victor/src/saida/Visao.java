package saida;

import dados.*;

public class Visao {

	public static void mostraMenuInicial() {
		System.out.println("Digite o numero correspondente ao tipo de funcionario que deseja cadastar\n\n"
				+ "[1] - Cadastrar novo funcionario regular\n" + "[2] - Cadastrar novo prestador de servicos\n"
				+ "[3] - Cadastar novo gerente de equipe\n" + "[0] - Encerrar os cadastros\n");
	}

	public static void mostraMenu() {
		System.out.println("Digite a opcao que deseja\n\n"
				+ "[1] - Total de funcionarios cadastrados em cada uma das tres categorias\n"
				+ "[2] - Total salarial a ser pago para cada categoria\n" 
				+ "[0] - Encerrar o progama\n");
	}

	public static void mostraTotalFuncionarios(TodosFuncionarios todosFuncionarios, FuncionariosPorSetor funcionariosPorSetor) {
		System.out.println("Quantidade de funcionarios regulares:" + funcionariosPorSetor.getListaRegulares().size());
		System.out.println("Quantidade de prestadores de servicos:" + funcionariosPorSetor.getListaPrestadores().size());
		System.out.println("Quantidade de gerentes de equipe:" + funcionariosPorSetor.getListaGerente().size());
		Visao.limpaTela(2);
		System.out.println("Soma do total de funcionários analisados :" + todosFuncionarios.getFuncionarios().size());
	}
	
	public static void mostraTotalSalarial(TodosFuncionarios todosFuncionarios) {
		int contadorFuncionarioRegular = 0;
		int contadorPrestadorServicos = 0;
		int contadorGerenteEquipe = 0;
		

	}

	public static void limpaTela(int linhas) {
		for (int i = 0; i < linhas; i++)
			System.out.println();
	}

}
