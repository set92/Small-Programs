package sergio;
//Ejercicio 1 - Pag 77
//Realiza un programa 
//Autor: Sergio Tobal
//Fecha: 00-00-2012


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejer522 {

	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		char letra;
		int infinito=1;//Variable creada para que el while nunca se detenga
		
		ejer522 c1;
		c1=new ejer522();
		System.out.println("la velocidad es "+c1.getVelocidad());//llama al metodo getVelocidad para mostrar la velocidad
		ejer522 c2,c3,c4,c5;
		
		System.out.println("Pulsa + para aumentar velocidad" +
				"\nPulsa - para decelerar" +
				"\nPulsa . para meter turbo" +
				"\nPulsa , para dar un frenazo o un aceleron y poner el velocimetro a 0");
		linea=lectura.readLine().toUpperCase();//Leer todo lo que ponga el usuario y lo pone en mayusculas
		letra=linea.charAt(0);//De todo lo que haya metido el usuario solo se cojera el primer caracter
			while (infinito!=0) {//Bucle infinito pues nunca se confirmara esta condicion
				switch (letra) {//Se mira lo que ha introducido el usuario, y depende de lo tocado acelera, frena o usa turbo
					case '+':c1.acelera(5);break;
					case '-':c1.frena(5);break;
					case '.':c1.acelera(30);break;
					case ',':c1.frenazo();break;
					default:System.out.println("Caracter erroneo.");
				}
				printvelocidad();
				System.out.print(System.getProperty("line.separator"));
				System.out.println("Pulsa + para aumentar velocidad" +
						"\nPulsa - para decelerar" +
						"\nPulsa . para meter turbo");
				linea=lectura.readLine().toUpperCase();
				letra=linea.charAt(0);
			}
	}
	
	
	private static int velocidad;
	ejer522(){
		velocidad=0;
	}
	public int getVelocidad() {
		return velocidad;
	}
	private void acelera(int mas) {
		velocidad+=mas;
	}
	private void frena(int menos) {
		velocidad-=menos;
	}
	private static void printvelocidad(){
		System.out.print("La velocidad es "+velocidad);
	}
	private void frenazo() {
		velocidad=0;
	}
}
