package saida;

import java.text.DecimalFormat;
import dados.*;

public class Visao {

	public static void solicitarNome() {
		System.out.print("\nInforme o nome do funcionario: ");
	}

	public static void informarNomeInvalido() {
		System.err.println("\nNome invalido! Informe tambem o sobrenome.");
	}

	public static void solicitarCpf() {
		System.out.print("\nInforme o CPF do funcionario: ");
	}

	public static void informarCpfInvalido() {
		System.err.println("\nCPF invalido! Informe exatamente 11 digitos. Apenas digitos sao permitidos.");
	}
	
	public static void informarCpfRepetido() {
		System.err.println("\nCPF ja inserido!!!");
	}

	public static void solicitarDiaDeNascimento() {
		System.out.print("\nInforme o numero correspondente ao dia de nascimento: ");
	}

	public static void informarDiaDeNascimentoInvalido() {
		System.err.println("\nDia de nascimento invalido! Informe um dia maior que 0 e menor que 31.");
	}

	public static void solicitarMesDeNascimento() {
		System.out.print("\nInforme o numero correspondente ao mes de nascimento (Janeiro = 1... Dezembro = 12;): ");
	}

	public static void informarMesDeNascimentoInvalido() {
		System.err.println("\nMes de nascimento invalido! Informe um mes maior que 0 e menor que 13.");
	}

	public static void solicitarAnoDeNascimento() {
		System.out.print("\nInforme o numero correspondente ao ano de nascimento: ");
	}

	public static void informarAnoDeNascimentoInvalido() {
		System.err.println("\nAno de nascimento invalido! Informe um ano maior que 0 e menor que 2021.");
	}

	public static void informarExcecaoInt() {
		System.err.println("\nEntrada invalida! Insira apenas um numero inteiro.");
	}

	public static void solicitarHorasTrabalhadas() {
		System.out.print("\nInforme a quantidade de horas trabalhadas: ");
	}

	public static void informarHorasTrabalhadasInvalida() {
		System.err.print("\nQuantidade de horas trabalhadas invalida, insira um valor maior que 0 e menor que 221");
	}

	public static void solicitarQuantidadeDeProjetos() {
		System.out.print("\nInforme a quantidade de projetos trabalhados: ");
	}

	public static void informarQuantidadeDeProjetosInvalido() {
		System.err.print("\nQuantidade de projetos invalido, insira um valor maior ou igual a 0 e menor que 100");
	}

	public static void exibirMenuDeFuncionarios() {
		System.out.println("\nInforme a opcao desejada:");
		System.out.println("1 - CADASTRAR FUNCIONARIO REGULAR");
		System.out.println("2 - CADASTRAR PRESTADOR DE SERVICOS");
		System.out.println("3 - CADASTRAR GERENTE DE EQUIPE");
		System.out.println("0 - ENCERRAR CADASTRO");
	}

	public static void exibirMenu() {
		Visao.limpaTela(1);
		System.out.println("Informe a opcao desejada:");
		System.out.println("1 - VISUALIZAR O TOTAL DE FUNCIONARIOS CADASTRADOS EM CADA CATEGORIA");
		System.out.println("2 - VISUALIZAR O TOTAL SALARIAL A SER PAGO PARA CADA CATEGORIA");
		System.out.println("0 - ENCERRAR O PROGRAMA");
	}

	public static void exibirMensagemCadastroDeFuncionario() {
		System.out.println("CADASTRO DE FUNCIONARIO");
	}

	public static void resultado(int codigo, Empresa empresa, final float PISO) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		Visao.limpaTela(40);
		if (codigo == 1) {
			Visao.imprimeTraco(70);
			System.out.println("\nTotal de funcionarios cadastrados\n");
			System.out.println("Funcionarios Regulares: " + empresa.getGrupoRegulares().size());
			System.out.println("Prestadores de Servicos: " + empresa.getGrupoPrestadores().size());
			System.out.println("Gerentes de Equipe: " + empresa.getGrupoGerentes().size());
			Visao.limpaTela(2);
			System.out.println("Todos funcionarios analisados: " + empresa.getTodosFuncionarios().size());
			Visao.imprimeTraco(70);
		}
		if (codigo == 2) {
			Visao.imprimeTraco(70);
			System.out.println("\nTotal salarial a ser pago\n");
			System.out.println("Funcionarios Regulares: " + mascara.format(Funcionario.getSalarioTotalRegulares(empresa, PISO)));
			System.out.println("Prestadores de Servicos: " + mascara.format(PrestadorDeServicos.getSalarioTotalPrestadores(empresa, PISO)));
			System.out.println("Gerentes de Equipe: " + mascara.format(GerenteDeEquipe.getSalarioTotalGerentes(empresa, PISO)));
			Visao.limpaTela(2);
			System.out.println("Todos funcionarios analisados: " + mascara.format(Funcionario.getSalarioTotalRegulares(empresa, PISO)
							+ PrestadorDeServicos.getSalarioTotalPrestadores(empresa, PISO)
							+ GerenteDeEquipe.getSalarioTotalGerentes(empresa, PISO)));
			Visao.imprimeTraco(70);
		}
		Visao.limpaTela(2);
	}

	public static void limpaTela(int linhasPuladas) {
		for (int aux = 0; aux < linhasPuladas; aux++)
			System.out.println();
	}
	
	public static void imprimeTraco(int qtdTracos) {
		for (int aux = 0; aux < qtdTracos; aux++)
			System.out.print("-");
	}
	
}
