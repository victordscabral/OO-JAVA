package bancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dados.*;

// Classe para estabelecer pessoaDao
public class PessoaDao {
	private Connection con = Conexao.getConexao();

// Cadastra no Banco de Dados
	public void cadastrar(Pessoa pessoa) {
		// Declaracoes
		String mySql = "INSERT INTO pessoa(idPessoa, nome, saude, gestante, idade) VALUES (?, ?, ?, ?, ?)";
		
		// Instrucoes
		try {
			PreparedStatement preparador = con.prepareStatement(mySql);
			preparador.setInt(1, pessoa.getIdentificador());
			preparador.setString(2, pessoa.getNome().toString());
			preparador.setString(3, pessoa.getSituacaoSaude().toString());
			if (pessoa.getFoiGestante() != null) 
				preparador.setString(4, pessoa.getFoiGestante().toString());
			else 
				preparador.setString(4, null);
			
			if (pessoa.getIdade() != null) 
				preparador.setInt(5, pessoa.getIdade());
			else 
				preparador.setString(5, null);
			preparador.execute();
			preparador.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					System.out.print("Falha ao fechar a conexão.");
					System.out.println("Causa: " + e.getMessage());
				}
		}
	}

// Atualiza populacao quando for necessario
	public Populacao atualizaPopulacao() {
		// Declaracoes
		String recupera = "SELECT * FROM pessoa";
		String identificador;
		String nome;
		String saude;
		String gestante;
		String idade;
		Populacao populacao = new Populacao();

		// Instrucoes
		try {
			PreparedStatement preparador = con.prepareStatement(recupera);
			ResultSet lista = preparador.executeQuery();

			while (lista.next()) {
				identificador = lista.getString("idPessoa");
				nome = lista.getString("nome");
				saude = lista.getString("saude");
				gestante = lista.getString("gestante");
				idade = lista.getString("idade");

				if (gestante == null) {
					Masculino masculino = new Masculino(Integer.parseInt(identificador), nome, saude.charAt(0),
							Integer.parseInt(idade));
					populacao.setPopulacao(masculino);
				}
				if (idade == null) {
					Feminino feminino = new Feminino(Integer.parseInt(identificador), nome, saude.charAt(0), gestante.charAt(0));
					populacao.setPopulacao(feminino);
				}
			}
			preparador.execute();
			preparador.close();
			
			return populacao;
		} catch (SQLException e) {
			e.printStackTrace();
			return populacao;
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					System.out.print("Falha ao fechar a conexão.");
					System.out.println("Causa: " + e.getMessage());
				}
		}
	}
	
// Metodo para definir qual sera o identificador da pessoa
		public int defineIdentificador(Populacao populacao) {
			// Declaracoes
			String recupera = "SELECT * FROM pessoa";
			final int MAIOR = 100;
			int identificador = 0;
			int identificadorBanco;
			Connection con = Conexao.getConexao();
			
			// Instrucoes
			try {
				PreparedStatement preparador = con.prepareStatement(recupera);
				ResultSet lista = preparador.executeQuery();

				while (lista.next()) {
					identificadorBanco = Integer.parseInt(lista.getString("idPessoa"));
					if (identificadorBanco > MAIOR) 
						identificador = identificadorBanco + 1;
				}
				preparador.execute();
				preparador.close();
				return identificador++;
			} catch (SQLException e) {
				e.printStackTrace();
				return identificador;
			} finally {
				if (con != null)
					try {
						con.close();
					} catch (SQLException e) {
						System.out.print("Falha ao fechar a conexão.");
						System.out.println("Causa: " + e.getMessage());
					}
			}
		}
}
