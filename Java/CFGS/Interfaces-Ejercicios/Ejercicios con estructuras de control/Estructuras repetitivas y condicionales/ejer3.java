import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 3
//Realiza un programa que solicite una letra y visualice 10 filas con 10 letras cada una.
//Autor: Sergio Tobal
//Fecha: 20-01-2012
public class ejer3 {

	public static void main(String[] args)throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		char letra;
		
//		Se pide la letra al usuario, se usa el .toUpperCase para que la letra introducida
//		este en	mayusculas y el .charAt para cojer solo la primera letra de todo lo que 
//		ponga
		System.out.println("Dame letra o numero");
		linea=lectura.readLine().toUpperCase();
        letra=linea.charAt(0);
        
//      Un bucle para crear los saltos de linea y otro bucle dentro de este para visualiz
//      -ar la letra que haya introducido el usuario
        for (int altura = 0; altura < 10; altura++) {
			System.out.println("");
			for (int fila = 0; fila < 10; fila++) {
				System.out.print(letra);
			}
		}
        System.out.println("----------------> Fin programa <-------------------");
		
	}

}
