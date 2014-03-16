package sergio;
/* Ejercicio 25 - Ejercicios con estructuras de control
 * Solicitar la estatura de 6 amigos y visualizar la estatura del mas alto.
 * El programa debe ser facil de modificar ya que el numero de amigos puede ser de 100.
 * Autor: Sergio Tobal
 * Fecha: 8-12-2011
 */

import java.io.*;
public class ejer25 {
	
	public static void main (String args[])throws IOException {

		BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));
		float alt, altwhile=0, altmayor=0;
		
		while (altwhile<6){
			altwhile=altwhile+1;
			System.out.println("Altura: ");
			alt=Float.parseFloat(lectura.readLine());
		
			if (alt>altmayor){
				altmayor=alt;
				
			}
		}
		
		System.out.println("La mayor altura es: "+altmayor);

	}
}

