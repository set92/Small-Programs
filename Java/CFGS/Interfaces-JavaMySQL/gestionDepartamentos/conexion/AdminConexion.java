package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modeloBD.Departamentos;
import modeloBD.Empleados;

public class AdminConexion {
	
	private Connection con;
	
	public AdminConexion() {
		abrirConexion();
	}

	public void abrirConexion() {
		
		String user = "root";
		String pass = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String conexionBD = "jdbc:mysql://localhost/bd_empresa";
			con = DriverManager.getConnection(conexionBD, user, pass);
		} catch (Exception e) {
			System.out.println("ERROR en la creacion de la BD");
		}
	}
	
	public void cerrarConexion() {
		try {
			con.close();
		}catch (Exception e) {
			System.out.println("Error al cerrar la conexion.");
		}
	}
	
	public ArrayList<Empleados> selectEmpleados() throws SQLException{
		ArrayList<Empleados> listaEmpleados = new ArrayList<Empleados>();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			Empleados empleado = new Empleados(rs.getInt("id_Emple"),rs.getString("nombre_Emple"),rs.getString("apell_Emple"),rs.getDate("fechaAlta_Emple"), rs.getDouble("sueldo_Emple"), rs.getInt("codDPTO_Emple"));
			listaEmpleados.add(empleado);
		}
		rs.close();
		return listaEmpleados;
	}
	
	public ArrayList<Departamentos> selectDepartamentos() throws SQLException{
		ArrayList<Departamentos> listaDepartamentos = new ArrayList<Departamentos>();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM departamentos");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			Departamentos departamento = new Departamentos(rs.getInt("id_Dpto"), rs.getString("descripcion"), rs.getString("poblacion"));
			listaDepartamentos.add(departamento);
		}
		rs.close();
		return listaDepartamentos;
	}
	
	
}
