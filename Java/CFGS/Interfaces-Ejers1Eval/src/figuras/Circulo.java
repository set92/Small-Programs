package figuras;

public class Circulo extends Figura2D {
	private double radio;
	/**
	 * @param args
	 */
	public Circulo() {
		this.radio=0;
	}
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	public double getRadio() {
		return (Math.PI * Math.pow(radio,2));
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI*(radio*radio);
	}

	@Override
	public double getPerimetro() {
		return 2*Math.PI*radio;
	}
	public void mostrarFigura(){
		System.out.println("Este circulo se llama "+this.getNombre()+" y es de color: "+this.getColor());
		System.out.println("Su radio es "+this.radio);
	}
	public void borrar(){
		super.borrar();
		radio=0;
	}

}
