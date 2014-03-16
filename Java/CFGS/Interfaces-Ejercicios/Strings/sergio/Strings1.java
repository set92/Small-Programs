package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 1
//Realiza un programa que solicite un texto al usuario y posteriormente solicite una letra.
//Contabilizar el numero de ocurrencias de dicha letra
//Autor: Sergio Tobal
//Fecha: 09-05-2012
public class Strings1 {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String texto;
		char letra='a';
		int cont=0,infi=0;
		
		System.out.println("Introduzca un texto, solo acepta minusculas: ");
		texto=lectura.readLine().toLowerCase();
		while (infi==0) {
			letra=introduce_letra(letra);

			for (int i = 0; i < texto.length(); i++) {
				if (texto.charAt(i)==letra) {
					cont++;
				}
			}
			System.out.println("La cantidad de veces que aparece la letra "+letra+" es "+cont);
		}
	}

	private static char introduce_letra(char letra) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce una letra");
		letra=lectura.readLine().toLowerCase().charAt(0);
		if (letra=='0') {
			System.exit(0);
		}
		return letra;
	}

}
