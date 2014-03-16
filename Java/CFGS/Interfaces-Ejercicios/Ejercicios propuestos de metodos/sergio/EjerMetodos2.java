package sergio;
//Ejercicio Metodos 2
//Realiza un metodo llamado Pcuadro cuya mision es la de visualizar un recuadro con las coordenads
//que recibe. Main solicita coordenadas al usuario y llama al metodo.
//Autor: Sergio Tobal
//Fecha: 10-02-2012
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjerMetodos2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int x=3,y=2,width=10,height=5,x2=3;
		
		System.out.println("Columna de donde quieres empezar: ");
		y=Integer.parseInt(lectura.readLine());
		System.out.println("Linea de donde quieres empezar: ");
		x=Integer.parseInt(lectura.readLine());
		
		System.out.println("Cuantas anchura quieres que tenga?");
		width=Integer.parseInt(lectura.readLine());
		System.out.println("Cuanta altura quieres que tenga?");
		height=Integer.parseInt(lectura.readLine());
		while (y!=1) {
			System.out.println(" ");
			y=y-1;
		}
		for (int ancho=0; ancho<x2; ancho++) {
			System.out.print(" ");
			x2=x-1;
		}

		Pcuadro(height,width,x2,x);
	}
	private static void Pcuadro(int height, int width, int x2, int x) {
		char topleft='a',topcenter='-',topright='b',botleft='c',botright='d',side='|';
		System.out.print(topleft);//pinta la punta superior izquierda
		for (int i=0; i<(width-2); i++) {
			System.out.print(topcenter);//pinta las lineas centrales
		}
		System.out.print(topright);//pinta la punta superior derecha
		System.out.println();//salto de linea
		
		for (int j = 0; j<(height-2); j++) {//pinta barras laterales
			for (int ancho=0; ancho<x2; ancho++) {//hueco de la izquierda
				System.out.print(" ");
				x2=x-1;
			}
			System.out.print(side);
			for (int i=0; i<(width-2); i++) {
				System.out.print(topcenter);//pinta las lineas centrales
			}
			System.out.println(side);
		}
		for (int ancho=0; ancho<x2; ancho++) {//hueco de la izquierda
			System.out.print(" ");
			x2=x-1;
		}
		System.out.print(botleft);
		for (int i=0; i<(width-2); i++) {
			System.out.print(topcenter);//pinta las lineas centrales
		}
		System.out.print(botright);
		
		
	}
	
}
