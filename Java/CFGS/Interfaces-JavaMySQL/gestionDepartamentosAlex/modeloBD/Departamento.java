package modeloBD;

/* Esta clase mapea la tabla de Departamentos y contiene los constructores y los GETers y SETers de cada atributo */

public class Departamento {

	private int idDpto;
	private String nomDpto;
	private String poblDpto;
	
	public Departamento(int idDpto, String nomDpto, String poblDpto) {
		super();
		this.idDpto = idDpto;
		this.nomDpto = nomDpto;
		this.poblDpto = poblDpto;
	}

	public int getIdDpto() {
		return idDpto;
	}

	public void setIdDpto(int idDpto) {
		this.idDpto = idDpto;
	}

	public String getNomDpto() {
		return nomDpto;
	}

	public void setNomDpto(String nomDpto) {
		this.nomDpto = nomDpto;
	}

	public String getPoblDpto() {
		return poblDpto;
	}

	public void setPoblDpto(String poblDpto) {
		this.poblDpto = poblDpto;
	}
		
	
}
