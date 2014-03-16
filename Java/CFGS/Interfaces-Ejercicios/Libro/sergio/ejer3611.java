package sergio;
/* Ejercicio 11
 * Realiza un programa con una variable entera t la cual contiene un tiempo en segundos
 * y queremos conocer este tiempo pero expresado en horas minutos y segundos.
 * Autor: Sergio Tobal
 * Fecha: 20-12-2011
 */
 import java.io.*;
 public class ejer3611{
	public static void main(String[] args)throws IOException{
		BufferedReader lectura= new BufferedReader (new InputStreamReader(System.in));
		int t, seg=0, min=0, hora=0;
		
		System.out.println("Introduce segundos: ");
		t=Integer.parseInt(lectura.readLine());
		seg=t;
		min=t/60;
		hora=min/60;
		System.out.println("Los segundos en horas son: "+hora);
		System.out.println("Los segundos en minutos son: "+min);
		System.out.println("Los segundos en segundos son: "+seg);
	}
}
