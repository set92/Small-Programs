package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Metodos 10
//Realiza un metodo llamado PonMayus que recibira un caracter y si es minus devolvera esa letra en mayus.
//Entre caracteres minus y mayus hay 32 valores.
//Autor: Sergio Tobal
//Fecha: 12-02-2012
public class EjerMetodos10 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		char minus;
		
		System.out.println("Dame un caracter en minus para que te lo transforma en mayus");
		minus=lectura.readLine().charAt(0);
		
//		Para hacerlo mas rapido podemos llamar a la funcion toUpperCase y a la isLowerCase para 
//		saber si es minuscula y si es asi transformarla en mayuscula
		if (Character.isLowerCase(minus)) {
			System.out.println("El caracter introducido era "+minus+" pero ahora es "+Character.toUpperCase(minus));
		}else {
			System.out.println("El caracter introducido ("+minus+") ya estaba en mayusculas");
		}
	}

}
