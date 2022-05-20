package principal;

import java.util.Scanner;

public class IdentificaSexo {

	public static void main(String[] args) {

		// Declara��es
		int aux = 0;
		String sexo;
		String masculino = new String("M");
		String feminino = new String("F");
		Scanner ler = new Scanner(System.in);

		// Instru��es
		System.out.print("Informe o sexo escolhido. M ou m para MASCULINO e F ou f para FEMININO: ");

		do {
			sexo = ler.next();

			for (int linha = 0; linha < 3; linha++)
				System.out.print("\n");

			for (int tabula��o = 0; tabula��o < 8; tabula��o++)
				System.out.print("\t");

			System.out.print((sexo.equalsIgnoreCase(masculino)) ? "MASCULINO"
					: (sexo.equalsIgnoreCase(feminino)) ? "FEMININO"
							: "O valor informando n�o tem sexo, tente novamente!\n\nInforme o sexo escolhido. M ou m para MASCULINO e F ou f para FEMININO: ");

			if (sexo.equalsIgnoreCase(masculino) || sexo.equalsIgnoreCase(feminino))
				aux++;
		} while (aux != 1);
	}
}
