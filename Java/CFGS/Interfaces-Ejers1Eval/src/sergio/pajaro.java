package sergio;

public class pajaro {
	private char color;
	private int edad;
	private static int numpajaro;
	
	public pajaro() {
		color='v';
		edad=4;
		numpajaro++;
	}
	pajaro(char color, int edad){
		this.color=color;
		this.edad=edad;
		numpajaro++;
	}
	public char getColor() {
		return color;
	}
	public int getEdad() {
		return edad;
	}
	public static int getNumpajaro() {
		return numpajaro;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setedad(int e){
		this.edad=e;
	}
	public void setcolor(char c){
		this.color=c;
	}
	public void printedad(){
		System.out.println(edad);
	}
	public String printcolor(){
		switch(color){
		case 'v':return "verde";
		case 'a':return "amarillo";
		case 'g':return "gris";
		case 'n':return "negro";
		default: return "Color no establecido";
		}
	}

	
}