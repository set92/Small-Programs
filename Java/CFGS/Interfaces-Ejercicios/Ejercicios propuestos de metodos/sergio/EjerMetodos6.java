package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Metodos 6
//Realiza un metodo llamado EsPrimo que recibira un numero y devolvera al metodo que lo llamo true false
//dependiendo de si es primo o no.Un numero es primo cuando solo es divisible por si mismo y la unidad.
//Autor: Sergio Tobal
//Fecha: 11-02-2012
public class EjerMetodos6 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num=3;
		boolean es_primo;
		
		System.out.print("Dame numero que quieres saber si es primo: ");
		num=Integer.parseInt(lectura.readLine());
		
//		Se lleva el valor introducido por el usuario al metodo, y lo que retorne se almacena
//		en la variable es_primo
		es_primo=EsPrimo(num);
		
		if (es_primo == true) {
			System.out.println(num+" es primo");
		} else if (es_primo == false) {
			System.out.println(num+" NO es primo");
		}
	}

	private static boolean EsPrimo(int num) {
		int cont=2;
		boolean primo=true;
		
//		Compruebo primero si el resto de la division es cero, si es asi ya no puede ser primo 
//		pues una caracteristica de primo es que nunca sera un numero par.
		if (num%2==0 && num!=2){
			  return false;
		}
		
//		Si llega hasta aqui querra decir que no es par por lo que se intentara que entre en un if
//		si en algun momento el resto es igual a 0, si llega a su mismo numero y al dividir su
//		resto no es 0 entonces saldra del bucle retornando el valor true al metodo main
		while ((primo==true) && (cont!=num)){
			if (num % cont == 0){//Si el resto es 0 entonces no sera primo
				primo = false;
			}
			cont++; 
		}
		return primo;
		
	}

}
