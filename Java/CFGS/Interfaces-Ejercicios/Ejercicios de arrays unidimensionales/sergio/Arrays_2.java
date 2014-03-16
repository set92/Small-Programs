package sergio;
//Ejercicio 2
//Realizar un programa que cree un array de 20 elementos de tipo numérico entero y nombre Pares.
//Primero lo incializamos a 0 y luego lo cargamos con los veinte primeros números pares. 
//Finalmente se visualiza.
//Autor: Sergio Tobal
//Fecha: 18-04-2012
public class Arrays_2 {

	public static void main(String[] args) {
		int SLOTS=20, cont=2;
		int ARRAY_NUMEROS[]=new int[SLOTS];
		
//		Se inicializa todos los slots a 0, lo cual no es necesario porque por defecto se inicia a 0.
		for (int i = 0; i < ARRAY_NUMEROS.length; i++) {
			ARRAY_NUMEROS[i]=0;
		}
		
//		Se asignan los primeros 20 numeros pares a los 20 SLOTS
		for (int i = 0; i < ARRAY_NUMEROS.length; i++) {
			ARRAY_NUMEROS[i]=cont;
			cont=cont+2;
		}
		
//		Se visualizan los SLOTS para ver los primeros numeros pares
		for (int i = 0; i < ARRAY_NUMEROS.length; i++) {
			System.out.println("El numero "+i+" es: "+ARRAY_NUMEROS[i]);
		}
	}

}
