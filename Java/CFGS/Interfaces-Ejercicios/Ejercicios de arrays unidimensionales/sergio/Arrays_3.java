package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 3
//Realizar un programa que solicite 20 números y los guarde en un array llamado mis_números.
//Visualizaremos el array y la suma de los números y su media.
//Autor: Sergio Tobal
//Fecha: 18-04-2012
public class Arrays_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int SLOTS=20,suma=0, media=0;
		int MIS_NUMEROS[]=new int[SLOTS];
		
//		Se piden tantos numeros como espacios tenga el array
		for (int i = 0; i < MIS_NUMEROS.length; i++) {
			System.out.println("Dame numero: ");
			MIS_NUMEROS[i]=Integer.parseInt(lectura.readLine());
		}
		
//		Visualizamos el array y calculamos la suma de todos sus numeros
		for (int i = 0; i < MIS_NUMEROS.length; i++) {
			System.out.println("El numero "+i+" es el "+MIS_NUMEROS[i]);
			suma=suma+MIS_NUMEROS[i];
		}
//		Calculamos la media
		media=suma/SLOTS;
		
//		Visualizamos suma y media
		System.out.println("La suma de todos los numeros es "+suma);
		System.out.println("La media de todos los numeros es "+media);
		
	}

}
