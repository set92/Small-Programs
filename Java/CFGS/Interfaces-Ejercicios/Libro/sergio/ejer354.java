package sergio;
/* Ejercicio 4. Pag 35
 * Autor: Sergio Tobal
 * Fecha: 25-11-2011
 */


public class ejer354 {
	
	public static void main (String args[]) {
		int num=5;
		num += num - 1 * 4 + 1;
		System.out.println(num);
		num=4;
		num %= 7 * num % 3 * 7 >> 1;
		System.out.println(num);
	}
}

