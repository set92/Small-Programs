package sergio;

/* Ejercicio 21 - Ejercicios con estructuras de control
 * Visualiza los diez primreos numeros naturales (1 2 3 4 5 6 7 8 9 10)
 * Autor: Sergio Tobal
 * Fecha: 5-12-2011
 */


public class piramide1 {
	
	public static void main (String args[]) {
		for(int i=0, izq=5, der=5; i<4; i++, izq--, der++){
			for(int j=0; j<=der; j++){
			 
			if((j >= izq) && (j<= der))
			System.out.print("*");
			else
			System.out.print(" ");
			}
			System.out.print("\n"); 
		}
		for(int i=0, izq=5, der=5; i<4; i++, izq--, der++){
			for(int j=0; j<=der; j++){
			 
			if((j >= izq) && (j<= der))
			System.out.print("*");
			else
			System.out.print(" ");
			}
			System.out.print("\n"); 
		}
	}
}

