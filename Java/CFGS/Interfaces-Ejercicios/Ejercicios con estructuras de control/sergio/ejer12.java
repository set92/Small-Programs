package sergio;
/* Ejercicio 12 - Estructuras condiciones: simple, doble y multiple
 * Solicitar al usuario la edad, si es mayor de 65 diremos jubilado, si es mayor 
 * de 35 diremos adulto y si no diremos que es Joven.
 * Autor: Sergio Tobal
 * Fecha: 29-11-2011
 */

import java.io.*;
public class ejer12 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		
		System.out.println("Edad: ");
		edad = Integer.parseInt(lectura.readLine());
		if (edad < 35){
			System.out.println("Es joven");
			}
		else if (edad > 65){
			System.out.println("Jubilado");
			}
		else if (edad > 110){
			System.out.println("No esta vivo");
			}
		else if( edad > 35 & edad < 65){
			System.out.println("Es adulto");
			}
	}
}

