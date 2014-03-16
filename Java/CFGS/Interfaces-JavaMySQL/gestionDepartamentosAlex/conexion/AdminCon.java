package conexion;

/* Esta clase es la que realiza la conexi�n a la BBDD */
/* Adem�s tambi�n realiza las operaciones SQL sobre las tablas de la BD  */

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modeloBD.Departamento;
import modeloBD.Empleado;


public class AdminCon {

	private static Connection con;
	
	public AdminCon(){
		establecerConexion();
	}
	
	public void establecerConexion() {
		String host = "127.0.0.1";
		String user = "root";
		String pass = "";
		String dtbs = "bd_empresa";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//con = DriverManager.getConnection("jdbc:mysql://" + host + "/" + dtbs,user,pass);
			String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs + "?" + "user=" + user + "&password=" + pass;
			con = DriverManager.getConnection(newConnectionURL);
		}catch (Exception e) {
			System.out.println("Error al abrir la conexi�n.");
		}
		
	}
	
	public void cerrarConexion() {
		try {
			con.close();
		}catch (Exception e) {
			System.out.println("Error al cerrar la conexi�n.");
		}
	}
	
	//Devuelve un ArrayList de empleados con el contenido de la tabla empleados
	public ArrayList<Empleado> recuperaEmpleados() throws SQLException{
		ArrayList<Empleado> listaEmp = new ArrayList<Empleado>();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Empleado emp = new Empleado(rs.getInt("id_Emple"),rs.getString("nombre_Emple"),rs.getString("apell_Emple"),rs.getDate("fechaAlta_Emple"),rs.getDouble("sueldo_Emple"),rs.getInt("codDPTO_Emple"));
			listaEmp.add(emp);
		}
		rs.close();
		return listaEmp;
	}
	
	//Devuelve la lista de empleados de un departamento dado
	public ArrayList<Empleado> recuperaEmpleDpto(int idDpto) throws SQLException{
		ArrayList<Empleado> listaEmp = new ArrayList<Empleado>();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados WHERE `codDPTO_Emple` = " + idDpto);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Empleado emp = new Empleado(rs.getInt("id_Emple"),rs.getString("nombre_Emple"),rs.getString("apell_Emple"),rs.getDate("fechaAlta_Emple"),rs.getDouble("sueldo_Emple"),rs.getInt("codDPTO_Emple"));
			listaEmp.add(emp);
		}
		rs.close();
		return listaEmp;
	}
	
	//Devuelve un ArrayList de departamentos con el contenido de la tabla empleados
	public ArrayList<Departamento> recuperaDepartamentos() throws SQLException{
		ArrayList<Departamento> listaDep = new ArrayList<Departamento>();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM departamentos");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Departamento dept = new Departamento(rs.getInt("id_Dpto"),rs.getString("descripcion"),rs.getString("poblacion"));
			listaDep.add(dept);
		}
		rs.close();
		return listaDep;
	}
	
	//Devuelve los datos de un departamento cuyo Id se le pasa como par�metro (Devuelve un objeto de tipo DPTO)
	public Departamento recuperaDpto(int idDpto) throws SQLException{
		Departamento Dpto = null;
		PreparedStatement ps = con.prepareStatement("SELECT * FROM departamentos WHERE `id_Dpto` = " + idDpto);
		ResultSet rs = ps.executeQuery();
		if (rs.next()==true){
			Dpto= new Departamento(rs.getInt("id_Dpto"),rs.getString("descripcion"),rs.getString("poblacion"));
		}
		return Dpto;
	}
	
	public void insertaEmple(int idEmple, String nomEmple, String apelEmple, Date faltaEmple, double sueloEmple, int idDptoEmple) throws SQLException {
		String seleccio = "INSERT INTO `empleados` (`id_Emple` ,`nombre_Emple` ,`apell_Emple` ,`fechaAlta_Emple`,`sueldo_Emple`,`codDPTO_Emple` )" + "VALUES (?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(seleccio);
		ps.setInt(1, idEmple);
		ps.setString(2, nomEmple);
		ps.setString(3, apelEmple);
		ps.setDate(4, faltaEmple);
		ps.setDouble(5, sueloEmple);
		ps.setInt(6, idDptoEmple);
		ps.executeUpdate();
	}

	public void editaEmple(int idEmple, String nomEmple, String apelEmple, Date faltaEmple, double sueloEmple, int idDptoEmple) throws SQLException {
		String seleccio = "UPDATE `empleados` SET `nombre_Emple` = ?, `apell_Emple` = ?,`fechaAlta_Emple` = ?,`sueldo_Emple` = ?,`codDPTO_Emple` = ? WHERE `id_Emple` =?";
		PreparedStatement ps = con.prepareStatement(seleccio);
		ps.setInt(6, idEmple);
		ps.setString(1, nomEmple);
		ps.setString(2, apelEmple);
		ps.setDate(3, faltaEmple);
		ps.setDouble(4, sueloEmple);
		ps.setInt(5, idDptoEmple);
		ps.executeUpdate();
	}
	
	public void eliminaEmple(int idEmple) throws SQLException {
		String seleccio = "DELETE FROM `empleados` WHERE `id_Emple` = ?";
		PreparedStatement ps = con.prepareStatement(seleccio);
		ps.setInt(1, idEmple);
		ps.executeUpdate();
	}
	
	//Ahora vendr�an los mismo 3 metodos anteriores pero para los departamentos.
	
	
}


