package saida;

import dados.Animais;
import dados.Mamifero;

public class Visao {

	public static void mostraMenu() {
		System.out.println("Digite o numero correspondente ao animais que deseja cadastar\n\n"
				+ "[1] - Cadastrar novo Macaco\n" + "[2] - Cadastrar novo Elefante\n" + "[3] - Cadastar nova Baleia\n"
				+ "[0] - Mostrar todo os animais cadastrados e encerrar o progama\n");
	}
	
	public static void mostraAnimais(Animais animais) {
		
		String formato = "%-30s%-30s%-35s%-30s%-20s%-20s%-20s\n";
		
		System.out.format(formato, "IDADE DE AMAMENTAÇÃO", "IDADE DE VIDA",
				"DESCRICAO DA ESPECIE", "TAMANHO NA FASE ADULTA", "PORTE", "PESO", "HABITAT");
		for (int aux = 0; aux < 185; aux++) {
			System.out.print("-");
		}
		limpaTela(1);
		for(Mamifero mamifero : animais.getAnimais()) {
			System.out.println(mamifero.toString());
		}
	}
	
	public static void limpaTela(int linhas) {
		for (int i = 0; i < linhas; i++)
			System.out.println();
	}
	
}
