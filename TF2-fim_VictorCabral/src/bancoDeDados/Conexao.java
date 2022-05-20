package bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Classe para pegar conexao
public class Conexao {
	public static Connection getConexao() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/pandemia?useTimezone=true&serverTimezone=UTC", "root", "XIZZ9636");
		} catch (SQLException e) {
			System.out.println("Sem conectar!\n" + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Falha na Conexão!\n" + e.getMessage());
			e.printStackTrace();
		}
		return con;
	}
}