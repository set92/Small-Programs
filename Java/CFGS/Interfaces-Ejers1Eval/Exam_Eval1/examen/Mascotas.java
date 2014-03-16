package examen;

public class Mascotas extends Articulos implements SerVivo{
	Fecha fechaNacimiento;
	
	public Mascotas(long codigo, String descripcion, int existencias) {
		super(codigo, descripcion, existencias);
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String cumpleaños() {
		switch (fechaNacimiento.getMes()) {
		case 1:return fechaNacimiento.getDia()+" de Enero";
		case 2:return fechaNacimiento.getDia()+" de Febrero";
		case 3:return fechaNacimiento.getDia()+" de Marzo";
		case 4:return fechaNacimiento.getDia()+" de Abril";
		case 5:return fechaNacimiento.getDia()+" de Mayo";
		case 6:return fechaNacimiento.getDia()+" de Junio";
		case 7:return fechaNacimiento.getDia()+" de Julio";
		case 8:return fechaNacimiento.getDia()+" de Agosto";
		case 9:return fechaNacimiento.getDia()+" de Septiembre";
		case 10:return fechaNacimiento.getDia()+" de Octubre";
		case 11:return fechaNacimiento.getDia()+" de Noviembre";
		case 12:return fechaNacimiento.getDia()+" de Diciembre";
		default:return "Mes incorrecto";
		}
	}

}
