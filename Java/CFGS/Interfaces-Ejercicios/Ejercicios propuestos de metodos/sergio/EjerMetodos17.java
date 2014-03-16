package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

//Ejercicio Metodos 17
//Realiza un metodo llamado PintarFechaActual cuya mision es la de visualizar la fecha del ordenador
//en el formato xxxxxxxx-dd/mm/aaaa, a partir de la columna y fila recibida.
//Autor: Sergio Tobal
//Fecha: 13-02-2012
public class EjerMetodos17 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int x,y;
		
		System.out.println("Que fila quieres empezar:");
		x=Integer.parseInt(lectura.readLine());
		System.out.println("Que columna quieres empezar");
		y=Integer.parseInt(lectura.readLine());
		
//		Le voy restando por cada salto de linea que haga para que haga los saltos que 
//		haya dicho el usuario
		while (x!=0) {
			System.out.println("");
			x--;
		}
//		Le vuelvo a restar pero esta vez para que meta espacios y sirva como columna
		while (y!=0) {
			System.out.print(" ");
			y--;
		}
		
		PintarFechaActual();
		
	}

	private static void PintarFechaActual() {
//		Declaro un objeto llamado calendario de la funcion Calendar
		Calendar calendario = Calendar.getInstance();
		
		String[ ] nombre_mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        String[] nombre_dias = new String[] { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves","Viernes", "Sabado" };

		String month = nombre_mes[calendario.get(Calendar.MONTH)];
		System.out.println("El dia de la semana es  : " + nombre_dias[calendario.get(Calendar.DAY_OF_WEEK) + 1]);
		System.out.println("Estamos en el mes : " + month);
//		Gracias a DATE, MONTH y YEAR puedo cojer el dia, mes y año que tenga el sistema
//		En MONTH se le suma 1 puesto que de normal para el ordenador los meses van del 0 al 11
	    System.out.println(calendario.get(Calendar.DATE)+"/"+(calendario.get(Calendar.MONTH)+1)+"/"+calendario.get(Calendar.YEAR));
	}

}
