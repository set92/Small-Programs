package examen;

public class Articulos {
	long codigo;
	String descripcion;
	int existencias;
	
	public Articulos(long codigo, String descripcion, int existencias) {
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.existencias=existencias;
	}

	public long getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	
	public void compra(int unidadesCompradasAlProveedor) {
		unidadesCompradasAlProveedor++;
	}
	
	public void venta(int unidadesVendidas) {
		unidadesVendidas--;
	}
	
	public boolean avisoStock() {
		if (existencias<5) {
			return true;
		}else {
			return false;
		}
	}
}
