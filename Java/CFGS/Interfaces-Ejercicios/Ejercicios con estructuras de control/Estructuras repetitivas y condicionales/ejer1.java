import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio 1
//Realiza un programa que solicite numeros hasta que se introduzca el 0, al finalizar visualizar la suma de los numeros positivos y negativos.
//Autor: Sergio Tobal
//Fecha: 20-01-2012
public class ejer1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num=1, positivos=0, negativos=0;

		while (num!=0) {
			System.out.println("Dame numero: ");
			num=Integer.parseInt(lectura.readLine());
			if (num>0) {
				positivos+=num;
				
			}
			if (num<0) {
				negativos+=num;
			}
		}
		System.out.println("Suma de los positivos: "+positivos);
		System.out.println("Suma de los negativos: "+negativos);
		
	}

}
