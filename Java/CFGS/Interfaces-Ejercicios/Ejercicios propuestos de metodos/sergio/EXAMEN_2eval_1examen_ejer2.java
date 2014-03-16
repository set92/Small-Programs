package sergio;

import java.io.*;

//Ejercicio Examen 2
//Realiza un metodo llamado ValFecha que recibira dia, mes y año, y devolvera true o false
//dependiendo de si la fecha es correcta o no, para que lo sea tiene que ser correcto tanto el
//dia como el mes.Main solicita el dia mes año al usuario, y llamara al metodo.
//Autor: Sergio Tobal

public class EXAMEN_2eval_1examen_ejer2 {

	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));		
		int dia,mes,anio;
		boolean comprobar;
		
		System.out.println("Dame un dia:");
		dia=Integer.parseInt(lectura.readLine());
		System.out.println("Dame un mes:");
		mes=Integer.parseInt(lectura.readLine());
		System.out.println("Dame un anio:");
		anio=Integer.parseInt(lectura.readLine());
		
		comprobar=ValFecha(dia,mes);
		
		if (comprobar==true) {
			System.out.println("\n"+dia+"-"+mes+"-"+anio+"\nFecha validada correctamente");
		}else {
			System.out.println("\n"+dia+"-"+mes+"-"+anio+"\nFecha validada INCORRECTAMENTE");
		}
	}

	private static boolean ValFecha(int dia, int mes) {
		
		if ((dia>=1 && dia<=31) && (mes>=1 && mes<=12)) {
			return true;
		}else {
			return false;
		}
		
	}


}

