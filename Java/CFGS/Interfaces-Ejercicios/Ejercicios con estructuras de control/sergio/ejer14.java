package sergio;
/* Ejercicio 14 - Estructuras condiciones: simple, doble y multiple
 * Realizar un progrmaa que solicite un mes al usuario y visualice dicho mes y el
 * siguiente.(Ej: "Es mes 4 y el mes que viene sera 5")
 * Autor: Sergio Tobal
 * Fecha: 29-11-2011
 */


import java.io.*;
public class ejer14 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		
		System.out.println("Mes actual:" );
		a=Integer.parseInt(lectura.readLine());
		b=a+1;
		System.out.println(System.getProperty("line.separator"));
		System.out.println("El mes actual es "+a+" y el siguiente es: " +b);
		
	}
}

