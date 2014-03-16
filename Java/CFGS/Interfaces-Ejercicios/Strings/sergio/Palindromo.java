package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Strings2
//Realiza un metodo espalindromo que devolvera verdadero si el string recibido es palindromo 
//Autor: Sergio Tobal
//Fecha: 11-05-2012
public class Palindromo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String texto1="",texto2="";
		
//		Pedir al usuario un texto para comprobar si es o no palindromo
		System.out.println("Introduce un texto: ");
		texto1=lectura.readLine();
		
//		Llamamos al metodo que lo comprobara
		es_palindromo(texto1,texto2);
		
	}

	private static boolean es_palindromo(String texto1, String texto2) {
		for (int i = 0; i < texto1.length(); i++) {
			texto2=texto2+texto1.charAt(i);
		}
		
//		Comparar los dos textos y comprobar que es palindromo
		if (texto1.equals(texto2)) {
			System.out.println("La palabra es palindroma");
		}else { 
			System.out.println("La palabra no es palindroma");
		}	
		
		
		return false;
	}

}
