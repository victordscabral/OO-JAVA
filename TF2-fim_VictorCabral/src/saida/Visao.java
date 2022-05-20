package saida;

import javax.swing.JOptionPane;
import dados.*;

// Classe focada em visao
public class Visao {
// Metodo para mostrar mensagem
	public static void mostraMensagem(String mensagem, String titulo) {
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
	}
	
// Metodo para mostrar mensagem de erro
	public static void mostraMensagemErro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
// Metodo para imprimir na console o resultado de quantidades
	public static void resultado(Populacao populacao) {
		Visao.limpaTela(40); 
		String formato = "%s%02d = %s";
		//String para imprimir especificamente 20 espaços
		String espacos = "                    ";
		System.out.format(formato, espacos, populacao.getQtdPessoasSituacao('C'), "CONTAMINADOS CURADOS\n");
		System.out.format(formato, espacos, populacao.getQtdPessoasSituacao('T'), "CONTAMINADOS EM TRATAMENTO\n"); 
		System.out.format(formato, espacos, populacao.getQtdPessoasSituacao('F'), "CONTAMINADOS FALECIDOS\n");
		System.out.format(formato, espacos, populacao.getQtdPessoasSituacao('S', 'M'), "HOMENS SEM CONTAMINACAO\n"); 
		System.out.format(formato, espacos, populacao.getQtdPessoasSituacao('S', 'F'), "MULHERES SEM CONTAMINACAO\n");
	  }
	  
// Metodo para imprimir na console o resultado da quantidade total
	public static void resultadoTotal(Populacao populacao) {
		//String para imprimir especificamente 20 espaços
		String espacos = "                    ";
		String formato = "%s%02d = %s"; 
		System.err.format(formato, espacos, populacao.getPopulacao().size(), "TOTAL DE REGISTRO DE PESSOAS\n");
	  }
	
// Metodo para limpar a console 
	public static void limpaTela(int qtdLinhas) {
		for (int aux = 0; aux < qtdLinhas; aux++)
			System.out.println();
	}
	
}
