package main.repository;
import java.sql.*;

public class CNXJDBC {

	
	public Connection conexaoBanco() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=uni_venda;";
		
		try {
			return DriverManager.getConnection(connectionUrl,"sa", "");
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	
}
