package leitura;

import java.util.Scanner;

public class Leitura {

	public static String lerNome() {
		Scanner ler = new Scanner(System.in);
		return (ler.nextLine().trim());
	}

	public static char lerChar() {
		Scanner lerChar = new Scanner(System.in);
		return lerChar.next().trim().toUpperCase().charAt(0);
	}

}
