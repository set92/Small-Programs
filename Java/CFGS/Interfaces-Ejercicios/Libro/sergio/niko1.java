package sergio;
/* Ejercicio niko1
 * Autor: Sergio Tobal
 * Fecha: 25-11-2011
 */

/*Realizar un programa que recoja tres valores desde la linea de comandos del SO y visualice la expresion A+B+C-100*/

public class niko1{
	public static void main (String[] args){
		int n1,n2,n3,suma;
		n1= Integer.parseInt(args[0]);
		n2= Integer.parseInt (args[1]);
		n3= Integer.parseInt (args[2]);
		suma=n1+n2+n3-100;
		System.out.println("El resultado de "+n1+"+"+n2+"+"+n3+"-"+100+"="+suma);
	}
}
