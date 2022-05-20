package principal;

import java.util.Scanner;

public class Validacao {
	
	public static String validaNome(String nome, Scanner lerNome) {

		int contador = 0;
		char validar;		
		
		while(contador == 0 || nome.length() < 3) {

				for (int aux = 0; aux < nome.length(); aux++) {
					validar = nome.charAt(aux);
					if (validar != ' ')
						contador++;
				}

				if (contador == 0 || nome.length() < 3) {
					System.out.println("Frase sem dados ou sem pelo menos 3 caracteres são inválidas! Tente novamente:");
					nome = lerNome.nextLine();
				}
		}
		return nome;
	}
	
	public static int validaIdade(int idade, Scanner lerIdade) {
		while(idade <= 0 || idade >= 151) {
			System.out.println("Idade inválida! Deve ser maior que zero e menor que 151 anos. Tente novamente:");
			idade = lerIdade.nextInt();
		}
		return idade;
	}
	
	public static float validaAltura(float altura, Scanner lerAltura) {
		float min = 0.4f;
		float max = 2.6f;
		while(altura <= min || altura >= max) {
			System.out.println("Altura inválida! Deve ser maior ser maior que 0.4 e menor que 2.6 metros. Tente novamente:");
			altura = lerAltura.nextFloat();
		}
		return altura;
	}
	
	public static validaContinua() {
		char continua;
	}

}
	
