package br.edu.ifsp.conexao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;


public class Conexao {

	private BasicDataSource ds;

    private static Conexao instance;
    public static Conexao getInstance() {
        if (instance == null){
            instance = new Conexao();
        }
        return instance;
    }

    private Conexao() {
        ds = new BasicDataSource();
        ds.setDriverClassName("oracle.jdbc.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        ds.setUsername("gabriel_lee");
        ds.setPassword("root");

    }

    public Connection getConnection() throws SQLException{
        return ds.getConnection();
        
    }
	/*private static Conexao conexao = null;
	private static Connection dataSource = null;
	private String url = "jdbc:mysql://localhost:3306/dsi";
	private String usuario = "root";
	private String senha = "";
	
	private Conexao() {
		
		try {			
			this.dataSource = DriverManager.getConnection(url, usuario, senha);
		}
		catch (SQLException e) {
			System.out.println("Erro ao comunicar com o banco de dados");
			e.printStackTrace();
		}

	}
		
	public Connection getConexao() {
		return dataSource;
	}
	
	public static Conexao getInstance() {
		
		if(conexao == null) {
			conexao =  new Conexao();
		}
		return conexao;
		
	}*/
	
}
