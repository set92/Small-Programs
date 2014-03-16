package sergio;
/* Ejercicio 28 - Ejercicios con estructuras de control
 * Realiza un programa que solicite una letra y visualice esa letra 10 veces
 * horizontalmente a parrtir de la columna 10 fila 3
 * Autor: Sergio Tobal
 * Fecha: 14-12-2011
 */

import java.io.*;
public class ejer28 {
		
	public static void main (String args[])throws IOException {
		
	/* Codigo para esperar un cierto periodo de tiempo
		try {
			System.out.println("esperamos 1 seg...");
			Thread.sleep(1000);
			
		}catch (InterruptedException x) {
			System.out.println("ha existido algún error...");
		}
	*/
		BufferedReader teclado= new BufferedReader (new InputStreamReader (System.in));
		String letra;
		
		System.out.println("Dame una letra");
		letra=teclado.readLine();
		System.out.print(System.getProperty("line.separator"));
		for (int cont=0;cont<10;cont++){
			System.out.print(" ");
			}
		for (int letramas=0;letramas<10;letramas++){
			System.out.print(letra);
		}
		System.out.print("\n");
		
	}
}

