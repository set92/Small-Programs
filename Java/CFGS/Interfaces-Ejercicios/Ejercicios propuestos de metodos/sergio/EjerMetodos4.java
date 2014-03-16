package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Metodos 4
//Realiza un metodo llamado EsNumerico que recibira un caracter y devolvera al metodo que la llamo un true
//o un false dependiendo de si es numero o letra. Main solicita la letra al usuario y llama
//al metodo, emitiendo un mensaje con el resultado
//Autor: Sergio Tobal
//Fecha: 11-02-2012
public class EjerMetodos4 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {//Me saltare un poco el enunciado para hacerlo como decia el anterior, en plan corto y conciso
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		char word;
		
		System.out.println("Introduce caracter:");
		word=lectura.readLine().charAt(0);
		
		if (Character.isDigit(word) == true) {
			System.out.println("Es un numero");
		} else if (Character.isLetter(word) == true) {
			System.out.println("Es una letra");
		}else {
			System.out.println("Error");
		}
		
	}

}
