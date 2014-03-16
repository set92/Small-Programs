package sergio;
/* Ejercicio 26 - Ejercicios con estructuras de control
 * Solicitar el peso de 5 amigos y visualizar la media de kilos.
 * (Ej: 70, 75, 65, 62, 79. La media es: 70,2kg)
 * Autor: Sergio Tobal
 * Fecha: 12-12-2011
 */

import java.io.*;
public class ejer26 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));
		float peso, mediapeso=0, contador=0, pesototal=0;
		int numperso=1;
		
		while(contador<5){
			contador=contador+1;
			System.out.println("Peso "+numperso+":");
			peso=Float.parseFloat(lectura.readLine());
			numperso=numperso+1;
			pesototal=pesototal+peso;
		}
		mediapeso=pesototal/contador;
		System.out.println("La media es: "+mediapeso);
		
		
	}
}

