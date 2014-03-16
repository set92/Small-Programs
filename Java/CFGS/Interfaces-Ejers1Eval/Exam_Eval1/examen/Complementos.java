package examen;

public class Complementos extends Articulos{
	Fecha fechaCaducidad;
	
	public Complementos(long codigo, String descripcion, int existencias) {
		super(codigo, descripcion, existencias);
	}

	public Fecha getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Fecha fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

}
