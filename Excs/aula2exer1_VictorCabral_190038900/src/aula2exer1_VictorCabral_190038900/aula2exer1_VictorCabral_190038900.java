package aula2exer1_VictorCabral_190038900;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aula2exer1_VictorCabral_190038900 {

	public static void main(String[] args) {

		// Declarações
		final float PISO = 1000.00F;
		float percentual, resultado;
		Scanner ler = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("0.00");

		// Instruções
		System.out.print("Digite o valor percentual desejado: ");

		percentual = ler.nextFloat();
		resultado = (percentual / 100) * PISO;

		for (int linha = 0; linha < 7; linha++)
			System.out.println();

		System.out.print("Valor Resultante: " + mascara.format(resultado));

		System.out.print("\nPercentual Informado: " + percentual + "%");
	}
}