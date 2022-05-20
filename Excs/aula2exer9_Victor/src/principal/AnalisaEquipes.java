package principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AnalisaEquipes {

	public static void main(String[] args) {

//Declarações	
		final int EQUIPES = 5;
		final int JOGADORES = 10;
		int[][] armazenaIdade = new int[EQUIPES][JOGADORES];
		float[][] armazenaAltura = new float[EQUIPES][JOGADORES];
		float[] somaIdade = new float[EQUIPES];
		int quantidadeIdade = 0, criterioIdade = 15, idadeMax = 122;
		float quantidadeAltura = 0F, somador = 0F, porcentagem = 0F, criterioAltura = 1.5F, alturaMax = 2.5F;
		Scanner lerIdade = new Scanner(System.in);
		Scanner lerAltura = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("0.##");

//Instruções		
		System.out.println("Digite os valores da idade e altura dos " + JOGADORES + " jogadores por equipe (" + EQUIPES
				+ " equipes no total).");

		for (int nEquipe = 0; nEquipe < EQUIPES; nEquipe++) {

			limpaTela(1);

			System.out.println("*" + (nEquipe + 1) + "º equipe*");

			limpaTela(1);

			for (int nJogador = 0; nJogador < JOGADORES; nJogador++) {

				System.out.println("Idade do " + (nJogador + 1) + "º jogador:");

				armazenaIdade[nEquipe][nJogador] = lerIdade.nextInt();

				while (armazenaIdade[nEquipe][nJogador] <= 0 || armazenaIdade[nEquipe][nJogador] > idadeMax) {
					limpaTela(1);
					System.out.println("Idade inválida, tente novamente!\n");
					System.out.println("Idade do " + (nJogador + 1) + "º jogador:");
					armazenaIdade[nEquipe][nJogador] = lerIdade.nextInt();
				}

				System.out.println("Altura do " + (nJogador + 1) + "º jogador:");

				armazenaAltura[nEquipe][nJogador] = lerAltura.nextFloat();

				while (armazenaAltura[nEquipe][nJogador] <= 0 || armazenaAltura[nEquipe][nJogador] > alturaMax) {
					limpaTela(1);
					System.out.println("Altura inválida, tente novamente!\n");
					System.out.println("Altura do " + (nJogador + 1) + "º jogador:");
					armazenaAltura[nEquipe][nJogador] = lerAltura.nextFloat();
				}

				limpaTela(1);
			}
		}

		for (int nEquipe = 0; nEquipe < EQUIPES; nEquipe++) {
			for (int nJogador = 0; nJogador < JOGADORES; nJogador++) {
				if (armazenaIdade[nEquipe][nJogador] > criterioIdade) {
					quantidadeIdade++;
					somador += armazenaIdade[nEquipe][nJogador];
				}
				if (armazenaAltura[nEquipe][nJogador] < criterioAltura)
					quantidadeAltura++;
			}
			somaIdade[nEquipe] = somador / JOGADORES;
			somador = 0;
		}

		porcentagem = (quantidadeAltura / (EQUIPES * JOGADORES)) * 100;

		limpaTela(30);

		System.out.println("Porcentagem de jogadores com altura menor que 1,50 metros entre todas as equipes: "
				+ mascara.format(porcentagem) + "%\n");

		System.out.println(
				"Quantidade de jogadores com idade maior que 15 anos: " + mascara.format(quantidadeIdade) + "\n");

		System.out.println("Média das idades dos jogadores com mais de 15 anos por equipe:\n");

		for (int aux = 0; aux < EQUIPES; aux++)
			System.out.println("*" + (aux + 1) + "º equipe: " + mascara.format(somaIdade[aux]) + "\n");

	}

	public static void limpaTela(int quantidadeLinhas) {

		for (int linha = 0; linha < quantidadeLinhas; linha++)
			System.out.print("\n");

	}

}