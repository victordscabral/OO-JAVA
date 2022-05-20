package validacao;

import java.util.InputMismatchException;

import dados.Pessoa;
import dados.TodosFuncionarios;
import leitura.Leitura;
import saida.Visao;

public class Validacao {
	public static int validaOpcao () {
		int opcao = -1;
		
		try {
			opcao = Leitura.lerInt();
			if (opcao < 0 || opcao > 3) {
				System.err.println("Erro, opcao invalida");
				opcao = validaOpcao();
			}
		} catch (NumberFormatException e) {
			System.err.println("Erro, a entrada deve ser numerica.");
			opcao = validaOpcao();
		}
		return opcao;
	}
	
	public static String validaNomeCompleto() {
		// Declaracoes
		String nomeCompleto = new String();
			
		// Instrucoes
		do {
			System.out.println("Nome completo do funcionario:");
			nomeCompleto = Leitura.lerString();
			Visao.limpaTela(2);
			
			if(nomeCompleto.split(" ").length < 2)
				System.err.println("Invalido! Nome e sobrenome nao podem ser vazios:");
			
			if (nomeCompleto.isBlank()) 
				System.err.println("Nenhum nome foi informado, por favor informe um nome valido:");
		} while (nomeCompleto.split(" ").length < 2 || nomeCompleto.isBlank());
		Visao.limpaTela(1);
		return nomeCompleto;
	}
		
	public static String validaCPF(TodosFuncionarios funcionarios) {
		// Declaracoes
		String CPF = new String();
		final int TAMANHO = 11;
		
		// Instrucoes
		System.out.println("CPF do funcionario (somente digitos):");
		CPF = Leitura.lerString();
		Visao.limpaTela(2);
		
		if (isCPFRepetido(funcionarios, CPF)) {
			System.err.println("Valor invalido!\nCPF nao deve se repetir. Tente novamente:\n");
			Validacao.validaCPF(funcionarios);
		}
		
		if (Validacao.isTextoComNumeros(CPF) == true || CPF.length() != TAMANHO || CPF.isBlank()) {
			System.err.println("Valor invalido!\nDeve ter " + TAMANHO + " digitos e ser composto somente de numeros. Tente novamente:\n");
			Validacao.validaCPF(funcionarios);			
		}
		return CPF;
	}
	
	public static boolean isCPFRepetido (TodosFuncionarios funcionarios, String CPF) {
		for (Pessoa pessoa : funcionarios.getFuncionarios()) {
			if (pessoa.getCPF().equals(CPF)) {
				return true;
			}
		}
		return false;
	}
	
	public static String validaDataNascimento() {
		// Declaracoes
		String dataNascimento = new String();
		int dia, mes, ano;
		final int TAMANHO_DIA = 31;
		final int TAMANHO_MES = 12;
		final int TAMANHO_ANO = 2020;
		
		// Instrucoes
			System.out.println("Data de nascimento do funcionario (no formato xx/xx/xxxx):");
			dataNascimento = Leitura.lerString();
			if (dataNascimento.length() != 10) {
				System.err.println("Valor invalido! Confira a quantidade de caracteres\n. Tente novamente:\n");
				Validacao.validaDataNascimento();
			}
			
			dia = Integer.parseInt(dataNascimento.substring(0, 2));
			mes = Integer.parseInt(dataNascimento.substring(3, 5));
			ano = Integer.parseInt(dataNascimento.substring(6, 10));

			Visao.limpaTela(2);

			if (dia > TAMANHO_DIA || dia < 1) {
				System.err.println("Valor invalido!\nDeve estar entre 1 e " + TAMANHO_DIA + ". Tente novamente:\n");
				Validacao.validaDataNascimento();
			}
			if (mes > TAMANHO_MES || mes < 1) {
				System.err.println("Valor invalido!\nDeve estar entre 1 e " + TAMANHO_MES + ". Tente novamente:\n");
				Validacao.validaDataNascimento();
			}
			if (ano > TAMANHO_ANO || ano < 1) {
				System.err.println("Valor invalido!\nDeve estar entre 1 e " + TAMANHO_ANO + ". Tente novamente:\n");
				Validacao.validaDataNascimento();
			}
		Visao.limpaTela(1);
		return dataNascimento;
	}
	
	public static int validaQtdHoras() {
		// Declaracoes
		int qtdHoras = 0;
		final int MIN = 0;
		
		// Instrucoes
		do {
			System.out.println("Quantidade de horas trabalhadas:");
			try {
				qtdHoras = Leitura.lerInt();
				Visao.limpaTela(2);
				if (qtdHoras < MIN)
					System.err.println("Valor invalido!\nNao pode ser menor que " + MIN + ". Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.err.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (qtdHoras < MIN);
		Visao.limpaTela(1);
		return qtdHoras;
	}
	
	public static int validaQtdProjetos() {
		// Declaracoes
		int qtdProjetos = 0;
		final int MIN = 0;
		
		// Instrucoes
		do {
			System.out.println("Quantidade de projetos:");
			try {
				qtdProjetos = Leitura.lerInt();
				Visao.limpaTela(2);
				if (qtdProjetos < MIN)
					System.err.println("Valor invalido!\nNao pode ser menor que " + MIN + ". Tente novamente:\n");
			} catch (InputMismatchException excecao) {
				System.err.println("Ocorreu um  erro. Digite apenas numeros!");
			}
		} while (qtdProjetos < MIN);
		Visao.limpaTela(1);
		return qtdProjetos;
	}
	public static boolean isTextoComNumeros(String texto) { 
		try { 
			Long.parseLong(texto); 
			return false; 
			} catch (NumberFormatException e) { 
				return true; 
			} 
		}
}
