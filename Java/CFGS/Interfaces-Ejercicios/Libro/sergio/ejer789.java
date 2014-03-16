package sergio;
//Ejercicio 1 - Pag 77
//Realiza un programa 
//Autor: Sergio Tobal
//Fecha: 00-00-2012
public class ejer789 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int div=2, n=7951;
		while (n%div!=0) {
			div++;
		}
		if (div==n) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("No es primo");
		}
	}

}
