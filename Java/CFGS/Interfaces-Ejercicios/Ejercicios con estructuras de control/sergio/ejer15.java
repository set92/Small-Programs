package sergio;
/* Ejercicio 15 - Estructuras condiciones: simple, doble y multiple
 * Recoger la nota de un alumno por teclado y visualizar si es suspenso, aprobado, 
 * notable o sobresaliente(if)
 * Autor: Sergio Tobal
 * Fecha: 30-11-2011
 */

import java.io.*;
public class ejer15 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura = new BufferedReader (new InputStreamReader (System.in));
		int nota;
		
		System.out.println("Nota: ");
		nota=Integer.parseInt(lectura.readLine());
		if (nota<5){
			System.out.println("Suspenso");
			}
		else if(nota>=5 & nota<=7){
			System.out.println("Aprobado");
			}
		else if(nota>=7 & nota<9){
			System.out.println("Notable");
			}
		else if(nota>=9){
			System.out.println("Sobresaliente");
			}
	}
}

