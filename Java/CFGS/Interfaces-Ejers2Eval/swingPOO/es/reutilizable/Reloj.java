package es.reutilizable;

import java.util.Calendar;

import javax.swing.*;


public class Reloj extends JPanel{
	
	public Reloj() {
		
		
		JLabel fecha = new JLabel (getTiempo());
		add(fecha);
		
		
		
	}
	String getTiempo(){
		String fecha;
		Calendar ahora = Calendar.getInstance();
		
		String[ ] nombre_mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
		
		int anio = ahora.get(Calendar.YEAR);

		int dia = ahora.get(Calendar.DAY_OF_MONTH);
		int hora = ahora.get(Calendar.HOUR_OF_DAY);
		int minuto = ahora.get(Calendar.MINUTE);
		
		String mes = nombre_mes[ahora.get(Calendar.MONTH)];
		
		fecha = hora+":"+minuto+" del "+dia+" de "+mes+" de "+anio;
		return fecha;
	}
}
