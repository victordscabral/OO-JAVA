package validacao;

import leitura.Leitura;
import saida.Visao;

public class Validacao {

	public static String validaNome() {
		String nome;

		nome = Leitura.lerNome().toUpperCase();

		while (nome.length() < 3 || nome.equals(null) || nome.trim().equals("")) {
			Visao.limpaTela(20);
			
			if(nome.equals(null) || nome.trim().equals("")) {
				System.out.println("Nenhum nome foi informado, por favor informe um nome válido: ");
				nome = Leitura.lerNome().toUpperCase();
			}else {
				System.out.print("Nome inválido! O nome deve ter pelo menos 3 caracteres.\nDigite o nome novamente: ");
				nome = Leitura.lerNome().toUpperCase();
			}
		}
		return nome;
	}

	public static boolean validaContinua() {
		// Declaracoes
		char opcao;

		// Instrucoes
		System.out.println("\nDeseja continuar cadastrando?\n Digite 'S' para sim e 'N' para sair do programa: ");
		opcao = Leitura.lerChar();
		Visao.limpaTela(30);

		while ((opcao != 'S') && (opcao != 'N')) {
			Visao.limpaTela(30);
			System.out.print(
					"Opção inválida! Continuar cadastrando?\nDigite 'S' para sim e 'N' para encerrar o programa: ");
			opcao = Leitura.lerChar();
		}
		if (opcao == 'N') {
			System.out.println("Até mais!");
		}

		return ((opcao == 'S') ? true : false);
	}

}
