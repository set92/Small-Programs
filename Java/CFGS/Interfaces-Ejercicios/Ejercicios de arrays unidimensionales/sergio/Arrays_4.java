package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 4
//Realizar un programa que cree un array unidimensional de 20 elementos de tipo numérico entero y nombre numeros.
//Solicitar los datos por teclado. Contabiliza y visualiza el número de positivos, negativos y ceros.
//Autor: Sergio Tobal
//Fecha: 18-04-2012
public class Arrays_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int SLOTS=20, cont_neg=0,  cont_pos=0, cont_ceros=0;
		int NUMEROS[]=new int[SLOTS];
		
//		Se piden tantos numeros como espacios tenga el array
		for (int i = 0; i < NUMEROS.length; i++) {
			System.out.println("Dame numero: ");
			NUMEROS[i]=Integer.parseInt(lectura.readLine());
		}
//		Se comprueba cada numero en que grupo esta y se suma +1 en un contador distinto.
		for (int i = 0; i < NUMEROS.length; i++) {
			if (NUMEROS[i]<0) {
				cont_neg++;
			}
			if (NUMEROS[i]>0) {
				cont_pos++;
			}
			if (NUMEROS[i]==0) {
				cont_ceros++;
			}
		}
//		Se visualiza la cantidad de cada tipo que hay en el array
		System.out.println("Hay "+cont_neg+" negativos");
		System.out.println("Hay "+cont_pos+" positivos");
		System.out.println("Hay "+cont_ceros+" ceros");
	}

}
