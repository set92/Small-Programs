package sergio;
//Ejercicio 4 - Pag 113
//Realiza un programa que utilizando recursividad muestre por pantalla la siguiente piramide.
//              1
//         1   1   1
//    1   2   3  2   1
//1  3   6   7   6   3   1
//Autor: Sergio Tobal
//Fecha: 20-03-2012
public class ejer113_4 {

	public static void main(String[] args) {
		int numfilas=4;
		
		for (int i = 1; i < (numfilas+1); i++) {
			for (int e = 0; e < (numfilas-i); e++) {
				System.out.print("  ");
			}
			for (int j = 1; j < (2*numfilas+1); j++) {
				int dato=elemento(i,j);
				if (dato>0){
					System.out.print(dato+" ");
				}
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
		return elemento(fila-1,columna)+elemento(fila-1,columna-1)+elemento(fila-1,columna-2);
	}

}
