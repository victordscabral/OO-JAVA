package leitura;

import java.util.Scanner;

public class Leitura {

	// Leitura de um caracter
	public static char lerChar() {
		return (new Scanner(System.in).next().trim().toUpperCase().charAt(0));
	}

	// Leitura de um inteiro
	public static int lerInt() {
		return (new Scanner(System.in).nextInt());
	}

	// Leitura de String
	public static String lerString() {
		return (new Scanner(System.in).nextLine().trim());
	}

}
