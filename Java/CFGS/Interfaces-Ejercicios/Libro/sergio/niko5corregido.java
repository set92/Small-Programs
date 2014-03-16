package sergio;
/* Realizar un programa que solicite al solicite al usuario el dia, mes
 * y año y visualice el dia siguiente.
 * Añadir años, meses y dias.
 * Autor: Sergio Tobal
 * Fecha: 5-12-2011
 */

import java.io.*;
public class niko5corregido {
	
	public static void main (String args[])throws Exception {
		BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));
		int a, m, d, diamax;
		
		
		System.out.print("dia: ");
		d=Integer.parseInt(lectura.readLine());
		System.out.print("Mes: ");
		m=Integer.parseInt(lectura.readLine());
		System.out.print("ano: ");
		a=Integer.parseInt(lectura.readLine());
		

		diamax=31;
		if (m==4 || m==6 || m==9 || m==11){
			diamax=30;
		}else if (m==2){
			diamax=28;
			if (a%4==0){
				diamax=29;
			}
		}
		d=d+1;
		if (d>diamax){
			d=1;
			m=m+1;
			if(m>12){
				m=1;
				a=a+1;
			}
		}
			
		System.out.println("El dia es "+d+", el mes es "+m+", y el ano es "+a);
	}
}

