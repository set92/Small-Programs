package modeloBD;

public class Departamentos {
	
	private int id_Dpto;
	private String descripcion;
	private String poblacion;
	
	public Departamentos(int id_Dpto, String descripcion, String poblacion) {
		super();
		this.id_Dpto = id_Dpto;
		this.descripcion = descripcion;
		this.poblacion = poblacion;
	}

	public int getId_Dpto() {
		return id_Dpto;
	}

	public void setId_Dpto(int id_Dpto) {
		this.id_Dpto = id_Dpto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	
	
	
	
}
