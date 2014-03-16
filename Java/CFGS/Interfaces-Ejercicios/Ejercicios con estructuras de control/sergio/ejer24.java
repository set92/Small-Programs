package sergio;
/* Ejercicio 24 - Ejercicios con estructuras de control
 * Solicitar la edad de los 4 cuatros amigos de la cuadrilla y visualizar la edad del mas joven.
 * El programa debe ser facil de modificar ya que el numero de amigos puede ser de 100.
 * Autor: Sergio Tobal
 * Fecha: 8-12-2011
 */

import java.io.*;
public class ejer24 {
	
	public static void main (String args[])throws IOException {
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		int edadwhile=0, edad, edadmenor=100;
		
		
		while (edadwhile<4){
			edadwhile=edadwhile+1;
			System.out.print("Edad: ");
			edad=Integer.parseInt(teclado.readLine());
			
			if (edadmenor>edad){
				edadmenor=edad;
			}
		}
		System.out.println("El menor es "+edadmenor);
		
	}
}

