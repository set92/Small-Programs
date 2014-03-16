package sergio;
/* Ejercicio 8
 * Realiza un programa que genere letras aleatoriamente y determine si son vocales, 
 * consonantes, mayusculas, minusculas o caracteres.
 * Autor: Sergio Tobal
 * Fecha: 29-11-2011
 */


public class ejer358aparte {
	
	public static char letras(){
		//(int) (Math.random() * (limiteSuperior - limiteInferior) + limiteInferior);
		return (char) (Math.random()*256);
		}
	public static void main (String args[]) {
		
		char letra_aleatoria = letras();
		
		System.out.println(letras());
		System.out.print (System.getProperty("line.separator"));
		
		if (letra_aleatoria>='a' && letra_aleatoria<='z'){
			System.out.println("Minusculas");
			}
		else if(letra_aleatoria>='A' && letra_aleatoria<='Z'){
			System.out.println("Mayusculas");
			}
		else{
			System.out.println("Ni uno ni otro");
			}
		
		
		if (letra_aleatoria=='a' || letra_aleatoria=='e' || letra_aleatoria=='i' || letra_aleatoria=='o' || letra_aleatoria=='u'){
			System.out.println("Vocales");
			}
		else {
			System.out.println("No es vocal");
			}		
		
	}
}
