package figuras;

public class Piramide extends Figura3D {
	private double triangulo;
	/**
	 * @param args
	 */
	
	public Piramide() {
		this.triangulo=0;
	}
	public Piramide(double triangulo) {
		this.triangulo=triangulo;
	}
	
	public double getTriangulo() {
		return triangulo;
	}
	public void setTriangulo(double triangulo) {
		this.triangulo = triangulo;
	}
	@Override
	public double calcular_volumen() {
		return Math.sqrt(2)/12*Math.pow(triangulo, 3);
	}
	@Override
	public void mostrarFigura() {
		System.out.println("Esta Piramide se llama "+this.getNombre()+"y es de color: "+this.getColor());
		System.out.println("Triangulo: "+this.triangulo);
	}
	@Override
	public void borrar() {
		super.borrar();
		this.triangulo=0;
	}
	
}
