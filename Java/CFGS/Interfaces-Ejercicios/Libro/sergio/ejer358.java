package sergio;
/* Ejercicio 8
 * Realiza un programa que genere letras aleatoriamente y determine si son vocales, 
 * consonantes, mayusculas, minusculas o caracteres.
 * Autor: Sergio Tobal
 * Fecha: 29-11-2011
 */
 
 public class ejer358{
	public static void main(String[] args){
		char letra;
		letra = (char)(Math.random()*256);
		System.out.println("Su letra es "+letra);
		if(letra >= 'a' && letra <= 'z'){
			System.out.println("Es minuscula");
		}else if(letra >= 'A' && letra <= 'Z'){
			System.out.println("ES MAYUSCULA");
		}else{
			System.out.println("No ES MAYUSCULA ni minuscula");
		}
		if(letra=='a'|| letra=='e'||letra=='i'|| letra=='o'|| letra=='u'){
			System.out.println("Es vocal");
		}else{
			System.out.println(" No es vocal");
		}
	}
}
