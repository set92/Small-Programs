package sergio;
/* Ejercicio 19 - Estructuras condiciones: simple, doble y multiple
 * Realizar un programa que solicite el numero de DNI y obtenga su letra.
 * Para calcular la letra del dni dividimos entre 23 y el resto de la division
 * indica la posicion de la letras. (switch)
 * RESTO 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 
 * LETRA T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
 * Autor: Sergio Tobal
 * Fecha: 2-12-2011
 */


import java.io.*;
public class ejer19 {
		
	public static void main (String args[])throws Exception {
		BufferedReader lectura=new BufferedReader( new InputStreamReader(System.in));
		int dni;
						
		
		System.out.print("DNI: ");
		dni=Integer.parseInt(lectura.readLine());
		dni=dni%23;
		
		switch(dni){
			case 0:System.out.print("T");break;
			case 1:System.out.print("R");break;
			case 2:System.out.print("W");break;
			case 3:System.out.print("A");break;
			case 4:System.out.print("G");break;
			case 5:System.out.print("M");break;
			case 6:System.out.print("Y");break;
			case 7:System.out.print("F");break;
			case 8:System.out.print("P");break;
			case 9:System.out.print("D");break;
			case 10:System.out.print("X");break;
			case 11:System.out.print("B");break;
			case 12:System.out.print("N");break;
			case 13:System.out.print("J");break;
			case 14:System.out.print("Z");break;
			case 15:System.out.print("S");break;
			case 16:System.out.print("Q");break;
			case 17:System.out.print("V");break;
			case 18:System.out.print("H");break;
			case 19:System.out.print("L");break;
			case 20:System.out.print("C");break;
			case 21:System.out.print("K");break;
			case 22:System.out.print("e");break;
			default:System.out.print("No es la longitud necesaria");break;
			
			}
		
	}
}



