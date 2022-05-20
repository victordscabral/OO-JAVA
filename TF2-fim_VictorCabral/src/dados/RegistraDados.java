package dados;

import bancoDeDados.PessoaDao;
import saida.Visao;

// Classe focada em registrar dados
public class RegistraDados {
	public static void registraMasculino(Populacao populacao, String nome, Character situacaoSaude, Integer idade) {		
		PessoaDao pessoaDao = new PessoaDao();
		int identificador = pessoaDao.defineIdentificador(populacao);
		
		Masculino masculino = new Masculino(identificador, nome, situacaoSaude, idade);
		pessoaDao.cadastrar(masculino);
		populacao.setPopulacao(masculino);		
		Visao.mostraMensagem(
				"Cadastro realizado com sucesso!\nO numero identificador e: " + masculino.getIdentificador(),
				"Cadastro");
	}
	
	public static void registraFeminino(Populacao populacao, String nome, Character situacaoSaude, Character foiGestante) {
		PessoaDao pessoaDao = new PessoaDao();
		int identificador = pessoaDao.defineIdentificador(populacao);
		
		Feminino feminino = new Feminino(identificador, nome, situacaoSaude, foiGestante);
		pessoaDao.cadastrar(feminino);
		populacao.setPopulacao(feminino);		
		Visao.mostraMensagem(
				"Cadastro realizado com sucesso!\nO numero identificador e: " + feminino.getIdentificador(),
				"Cadastro");
	}
}
