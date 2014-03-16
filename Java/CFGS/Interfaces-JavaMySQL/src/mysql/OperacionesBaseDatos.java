package mysql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class OperacionesBaseDatos {
	private Connection conn;
	private Statement st;
	
	public OperacionesBaseDatos() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_empresa", "root", "");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void alta(String strSQL) {
		try {
			st = conn.createStatement();
			st.executeUpdate(strSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void cerraConexiones() {
		try {
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
	}
	
	
}
