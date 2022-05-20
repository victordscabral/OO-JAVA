package principal;

import saida.InterfaceGrafica;
import dados.Populacao;
import bancoDeDados.PessoaDao;

// Metodo main
public class Principal {
	public static void main(String[] args) {
		PessoaDao pessoaDao = new PessoaDao();
		Populacao populacao = pessoaDao.atualizaPopulacao();
		new InterfaceGrafica(populacao);
	}
}
