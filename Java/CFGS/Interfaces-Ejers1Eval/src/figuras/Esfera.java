package figuras;

public class Esfera extends Figura3D {
	private double radio;
	/**
	 * @param args
	 */
	public Esfera() {
		this.radio=0;
	}
	public Esfera(double radio) {
		this.radio=radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	@Override
	public double calcular_volumen() {
		return (4/3)*Math.PI*(radio*radio*radio);
	}
	@Override
	public void mostrarFigura() {
		System.out.println("Esta esfera se llama "+this.getNombre()+"y es de color: "+this.getColor());
		System.out.println("Radio: "+this.radio);
	}
	@Override
	public void borrar() {
		super.borrar();
		this.radio=0;
	}

}
