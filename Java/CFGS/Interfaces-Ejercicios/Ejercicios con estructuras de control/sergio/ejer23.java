package sergio;
/* Ejercicio 23 - Ejercicios con estructuras de control
 * Visualiza los diez primeros numeros naturales del 10 al 1 separados por comas
 * "10,9,8,7,6,5,4,3,2,1."
 * Autor: Sergio Tobal
 * Fecha: 8-12-2011
 */


public class ejer23 {
	
	public static void main (String args[]) {
		int num=10;
		
		System.out.print("`");
		while (num>0){
			System.out.print(num);
			num=num-1;
			if (num==0){
				System.out.print(".");
			}
			else {
				System.out.print(", ");
			}
		}
		System.out.print("'");
		System.out.print(System.getProperty("line.separator"));
	}
}

