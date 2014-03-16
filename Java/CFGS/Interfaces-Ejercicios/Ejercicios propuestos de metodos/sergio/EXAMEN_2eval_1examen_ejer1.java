package sergio;

import java.io.*;

//Ejercicio Examen 1
//Realiza un metodo llamado EsPrimo que recibira un numero y devolvera al metodo que lo llamo true false
//dependiendo de si es primo o no.Un numero es primo cuando solo es divisible por si mismo y la unidad.
//Autor: Sergio Tobal

public class EXAMEN_2eval_1examen_ejer1{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num=3;
		boolean es_primo;
		
		System.out.print("Dame numero que quieres saber si es primo: ");
		num=Integer.parseInt(lectura.readLine());
		
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
		
		if (num % 2 == 0 && num != 2){
			  return false;
		}
		
		while ((primo==true) && (cont!=num)){
			if (num % cont == 0){
				primo = false;
			}
			cont++; 
		}
		return primo;
	}
	
}
