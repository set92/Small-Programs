package sergio;
/* Ejercicio 16 - Estructuras condiciones: simple, doble y multiple
 * Solicita un nº de mes y visualizar en letra el mes correspondiente a ese nº, si no
 * existe que ponga error
 * Autor: Sergio Tobal
 * Fecha: 30-11-2011
 */
 
import java.io.*;
public class ejer16 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));
		int mes;
		
		System.out.print("Numero mes: ");
		mes=Integer.parseInt(lectura.readLine());
		
		switch(mes){
			case 1: System.out.println("Enero");break;
			case 2: System.out.println("Febrero");break;
			case 3: System.out.println("Marzo");break;
			case 4: System.out.println("Abril");break;
			case 5: System.out.println("Mayo");break;
			case 6: System.out.println("Junio");break;
			case 7: System.out.println("Julio");break;
			case 8: System.out.println("Agosto");break;
			case 9: System.out.println("Septiembre");break;
			case 10: System.out.println("Octubre");break;
			case 11: System.out.println("Noviembre");break;
			case 12: System.out.println("Diciembre");break;
			default: System.out.println("Error");break;
			
		}
	}
}

