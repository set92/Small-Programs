package sergio;
/* Ejercicio 13 - Estructuras condiciones: simple, doble y multiple
 * Solicitar 2 numeros por teclado e indica cual es mayor cual menor o si son iguales
 * Autor: Sergio Tobal
 * Fecha: 29-11-2011
 */


import java.io.*;
public class ejer13 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		
		System.out.println("Numero 1:" );
		a=Integer.parseInt(lectura.readLine());
		System.out.println("Numero 2:" );
		b=Integer.parseInt(lectura.readLine());
		if (a < b){
			System.out.println("Mayor: "+b);
			}
		else if (a > b){
			System.out.println("Mayor: "+a);
			}
		else if (a == b){
			System.out.println("Igual");
			}
	}
}

