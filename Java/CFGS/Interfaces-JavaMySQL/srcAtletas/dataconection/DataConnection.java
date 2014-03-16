package dataconection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.Empleados;


public class DataConnection {
	
	private Connection con;
	
	public DataConnection(){
		performConnection();
	}
	
	public void performConnection() {
		String host = "127.0.0.1";
		String user = "root";
		String pass = "";
		String dtbs = "atletismo";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs + "?" + "user=" + user + "&password=" + pass;
			con = DriverManager.getConnection(newConnectionURL);
		}catch (Exception e) {
			System.out.println("Error al abrir la conexi�n.");
		}
		
	}
	
	public void closeConnection() {
		try {
			con.close();
		}catch (Exception e) {
			System.out.println("Error al cerrar la conexi�n.");
		}
	}
	
	public ArrayList<Empleados> retornaAtletas() throws SQLException{
		ArrayList<Empleados> ls = new ArrayList<Empleados>();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM atleta");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Empleados a = new Empleados(rs.getInt("numllicencia"),rs.getString("nomatleta"),rs.getString("email"),rs.getString("telefon"));
			ls.add(a);
		}
		rs.close();
		return ls;
	}

	public void insertaAtleta(int numlic, String nombre, String email, String telefono) throws SQLException {
		String seleccio = "INSERT INTO atleta (numllicencia ,nomatleta ,email ,telefon)" + "VALUES (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(seleccio);
		ps.setInt(1, numlic);
		ps.setString(2, nombre);
		ps.setString(3, email);
		ps.setString(4, telefono);
		ps.executeUpdate();
	}

	public void editaAtleta(int numlic, String nom) throws SQLException {
		String seleccio = "UPDATE `atleta` SET `nomatleta` = ? WHERE `numllicencia` =?";
		PreparedStatement ps = con.prepareStatement(seleccio);
		ps.setString(1, nom);
		ps.setInt(2, numlic);
		ps.executeUpdate();
	}
	
	public void eliminaAtleta(int numlic) throws SQLException {
		String seleccio = "DELETE FROM `atleta` WHERE `numllicencia` = ?";
		PreparedStatement ps = con.prepareStatement(seleccio);
		ps.setInt(1, numlic);
		ps.executeUpdate();
	}
}
