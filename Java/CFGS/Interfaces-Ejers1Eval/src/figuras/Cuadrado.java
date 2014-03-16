package figuras;

public class Cuadrado extends Figuras{

	private int lado;
	
	public Cuadrado(int lado) {
		this.lado=lado;
	}
	public int getarea() {
		return lado*lado;
	}
	@Override
	public void mostrarFigura() {
		System.out.println("Este cuadrado se llama "+this.getNombre()+"y es de color: "+this.getColor());
		System.out.println("Sus lado es "+this.lado);
	}
	@Override
	public void borrar() {
		super.borrar();
		this.lado=0;
	}

}
