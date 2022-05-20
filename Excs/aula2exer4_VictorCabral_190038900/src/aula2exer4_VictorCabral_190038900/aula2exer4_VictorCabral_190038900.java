package aula2exer4_VictorCabral_190038900;

import java.util.Scanner;
import java.util.Arrays;

public class aula2exer4_VictorCabral_190038900 {

	public static void main(String[] args) {

		// Declarações
		int aux;
		float pesos[] = new float[3];
		Scanner ler = new Scanner(System.in);

		// Instruções
		System.out.println("Digite os pesos dos 3 elefantes (nunca menores do que 5 quilos): ");

		for (aux = 0; aux < pesos.length; aux++) {
			pesos[aux] = ler.nextFloat();
			if (pesos[aux] < 5) {
				System.out.println("O peso não deve ser menor que 5 quilos, tente novamente!");
				aux--;
			}
		}

		Arrays.sort(pesos);

		System.out.println("Ordem crescente:");

		for (aux = 0; aux < pesos.length; aux++)
			System.out.println((aux + 1) + "º: " + "" + pesos[aux]);

	}
}