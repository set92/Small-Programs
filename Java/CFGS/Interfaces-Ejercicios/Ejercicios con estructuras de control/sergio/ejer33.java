package sergio;
/* Ejercicio 28 - Ejercicios con estructuras de control
 * Realiza un reloj contador que visualice las horas, minutos y segundos. El intervalo
 * entre segundo y segundo sera de 0.001seg. Comenzara en 00:00:00 y llegara a 23:59:59.
 * (Idea: el numero de iteracciones es 24*60*60=86400) Tiempo de ejecucion 1min 40seg
 * Autor: Sergio Tobal
 * Fecha: 17-12-2011
 */


public class ejer33 {
	
	public static void main (String args[]) {
		int hora=0, min=0, seg=0;
		
		while(hora!=23 || min!=59 || seg!=59){
			seg=seg+1;
			if(seg==60){
				min=min+1;
				seg=0;
			}
			if (min==60){
				hora=hora+1;
				min=0;
			}
			
			if (hora<=9) {
				System.out.print("0"+hora+":");
			} else {
				System.out.print(hora+":");
			}
			if (min<=9) {
				System.out.print("0"+min+":");
			} else {
			System.out.print(min+":");
			}
			if (seg<=9) {
				System.out.print("0"+seg+"\n");
			} else {
				System.out.print(seg+"\n");
			}

			
			try {
				Thread.sleep(1);

			}catch (InterruptedException x) {
				System.out.println("Detectado un error...");
			}
		}
		
		
	}
}

