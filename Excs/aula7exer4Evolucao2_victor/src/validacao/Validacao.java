package validacao;

import java.util.InputMismatchException;
import dados.Funcionario;
import dados.Empresa;
import leitura.Leitura;
import saida.Visao;

public class Validacao {

	public static String validaNome() {
		Visao.limpaTela(40);
		Visao.exibirMensagemCadastroDeFuncionario();

		Visao.solicitarNome();
		String nome = Leitura.lerLinha();

		while (nome.split(" ")[0].equals(nome)) {
			Visao.informarNomeInvalido();
			nome = Leitura.lerLinha();
		}

		return nome;
	}

	public static String validaCpf(Empresa empresa) {
		String cpf;

		Visao.solicitarCpf();
		cpf = Leitura.lerString();

		if (isCPFRepetido(empresa, cpf)) {
			Visao.informarCpfRepetido();
			Validacao.validaCpf(empresa);
		}
			
		while (cpf.length() != 11 || !verificaDigitos(cpf)) {
			Visao.informarCpfInvalido();
			cpf = Leitura.lerString();
		}

		return cpf;
	}

	public static boolean isCPFRepetido(Empresa empresa, String cpf) {
		for (Funcionario funcionario : empresa.getTodosFuncionarios()) {
			if (funcionario.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}	
	
	public static boolean verificaDigitos(String palavra) {

		for (char c : palavra.toCharArray()) {
			if (!('0' <= c && c <= '9')) {
				return false;
			}
		}
		return true;
	}

	public static String validaDataDeNascimento() {
		int dia, mes, ano;

		dia = validaDia();
		mes = validaMes();
		ano = validaAno();

		return Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);

	}

	public static int validaDia() {
		int dia;

		Visao.solicitarDiaDeNascimento();
		try {
			dia = Leitura.lerInt();

			while (!(dia > 0 && dia <= 30)) {
				Visao.informarDiaDeNascimentoInvalido();
				dia = validaDia();
			}
		} catch (InputMismatchException e) {
			Visao.informarExcecaoInt();
			dia = validaDia();
		}
		return dia;
	}

	public static int validaMes() {
		int mes;

		Visao.solicitarMesDeNascimento();
		try {
			mes = Leitura.lerInt();

			while (!(mes > 0 && mes <= 12)) {
				Visao.informarMesDeNascimentoInvalido();
				mes = validaMes();
			}
		} catch (InputMismatchException e) {
			Visao.informarExcecaoInt();
			mes = validaMes();
		}
		return mes;
	}

	public static int validaAno() {
		int ano;

		Visao.solicitarAnoDeNascimento();
		try {
			ano = Leitura.lerInt();

			while (!(ano > 0 && ano <= 2020)) {
				Visao.informarAnoDeNascimentoInvalido();
				ano = validaAno();
			}
		} catch (InputMismatchException e) {
			Visao.informarExcecaoInt();
			ano = validaAno();
		}
		return ano;
	}

	public static int validaHorasTrabalhadas() {
		int horas;

		Visao.solicitarHorasTrabalhadas();
		try {
			horas = Leitura.lerInt();

			while (!(horas > 0 && horas <= 220)) {
				Visao.informarHorasTrabalhadasInvalida();
				horas = validaHorasTrabalhadas();
			}
		} catch (InputMismatchException e) {
			Visao.informarExcecaoInt();
			horas = validaHorasTrabalhadas();
		}
		return horas;
	}

	public static int validaProjetos() {
		int projetos;

		Visao.solicitarQuantidadeDeProjetos();
		try {
			projetos = Leitura.lerInt();

			while (!(projetos > 0 && projetos <= 220)) {
				Visao.informarQuantidadeDeProjetosInvalido();
				projetos = validaProjetos();
			}
		} catch (InputMismatchException e) {
			Visao.informarExcecaoInt();
			projetos = validaProjetos();
		}
		return projetos;
	}

	public static int validaMenuDeFuncionarios() {
		int opcao;

		do {
			Visao.exibirMenuDeFuncionarios();

			try {
				opcao = Leitura.lerInt();
				if (opcao < 0 || opcao > 3) {
					System.err.println("Valor Invalido! Insira um numero de 0 a 3");
					opcao = validaMenuDeFuncionarios();
					System.out.println("teste " + opcao);

				}
			} catch (InputMismatchException e) {
				System.err.println("Valor Invalido! Insira apenas um numero");
				opcao = validaMenuDeFuncionarios();
			}
		} while (opcao < 0 || opcao > 3);

		return opcao;
	}

	public static int validaMenu() {
		int opcao;

		do {
			Visao.exibirMenu();

			try {
				opcao = Leitura.lerInt();
				if (opcao < 0 || opcao > 2) {
					System.err.println("Valor Invalido! Insira um numero de 0 a 2");
					opcao = validaMenu();

				}
			} catch (InputMismatchException e) {
				System.err.println("Valor Invalido! Insira apenas um numero");
				opcao = validaMenu();
			}
		} while (opcao < 0 || opcao > 2);
		return opcao;
	}
}
