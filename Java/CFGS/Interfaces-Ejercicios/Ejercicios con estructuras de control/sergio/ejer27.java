package sergio;
/* Ejercicio 27 - Ejercicios con estructuras de control
 * Realiza un programa que solicite un numero y realizar su tabla de multiplicar
 * Autor: Sergio Tobal
 * Fecha: 8-12-2011
 */

import java.io.*;
public class ejer27 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));
		int num;
                   
		System.out.println("Numero de la tabla: ");
		num=Integer.parseInt(lectura.readLine());
		System.out.println("El numero introducido es " +num);
        
		for (int x=1;x<11;x++){
			System.out.println(num + " x " + x + " = " + (x*num));
		}
                   	
	}
}

