package sergio;
/* Ejercicio 1 - PAGINA 31
 * Autor: Sergio Tobal
 * Fecha: 25-11-2011
 */

class ejer311 
{
	public static char getLetras () 
	{
		return (char) (Math.random()*26);	
	}
	public static void main (String args[]) 
	{
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
	}
}

