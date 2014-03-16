package sergio;
//Ejercicio 1 - Pag 115
//Realiza un programa que muestre por pantalla el siguiente cuadrado. El cuadrado podra ser de cualquier dimension. Usar la recursividad.
//1 1  1   1   1
//1 2  3   4   5
//1 3  6  10 15
//1 4 10 20 35
//1 5 15 35 70
//Autor: Sergio Tobal
//Fecha: 20-03-2012
public class ejer115_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numfilas=5;
		
		for (int fila = 1; fila <= numfilas; fila++) {
			for (int columna = 1; columna <= numfilas; columna++) {
				int dato=elemento(fila,columna);
				System.out.print(dato+" ");
			}
		System.out.println("");
		}
	}

	private static int elemento(int fila, int columna) {
		if (fila<1 || columna<1) {
			return 0;
		}
		if (columna==1) {
			return 1;
		}
		return elemento(fila-1,columna)+elemento(fila,columna-1);
	}

}
