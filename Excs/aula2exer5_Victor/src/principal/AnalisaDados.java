package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AnalisaDados {

	public static void main(String[] args) {

//Declara��es:

//597kg � o maior peso humano j� registrado, logo esse foi o limite m�ximo escolhido		

		final int MAXIMO = 20;
		float peso[] = new float[MAXIMO];
		String sexo[] = new String[MAXIMO];
		Scanner lerPeso = new Scanner(System.in);
		Scanner lerSexo = new Scanner(System.in);
		float pesoMaximo = 597F, menor = 0F, maior = 0F, mediaPeso = 0F, somaPeso = 0F, numHomens = 0F,
				numMulheres = 0F;
		String sexoMasculino = new String("masculino");
		String sexoFeminino = new String("feminino");
		DecimalFormat mascara = new DecimalFormat("0.###");
		int aux;
		float valor;
		String valor2;

//Instru��es:

		System.out.print("Digite o peso (m�ximo de 597 quilos) e sexo (masculino ou feminino) de 20 pessoas:\n");

		for (aux = 0; aux < MAXIMO; aux++) {
			System.out.print("\n" + (aux + 1) + "� Peso: ");
			peso[aux] = lerPeso.nextFloat();
			valor = validaPeso(peso[aux], pesoMaximo, aux, lerPeso);
			peso[aux] = valor;
		}

		for (aux = 0; aux < MAXIMO; aux++) {
			System.out.print("\n" + (aux + 1) + "� Sexo: ");
			sexo[aux] = lerSexo.next();
			valor2 = validaSexo(sexo[aux], aux, lerSexo);
			sexo[aux] = valor2;
		}

		menor = peso[0];

		maior = peso[0];

		for (aux = 0; aux < MAXIMO; aux++) {

			if (peso[aux] < menor)
				menor = peso[aux];
			if (peso[aux] > maior)
				maior = peso[aux];
			if (sexo[aux].equalsIgnoreCase(sexoMasculino)) {
				numHomens += 1;
				somaPeso += peso[aux];
			}
			if (sexo[aux].equalsIgnoreCase(sexoFeminino))
//Pensar que n�o � necess�rio fazer certas contas, economizando processamento.
				numMulheres += 1;
		}

		mediaPeso = somaPeso / numHomens;
		if (numHomens == 0)
			mediaPeso = 0;

		limpaTela(30);

		System.out.println("Maior peso informado: " + mascara.format(maior) + " quilos\n");

		System.out.println("Menor peso informado: " + mascara.format(menor) + " quilos\n");

		System.out.println("M�dia dos pesos dos homens: " + mascara.format(mediaPeso) + " quilos\n");

		System.out.println("N�mero de mulheres: " + mascara.format(numMulheres));

	}

	public static void limpaTela(int quantidadeLinhas) {

		for (int linha = 0; linha < quantidadeLinhas; linha++)
			System.out.print("\n");

	}

	public static float validaPeso(float valor, float pesoMaximo, int aux, Scanner lerPeso) {

//Instru��es:		

		while (valor <= 0 || valor > pesoMaximo) {
			System.out.println("\nPeso inv�lido, tente novamente!");
			System.out.print("\n" + (aux + 1) + "� Peso: ");
			valor = lerPeso.nextFloat();
		}

		return valor;

	}

	public static String validaSexo(String valor2, int aux, Scanner lerSexo) {

//Declara��es

		int contador = 0;
		String sexoMasculino = new String("masculino");
		String sexoFeminino = new String("feminino");

//Instru��es:		

		while (contador != 1) {
			if (valor2.equalsIgnoreCase(sexoMasculino) || valor2.equalsIgnoreCase(sexoFeminino))
				contador++;
			else {
				System.out.println("\nSexo inv�lido, tente novamente!");
				System.out.print("\n" + (aux + 1) + "� Sexo: ");
				valor2 = lerSexo.next();
			}
		}

		return valor2;

	}
}