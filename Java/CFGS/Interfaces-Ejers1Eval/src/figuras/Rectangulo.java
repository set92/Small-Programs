package figuras;

public class Rectangulo extends Figura2D{
	private double lado1, lado2 ,diagonal;
	
	/**
	 * @param args
	 */
	public Rectangulo() {
		this.lado1=0;
		this.lado2=0;
		this.diagonal=0;
	}
	public Rectangulo(double lado1, double lado2){
		this.lado1=lado1;
		this.lado2=lado2;
	}
	
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public double getDiagonal() {
		return diagonal;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getDiagonal(double lado1, double lado2) {
		return Math.sqrt((lado1*lado1)+(lado2*lado2));
	}
	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}
	@Override
	public double getArea() {
		return (lado1*lado2);
	}
	@Override
	public double getPerimetro() {
		return ((2*lado1)+(2*lado2));
	}
	@Override
	public void mostrarFigura() {
		System.out.println("Este rectangulo se llama "+this.getNombre()+"y es de color: "+this.getColor());
		System.out.println("Sus lados son-> Lado 1: "+this.lado1+" y el otro lado es "+this.lado2);
	}
	@Override
	public void borrar() {
		super.borrar();
		this.lado1=0;
		this.lado2=0;
	}
	
}
