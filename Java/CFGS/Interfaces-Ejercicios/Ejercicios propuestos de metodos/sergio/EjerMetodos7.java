package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Metodos 7
//Realiza un metodo llamado Factorial que recibira un numero y devolvera al metodo que lo llamo el calculo.
//El factorial de 5 es 5*4*3*2*1=120
//Autor: Sergio Tobal
//Fecha: 12-02-2012
public class EjerMetodos7 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num,res;
		
		System.out.println("Dame numero para que te diga el factorial: ");
		num=Integer.parseInt(lectura.readLine());
		
		res=Factorial(num);
		
		System.out.println("El factorial de "+num+" es "+res);
		
	}

	private static int Factorial(int num) {
		int factorial=1;
		
//		Va multiplicando el numero del usuario por 1 hasta que el numero llega ha cero y retorna
//		la multiplicacion de todos los numeros
		while (num!=0) {
			factorial=factorial*num;
			num--;
		}
		return factorial;
	}

}
