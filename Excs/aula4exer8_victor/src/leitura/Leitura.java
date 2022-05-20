package leitura;

import java.util.Scanner;

public class Leitura {
	
	public static char leituraChar() {
		Scanner ler = new Scanner(System.in);
		return (ler.next().trim().toUpperCase().charAt(0));
	}
	
	public static float leituraFloat() {
		Scanner ler = new Scanner(System.in);
		try {
			return(ler.nextFloat());
		} catch (Exception e) {
			return -1f;
		}
	}

	public static int leituraInt() {
		Scanner ler = new Scanner(System.in);
		try {
			return(ler.nextInt());
		} catch (Exception e) {
			return -1;
		}
	}

}
