package sergio;
/* Ejercicio 22 - Ejercicios con estructuras de control
 * Visualizar la suma de los 100 primeros numeros naturales. Solucion=5050
 * Autor: Sergio Tobal
 * Fecha: 5-12-2011
 */


public class ejer22 {
	
	public static void main (String args[]) {
		int num=0, num1=0;
		
		
		while (num<=100){
			num1=num1+num;
			num++;
			System.out.println("Numero: "+num);
		}
		System.out.println(System.getProperty("line.separator"));
		System.out.println("Solucion total: "+num1);
	}
}

