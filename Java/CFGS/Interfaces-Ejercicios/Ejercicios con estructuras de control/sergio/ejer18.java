package sergio;
/* Ejercicio 18 - Estructuras condiciones: simple, doble y multiple
 * Realizar un programa que presente 5 opciones: 1-musica, 2-cine, 3-teatro, 4-radio
 * 5-futbol. Solicite al usuario el numero de su hobby favorito. El programa debe
 * decidir cual ha sido la eleccion y un comentario al respecto.(switch)
 * Autor: Sergio Tobal
 * Fecha: 1-12-2011
 */

import java.io.*;
public class ejer18 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura=new BufferedReader(new InputStreamReader (System.in));
		int opcion;
		
		System.out.println("1. Musica ");
		System.out.println("2. Cine ");
		System.out.println("3. Teatro ");
		System.out.println("4. Radio ");
		System.out.println("5. Futbol ");
		System.out.print(System.getProperty("line.separator"));
		System.out.print("Tu opcion: ");
		opcion=Integer.parseInt(lectura.readLine());
		System.out.print(System.getProperty("line.separator"));
		
		switch(opcion){
			case 1: System.out.println("Musica");
					System.out.println("Esto es musica");
					break;
			case 2: System.out.println("Cine");
					System.out.println("Esto es cine");
					break;
			case 3: System.out.println("Teatro");
					System.out.println("Esto es teatro");
					break;
			case 4: System.out.println("Radio");
					System.out.println("Esto es radio");
					break;
			case 5: System.out.println("Futbol");
					System.out.println("Esto es futbol");
					break;
			default: System.out.println("Ninguna seleccionada.");
					System.out.println("Selecciona alguna por favor.");
					break;
						
			}
		
	}
}

