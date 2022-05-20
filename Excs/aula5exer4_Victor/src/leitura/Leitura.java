package leitura;

import java.util.Scanner;

public class Leitura {

	public static char leituraChar() {
		Scanner ler = new Scanner(System.in);
		return (ler.nextLine().trim().toUpperCase().charAt(0));
	}

	public static String leituraString() {
		Scanner ler = new Scanner(System.in);
		return ler.nextLine().trim();
	}

	public static int leituraInt() {
		Scanner ler = new Scanner(System.in);
		return ler.nextInt();
	}

}