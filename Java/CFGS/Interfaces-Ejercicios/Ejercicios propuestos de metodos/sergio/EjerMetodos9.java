package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Metodos 9
//Realiza un metodo llamado Potencia que recibira la base y el exponente y devolvera al metodo
//el resultado. Potencia de 2 a la 5 es 2*2*2*2*2=32
//Autor: Sergio Tobal
//Fecha: 00-00-2012
public class EjerMetodos9 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int base,exponente,res;
		
		System.out.println("Dame base: ");
		base=Integer.parseInt(lectura.readLine());
		System.out.println("Dame exponente: ");
		exponente=Integer.parseInt(lectura.readLine());
		
		res=Potencia(base,exponente);
		
		System.out.println("La potencia de "+base+" elevado a "+exponente+" es "+res);
		
	}

	private static int Potencia(int base, int exponente) {
		int res=1;
		
//		Ejecuto el bucle reduciendo el exponente en 1 como si fuera un contador para saber cuantas
//		veces tiene que ejecutar el bucle
		while (exponente!=0) {
			res=res*base;
			exponente--;
		}
		
		return res;
	}

}
