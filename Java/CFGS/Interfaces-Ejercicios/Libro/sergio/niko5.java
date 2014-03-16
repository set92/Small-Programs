package sergio;
/* Realizar un programa que solicite al solicite al usuario el dia, mes
 * y año y visualice el dia siguiente.
 * Añadir años, meses y dias.
 * Autor: Sergio Tobal
 * Fecha: 5-12-2011
 */

import java.io.*;
public class niko5 {
	
	public static void main (String args[])throws Exception {
		BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));
		int ano, mes, dia, ano1=0;
		
		
		System.out.print("dia: ");
		dia=Integer.parseInt(lectura.readLine());
		System.out.print("Mes: ");
		mes=Integer.parseInt(lectura.readLine());
		System.out.print("ano: ");
		ano=Integer.parseInt(lectura.readLine());
		//~ int ano1=ano%4;
		
		ano1=ano;
		ano1=ano1%4;
		dia=dia+1;
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
			if(dia==32){
				dia=1;
				mes=mes+1;
			}
		} else {
			if(mes==2){
				if (ano1==0) {
					if (dia==30){
						mes=mes+1;
						dia=1;
					}
				} else {
					if (dia==29){
						mes=mes+1;
						dia=1;		
					} 		
				}
			}	
		}		
			if(mes==4 || mes==6 || mes==9 || mes==11){
				if (dia==31){
						mes=mes+1;
						dia=1;
				}
			}
		if (mes==13){
			ano=ano+1;
			mes=1;
		}
			
System.out.println("El dia es "+dia+", el mes es "+mes+", y el ano es "+ano);
}
}

