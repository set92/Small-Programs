package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));//Habilitar teclado
		int numero, div=2, contador=0, numero2=0;
		
		System.out.println("Proporcione un numero por favor:");
		numero=Integer.parseInt(lectura.readLine());
		for (int i = 0; i < 100;) {
			
			//Parte de calcular primo
			while (numero%div!=0) {
				div++;
			}
			if (div==numero) {
				System.out.println("Es primo");break;//Los break me los obliga a poner para que no este 100 veces comprobando
			}
			else {
				System.out.println("No es primo");break;
			}
		}
	}

	
	public static boolean esprimo(int num) {
		int div=2;
		while (num%div!=0) {
			div++;
		}
		if (div==num) {
			return true;
		}
		else {
			return false;
		}

	}
}