package conexion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modeloBD.Departamentos;
import modeloBD.Empleados;

public class AdminConexion {
	
	private static Connection con;
	
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
			System.out.println("DEBUG: Conexion realizada");
		} catch (Exception e) {
			System.out.println("ERROR en la conexion con la BD");
		}
	}
	
	public void cerrarConexion() {
		try {
			con.close();
		}catch (Exception e) {
			System.out.println("ERROR: No se ha podido cerrar la conexion.");
		}
	}
	
	public ArrayList<Empleados> selectEmpleadoDpto(int idDpto) throws SQLException{
		ArrayList<Empleados> listaEmp = new ArrayList<Empleados>();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados WHERE codDPTO_Emple = " + idDpto);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			Empleados empleado = new Empleados(rs.getInt("id_Emple"),rs.getString("nombre_Emple"),rs.getString("apell_Emple"),rs.getDate("fechaAlta_Emple"),rs.getDouble("sueldo_Emple"),rs.getInt("codDPTO_Emple"));
			listaEmp.add(empleado);
		}
		rs.close();
		return listaEmp;
	}
	
	public Empleados selectEmpleado(int idEmple) throws SQLException{
		Empleados empleado = null;
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados WHERE id_Emple =" +idEmple);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()==true){
			empleado = new Empleados(rs.getInt("id_Emple"),rs.getString("nombre_Emple"),rs.getString("apell_Emple"),rs.getDate("fechaAlta_Emple"),rs.getDouble("sueldo_Emple"),rs.getInt("codDPTO_Emple"));
		}
		rs.close();
		return empleado;
	}
	
	public Departamentos selectDepartamento(int idDpto) throws SQLException{
		Departamentos departamento = null;
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM departamentos WHERE id_Dpto =" +idDpto);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()==true){
			departamento= new Departamentos(rs.getInt("id_Dpto"),rs.getString("descripcion"),rs.getString("poblacion"));
		}
		rs.close();
		return departamento;
	}
	
	public boolean existeEmpleado(int idEmple) throws SQLException{
		PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados WHERE id_Emple =" +idEmple);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()==true){
			return false;
		}

		return true;
	}
	
	public boolean existeDepartamento(int idDpto) throws SQLException{
		PreparedStatement ps = con.prepareStatement("SELECT * FROM departamentos WHERE id_Dpto =" +idDpto);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()==true){
			return false;
		}

		return true;
	}
	
	
}
