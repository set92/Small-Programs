package sergio;
//Ejercicio Metodos 3
//Realiza un metodo llamado EsMayus que recibira una letra y devolvera al metodo que la llamo un true
// o un false dependiendo de si es mayuscula o minuscula. Main solicita la letra al usuario y llama
//al metodo, emitiendo un mensaje con el resultado
//Autor: Sergio Tobal
//Fecha: 10-02-2012
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjerMetodos3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
//	Despues de crear el programa me he dado cuenta de que el codigo es redundante y que se podria hacer todo
//	en el main gracias a isUpperCase pero el profesor pidio con metodo osea lo dejo como empece haciendolo
	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		char num;
		boolean MayusMinus;
		
		System.out.println("Introduzca una letra y el programa le dira si es mayuscula o minuscula: ");
		num=lectura.readLine().charAt(0);
//		La funcion isLetter comprueba si el usuario introduce una letra y mediante la funcion System.exit sale del programa
//		No pude usar aqui un break; por no tratarse de un bucle, porque si era un bucle entonces se ejecutaba siempre
		if (Character.isLetter(num) == false) {
			System.out.println("El programa solo funciona con letras, no introduzcas otros caracteres.");System.exit(num);
		}
//		El valor devuelto por el metodo es almacenado en una variable llamada MayusMinus
		MayusMinus=EsMayus(num);
		
//		Si el contenido de la variables es mayuscula entonces el valor sera true, si es minuscula sera false
		if (MayusMinus == true) {
			System.out.println("La letra introducida es Mayuscula");
		} else if (MayusMinus == false){
			System.out.println("La letra introducida es Minuscula");
		}
		
	}

	private static boolean EsMayus(char num) {
		boolean opt=true;
		
//		La funcion isUpperCase comprueba que el contenido de num sea mayuscula
		if (Character.isUpperCase(num) == true) {
			opt=true;
//		La funcion isLowerCase comprueba que el contenido de num sea minuscula
		} else if(Character.isLowerCase(num) == true){
			opt=false;
		}

		return opt;
	}

}
