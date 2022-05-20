package principal;

import java.util.Scanner;

public class InformaCapitalDDD {

	public static void main(String[] args) {

		// Declarações
		int DDD, aux = 0;
		Scanner ler = new Scanner(System.in);

		// Instruções
		System.out.print("Digite o número de DDD da unidade federativa do Centro-Oeste brasileiro na qual deseja saber a capital: ");

		DDD = ler.nextInt();

		do {
			if (DDD <= 10 || DDD >= 100) {
				System.out.print("\nDDD inválido. Informe novamente: ");
				DDD = ler.nextInt();
			} else
				aux++;
		} while (aux != 1);

		for (int linha = 0; linha < 10; linha++)
			System.out.print("\n");

		switch (DDD) {
		case 61:
			System.out.println("61-Brasília");
			break;
		case 62:
			System.out.println("62-Goiânia");
			break;
		case 65:
			System.out.println("65-Cuiabá");
			break;
		case 67:
			System.out.println("67-Campo Grande");
			break;
		default:
			System.out.println("DDD digitado: " + DDD + ". DDD não pertence a capital do centro-oeste brasileiro.");
		}
	}
}