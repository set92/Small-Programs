package figuras;

public class Triangulo extends Figura2D {
	private double base, altura;
	/**
	 * @param args
	 */
	public Triangulo(){
		this.base=0;
		this.altura=0;
	}
	public Triangulo(double base, double altura){
		this.base=base;
		this.altura=altura;
	}
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double getArea() {
		return (base*altura)/2;
	}

	@Override
	public double getPerimetro() {
		return(base*base*base); // Damos por hecho que el triangulo es equilatero
	}
	@Override
	public void mostrarFigura() {
		System.out.println("Este triangulo se llama "+this.getNombre()+"y es de color: "+this.getColor());
		System.out.println("Sus lados son-> Base: "+this.base+" y la altura es "+this.altura);
	}
	@Override
	public void borrar() {
		super.borrar();
		this.base=0;
		this.altura=0;
	}

}
