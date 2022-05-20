package principal;

import java.util.Scanner;

public class AnalisaFrase {

	public static void main(String[] args) {

//Declarações		

		Scanner lerFim = new Scanner(System.in);
		String frase = new String();
		int end = 0, contarTotal = 0;
		int vogaisEspacos[] = new int[6];

//Instruções

		do {

			System.out.println("Digite uma frase:");

			frase = validaFrase(frase);

			frase = frase.toLowerCase();

			vogaisEspacos = contarVogal(frase);

			contarTotal = somarTodas(frase);

			limpaTela(30);

			System.out.println("Quantidade de vogais a/A: " + vogaisEspacos[0]);

			System.out.println("Quantidade de vogais e/E: " + vogaisEspacos[1]);

			System.out.println("Quantidade de vogais i/I: " + vogaisEspacos[2]);

			System.out.println("Quantidade de vogais o/O: " + vogaisEspacos[3]);

			System.out.println("Quantidade de vogais u/U: " + vogaisEspacos[4]);

			System.out.println("Quantidade total de vogais: " + contarTotal);

			System.out.println("Tamanho da frase digitada (sem espaços): " + (frase.length() - vogaisEspacos[5]));

			System.out.println("Tamanho da frase digitada (com espaços): " + frase.length());

			System.out.println(
					"\nCaso queira repetir o processo digite 0 (zero). Ademais, digite qualquer outro número para encerrar o programa:");

			end = lerFim.nextInt();

			limpaTela(30);

		} while (end == 0);

		limpaTela(30);

		System.out.print("\nProgama encerrado!");

	}

	public static void limpaTela(int quantidadeLinhas) {

		for (int linha = 0; linha < quantidadeLinhas; linha++)
			System.out.print("\n");

	}

	public static String validaFrase(String frase) {

		Scanner lerFrase = new Scanner(System.in);
		int contador = 0;
		char validar;

		do {
			frase = lerFrase.nextLine();

			for (int aux = 0; aux < frase.length(); aux++) {
				validar = frase.charAt(aux);
				if (validar != ' ')
					contador++;
			}

			if (contador == 0)
				System.out.println("Frase sem dados são inválidas! Tente novamente:");

		} while (contador == 0);

		return frase;

	}

	public static int[] contarVogal(String frase) {

//Declarações			

		char vogais;
		int aux, contarEspacos = 0, contarVogaisA = 0, contarVogaisE = 0, contarVogaisI = 0, contarVogaisO = 0,
				contarVogaisU = 0;

//Instruções		

		for (aux = 0; aux < frase.length(); aux++) {

			vogais = frase.charAt(aux);

			switch (vogais) {
			case 'a':
				contarVogaisA++;
				break;
			case 'e':
				contarVogaisE++;
				break;
			case 'i':
				contarVogaisI++;
				break;
			case 'o':
				contarVogaisO++;
				break;
			case 'u':
				contarVogaisU++;
				break;
			case ' ':
				contarEspacos++;
			}
		}

		int[] vogaisEspacos = new int[] { contarVogaisA, contarVogaisE, contarVogaisI, contarVogaisO, contarVogaisU,
				contarEspacos };

		return vogaisEspacos;

	}

	public static int somarTodas(String frase) {

//Declarações	

		char vogais;
		int aux, contarTotal = 0;

//Instruções		

		for (aux = 0; aux < frase.length(); aux++) {
			vogais = frase.charAt(aux);

			if (vogais == 'a' || vogais == 'e' || vogais == 'i' || vogais == 'o' || vogais == 'u')
				contarTotal++;
		}

		return contarTotal;

	}

}