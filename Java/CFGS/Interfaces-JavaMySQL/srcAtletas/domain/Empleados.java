package domain;

public class Empleados {
	
	private int numlic;
	private String nombre;
	private String mail;
	private String telf;
	
	public Empleados(int numlic, String nombre, String mail, String telf) {
		super();
		this.numlic = numlic;
		this.nombre = nombre;
		this.mail = mail;
		this.telf = telf;
	}
	
	public int getNumlic() {
		return numlic;
	}
	public void setNumlic(int numlic) {
		this.numlic = numlic;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelf() {
		return telf;
	}
	public void setTelf(String telf) {
		this.telf = telf;
	}

}
