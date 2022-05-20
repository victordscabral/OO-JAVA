package saida;

import java.text.DecimalFormat;
import java.util.Vector;

import dados.Habitante;
import servicos.Calculos;

public class Visao {
	// Mostra mensagem inicial
	public static void mensagemInicial() {
		Visao.limpaTela(1);
		System.out.println("Digite os seguintes dados para a pesquisa:");
		Visao.limpaTela(1);
	}
	
	// Apresenta o resultado final
	// Mostra resultados
	public static void imprimeResultado(Vector<Habitante> grupoHabitantes) {
		// Declaracoes
		float media = 0F;
		DecimalFormat mascara = new DecimalFormat("0.###");

		// Instrucoes
		Visao.limpaTela(30);
		System.out.println("Resultados Finais");
		System.out.println("=================");
		System.out.println("Menor idade entre os entrevistados: " + Calculos.menorIdade(grupoHabitantes));
		System.out.println("Maior salário registrado: R$" + mascara.format(Calculos.maiorSalario(grupoHabitantes)));
		System.out.println("Media do número de filhos entre todos os cadastros: "
				+ mascara.format(Calculos.mediaNumFilhos(grupoHabitantes)));
		System.out.println("Media do salário das pessoas registradas: "
				+ mascara.format((media = Calculos.mediaSalario(grupoHabitantes))));
		System.out.println("Media dos homens com salario superior a R$300,00: "
				+ mascara.format(Calculos.mediaHomensSalSup(grupoHabitantes)));
		System.out.println(
				"Quantidade de pessoas que tem salario maior que a media de todas as pessoas pesquisadas (registradas): "
						+ Calculos.quantPessoasSalSup(grupoHabitantes, media));
	}

	// Salta quantidade de linhas desejadas
	public static void limpaTela(int linhas) {
		for (int i = 0; i < linhas; i++)
			System.out.println();
	}
}
