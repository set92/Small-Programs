package sergio;
/* Ejercicio 17 - Estructuras condiciones: simple, doble y multiple
 * Calcular el dia siguiente. Solicita el dia y mes actual y visualice el dia de mñn
 * (Ej: Hoy es dia 31 del 3 y mañana dia 1 del 4)
 * Autor: Sergio Tobal
 * Fecha: 29-11-2011
 */

import java.io.*;
public class ejer17 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int dia, mes, dia1, mes1;
		
		System.out.println("Dia actual:" );
		dia=Integer.parseInt(lectura.readLine());
		dia1=dia+1;
		System.out.println("Mes actual:" );
		mes=Integer.parseInt(lectura.readLine());
		mes1=mes;
		
		if (dia==31){
			dia1=1;
			mes1=mes+1;
			}
		System.out.println("Hoy es "+dia+" del "+mes+" y maana "+dia1+" del "+mes1);
	}
}

