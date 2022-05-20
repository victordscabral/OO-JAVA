package principal;

import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AnalisaDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// DECLARACOES
		
		//597kg � o maior peso humano j� registrado, logo esse foi o limite m�ximo escolhido
		
		final int QTDPESSOAS = 3;
		Scanner lerPeso = new Scanner(System.in);
		Scanner lerSexo = new Scanner(System.in);
		String sexo;
		float peso, pesoMaximo = 597F, maiorPeso = 0F, menorPeso = (pesoMaximo + 1F), somaPesoMasc = 0F;
		int qtdMas = 0;

		// INSTRUCOES
		
		System.out.print("Digite o peso (m�ximo de " + pesoMaximo + " quilos) e sexo (masculino/feminino) de" + QTDPESSOAS + " pessoas:\n");
		
		limpaTela(1);
		
		for (int i = 0; i < QTDPESSOAS; i++) {
			
			System.out.print("Peso da " + (i + 1) + "� pessoa: ");
			peso = lerPeso.nextFloat();
			
			limpaTela(1);
			
			peso = validaPeso(peso, lerPeso);
			
			maiorPeso = comparaMaiorPeso(peso, maiorPeso);
			
			menorPeso = comparaMenorPeso(peso, menorPeso);
			
			System.out.print("Sexo da " + (i + 1) + "� pessoa: ");
			sexo = lerSexo.next();
			
			limpaTela(1);

			sexo = validaSexo(sexo, lerSexo);

			if (sexo.equalsIgnoreCase("masculino")) {
				qtdMas++;
				somaPesoMasc += peso;
			}

		}

		limpaTela(40);
		
		imprimeResultado(QTDPESSOAS, qtdMas, maiorPeso, menorPeso, somaPesoMasc);
		
	}

	public static float validaPeso(float peso, Scanner lerPeso) {

		while (peso <= 0 || peso > 597) {
			System.out.print("Peso inv�lido! Digite novamente: ");
			peso = lerPeso.nextFloat();
			limpaTela(1);
		}
		
		return peso;
		
	}
	
	public static String validaSexo(String sexo, Scanner lerSexo) {
		
		while (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("feminino")) {
			System.out.print("Sexo inv�lido! Digite novamente (masculino/feminino): ");
			sexo = lerSexo.next();
			limpaTela(1);
		}		
		
		return sexo;
		
	}
	
	public static float comparaMaiorPeso(float peso, float maiorPeso) {
		if (peso > maiorPeso) 
			maiorPeso = peso;
		
		return maiorPeso;
	}
	
	public static float comparaMenorPeso(float peso, float menorPeso) {
		if (peso < menorPeso) 
			menorPeso = peso;
		
		return menorPeso;
	}
	
	public static void imprimeResultado(final int QTDPESSOAS, int qtdMas, float maiorPeso, float menorPeso, float somaPesoMasc) {
//Declara��es
		DecimalFormat mascara = new DecimalFormat("0.###");

//Instru��es		
		System.out.println("Maior peso informado: " + mascara.format(maiorPeso) + " KG\n");

		System.out.println("Menor peso informado: " + mascara.format(menorPeso) + " KG\n");
		
		if(somaPesoMasc == 0)
			System.out.println("A media dos pesos dos homens �: " + mascara.format(somaPesoMasc) + " KG\n");
		else
			System.out.println("A media dos pesos dos homens �: " + mascara.format(somaPesoMasc / qtdMas) + " KG\n");

		System.out.println("A quantidade de mulheres �: " + mascara.format(QTDPESSOAS - qtdMas));		
		
	}
	
	public static void limpaTela(int quantidadeLinhas) {

		for (int linha = 0; linha < quantidadeLinhas; linha++)
			System.out.print("\n");

	}	

}
