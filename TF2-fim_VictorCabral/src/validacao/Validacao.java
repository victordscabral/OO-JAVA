package validacao;

import saida.Visao;
import java.util.InputMismatchException;

//Classe focada em validacao
public class Validacao {
// Metodo para validar nome
	public static boolean validaNome(String nome) {
		// Instrucoes
		if (nome.isEmpty() || nome == null) {
			Visao.mostraMensagemErro("Preencha o campo de nome!");
			return false;
		} else if (isComNumeros(nome)) {
			Visao.mostraMensagemErro("Nome nao pode possuir numeros, informe novamente!");
			return false;
		} else if (nome.split(" ").length < 2) {
			Visao.mostraMensagemErro("Nome invalido! Informe tambem o sobrenome.");
			return false;
		} else if (nome.length() < 2) {
			Visao.mostraMensagemErro("Nome deve possuir ao menos dois caracteres, informe novamente!");
			return false;
		} else if (nome.length() > 90) {
			Visao.mostraMensagemErro("Nome nao deve possuir mais de 90 caracteres, informe novamente!");
			return false;
		}
		return true;
	}
// Metodo para verificar se nome tem numeros
	public static boolean isComNumeros(String stringAnalisada) {
		// Instrucoes
		for (char c : stringAnalisada.toCharArray()) {
			if (Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}
	
// Metodo para validar idade
	public static boolean validaIdade(String idadeString) {
		try {
			// Declaracoes
			final int MAXIMO = 150;
			int idade;

			// Instrucoes
			idade = Integer.parseInt(idadeString);

			if (idade < 0 || idade > MAXIMO) {
				Visao.mostraMensagemErro("Idade invalida! Deve ser ao menos 0 e menor que " + MAXIMO + ".");
				return false;
			}
		} catch (NumberFormatException e1) {
			Visao.mostraMensagemErro("Idade so pode pussuir numeros e nao deve ser vazia, informe novamente!");
			return false;
		} catch (InputMismatchException e2) {
			Visao.mostraMensagemErro("Idade so pode pussuir numeros inteiros, informe novamente!");
			return false;
		}
		return true;
	}

// Metodo para validar pesquisa por identificador
	public static boolean validaPesquisaIdentificador(String identificadorString) {
		try {
			// Declaracoes
			final int MAXIMO = 100;
			int identificador;

			// Instrucoes
			identificador = Integer.parseInt(identificadorString);
			
			if (identificador <= MAXIMO) {
				Visao.mostraMensagemErro("Identificador invalido! Deve ser maior " + MAXIMO + ".");
				return false;
			}
		} catch (NullPointerException e) {
			Visao.mostraMensagem("Mostra pessoa cancelada.", "Mostra pessoa");
			return false;
		} catch (NumberFormatException e) {
			Visao.mostraMensagemErro(
					"Identificador so pode pussuir numeros e nao deve ser vazio, informe novamente!");
			return false;
		}
		return true;
	}

// Metodo para validar pesquisa por nome
	public static boolean validaPesquisaNome(String nomePesquisa) {
		// Instrucoes
		if (nomePesquisa.isEmpty() || nomePesquisa == null) {
			Visao.mostraMensagemErro("Preencha o campo de nome!");
			return false;
		} else if (isComNumeros(nomePesquisa)) {
			Visao.mostraMensagemErro("Nome nao pode possuir numeros, informe novamente!");
			return false;
		} else if (nomePesquisa.length() > 90) {
			Visao.mostraMensagemErro("Nome nao deve possuir mais de 90 caracteres, informe novamente!");
			return false;
		}
		return true;
	}
}
