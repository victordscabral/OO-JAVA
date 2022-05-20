package principal;

import java.util.Scanner;

public class AnalisaSenha {

	public static void main(String[] args) {

//Declara��es

		final int MAXIMO = 9;
		Scanner lerSenha = new Scanner(System.in);
		Scanner lerTentativa = new Scanner(System.in);
		String senha = new String();
		String tentativa = new String();

//Instru��es

		System.out.println("Registre sua senha (deve conter de 3 a 5 caracteres e n�o possuir espa�os):");

		senha = lerSenha.nextLine();

		senha = validaSenha(senha, lerSenha);

		limpaTela(30, 0);

		System.out.println("Voc� tem 9 tentativas para acertar a senha at� o computador se autodestruir!");

		limpaTela(1, 0);

		tentativa = validaTeste(senha, lerTentativa, MAXIMO);

		if (tentativa.equals(senha)) {
			limpaTela(20, 5);

			System.out.print("Parab�ns, voc� acertou a senha!");
		} else {
			limpaTela(20, 5);

			System.out.print("Seu computador ir� se autodestruir em 10 segundos!!!!!");

			try {
				Thread.sleep(10000);
			} catch (Exception erro) {
			}
		}

	}

	public static void limpaTela(int numLinhas, int numTabulacoes) {

//Declara��es			

		int contador;

//Instru��es
//Conforme enunciado, m�todo (fun��o) limpaTela deve sempre saltar pelo menos 1 linha.		

		if (numLinhas <= 0)
			System.out.print("\n");

		for (contador = 0; contador < numLinhas; contador++)
			System.out.print("\n");

		for (contador = 0; contador < numTabulacoes; contador++)
			System.out.print("\t");

	}

	public static String validaSenha(String senha, Scanner lerSenha) {

//Declara��es			

		char validar;
		int minCaracteres = 3, maxCaracteres = 5;

//Instru��es		

		for (int aux = 0; aux < senha.length(); aux++) {

			validar = senha.charAt(aux);

			while (validar == ' ' || senha.length() < minCaracteres || senha.length() > maxCaracteres) {
				System.out.println("\nA senha deve conter de 3 a 5 caracteres e n�o possuir espa�os, tente novamente:");
				senha = lerSenha.nextLine();
				validar = senha.charAt(0);
				aux = 0;
			}
		}

		return senha;

	}

	public static String validaTeste(String senha, Scanner lerTentativa, int MAXIMO) {

//Declara��es			

		String tentativa = new String();

//Instru��es		

		for (int aux = 0; aux < MAXIMO; aux++) {

			System.out.println("" + (aux + 1) + " � tentativa! Digite a senha: ");

			tentativa = lerTentativa.nextLine();

			if (tentativa.equals(senha))
				break;

			limpaTela(1, 0);

		}

		return tentativa;

	}

}