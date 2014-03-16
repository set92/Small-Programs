//Ejercicio 5
//Realiza un programa que te diga a que signo del Zodiaco perteneces. Solicitar al usuario
//el dia y el mes de nacimiento.
//Autor: Sergio Tobal
//Fecha: 22-01-2012
import java.io.*;

public class ejer5 {
static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int mes, dia;
		
		System.out.println("Dia que nacistes: ");
		dia=Integer.parseInt(lectura.readLine());
		System.out.println("Mes de nacimiento: ");
		mes=Integer.parseInt(lectura.readLine());
		
		switch (mes) {//Se comprueba el valor almacenado en mes y va al caso de ese valor
		case 1://Enero
			if (dia<=20) {//Dentro de Enero los dias anteriores a 20
				System.out.println("Capricornio");
			}else if (dia>=21) {//Dentro de Enero los dias siguientes a 21
				System.out.println("Acuario");
		}break;
		case 2://Febrero
			if (dia<=19) {//Dentro de Febrero los dias anteriores a 19
				System.out.println("Acuario");
			}else if (dia>=20) {
				System.out.println("Piscis");
		}break;
		case 3://Marzo
			if (dia<=20) {//Dentro de Marzo los dias anteriores a 20
				System.out.println("Piscis");
			}else if (dia>=21) {
				System.out.println("Aries");
		}break;
		case 4://Abril
			if (dia<=20) {//Dentro de Abril los dias anteriores a 20
				System.out.println("Aries");
			}else if (dia>=21) {
				System.out.println("Tauro");
		}break;
		case 5://Mayo
			if (dia<=21) {//Dentro de Mayo los dias anteriores a 21
				System.out.println("Tauro");
			}else if (dia>=22) {
				System.out.println("Geminis");
		}break;
		case 6://Junio
			if (dia<=21) {//Dentro de Junio los dias anteriores a 21
				System.out.println("Geminis");
			}else if (dia>=21) {
				System.out.println("Cancer");
		}break;
		case 7://Julio
			if (dia<=23) {//Dentro de Julio los dias anteriores a 23
				System.out.println("Cancer");
			}else if (dia>=24) {
				System.out.println("Leo");
		}break;
		case 8://Agosto
			if (dia<=23) {//Dentro de Agosto los dias anteriores a 23
				System.out.println("Leo");
			}else if (dia>=24) {
				System.out.println("Virgo");
		}break;
		case 9://Septiembre
			if (dia<=23) {//Dentro de Septiembre los dias anteriores a 23
				System.out.println("Virgo");
			}else if (dia>=24) {
				System.out.println("Libra");
		}break;
		case 10://Octubre
			if (dia<=23) {//Dentro de Octubre los dias anteriores a 23
				System.out.println("Libra");
			}else if (dia>=24) {
				System.out.println("Escorpio");
		}break;
		case 11://Noviembre
			if (dia<=22) {//Dentro de Noviembre los dias anteriores a 22
				System.out.println("Escorpio");
			}else if (dia>=23) {
				System.out.println("Sagitario");
		}break;
		case 12://Diciembre
			if (dia<=21) {//Dentro de Diciembre los dias anteriores a 21
				System.out.println("Sagitario");
			}else if (dia>=22) {
				System.out.println("Capricornio");
		}break;
		
		default://Ninguno de los casos anteriores
			System.out.println("Dia y/o mes no validos");
			break;
		}
		
	}

}
