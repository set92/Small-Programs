package sergio;
/* Ejercicio 31 - Ejercicios con estructuras de control
 * Realiza un programa que visualice la tala ASCII de los caracteres comprendidos
 * entre el valor ASCII 31 y 122. Visualizar en ASCII y en caracter
 * Autor: Sergio Tobal
 * Fecha: 19-12-2011
 */

public class ejer31 {
	
	public static void main (String args[]){
		int num=31;
		char numasc=31;
		
		while (num<=122){
			System.out.println("Numero: "+num);
			System.out.println("ASCII: "+numasc+"\n");
			num++;
			numasc++;
		}
	}
}

