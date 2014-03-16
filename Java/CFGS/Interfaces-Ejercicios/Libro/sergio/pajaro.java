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
		String nomcolor;
		switch(color){
		case 'v':nomcolor="verde";break;
		case 'a':nomcolor="amarillo";break;
		case 'g':nomcolor="gris";break;
		case 'n':nomcolor="negro";break;
		default:nomcolor="Color no establecido";
		}
		return nomcolor;
	}
	public static void main(String[] args) {
		pajaro objpajaro1 = new pajaro();
		pajaro objpajaro2 = new pajaro();
		pajaro objpajaro3 = new pajaro('a',14);
		
		objpajaro1.setcolor('v');
		objpajaro1.setedad(15);
		objpajaro2.setcolor('a');
		objpajaro2.setedad(8);
		
		
		System.out.println("El color del Pajaro 1 es: "+objpajaro1.printcolor()+" y su edad es: "+objpajaro1.getEdad());
		System.out.println("El color del Pajaro 2 es: "+objpajaro2.printcolor()+" y su edad es: "+objpajaro2.getEdad());
		System.out.println("El color del Pajaro 3 es: "+objpajaro3.printcolor()+" y su edad es: "+objpajaro3.getEdad());
		System.out.println("El numero de pajaros es: "+numpajaro);
	}
	
}