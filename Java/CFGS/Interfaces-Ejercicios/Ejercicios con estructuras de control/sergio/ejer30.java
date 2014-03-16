package sergio;
/* Ejercicio 30 - Ejercicios con estructuras de control
 * Realiza un programa que obtenga la suma de los numeros comprendidos entre 15 y 20
 * ambos inclusive.
 * Autor: Sergio Tobal
 * Fecha: 16-12-2011
 */


public class ejer30 {
	
	public static void main (String args[]) {
		int num=15, acum=0;
		
		while(num<21){
			acum=acum+num;
			num++;
			
		}
		System.out.println("La suma total es "+acum);
	}
}

