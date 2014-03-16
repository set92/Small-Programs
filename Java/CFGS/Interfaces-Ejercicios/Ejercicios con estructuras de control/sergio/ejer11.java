package sergio;
/* Ejercicio 11 - Estructuras condiciones: simple, doble y multiple
 * Solicitar al usuario dos numeros diferentes y decir cual es mayor y cual menor.
 * Autor: Sergio Tobal
 * Fecha: 28-11-2011
 */
import java.io.*;

public class ejer11 {
	
	public static void main (String args[])throws IOException {
		//Habilitar teclado
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2;
		
		System.out.println ("Numero 1: ");
		//Lectura de caracter por teclado
		num1 = Integer.parseInt(lectura.readLine());
		//Separador de linea
		System.out.print(System.getProperty("line.separator"));
		System.out.println ("Numero 2: ");
		num2 = Integer.parseInt(lectura.readLine());
		System.out.print(System.getProperty("line.separator"));
		if (num1>num2){
			System.out.println ("Es mayor el numero " +num1);
		}else if (num1 < num2){
			System.out.println ("Es mayor el numero " +num2);
		}else{
			System.out.print ("Son el mismo" + System.getProperty("line.separator") +"Numero introducido: " +num1);
		}
				
	}
}

