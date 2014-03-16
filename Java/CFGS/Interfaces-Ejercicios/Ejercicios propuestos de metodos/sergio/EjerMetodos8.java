package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio Metodos 8
//Realiza un metodo llamado ValFecha que recibira dia, mes y año, y devolvera true o false
//dependiendo de si la fecha es correcta o no, para que lo sea tiene que ser correcto tanto el
//dia como el mes.Main solicita el dia mes año al usuario, y llamara al metodo.
//Autor: Sergio Tobal
//Fecha: 12-02-2012
public class EjerMetodos8 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));		
		int day,month,year;
		boolean check;
		
		System.out.println("Dame un dia:");
		day=Integer.parseInt(lectura.readLine());
		System.out.println("Dame un mes:");
		month=Integer.parseInt(lectura.readLine());
		System.out.println("Dame un anio:");
		year=Integer.parseInt(lectura.readLine());
		
		check=ValFecha(day,month);
		
		if (check==true) {
			System.out.println("\n"+day+"-"+month+"-"+year+"\nFecha validada correctamente");
		}else {
			System.out.println("\n"+day+"-"+month+"-"+year+"\nFecha validada INCORRECTAMENTE");
		}
	}

	private static boolean ValFecha(int day, int month) {
		
		
		if ((day>=1 && day<=31) && (month>=1 && month<=12)) {
			return true;
		}else {
			return false;
		}
	}
}
