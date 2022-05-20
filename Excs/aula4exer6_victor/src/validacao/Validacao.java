package validacao;

import leitura.Leitura;
import saida.Visao;

public class Validacao {
	
	public static boolean validaContinua() {
		//Declaracao
		char opcao;
		
		//Instrucoes
		System.out.println("Deseja continuar cadastrando?\nDigite 'S' para sim e 'N' para não:");
		opcao = Leitura.leituraChar();
		Visao.limpaTela(30);
		
		while((opcao != 'S') && (opcao != 'N')) {
			Visao.limpaTela(30);
			System.out.println("Opção inválida! Continuar cadastrando?\nDigite 'S' para sim e 'N' para não:");
			opcao = Leitura.leituraChar();
		}
		return ((opcao =='S') ? true : false);	
	}
	
	public static String validaNome() {
		//Declaracao
		String nome = new String();
	
		//Instrucoes
		nome = Leitura.leituraNome();
		
		while(nome.isEmpty()) {
			Visao.limpaTela(2);
			System.out.println("Nome sem dados!\nDigite o nome novamente:");
			nome = Leitura.leituraNome();
		}
		return nome;
	}	

}
