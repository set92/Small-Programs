//Ejercicio Cfecha
//Realizar una clase llamada Cfecha con los miembros dia mes anio, con un constructor que los inicialice a 0
//y con otro constructor que los inicialice con los valores proporcionados.
//Autor: Sergio Tobal
//Fecha: 27-02-2012
package sergio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cfecha {
	int dia,mes,anio;
	Cfecha(){
		dia=0;
		mes=0;
		anio=0;
	}
	Cfecha(int d,int m, int a){
		dia=d;
		mes=m;
		anio=a;
	}
	int dia(int dia){
		
		
		return dia;
	}
	int mes(int mes){
		
		return mes;
	}
	int anio(int anio){
		
		return anio;
	}
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int dia,mes,anio;
		
		System.out.println("Dame tu dia de nacimiento: ");
		dia=Integer.parseInt(lectura.readLine());
		System.out.println("Dame tu mes de nacimiento: ");
		mes=Integer.parseInt(lectura.readLine());
		System.out.println("Dame tu año de nacimiento: ");
		anio=Integer.parseInt(lectura.readLine());
		
//		Se llama al constructor F1 del objeto Cfecha, que los inicializa con los valores introducidos por el usuario
		Cfecha F1=new Cfecha(dia,mes,anio);
		
		Cfecha F0=new Cfecha();
		
		
		
	}

}
