package sergio;
/* Ejercicio niko3
 * Autor: Sergio Tobal
 * Fecha: 28-11-2011
 */
 
/* Realizar programa que recoja desde la cmd la edad del usuario y nos mande un msg
 * indicando si es mayor de edad o no.
 */
 
public class niko3{
	
	public static void main (String args[]){
	int edad;
		edad= Integer.parseInt(args[0]);
		
		if (edad>=18){
			System.out.println("\nMayor de edad");
		}
		else{
			System.out.println("\nMenor de 18");
		}
	}
}

