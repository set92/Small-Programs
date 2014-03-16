package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Metodos 1
//Realiza un metodo llamado TablaMultiplicar cuya mision es la de visualizar la tabla de multiplicar
//del numero que recibe. El numero sera solicitado al usuario por Main, tambien llamara al metodo.
//Autor: Sergio Tobal
//Fecha: 10-02-2012
public class EjerMetodos1 {
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		System.out.println("La tabla de multiplicar de que numero quieres visualizar?");
		num=Integer.parseInt(lectura.readLine());
		
		TablaMultiplicar(num);
	}

	private static void TablaMultiplicar(int num) {
		int cond=1,res;
		
		while (cond!=11) {
			res=num*cond;
			System.out.println(num+" X "+cond+" = "+res);
			cond+=1;
		}
	}
	
}
