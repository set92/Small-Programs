package figuras;

public class Cubo extends Figura3D {
	private double rectangulo, altura;
	/**
	 * @param args
	 */
	public Cubo() {
		this.rectangulo=0;
		this.altura=0;
	}
	public Cubo(double rectangulo, double altura) {
		this.rectangulo=rectangulo;
		this.altura=altura;
	}
	
	public double getRectangulo() {
		return rectangulo;
	}
	public double getAltura() {
		return altura;
	}
	public void setRectangulo(double rectangulo) {
		this.rectangulo = rectangulo;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	@Override
	public double calcular_volumen() {
		return rectangulo*altura;
	}
	@Override
	public void mostrarFigura() {
		System.out.println("Este cubo se llama "+this.getNombre()+"y es de color: "+this.getColor());
		System.out.println("Lado: "+this.rectangulo+" y la altura es "+this.altura);
	}
	@Override
	public void borrar() {
		super.borrar();
		this.rectangulo=0;
		this.altura=0;
	}

}
