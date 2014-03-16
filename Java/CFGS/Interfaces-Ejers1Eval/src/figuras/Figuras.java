package figuras;

public abstract class Figuras {
	private String color;
	private String Nombre;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void mostrarFigura(){
		System.out.println("Esta figura se llama "+this.getNombre()+"y es de color: "+this.getColor());
	}
	public void borrar(){
		this.Nombre="";
		this.color="";
	}
	
}
