package principal;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;

public class OrdenaPeso {

	public static void main(String[] args) {

		// DECLARACOES
		final int MAX = 3;
		final int PESOMINIMO = 5;
		int mudar = 1;
		float aux = 0f;
		float troca;
		float[] peso = new float[MAX];
		Scanner ler = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("#0.00");

		// INSTRUCOES
		System.out.println("Digite os pesos dos " + MAX + " elefantes (nunca menores do que " + PESOMINIMO + " quilos):\n");
		
		for (int contador = 0; contador < MAX; contador++) {
			System.out.println("Peso do " + (contador + 1) + "º" + " elefante:");
			peso[contador] = ler.nextFloat();
			troca = validaPeso(peso[contador], PESOMINIMO, contador);
			peso[contador] = troca;
			limpaTela(1);	
		}
		
		while (mudar != 0) {
			mudar = 0;
			if(peso[0] > peso[1]) {
				aux = peso[0];
				peso[0] = peso[1];
				peso[1] = aux;
				mudar++;
			}
			
			if (peso[1] > peso[2]) {
				aux = peso[1];
				peso[1] = peso[2];
				peso[2] = aux;
				mudar++;
			}
		}
		
		limpaTela(20);

		System.out.println("Pesos Gravados:\n");
		
		for (int contador = 0; contador < MAX; contador++) 
			System.out.println("Peso do " + (contador + 1) + "º elefante = " + mascara.format(peso[contador]));
		
	}
	
	public static void limpaTela(int quantidadeLinhas) {
		
		for (int linha = 0; linha < quantidadeLinhas; linha++)
			System.out.print("\n");
	
	}
	
	public static float validaPeso(float valor, final int PESOMINIMO, int contador) {
		
		Scanner ler = new Scanner(System.in);
		float troca;
		
		while (valor < PESOMINIMO) {
			System.out.println("\nO peso não deve ser menor que "  + PESOMINIMO + " quilos, tente novamente!");
			System.out.println("\nPeso do " + (contador + 1) + "º" + " elefante:");
			valor = ler.nextFloat();
		}
		
		troca = valor;
		
		return troca;
	
	}
	
}
