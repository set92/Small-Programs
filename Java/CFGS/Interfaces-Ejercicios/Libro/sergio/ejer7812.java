package sergio;
//Ejercicio 1 - Pag 77
//Realiza un programa que muestre por pantalla los numeros del 1 al 100 sin mostrar aquellos numeros multiplos de 5.
//Autor: Sergio Tobal
//Fecha: 18-01-2012
public class ejer7812 {

	public static void main(String[] args) {
		int numero=0, numero2=0;
		
		for (int i = 0; i<100; i++) {
			numero++;
			numero2=numero%10;
			
			if (numero2==5 || numero2==0) {
				System.out.println("Aquí iria un multiplo de 5");
			} else {
				System.out.println(numero);
				
			}

			
		}

	}

}
