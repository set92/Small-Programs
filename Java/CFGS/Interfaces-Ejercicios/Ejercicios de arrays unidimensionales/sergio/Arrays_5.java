package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 5
//Realizar un programa que cree un array de 15 elementos de tipo numérico entero de nombre Array. 
//Visualiza los números mayores de 30 y su posición. En caso de no existir ninguno emitiremos un mensaje “No hay mayores de 30”. 
//El  array es cargado previamente por teclado. Visualizar el array destino.
//Autor: Sergio Tobal
//Fecha: 18-04-2012
public class Arrays_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int SLOTS=4,cont_mayor_30=0;
		int ARRAY[]=new int[SLOTS];
		
//		Se piden tantos numeros como espacios tenga el array
		for (int i = 0; i < ARRAY.length; i++) {
			System.out.println("Dame numero: ");
			ARRAY[i]=Integer.parseInt(lectura.readLine());
		}
		for (int i = 0; i < ARRAY.length; i++) {
			if (ARRAY[i]>30) {
				System.out.println("El numero "+ARRAY[i]+" de la posicion "+i+" es mayor de 30");
				cont_mayor_30++;
			}
		}
//		Controlamos mediante un contador que no existe ningun numero mayor de 30
		if(cont_mayor_30==0){
			System.out.println("No existe ningun numero mayor de 30");
		}
	}

}
