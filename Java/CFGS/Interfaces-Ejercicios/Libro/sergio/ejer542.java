package sergio;
//Ejercicio 2 - Pag 54
//Realiza una clase minumero que proporcione el doble,triple,cuadruple de un numero proporcionado en su constructor
//Haz que la clase tenga un metodo main y compruena los distintos metodos
//Autor: Sergio Tobal
//Fecha: 03-01-2012
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ejer542 {
	
	int valor;
	
	ejer542(int numero){
		valor=numero;
	}
	private int doble(int numero) {
		int r;
		r=numero*2;
		
		return r;
	}
	private int triple(int numero) {
		int r;
		r=numero*3;
		
		return r;
	}
	private int cuadruple(int numero) {
		int r;
		r=numero*4;
		
		return r;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int numero, x2, x3, x4;
		
		System.out.println("Numero: ");
		numero=Integer.parseInt(lectura.readLine());
		
		ejer542 numeros = new ejer542(numero);
		
		x2=numeros.doble(numero);
		x3=numeros.triple(numero);
		x4=numeros.cuadruple(numero);
		
		System.out.println("Numero doble: "+x2);
		System.out.println("Numero triple: "+x3);
		System.out.println("Numero cuadruple: "+x4);
		
	}

}
