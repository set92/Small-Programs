package modeloBD;

import java.sql.Date;

public class Empleados {
	
	private int id_Emple;
	private String nombre_Emple;
	private String apell_Emple;
	private Date fechaAlta_Emple;
	private double sueldo_Emple;
	private int codDPTO_Emple;
	
	public Empleados(int id_Emple, String nombre_Emple, String apell_Emple,	Date fechaAlta_Emple, double sueldo_Emple, int codDPTO_Emple) {
		super();
		this.id_Emple = id_Emple;
		this.nombre_Emple = nombre_Emple;
		this.apell_Emple = apell_Emple;
		this.fechaAlta_Emple = fechaAlta_Emple;
		this.sueldo_Emple = sueldo_Emple;
		this.codDPTO_Emple = codDPTO_Emple;
	}

	public int getId_Emple() {
		return id_Emple;
	}

	public void setId_Emple(int id_Emple) {
		this.id_Emple = id_Emple;
	}

	public String getNombre_Emple() {
		return nombre_Emple;
	}

	public void setNombre_Emple(String nombre_Emple) {
		this.nombre_Emple = nombre_Emple;
	}

	public String getApell_Emple() {
		return apell_Emple;
	}

	public void setApell_Emple(String apell_Emple) {
		this.apell_Emple = apell_Emple;
	}

	public Date getFechaAlta_Emple() {
		return fechaAlta_Emple;
	}

	public void setFechaAlta_Emple(Date fechaAlta_Emple) {
		this.fechaAlta_Emple = fechaAlta_Emple;
	}

	public double getSueldo_Emple() {
		return sueldo_Emple;
	}

	public void setSueldo_Emple(double sueldo_Emple) {
		this.sueldo_Emple = sueldo_Emple;
	}

	public int getCodDPTO_Emple() {
		return codDPTO_Emple;
	}

	public void setCodDPTO_Emple(int codDPTO_Emple) {
		this.codDPTO_Emple = codDPTO_Emple;
	}
	
	
	
	
}
