package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//Ejercicio 9
//Programa que cree un array unidimensional de 15 elementos de tipo numerico entero y de nombre Tabla.
//Cargar ese array con valores positivos, negativos y ceros. Hallar la suma de los n primeros elementos almacenados en el array.
//N sera un dato solicitado por teclado. Validaremos dicho valor no pudiendo superar el máximo de elementos
//Mostrar en pantalla el resultado obtenido de la suma y el contenido del array.
//Autor: Sergio Tobal
//Fecha: 18-04-2012
public class Arrays_9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int SLOTS=15, num=0, suma=0;
		int NUMEROS[]=new int[SLOTS];
		
//		Llenado del array con numeros aleatorios
		for (int i = 0; i < NUMEROS.length; i++) {
//		Creamos un objeto para numeros aleatorios, y usamos aleatorio.nextDouble para cojer un numero de rango 2^-64 y 2^64
//		La sintaxis compleja es para limitar los numeros y funciona de la siguiente forma: (int) (aleatorio.nextDouble() * cantidad_numeros_rango + termino_inicial_rango)
		Random  aleatorio = new Random();
		NUMEROS[i]=(int)(aleatorio.nextDouble() * 20 + -10);
		}
		
//		Se muestran al array completo
		for (int i = 0; i < NUMEROS.length; i++) {
			System.out.println("El numero de la posicion "+i+" es "+NUMEROS[i]);
		}
		
		System.out.println("De cuantos numeros quieres hallar la suma?");
		num=Integer.parseInt(lectura.readLine());
//		Se comprueba que el numero introducido no excede el numero de posiciones
		if (num>SLOTS) {
			System.out.println("ERROR. Numero no permitido por exceder el numero de slots del array");
		}else {
//			Se va almacenando en una variable los valores
			for (int i = 0; i < num; i++) {
				suma=suma+NUMEROS[i];
			}
//			Se muestra el valor de la suma
			System.out.println("Los "+num+" primeros numeros dan como suma: "+suma);
		}
		
		
	}

}
