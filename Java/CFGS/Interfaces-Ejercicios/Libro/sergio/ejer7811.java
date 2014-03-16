package sergio;
//Ejercicio 11 - Pag 78
//Realiza un programa que muestre por pantalla los 50 primeros numeros pares
//Autor: Sergio Tobal
//Fecha: 17-01-2012
public class ejer7811 {

	public static void main(String[] args) {
		int numero=2, contador=1;
		while (numero<=100) {
			if (numero%2==0) {
				System.out.println("Numero "+contador+": "+numero);
				contador++;
				}
			numero++;
			}
		}
	}


