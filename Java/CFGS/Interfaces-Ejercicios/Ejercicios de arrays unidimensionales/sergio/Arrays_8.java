package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 8
//Realizar un programa que realice la búsqueda de un numero en un array de 100 elementos, cargado mediante un proceso al azar con números comprendidos entre 1 y 10000.
//Solicitaremos el número y visualizaremos la posición de ese número o indicaremos si no existe.
//Autor: Sergio Tobal
//Fecha: 18-04-2012
public class Arrays_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int SLOTS=100, num=0, cont_existe=0;
		int NUMEROS[]=new int[SLOTS];
		
//		Se generan numeros aleatorios y se van guardando en cada SLOT
		for (int i = 0; i < NUMEROS.length; i++) {
			NUMEROS[i]=genera_aleatorio();
		}
//		Se pide el numero a buscar
		System.out.println("¿Que numero quiere buscar?");
		num=Integer.parseInt(lectura.readLine());
		
//		Se recorre otra vez el array y se mira que el numero en el que esta sea igual que el numero dado por el usuario
		for (int i = 0; i < NUMEROS.length; i++) {
			if (NUMEROS[i]==num) {
				System.out.println("El numero existe, esta en la posicion "+i);
				cont_existe++;
			}
		}
//		Comprobamos mediante el cont_existe haber si ha habido algun numero igual, sino se le dice al usuario
		if (cont_existe==0) {
			System.out.println("El numero "+num+" no esta en este array");
		}
	}
	
	public static int genera_aleatorio(){
		return (int) (Math.random()*10000+1);
	}
	
}
