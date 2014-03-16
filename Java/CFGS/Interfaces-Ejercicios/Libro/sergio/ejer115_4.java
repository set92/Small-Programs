package sergio;
//Ejercicio 4 - Pag 115
//Realiza en un equipo un paquete utilidades.mates con dos clases sumar y potenciar. La clase sumar tendra un metodo int suma(int,int)
//el cual devolvera la suma de los dos parametros introducidos y la clase potenciar tendra un metodo int potencia(int,int) el cual devolvera
//el resultado de elevar el primer parametro al segundo parametro. Realiza un programa que haga uso de este paquete.
//Autor: Sergio Tobal
//Fecha: 20-03-2012
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utilidades.mates.*;

public class ejer115_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int opcion;
		Sumar Msuma=new Sumar();
		Potencia Mpotencia=new Potencia();
		
		System.out.println("Pulsa 1 si quieres sumar o 2 si quieres potencia.");
		opcion=Integer.parseInt(lectura.readLine());
		if (opcion==1) {
			Msuma.main();
		}else if (opcion==2) {
			Mpotencia.main();
		}else {
			System.out.println("Error");
		}
	}

}
