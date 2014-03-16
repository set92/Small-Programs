package utilidades.mates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 4 - Pag 115
//Realiza en un equipo un paquete utilidades.mates con dos clases sumar y potenciar. La clase sumar tendra un metodo int suma(int,int)
//el cual devolvera la suma de los dos parametros introducidos y la clase potenciar tendra un metodo int potencia(int,int) el cual devolvera
//el resultado de elevar el primer parametro al segundo parametro. Realiza un programa que haga uso de este paquete.
//Autor: Sergio Tobal
//Fecha: 20-03-2012
public class Sumar {

	/**
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main() throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;
		
		System.out.print("Introduce el valor numero 1: ");
		n1=Integer.parseInt(lectura.readLine());
		System.out.print("Introduce el valor numero 2: ");
		n2=Integer.parseInt(lectura.readLine());
		
		System.out.println("El valor de la suma es: "+suma(n1,n2));
	}

	public static int suma(int n1, int n2) {
		int r;
		
		r=n1+n2;
		return r;
	}

}
