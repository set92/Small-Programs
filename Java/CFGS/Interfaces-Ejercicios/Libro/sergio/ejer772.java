package sergio;
/* Ejercicio 2 - Pag 77
 * Realiza un programa utilizando bucles que muestre la siguiente figura por pantalla:
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * Autor: Sergio Tobal
 * Fecha: 09-01-2012
 */
public class ejer772 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j;
		
		for (i=1;i<=5;i++){

			for (j=1;j<=1*(i-1)+1;j++) {
				System.out.print("*");
			}
//			LA i SON EL TOTAL DE LINEAS QUE VA A ESCRIBIR
//			LA j SE ENCARGA DE LOS * Y DE CUANTOS AHI POR LINEAS
//			for (j=1;j<=(INCREMENTO DE * CADA LINEA)*(i-(NUMERO DE LINEA QUE EMPIEZA))+(NUMERO DE * EN LINEA 1);j++) {
//				System.out.print("*");
//			}
			System.out.println("");
		}
	}

	
}
