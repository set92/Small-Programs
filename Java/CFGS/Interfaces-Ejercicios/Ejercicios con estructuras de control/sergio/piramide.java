package sergio;
/* Ejercicio 21 - Ejercicios con estructuras de control
 * Visualiza los diez primreos numeros naturales (1 2 3 4 5 6 7 8 9 10)
 * Autor: Sergio Tobal
 * Fecha: 5-12-2011
 */


public class piramide {
	
	public static void main (String args[]) {
		int filas=0;
		bucleext :
		while(filas<20){
			filas++;
			for (int k=1;k<(19-filas);k+=3){
				if (filas%3==0){continue bucleext;}
				System.out.print(" ");
			}
			for (int j=1;j<filas;j++){
				System.out.print("*");
			}
			System.out.println("");
			if (filas==19){break bucleext;}
		}
	}
}

