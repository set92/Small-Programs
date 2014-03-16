package sergio;
/* Ejercicio 28 - Ejercicios con estructuras de control
 * Realiza un programa que solicite una letra y visualice esa letra 10 veces
 * verticalmente a partir de la fila 20 columna 5
 * Autor: Sergio Tobal
 * Fecha: 14-12-2011
 */

import java.io.*;
public class ejer29 {
	
	public static void main (String args[])throws IOException {
		BufferedReader teclado= new BufferedReader (new InputStreamReader (System.in));
		String letra;
		
		System.out.println("Dame una letra");
		letra=teclado.readLine();
		System.out.print(System.getProperty("line.separator"));
		
		for (int y=0;y<20;y++){
			System.out.println("");
			}
		for (int x=0;x<5;x++){
			System.out.print(" ");
		}
		for (int letramas=0;letramas<10;letramas++){
			System.out.print(letra);
		}
		System.out.print("\n");
	}
}

