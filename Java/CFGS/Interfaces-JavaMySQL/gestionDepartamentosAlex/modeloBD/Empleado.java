package modeloBD;

/* Esta clase mapea la tabla de Empleados y contiene los constructores y los GETers y SETers de cada atributo */

import java.sql.Date;

public class Empleado {

	private int idEmple;
	private String nomEmple;
	private String apelEmple;
	private Date faltaEmple;
	private double sueldoEmple;
	private int idDptoEmple;
	
	
	public Empleado(int idEmple, String nomEmple, String apelEmple,
			Date faltaEmple, double sueldoEmple, int idDptoEmple) {
		super();
		this.idEmple = idEmple;
		this.nomEmple = nomEmple;
		this.apelEmple = apelEmple;
		this.faltaEmple = faltaEmple;
		this.sueldoEmple = sueldoEmple;
		this.idDptoEmple = idDptoEmple;
	}


	public int getIdEmple() {
		return idEmple;
	}


	public void setIdEmple(int idEmple) {
		this.idEmple = idEmple;
	}


	public String getNomEmple() {
		return nomEmple;
	}


	public void setNomEmple(String nomEmple) {
		this.nomEmple = nomEmple;
	}


	public String getApelEmple() {
		return apelEmple;
	}


	public void setApelEmple(String apelEmple) {
		this.apelEmple = apelEmple;
	}


	public Date getFaltaEmple() {
		return faltaEmple;
	}


	public void setFaltaEmple(Date faltaEmple) {
		this.faltaEmple = faltaEmple;
	}


	public double getSueldoEmple() {
		return sueldoEmple;
	}


	public void setSueldoEmple(double sueldoEmple) {
		this.sueldoEmple = sueldoEmple;
	}


	public int getIdDptoEmple() {
		return idDptoEmple;
	}


	public void setIdDptoEmple(int idDptoEmple) {
		this.idDptoEmple = idDptoEmple;
	}
	
	
	
}
