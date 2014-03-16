package utilidades.mates;
//Ejercicio 4 - Pag 115
//Realiza en un equipo un paquete utilidades.mates con dos clases sumar y potenciar. La clase sumar tendra un metodo int suma(int,int)
//el cual devolvera la suma de los dos parametros introducidos y la clase potenciar tendra un metodo int potencia(int,int) el cual devolvera
//el resultado de elevar el primer parametro al segundo parametro. Realiza un programa que haga uso de este paquete.
//Autor: Sergio Tobal
//Fecha: 20-03-2012
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Potencia {

	/**
	 */
	public static void main() throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int base,exponente;
		
		System.out.print("Introduce la base: ");
		base=Integer.parseInt(lectura.readLine());
		System.out.print("Introduce el exponente: ");
		exponente=Integer.parseInt(lectura.readLine());
		
		System.out.println("El valor de la potencia es: "+potencia(base,exponente));
	}

	public static int potencia(int base, int exponente) {
		int r = 1;
		
		while (exponente!=0) {
			r=r*base;
			exponente--;
		}

		return r;
	}

}
