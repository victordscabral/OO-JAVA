package principal;

import java.util.Scanner;

public class InformaCapitalDDD {

	public static void main(String[] args) {

		// Declara��es
		int DDD, aux = 0;
		Scanner ler = new Scanner(System.in);

		// Instru��es
		System.out.print("Digite o n�mero de DDD da unidade federativa do Centro-Oeste brasileiro na qual deseja saber a capital: ");

		DDD = ler.nextInt();

		do {
			if (DDD <= 10 || DDD >= 100) {
				System.out.print("\nDDD inv�lido. Informe novamente: ");
				DDD = ler.nextInt();
			} else
				aux++;
		} while (aux != 1);

		for (int linha = 0; linha < 10; linha++)
			System.out.print("\n");

		switch (DDD) {
		case 61:
			System.out.println("61-Bras�lia");
			break;
		case 62:
			System.out.println("62-Goi�nia");
			break;
		case 65:
			System.out.println("65-Cuiab�");
			break;
		case 67:
			System.out.println("67-Campo Grande");
			break;
		default:
			System.out.println("DDD digitado: " + DDD + ". DDD n�o pertence a capital do centro-oeste brasileiro.");
		}
	}
}