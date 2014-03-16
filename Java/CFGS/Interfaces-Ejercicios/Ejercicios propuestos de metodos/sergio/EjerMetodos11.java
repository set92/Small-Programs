package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Metodos 11
//Realiza un programa que solicite 2 valores, si el primer valor es menos que el segundo
//se ejecutara el metodo suma, sino el producto. Dichos metodos devolveran el resultado
//que se mostrara despues por pantalla.
//Autor: Sergio Tobal
//Fecha: 00-00-2012
public class EjerMetodos11 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;
		
		System.out.println("Introduce numero 1:");
		n1=Integer.parseInt(lectura.readLine());
		System.out.println("Introduce numero 2:");
		n2=Integer.parseInt(lectura.readLine());
		
		if (n1>n2) {
			suma(n1,n2);
		} else if (n2>n1){
			producto(n1,n2);
		} 
		
	}

	private static void suma(int n1, int n2) {
		int res;
		
		res=n1+n2;
		System.out.println("El resultado de "+n1+" + "+n2+" es "+res);
	}

	private static void producto(int n1, int n2) {
		int res;
		
		res=n1*n2;
		System.out.println("El resultado de "+n1+" * "+n2+" es "+res);
	}

}
