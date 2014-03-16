package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Ejercicio Metodos 12
//Realiza un metodo llamado ObtenerEdad que recibe dia mes y anio de nacimiento
//y devuelve la edad que tiene el usuario
//Autor: Sergio Tobal
//Fecha: 12-02-2012
public class EjerMetodos12 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException{
		int edad;
		
		edad=ObtenerEdad();
		System.out.println("Tienes "+edad+" años");
		
	}

	private static int ObtenerEdad()throws NumberFormatException, IOException{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int year,month,day;
		
		System.out.println("Dime tu dia de nacimiento: ");
		day=Integer.parseInt(lectura.readLine());
		System.out.println("Dime tu mes de nacimiento: ");
		month=Integer.parseInt(lectura.readLine());
		System.out.println("Dime tu año de nacimiento: ");
		year=Integer.parseInt(lectura.readLine());
		
		Calendar cal = new GregorianCalendar(year, month, day);
	    Calendar now = new GregorianCalendar();
	    int edad = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
	    if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH)) || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) && cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH)))
	    {
	      edad--;
	    }
	    return edad;
	}

}
