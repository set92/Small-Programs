package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

//Ejercicio Metodos 5
//Realiza un metodo llamado EsBisiesto que recibira un año y devolvera al metodo que lo llamo true o false
//en funcion de si es bisiesto o o no. Main solicita el año al usuario y llama al metodo. Un año es bisiesto
//cuando es multiplo de 4 a excepcion de los multiplos de 100, y de estos a excepcion de los multiplos de
//400 que si que lo son.
//Autor: Sergio Tobal
//Fecha: 00-00-2012
public class EjerMetodos5 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int year;
		
//		Se le pide al usuario el año que quiere comprobar
		System.out.println("Introduce año:");
		year=Integer.parseInt(lectura.readLine());
		
//		Mediante una funcion de java se comprueba que el año es bisiesto o no, y se muestra el msg al usuario
		GregorianCalendar calendario = new GregorianCalendar();
		if (calendario.isLeapYear(year) == true) {
			System.out.println(year+" es bisiesto");
		} else  {
			System.out.println(year+" no es bisiesto");
		}
		
		
	}

}
