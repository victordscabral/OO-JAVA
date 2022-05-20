package leitura;

import java.util.Scanner;

public class Leitura {

	public static char lerChar() {
		return new Scanner(System.in).next().toUpperCase().trim().charAt(0);
	}

	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}

	public static float lerFloat() {
		return new Scanner(System.in).nextFloat();
	}
}