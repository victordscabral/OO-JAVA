package principal;

import java.util.Scanner;

public class Leitura {
	
	public static String lerNome() {
		String nome;
		Scanner lerNome = new Scanner(System.in);
		System.out.println("Digite o nome:");
		nome = lerNome.nextLine();
		Validacao.validaNome(nome, lerNome);
		return nome;
	}
	
	public static int lerIdade() {
		int idade;
		Scanner lerIdade = new Scanner(System.in);
		System.out.println("Digite idade: ");
		idade = lerIdade.nextInt();
		Validacao.validaIdade(idade, lerIdade);
		return idade;
	}
	
	public static float lerAltura() {
		float altura;
		Scanner lerAltura = new Scanner(System.in);
		System.out.println("Digite altura: ");
		altura = lerAltura.nextFloat();
		Validacao.validaAltura(altura, lerAltura);
		return altura;
	}
	
}
