package saida;

public class Visao {
	// Mostra mensagem inicial
	public static void mensagemInicial() {
		Visao.limpaTela(1);
		System.out.println(
				"Informe a opcao que deseja:\n\n"
				+ "[1] - Cadastra um novo Quadro\n"
				+ "[2] - Cadastra um novo Pintor\n"
				+ "[3] - Lista todos Quadros de um Pintor e o valor total de suas obras\n"
				+ "[4] - Apresenta todos Quadros cadastrados até o momento\n"
				+ "[0] - Encerra o programa");
	}

	// Salta quantidade de linhas desejadas
	public static void limpaTela(int linhas) {
		for (int i = 0; i < linhas; i++)
			System.out.println();
	}
}
