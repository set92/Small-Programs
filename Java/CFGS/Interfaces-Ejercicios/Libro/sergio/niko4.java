package sergio;
/* Realizar un programa que solicite al solicite al usuario las horas, los minutos
 * y los segundos y visualice el siguiente segundo.(Ej: 23:59:59 -> 0:0:0)
 * Autor: Sergio Tobal
 * Fecha: 5-12-2011
 */

import java.io.*;
public class niko4 {
	
	public static void main (String args[])throws IOException {
		BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));
		int hora, min, seg;
		
		System.out.print("Hora: ");
		hora=Integer.parseInt(lectura.readLine());
		System.out.print("Min: ");
		min=Integer.parseInt(lectura.readLine());
		System.out.print("Seg: ");
		seg=Integer.parseInt(lectura.readLine());
		
		seg=seg+1;
		if( seg>59){
			seg=0;
			min=min+1;
			}
		else if(min>59){
			min=0;
			hora=hora+1;
			}
				
		System.out.println("Hora siguiente: "+hora+":"+min+":"+seg);
		
	}
}

